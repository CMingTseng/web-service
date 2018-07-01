package com.vietfintex.marketplace.web.service.impl;

import com.vietfintex.marketplace.common.LogicException;
import com.vietfintex.marketplace.persistence.model.User;
import com.vietfintex.marketplace.persistence.repo.UserRepo;
import com.vietfintex.marketplace.util.BaseMapper;
import com.vietfintex.marketplace.web.dto.MenuDTO;
import com.vietfintex.marketplace.web.dto.UserDTO;
import com.vietfintex.marketplace.web.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Service;

import java.util.List;

import static java.util.Objects.isNull;

@Service
public class UserServiceImpl extends AbstractService<User, UserDTO> implements UserService {
    private static final BaseMapper<User, UserDTO> mapper = new BaseMapper<>(User.class, UserDTO.class);
    @Autowired
    private UserRepo userRepo;

    @Override
    protected PagingAndSortingRepository<User, Long> getDao() {
        return userRepo;
    }

    @Override
    protected BaseMapper<User, UserDTO> getMapper() {
        return mapper;
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

    @Override
    public UserDTO login(String username, String password) {
        User user = userRepo.findByUsername(username, password);
        if (isNull(user)){
            user = userRepo.findByEmail(username, password);
        }
        if (isNull(user)){
            user = userRepo.findByPhone(username, password);
        }
        return getMapper().toDtoBean(user);
    }

    @Override
    public UserDTO loginAdmin(String username, String password) {
        UserDTO userDTO = login(username, password);
        if (isNull(userDTO)) return null;
        userDTO.setMenuList(userRepo.findMenuPermission(userDTO.getUserId()));
        return userDTO;
    }

    @Override
    public List<UserDTO> search(UserDTO searchDTO, int page, int size) {
        return getMapper().toDtoBean(userRepo.search(searchDTO, page, size));
    }

    @Override
    public long count(UserDTO searchDTO) {
        return userRepo.count(searchDTO);
    }
}
