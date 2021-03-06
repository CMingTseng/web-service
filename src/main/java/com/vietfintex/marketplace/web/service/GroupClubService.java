package com.vietfintex.marketplace.web.service;

import com.vietfintex.marketplace.persistence.model.GroupClub;
import com.vietfintex.marketplace.web.dto.GroupClubDTO;

import java.math.BigInteger;
import java.util.List;

public interface GroupClubService extends IOperations<GroupClub, GroupClubDTO> {
    GroupClubDTO    createOrInsertClub(Long userLoginId,GroupClubDTO groupClubDTO);
    List<GroupClubDTO>  getListGroupClub(Integer page, Long groupId, String privacy, String keyword, Long ownerId);
    List<GroupClubDTO>  getListOtherGroupClub(Integer page,Long groupId, String privacy, String keyword, Long ownerId);
    void deleteGroupClub(GroupClubDTO groupClubDTO);
}
