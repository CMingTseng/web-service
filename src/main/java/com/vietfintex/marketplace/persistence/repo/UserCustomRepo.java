package com.vietfintex.marketplace.persistence.repo;

import com.vietfintex.marketplace.persistence.model.User;
import com.vietfintex.marketplace.web.dto.MenuDTO;
import com.vietfintex.marketplace.web.dto.UserDTO;

import java.util.List;

public interface UserCustomRepo {
    List<MenuDTO> findMenuPermission(Long userId);

    List<User> search(UserDTO searchDTO, int startPage, int pageSize);

    Long count(UserDTO userDTO);
}
