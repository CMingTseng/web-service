package com.vietfintex.marketplace.web.controller;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.vietfintex.marketplace.util.GlobalUtil;
import com.vietfintex.marketplace.web.dto.ResponseDTO;
import com.vietfintex.marketplace.web.dto.UserDTO;
import com.vietfintex.marketplace.web.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;

import static java.util.Objects.isNull;
import static java.util.Objects.requireNonNull;

@RestController
@RequestMapping(value = "/users")
public class UserController {
    @Autowired
    private UserService userService;

    @RequestMapping(value = "/search", method = RequestMethod.POST)
    @ResponseBody
    public ResponseDTO search(@RequestBody Map<String, Object> param) {
        ResponseDTO response = new ResponseDTO(false);
        try {
            param = Optional.ofNullable(param).orElseGet(HashMap::new);
            ObjectMapper mapper = new ObjectMapper();
            UserDTO searchDTO = Optional.ofNullable(param.get("searchDTO"))
                    .map(x -> mapper.convertValue(x, UserDTO.class))
                    .orElseGet(UserDTO::new);
            int startPage = (int) param.get("startPage");
            int pageSize = (int) param.get("pageSize");
            List<UserDTO> users = userService.search(searchDTO, startPage, pageSize);
            response.setSuccess(true);
            response.setObjectReturn(users);
        } catch (Exception e) {
            response.setErrorMessage("Co loi xay ra: " + e.getMessage());
        }
        return response;
    }

    @RequestMapping(value = "/count", method = RequestMethod.POST)
    @ResponseBody
    public ResponseDTO count(@RequestBody Map<String, Object> param) {
        ResponseDTO response = new ResponseDTO(false);
        try {
            param = Optional.ofNullable(param).orElseGet(HashMap::new);
            ObjectMapper mapper = new ObjectMapper();
            UserDTO searchDTO = Optional.ofNullable(param.get("searchDTO"))
                    .map(x -> mapper.convertValue(x, UserDTO.class))
                    .orElseGet(UserDTO::new);
            response.setSuccess(true);
            response.setObjectReturn(userService.count(searchDTO));
        } catch (Exception e) {
            response.setErrorMessage("Co loi xay ra: " + e.getMessage());
        }
        return response;
    }


    @RequestMapping(value = "/{userId}", method = RequestMethod.GET)
    @ResponseBody
    public ResponseDTO findByUserId(@PathVariable final Long userId) {
        ResponseDTO response = new ResponseDTO(false);
        try {
            if (isNull(userId)) {
                response.setErrorMessage("userId must be not null");
                return response;
            }
            UserDTO users = userService.findOne(userId);
            response.setSuccess(true);
            response.setObjectReturn(users);
        } catch (Exception e) {
            response.setErrorMessage("Co loi xay ra: " + e.getMessage());
        }
        return response;
    }

    @PostMapping(value = "/login-admin")
    @ResponseBody
    public ResponseDTO login(@RequestBody Map<String, String> param) {
        ResponseDTO response = new ResponseDTO(false);
        try {
            requireNonNull(param, "param not found");
            String username = GlobalUtil.requireNonEmpty(param.get("username"), "username must be not null");
            String password = GlobalUtil.requireNonEmpty(param.get("password"), "password must be not null");
            UserDTO users = userService.loginAdmin(username, password);
            requireNonNull(users, "not found user");
            response.setSuccess(true);
            response.setObjectReturn(users);
        } catch (Exception e) {
            response.setErrorMessage("Co loi xay ra: " + e.getMessage());
        }
        return response;
    }

    @RequestMapping(value = "/register", method = RequestMethod.POST)
    @ResponseBody
    public ResponseDTO register(@RequestBody final UserDTO user) {
        ResponseDTO response = new ResponseDTO(false);
        try {
            userService.validate(user);
            UserDTO users = userService.register(user);
            response.setSuccess(true);
            response.setObjectReturn(users);
        } catch (Exception e) {
            response.setErrorMessage("Co loi xay ra: " + e.getMessage());
        }
        return response;
    }
    @RequestMapping(value = "/login", method = RequestMethod.POST)
    @ResponseBody
    public  ResponseDTO login(@RequestBody final  UserDTO user){
        ResponseDTO response = new ResponseDTO(false);
        try{
            if(GlobalUtil.isNullOrEmpty(user.getUserName())){
                response.setErrorMessage("Vui lòng nhập tên đăng nhập, số điện thoại hoặc email để đăng nhập");
                return response;
            }else if(GlobalUtil.isNullOrEmpty(user.getPassword())){
                response.setErrorMessage("Vui lòng nhập mật khẩu để đăng nhập");
                return response;
            }else {
                UserDTO userDTO = userService.login(
                        user.getUserName(),
                        user.getPassword());
                if(userDTO == null){
                    response.setSuccess(false);
                    response.setErrorMessage("Sai tên đăng nhập hoặc mật khẩu");
                    return response;
                }
                response.setSuccess(true);
                response.setObjectReturn(userDTO);
                return response;
            }
        }catch (Exception e){
            response.setErrorMessage("Co loi xay ra: "+ e.getMessage());
        }
        return response;
    }
    @PostMapping(value = "/")
    @ResponseBody
    public  ResponseDTO update(@RequestBody UserDTO user){
        ResponseDTO response = new ResponseDTO(false);
        try{
            user = requireNonNull(user, "Not found user param");
            UserDTO userDTO = userService.update(user);
            requireNonNull(userDTO, "Error save info user");
            response.setSuccess(true);
            response.setObjectReturn(userDTO);
        }catch (Exception e){
            response.setErrorMessage("Co loi xay ra: "+ e.getMessage());
        }
        return response;
    }

}
