package com.vietfintex.marketplace.web.controller;

import com.vietfintex.marketplace.web.dto.OrderDTO;
import com.vietfintex.marketplace.web.dto.ResponseDTO;
import com.vietfintex.marketplace.web.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Map;
import java.util.Objects;

@RestController
@RequestMapping(value = "/orders")
public class OrderController {
    @Autowired
    OrderService orderService;

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
    public ResponseDTO save(@RequestBody OrderDTO orderDTO) {
        ResponseDTO response = new ResponseDTO(false);
        try {
            Objects.requireNonNull(orderDTO, "not found required orderDTO param");
            //todo validate here
            orderDTO = orderService.save(orderDTO);
            response.setObjectReturn(orderDTO);
            response.setSuccess(true);
        } catch (Exception e) {
            response.setErrorMessage("Có lỗi xảy ra: " + e.getMessage());
        }
        return response;
    }

}
