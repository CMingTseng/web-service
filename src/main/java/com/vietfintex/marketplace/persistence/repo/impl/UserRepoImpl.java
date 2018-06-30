package com.vietfintex.marketplace.persistence.repo.impl;

import com.vietfintex.marketplace.persistence.model.User;
import com.vietfintex.marketplace.persistence.repo.UserCustomRepo;
import com.vietfintex.marketplace.web.dto.MenuDTO;
import com.vietfintex.marketplace.web.dto.UserDTO;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import static com.vietfintex.marketplace.util.GlobalUtil.isEmpty;
import static com.vietfintex.marketplace.util.NumberUtils.convertToLong;
import static com.vietfintex.marketplace.util.NumberUtils.convertToString;
import static java.util.Objects.isNull;

public class UserRepoImpl implements UserCustomRepo {
    @PersistenceContext
    private EntityManager em;

    @Override
    public List<MenuDTO> findMenuPermission(Long userId) {
        String sql = "select ac.admin_section_id, ac.admin_section_parent_id, ac.section_key, ac.url, ac.icon from\n" +
                "  admin_role ar, role_permission rp, admin_section ac\n" +
                "where ar.role_id = rp.role_id and rp.admin_section_id = ac.admin_section_id\n" +
                "      and ac.status ='A' and ac.status = 'A' and ar.status = 'A'\n" +
                "      and ar.user_id = :userId  order by ac.admin_section_parent_id, ac.section_order";
        Query query = em.createNativeQuery(sql);
        query.setParameter("userId", userId);
        List<Object[]> lst = query.getResultList();
        if (isEmpty(lst)) return null;

        int i;
        List<MenuDTO> menuDTOList = new ArrayList<>();
        for (Object[] objs: lst){
            i = 0;
            MenuDTO menuDTO = new MenuDTO();
            menuDTO.setMenuId(convertToLong(objs[i++]));
            menuDTO.setParentMenuId(convertToLong(objs[i++]));
            menuDTO.setMenuKey(convertToString(objs[i++]));
            menuDTO.setUrl(convertToString(objs[i++]));
            menuDTO.setIcon(convertToString(objs[i]));
            if (isNull(menuDTO.getParentMenuId())){
                menuDTOList.add(menuDTO);
            }else{
                for (MenuDTO menu: menuDTOList){
                    if (menu.getMenuId().equals(menuDTO.getParentMenuId())){
                        menu.addChildMenu(menuDTO);
                        break;
                    }
                }
            }
        }
        return menuDTOList;
    }

    @Override
    public List<User> search(UserDTO searchDTO, int startPage, int pageSize) {
        if (isNull(searchDTO)){
            return null;
        }
        Map<String, Object> param = new HashMap<>();
        String sql = "SELECT * FROM user u WHERE 1=1 ";
        if (!isEmpty(searchDTO.getUserName())){
            sql += " AND u.user_name like CONCAT('%',:userName,'%')";
            param.put("userName", searchDTO.getUserName());
        }
        if (!isEmpty(searchDTO.getEmail())){
            sql += " AND u.email like CONCAT('%',:email,'%')";
            param.put("email", searchDTO.getEmail());
        }
        if (!isEmpty(searchDTO.getPhone())){
            sql += " AND u.phone like CONCAT('%',:phone,'%')";
            param.put("phone", searchDTO.getPhone());
        }
        if (!isEmpty(searchDTO.getFirstname())){
            sql += " AND u.firstname like CONCAT('%',:firstname,'%')";
            param.put("firstname", searchDTO.getFirstname());
        }
        if (!isEmpty(searchDTO.getLastname())){
            sql += " AND u.lastname like CONCAT('%',:lastname,'%')";
            param.put("lastname", searchDTO.getLastname());
        }
        Query query = em.createNativeQuery(sql, User.class);
        param.forEach(query::setParameter);
        return query.getResultList();
    }

    @Override
    public Long count(UserDTO searchDTO) {
        if (isNull(searchDTO)){
            return null;
        }
        Map<String, Object> param = new HashMap<>();
        String sql = "SELECT count(*) FROM user u WHERE 1=1 ";
        if (!isEmpty(searchDTO.getUserName())){
            sql += " AND u.user_name like CONCAT('%',:userName,'%')";
            param.put("userName", searchDTO.getUserName());
        }
        if (!isEmpty(searchDTO.getEmail())){
            sql += " AND u.email like CONCAT('%',:email,'%')";
            param.put("email", searchDTO.getEmail());
        }
        if (!isEmpty(searchDTO.getPhone())){
            sql += " AND u.phone like CONCAT('%',:phone,'%')";
            param.put("phone", searchDTO.getPhone());
        }
        if (!isEmpty(searchDTO.getFirstname())){
            sql += " AND u.firstname like CONCAT('%',:firstname,'%')";
            param.put("firstname", searchDTO.getFirstname());
        }
        if (!isEmpty(searchDTO.getLastname())){
            sql += " AND u.lastname like CONCAT('%',:lastname,'%')";
            param.put("lastname", searchDTO.getLastname());
        }
        Query query = em.createNativeQuery(sql, UserDTO.class);
        param.forEach(query::setParameter);
        return convertToLong(query.getSingleResult());
    }
}
