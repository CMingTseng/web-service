package com.vietfintex.marketplace.web.controller;

import com.vietfintex.marketplace.web.dto.ProductOptionDTO;
import com.vietfintex.marketplace.web.dto.ResponseDTO;
import com.vietfintex.marketplace.web.service.ProductOptionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Map;
import java.util.Objects;

@RestController
@RequestMapping(value = "/options")
public class ProductOptionController {
    @Autowired
    ProductOptionService productOptionService;

    @PostMapping(value = "/search")
    @ResponseBody
    public ResponseDTO search(@RequestBody final Map<String, Object> param) {
        ResponseDTO response = new ResponseDTO(false);
        try {

        } catch (Exception e) {
            response.setErrorMessage("Có lỗi xảy ra: " + e.getMessage());
        }
        return response;
    }


    @RequestMapping(value = "/count", method = RequestMethod.POST)
    @ResponseBody
    public ResponseDTO count(@RequestBody Map<String, Object> param) {
        ResponseDTO response = new ResponseDTO(false);
        try {

        } catch (Exception e) {
            response.setErrorMessage("Có lỗi xảy ra: " + e.getMessage());
        }
        return response;
    }

    @RequestMapping(value = "/", method = RequestMethod.POST)
    @ResponseBody
    public ResponseDTO saveOption(@RequestBody ProductOptionDTO productOptionDTO) {
        ResponseDTO response = new ResponseDTO(false);
        try {
            Objects.requireNonNull(productOptionDTO, "not found required productOptionDTO param");
            productOptionService.save(productOptionDTO);
            response.setSuccess(true);
        } catch (Exception e) {
            response.setErrorMessage("Có lỗi xảy ra: " + e.getMessage());
        }
        return response;
    }

}
