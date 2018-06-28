package com.vietfintex.marketplace.web.service;

import com.vietfintex.marketplace.common.LogicException;
import com.vietfintex.marketplace.persistence.model.UserData;
import com.vietfintex.marketplace.persistence.model.Users;
import com.vietfintex.marketplace.web.dto.ResponseDTO;
import com.vietfintex.marketplace.web.dto.UserDTO;

public interface UserService extends IOperations<Users, UserDTO> {
    void validate(UserDTO user) throws LogicException;

    UserDTO register(UserDTO userDTO) throws LogicException;
}
