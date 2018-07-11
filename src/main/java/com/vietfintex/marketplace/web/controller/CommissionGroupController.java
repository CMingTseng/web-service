package com.vietfintex.marketplace.web.controller;

import com.vietfintex.marketplace.web.dto.CommissionCategoryWrap;
import com.vietfintex.marketplace.web.dto.CommissionGroupDTO;
import com.vietfintex.marketplace.web.dto.ResponseDTO;
import com.vietfintex.marketplace.web.dto.StoreCategoryDTO;
import com.vietfintex.marketplace.web.service.CommissionGroupService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "/commissionGroup")
public class CommissionGroupController {

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
}
