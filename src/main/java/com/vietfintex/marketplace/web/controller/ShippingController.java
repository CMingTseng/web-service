package com.vietfintex.marketplace.web.controller;

import com.vietfintex.marketplace.web.dto.ResponseDTO;
import com.vietfintex.marketplace.web.dto.ShippingDTO;
import com.vietfintex.marketplace.web.service.ShippingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Map;
import java.util.Objects;

@RestController
@RequestMapping(value = "/shipping")
public class ShippingController {
    @Autowired
    ShippingService shippingService;

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
    public ResponseDTO save(@RequestBody ShippingDTO shippingDTO) {
        ResponseDTO response = new ResponseDTO(false);
        try {
            Objects.requireNonNull(shippingDTO, "not found required shippingDTO param");
            shippingService.save(shippingDTO);
            response.setSuccess(true);
        } catch (Exception e) {
            response.setErrorMessage("Có lỗi xảy ra: " + e.getMessage());
        }
        return response;
    }

}
