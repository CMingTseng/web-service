package com.vietfintex.marketplace.web.service;

import com.vietfintex.marketplace.persistence.model.Users;
import com.vietfintex.marketplace.web.dto.ResponseDTO;

public interface UserService extends IOperations<Users> {
    ResponseDTO validate(Users user);
}
