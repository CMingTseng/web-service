package com.vietfintex.marketplace.web.service.impl;

import com.vietfintex.marketplace.persistence.model.GroupClub;
import com.vietfintex.marketplace.persistence.repo.GroupClubCustomRepo;
import com.vietfintex.marketplace.persistence.repo.GroupClubRepo;
import com.vietfintex.marketplace.util.BaseMapper;
import com.vietfintex.marketplace.web.dto.GroupClubDTO;
import com.vietfintex.marketplace.web.service.GroupClubService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Service;

import java.math.BigInteger;
import java.util.List;
@Service
public class GroupClubServiceImpl extends  AbstractService<GroupClub,GroupClubDTO> implements GroupClubService {
    private static final BaseMapper<GroupClub, GroupClubDTO> mapper = new BaseMapper<>(GroupClub.class, GroupClubDTO.class);
    @Autowired
    private GroupClubRepo repo;

    @Override
    public GroupClubDTO createOrInsertClub(GroupClubDTO groupClubDTO) {
        return getMapper().toDtoBean(getDao().save(getMapper().toPersistenceBean(groupClubDTO)));
    }

    @Override
    public List<GroupClubDTO> getListGroupClub(Long groupId, String privacy, String keyword, BigInteger ownerId) {
        return getMapper().toDtoBean(repo.getListGroupClub(groupId, privacy, keyword, ownerId));
    }

    @Override
    protected PagingAndSortingRepository<GroupClub, Long> getDao() {
        return repo;
    }

    @Override
    protected BaseMapper<GroupClub, GroupClubDTO> getMapper() {
        return mapper;
    }
}
