package com.vietfintex.marketplace.web.controller;

import com.vietfintex.marketplace.web.dto.ProductFeatureDTO;
import com.vietfintex.marketplace.web.dto.ResponseDTO;
import com.vietfintex.marketplace.web.service.ProductFeatureService;
import com.vietfintex.marketplace.web.service.ProductFeatureVariantService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Map;
import java.util.Objects;

@RestController
@RequestMapping(value = "/features")
public class ProductFeatureController {
    @Autowired
    ProductFeatureService productFeatureService;
    @Autowired
    ProductFeatureVariantService productFeatureVariantService;

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

        } catch (Exception e) {
            response.setErrorMessage("Có lỗi xảy ra: " + e.getMessage());
        }
        return response;
    }

    @RequestMapping(value = "/", method = RequestMethod.POST)
    @ResponseBody
    public ResponseDTO createFeature(@RequestBody ProductFeatureDTO productFeatureDTO) {
        ResponseDTO response = new ResponseDTO(false);
        try {
            Objects.requireNonNull(productFeatureDTO, "not found required param");
            productFeatureService.create(productFeatureDTO);
            response.setSuccess(true);
        }catch (Exception e){
            response.setErrorMessage("Có lỗi xảy ra: "+e.getMessage());
        }
        return response;
    }

}
