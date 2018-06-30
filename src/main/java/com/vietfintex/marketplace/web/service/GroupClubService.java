package com.vietfintex.marketplace.web.service;

import com.vietfintex.marketplace.persistence.model.GroupClub;
import com.vietfintex.marketplace.web.dto.GroupClubDTO;

import java.math.BigInteger;
import java.util.List;

public interface GroupClubService extends IOperations<GroupClub, GroupClubDTO> {
    GroupClubDTO    createOrInsertClub(GroupClubDTO groupClubDTO);
    List<GroupClubDTO>  getListGroupClub(Long groupId, String privacy, String keyword, BigInteger ownerId);
}
