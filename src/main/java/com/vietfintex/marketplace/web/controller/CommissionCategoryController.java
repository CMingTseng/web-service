package com.vietfintex.marketplace.web.controller;

import com.vietfintex.marketplace.persistence.model.CommissionCategory;
import com.vietfintex.marketplace.web.dto.CommissionCategoryDTO;
import com.vietfintex.marketplace.web.dto.ResponseDTO;
import com.vietfintex.marketplace.web.service.CommissionCategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "/commissionCategory")
public class CommissionCategoryController {
    @Autowired
    private CommissionCategoryService commissionCategoryService;

    @RequestMapping(value = "/insertOrUpdate",method = RequestMethod.POST)
    @ResponseBody
    public ResponseDTO insertOrUpdate(@RequestBody final List<CommissionCategoryDTO> commissionCategoryDTOList){
        ResponseDTO responseDTO = new ResponseDTO(false);
        try {
            if(commissionCategoryDTOList != null){
                List<CommissionCategoryDTO> returnObject = commissionCategoryService.insertOrUpdate(commissionCategoryDTOList);
                if (returnObject != null){
                    responseDTO.setSuccess(true);
                    responseDTO.setObjectReturn(returnObject);
                    return responseDTO;
                }
            }
            responseDTO.setErrorMessage("Bad request");
        }catch (Exception e){
            responseDTO.setErrorMessage("Co loi xay ra "+e.getMessage());
        }
        return responseDTO;
    }
    @RequestMapping(value = "/getCommissionCategory", method = RequestMethod.POST)
    @ResponseBody
    public ResponseDTO getCommissionCategory(@RequestBody final CommissionCategoryDTO commissionCategoryDTO){
        ResponseDTO responseDTO = new ResponseDTO(false);
        try {
            if (commissionCategoryDTO != null ){
                List<CommissionCategoryDTO> returnObject = commissionCategoryService.findByStoreCategoryId(
                        commissionCategoryDTO.getStoreCategoryId());
                if (returnObject != null){
                    responseDTO.setSuccess(true);
                    responseDTO.setObjectReturn(returnObject);
                    return responseDTO;
                }
            }
            responseDTO.setErrorMessage("Bad request");
        }catch (Exception e){
            responseDTO.setErrorMessage("Co loi xay ra "+e.getMessage());
        }
        return responseDTO;
    }
}
