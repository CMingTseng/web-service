package com.vietfintex.marketplace.web.controller;

import com.vietfintex.marketplace.persistence.model.Status;
import com.vietfintex.marketplace.web.dto.ResponseDTO;
import com.vietfintex.marketplace.web.service.StatusService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "/status")
public class StatusController {
    @Autowired
    private StatusService statusService;

    @GetMapping(value = "/{type}")
    @ResponseBody
    public ResponseDTO search(@PathVariable("type") String type) {
        ResponseDTO response = new ResponseDTO(false);
        try {
            List<Status> statuses = statusService.findByType(type);
            response.setSuccess(true);
            response.setObjectReturn(statuses);
        } catch (Exception e) {
            response.setErrorMessage("Co loi xay ra: " + e.getMessage());
        }
        return response;
    }

}
