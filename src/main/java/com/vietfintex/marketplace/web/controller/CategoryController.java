package com.vietfintex.marketplace.web.controller;

import com.vietfintex.marketplace.web.dto.CategoryDTO;
import com.vietfintex.marketplace.web.dto.CategoryWrapDTO;
import com.vietfintex.marketplace.web.dto.ResponseDTO;
import com.vietfintex.marketplace.web.service.CategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "/category")
public class CategoryController {
    @Autowired
    CategoryService categoryService;

    @RequestMapping(value = "/getCategoryList", method = RequestMethod.GET)
    @ResponseBody
    ResponseDTO getCategoryList(){
        ResponseDTO response = new ResponseDTO(false);
        try {
            List<CategoryDTO> returnObject = categoryService.getCategoryList();
            if(returnObject!= null){
                response.setSuccess(true);
                response.setObjectReturn(returnObject);
                return response;
            }
        }catch (Exception e){
            response.setErrorMessage("Co loi xay ra: "+e.toString());
        }
        return response;
    }
    @RequestMapping(value = "/searchCategory", method = RequestMethod.POST)
    @ResponseBody
    ResponseDTO searchCategory(@RequestBody final CategoryWrapDTO categoryWrapDTO){
        ResponseDTO response = new ResponseDTO(false);
        try {
            List<CategoryDTO> returnObject = categoryService.searchCategory(categoryWrapDTO.getSearchKey(),
                    categoryWrapDTO.getPage());
            if(returnObject!= null){
                response.setSuccess(true);
                response.setObjectReturn(returnObject);
                return response;
            }
        }catch (Exception e){
            response.setErrorMessage("Co loi xay ra: "+e.getMessage());
        }
        return response;
    }
}
