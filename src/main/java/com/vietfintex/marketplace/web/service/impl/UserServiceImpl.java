package com.vietfintex.marketplace.web.service.impl;

import com.vietfintex.marketplace.persistence.model.Users;
import com.vietfintex.marketplace.persistence.repo.UserRepo;
import com.vietfintex.marketplace.web.dto.ResponseDTO;
import com.vietfintex.marketplace.web.dto.UserDTO;
import com.vietfintex.marketplace.web.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Service;

import static java.util.Objects.isNull;

@Service
public class UserServiceImpl extends AbstractService<UserDTO> implements UserService {
    @Autowired
    private UserRepo userRepo;

    @Override
    protected PagingAndSortingRepository<Users, Long> getDao() {
        return userRepo;
    }

    @Override
    public UserDTO findOne(Long id) {
        return userRepo.findByUserId(id);
    }

    @Override
    public ResponseDTO validate(Users user) {
        ResponseDTO response = new ResponseDTO(false);
        if (isNull(user)) {
            response.setErrorMessage("user must be not null");
            return response;
        }
        response.setSuccess(true);
        return response;
    }
}
