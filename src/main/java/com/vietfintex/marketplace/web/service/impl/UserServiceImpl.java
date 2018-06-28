package com.vietfintex.marketplace.web.service.impl;

import com.vietfintex.marketplace.common.LogicException;
import com.vietfintex.marketplace.persistence.model.Users;
import com.vietfintex.marketplace.persistence.repo.UserRepo;
import com.vietfintex.marketplace.util.BaseMapper;
import com.vietfintex.marketplace.web.dto.ResponseDTO;
import com.vietfintex.marketplace.web.dto.UserDTO;
import com.vietfintex.marketplace.web.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Service;

import static java.util.Objects.isNull;

@Service
public class UserServiceImpl extends AbstractService<Users, UserDTO> implements UserService {
    private static final BaseMapper<Users, UserDTO> mapper = new BaseMapper<>(Users.class, UserDTO.class);
    @Autowired
    private UserRepo userRepo;

    @Override
    protected PagingAndSortingRepository<Users, Long> getDao() {
        return userRepo;
    }

    @Override
    protected BaseMapper<Users, UserDTO> getMapper() {
        return mapper;
    }

    @Override
    public UserDTO findOne(Long id) {
        return getMapper().toDtoBean(userRepo.findByUserId(id));
    }

    @Override
    public void validate(UserDTO user) throws LogicException {
        if (isNull(user)) {
            throw new LogicException("user must be not null");
        }
    }

    @Override
    public UserDTO register(UserDTO userDTO) throws LogicException{
        return getMapper().toDtoBean(getDao().save(getMapper().toPersistenceBean(userDTO)));
    }
}
