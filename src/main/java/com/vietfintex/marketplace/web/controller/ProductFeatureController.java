package com.vietfintex.marketplace.web.controller;

import com.vietfintex.marketplace.web.dto.ProductFeatureDTO;
import com.vietfintex.marketplace.web.dto.ResponseDTO;
import com.vietfintex.marketplace.web.dto.StoreDTO;
import com.vietfintex.marketplace.web.dto.StoreWrapDTO;
import com.vietfintex.marketplace.web.service.ProductService;
import com.vietfintex.marketplace.web.service.StoreService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;

@RestController
@RequestMapping(value = "/features")
public class ProductFeatureController {
    @Autowired
    ProductService productService;

    @PostMapping(value = "/search")
    @ResponseBody
    public ResponseDTO search(@RequestBody final Map<String, Object> param){
        ResponseDTO response = new ResponseDTO(false);
        try {

        }catch (Exception e){
            response.setErrorMessage("Có lỗi xảy ra: "+e.getMessage());
        }
        return response;
    }


    @RequestMapping(value = "/count", method = RequestMethod.POST)
    @ResponseBody
    public ResponseDTO count(@RequestBody Map<String, Object> param){
        ResponseDTO response = new ResponseDTO(false);
        try {

        }catch (Exception e){
            response.setErrorMessage("Có lỗi xảy ra: "+e.getMessage());
        }
        return response;
    }

}
