package com.vietfintex.marketplace.web.controller;

import com.vietfintex.marketplace.persistence.model.CommissionGroup;
import com.vietfintex.marketplace.persistence.model.GroupMember;
import com.vietfintex.marketplace.persistence.repo.GroupMemberRepo;
import com.vietfintex.marketplace.web.dto.*;
import com.vietfintex.marketplace.web.service.CommissionGroupService;
import org.apache.commons.lang3.SerializationUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping(value = "/commissionGroup")
public class CommissionGroupController {

    @Autowired
    GroupMemberRepo repo;

    @Autowired
    private CommissionGroupService commissionGroupService;

    @RequestMapping(value = "/insertOrUpdate", method = RequestMethod.POST)
    @ResponseBody
    public ResponseDTO insertOrUpdate(@RequestBody final CommissionCategoryWrap commissionCategoryWrap){
        ResponseDTO responseDTO = new ResponseDTO(false);
        try {
            if (commissionCategoryWrap != null && commissionCategoryWrap.getData() != null
                && commissionCategoryWrap.getData().size() > 0){
                List<CommissionGroupDTO> returnObject = commissionGroupService.insertOrUpdate(commissionCategoryWrap.getData());
                if(returnObject != null){
                    responseDTO.setObjectReturn(returnObject);
                    responseDTO.setSuccess(true);
                    return responseDTO;
                }
            }
        }catch (Exception e){
            responseDTO.setErrorMessage("Co loi xay ra: " + e.toString());
            return responseDTO;
        }
        responseDTO.setErrorMessage("Co loi xay ra: bad request" );
        return responseDTO;
    }

    @RequestMapping(value = "/getListByStoreCategoryId", method = RequestMethod.POST)
    @ResponseBody
    public ResponseDTO getListByStoreCategoryId(@RequestBody final StoreCategoryDTO storeCategoryDTO){
        ResponseDTO responseDTO = new ResponseDTO(false);
        try {
            if(storeCategoryDTO != null && storeCategoryDTO.getStoreCategoryId() != null){
                List<CommissionGroupDTO> returnObject = commissionGroupService.getListByStoreCategoryId(storeCategoryDTO.getStoreCategoryId());
                if (returnObject != null){
                    responseDTO.setSuccess(true);
                    responseDTO.setObjectReturn(returnObject);
                    return responseDTO;
                }
            }
        }catch (Exception e){
            responseDTO.setErrorMessage("Co loi xay ra: "+e.getMessage());
            return responseDTO;
        }
        responseDTO.setErrorMessage("Bab request");
        return responseDTO;
    }

    @RequestMapping(value = "/insertOrUpdateAllGroup", method = RequestMethod.POST)
    @Transactional
    @ResponseBody
    public ResponseDTO insertOrUpdateAllGroup(@RequestBody final CommissionCategoryWrap commissionCategoryWrap){
        ResponseDTO responseDTO = new ResponseDTO(false);
        try {
            if (commissionCategoryWrap != null && commissionCategoryWrap.getData() != null
                    && commissionCategoryWrap.getData().size() > 0 && commissionCategoryWrap.getUserLogin() !=null){
                List<GroupMember> listMember = repo.getByUserId(commissionCategoryWrap.getUserLogin());
                if (listMember != null && listMember.size() > 0){
                    List<CommissionGroupDTO> dataRequest = new ArrayList<>();
                    List<CommissionGroupDTO> returnObject;
                    for (int i  =0 ;i < listMember.size() ; i++){
                        GroupMember group = listMember.get(i);
                        for (int j =0; j< commissionCategoryWrap.getData().size() ;j++){
                            CommissionGroupDTO commissionGroupDTO = commissionCategoryWrap.getData().get(j);
                            commissionGroupDTO.setGroupId(group.getGroupId());
                            CommissionGroupDTO item = commissionGroupService.searchCommissionGroup(group.getGroupId(),commissionGroupDTO.getProductId(),
                                    commissionGroupDTO.getStoreCategoryId(),commissionGroupDTO.getLevel());
                            if (item != null){
                                item.setCommission(commissionGroupDTO.getCommission());
                                CommissionGroupDTO newItem = SerializationUtils.clone(item);
                                dataRequest.add(newItem);
                            }else{
                                CommissionGroupDTO newItem = SerializationUtils.clone(commissionGroupDTO);
                                dataRequest.add(newItem);

                            }
                        }
                    }
                    returnObject = commissionGroupService.insertOrUpdate(dataRequest);
                    if(returnObject != null){
                        responseDTO.setObjectReturn(returnObject);
                        responseDTO.setSuccess(true);
                        return responseDTO;
                    }
                }
            }
        }catch (Exception e){
            responseDTO.setErrorMessage("Co loi xay ra: " + e.toString());
            return responseDTO;
        }
        responseDTO.setErrorMessage("Co loi xay ra: bad request" );
        return responseDTO;
    }
}
