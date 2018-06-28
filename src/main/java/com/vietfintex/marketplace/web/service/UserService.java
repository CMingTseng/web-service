package com.vietfintex.marketplace.web.service;

import com.vietfintex.marketplace.common.LogicException;
import com.vietfintex.marketplace.persistence.model.User;
import com.vietfintex.marketplace.web.dto.UserDTO;

public interface UserService extends IOperations<User, UserDTO> {
    void validate(UserDTO user) throws LogicException;

    UserDTO register(UserDTO userDTO) throws LogicException;

    UserDTO login(String username, String password);
}
