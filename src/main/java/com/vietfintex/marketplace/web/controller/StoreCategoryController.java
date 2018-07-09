package com.vietfintex.marketplace.web.controller;

import com.vietfintex.marketplace.util.GlobalUtil;
import com.vietfintex.marketplace.util.NumberUtils;
import com.vietfintex.marketplace.web.dto.*;
import com.vietfintex.marketplace.web.service.CategoryService;
import com.vietfintex.marketplace.web.service.StoreCategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "/storeCategory")
public class StoreCategoryController {
    @Autowired
    StoreCategoryService storeCategoryService;
    @Autowired
    CategoryService categoryService;

    @RequestMapping(value = "/getListStoreCategory" , method = RequestMethod.POST)
    ResponseDTO getListStoreCategory(@RequestBody final StoreCategoryWrapDTO storeCategoryWrapDTO){
        ResponseDTO response = new ResponseDTO(false);
        try {
            StoreCategoryDTO storeCategoryDTO = storeCategoryWrapDTO.getStoreCategoryDTO();
            if(storeCategoryDTO != null){
                List<CategoryDTO> returnObject = categoryService.getListStoreCategory(
                        storeCategoryDTO.getStoreCategoryId(),storeCategoryDTO.getStoreId(),
                        storeCategoryDTO.getCategoryId(),(storeCategoryWrapDTO.getKeySearch() != null&&
                        !"".equals(storeCategoryWrapDTO.getKeySearch()))?GlobalUtil.base64Decode(storeCategoryWrapDTO.getKeySearch()):"",
                        storeCategoryWrapDTO.getPage());
                if(returnObject != null){
                    response.setErrorCode("200");
                    response.setSuccess(true);
                    response.setObjectReturn(returnObject);
                    return response;
                }
            }

        }catch (Exception e){
            response.setErrorMessage("Co loi xay ra: "+e.toString());
            return response;
        }
        response.setErrorMessage("bad request");
        response.setErrorCode("201");
        return response;
    }
    @RequestMapping(value = "/modifyStoreCategory",method = RequestMethod.POST)
    ResponseDTO modifyStoreCategory(@RequestBody final StoreCategoryWrapDTO storeCategoryWrapDTO){
        ResponseDTO response = new ResponseDTO(false);
        try {
            if (storeCategoryWrapDTO != null && storeCategoryWrapDTO.getStoreCategoryDTO() != null &&
                    storeCategoryWrapDTO.getAction() != null) {
                StoreCategoryDTO storeCategoryDTO = storeCategoryService.modifyStoreCategory(
                        storeCategoryWrapDTO.getStoreCategoryDTO(), storeCategoryWrapDTO.getAction());
                if (storeCategoryDTO != null) {
                    response.setSuccess(true);
                    CategoryDTO categoryDTO = categoryService.findOne(storeCategoryDTO.getCategoryId());
                    response.setObjectReturn(categoryDTO);
                    return response;
                }
            }
        }catch (Exception e){
            response.setErrorMessage("Co loi xay ra "+e.getMessage());
            return response;
        }
        response.setErrorMessage("Bad request");
        return response;
    }

    @RequestMapping(value = "storeCategoryChange" , method = RequestMethod.POST)
    ResponseDTO storeCategoryChange(@RequestBody final StoreCategoryChangeDTO storeCategoryChangeDTO){
        ResponseDTO response = new ResponseDTO(false);
        try {
            if(storeCategoryChangeDTO != null && storeCategoryChangeDTO.getStoreId() != null && storeCategoryChangeDTO.getStoreId() >=0
            && storeCategoryChangeDTO.getCategoryIdList() != null && storeCategoryChangeDTO.getCategoryIdList().size() >=1){
                storeCategoryService.storeCategoryChange(storeCategoryChangeDTO.getStoreId(),storeCategoryChangeDTO.getCategoryIdList());
                response.setSuccess(true);
                return response;
            }
        }catch (Exception e){
            response.setErrorMessage("Co loi xay ra "+e.getMessage());
            return response;
        }
        response.setErrorMessage("Bad request");
        return response;
    }
}
