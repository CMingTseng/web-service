package com.vietfintex.marketplace.web.service.impl;

import com.vietfintex.marketplace.persistence.model.GroupClub;
import com.vietfintex.marketplace.persistence.model.GroupMember;
import com.vietfintex.marketplace.persistence.repo.GroupClubCustomRepo;
import com.vietfintex.marketplace.persistence.repo.GroupClubRepo;
import com.vietfintex.marketplace.persistence.repo.GroupMemberCustomRepo;
import com.vietfintex.marketplace.persistence.repo.GroupMemberRepo;
import com.vietfintex.marketplace.util.BaseMapper;
import com.vietfintex.marketplace.util.GlobalUtil;
import com.vietfintex.marketplace.web.dto.GroupClubDTO;
import com.vietfintex.marketplace.web.dto.GroupMemberDTO;
import com.vietfintex.marketplace.web.service.GroupClubService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Example;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.math.BigInteger;
import java.util.List;

@Service
public class GroupClubServiceImpl extends AbstractService<GroupClub, GroupClubDTO> implements GroupClubService {
    private static final BaseMapper<GroupClub, GroupClubDTO> mapper = new BaseMapper<>(GroupClub.class,
            GroupClubDTO.class);
    @Autowired
    private GroupClubRepo repo;

    @Autowired
    private GroupMemberRepo groupMemberRepo;
    private static final BaseMapper<GroupMember, GroupMemberDTO> groupMemberMapper = new BaseMapper<>(GroupMember.class,
            GroupMemberDTO.class);

    @Override
    @Transactional(rollbackFor = Exception.class)
    public GroupClubDTO createOrInsertClub(Long userLoginId,GroupClubDTO groupClubDTO) {
        GroupClubDTO group = getMapper().toDtoBean(getDao().save(getMapper().toPersistenceBean(groupClubDTO)));
        //kiem tra & cap nhat vao bang group_member.
        GroupMember groupMember = groupMemberRepo.findGroupMemberByGroupUser(null,group.getGroupId(),userLoginId);

        if(groupMember == null){
            groupMember = new GroupMember();
            groupMember.setGroupId(group.getGroupId());
            groupMember.setUserId(userLoginId);
            groupMember.setStatus("A");
            groupMember.setLevel(0);
            groupMemberRepo.save(groupMember);
        }
        group.setAccessKey(GlobalUtil.sha256(group.getGroupId() + ""));
        group.setMemberCount(groupMemberRepo.getMemberCountByGroupId(group.getGroupId()));
        return getMapper().toDtoBean(getDao().save(getMapper().toPersistenceBean(group)));
    }

    @Override
    public List<GroupClubDTO> getListGroupClub(Integer page,Long groupId, String privacy, String keyword, Long ownerId) {
        return getMapper().toDtoBean(repo.getListGroupClub(groupId, privacy, keyword, ownerId,page));
    }

    @Override
    public List<GroupClubDTO> getListOtherGroupClub(Integer page,Long groupId, String privacy, String keyword, Long ownerId) {
        return getMapper().toDtoBean(repo.getListOtherGroupClub(groupId, privacy, keyword, ownerId,page));
    }

    @Override
    @Transactional(rollbackFor = Exception.class)
    public void deleteGroupClub(GroupClubDTO groupClubDTO) {
        repo.delete(getMapper().toPersistenceBean(groupClubDTO));
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
