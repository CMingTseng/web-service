package com.vietfintex.marketplace.web.controller;

import com.vietfintex.marketplace.persistence.model.Users;
import com.vietfintex.marketplace.web.dto.ResponseDTO;
import com.vietfintex.marketplace.web.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import static java.util.Objects.isNull;

@RestController
@RequestMapping(value = "/users")
public class UserController {
    @Autowired
    private UserService userService;

    @RequestMapping(value = "/{userId}", method = RequestMethod.GET)
    @ResponseBody
    public ResponseDTO findByUserId(@PathVariable final Long userId) {
        ResponseDTO response = new ResponseDTO(false);
        try {
            if (isNull(userId)) {
                response.setErrorMessage("userId must be not null");
                return response;
            }
            Users users = userService.findOne(userId);
            response.setSuccess(true);
            response.setObjectReturn(users);
        } catch (Exception e) {
            response.setErrorMessage("Co loi xay ra: " + e.getMessage());
        }
        return response;
    }

    @RequestMapping(value = "/register", method = RequestMethod.POST)
    @ResponseBody
    public ResponseDTO register(@RequestBody final Users user) {
        ResponseDTO response = new ResponseDTO(false);
        try {
            ResponseDTO validate = userService.validate(user);
            if (!validate.isSuccess()){
                return validate;
            }
            Users users = userService.create(user);
            response.setSuccess(true);
            response.setObjectReturn(users);
        } catch (Exception e) {
            response.setErrorMessage("Co loi xay ra: " + e.getMessage());
        }
        return response;
    }

}
