package com.vietfintex.marketplace.web.service;

import com.vietfintex.marketplace.common.LogicException;
import com.vietfintex.marketplace.persistence.model.User;
import com.vietfintex.marketplace.web.dto.UserDTO;

import java.util.List;

public interface UserService extends IOperations<User, UserDTO> {
    void validate(UserDTO user) throws LogicException;

    UserDTO register(UserDTO userDTO) throws LogicException;

    UserDTO login(String username, String password);

    UserDTO loginAdmin(String username, String password);

    List<UserDTO> search(UserDTO searchDTO, int page, int size);

    Long count(UserDTO searchDTO);

    UserDTO checkUser(String username, String email, String phone);
}
