package com.vietfintex.marketplace.persistence.repo;

import com.vietfintex.marketplace.persistence.model.GroupClub;

import java.math.BigInteger;
import java.util.List;

public interface GroupClubCustomRepo {
    List<GroupClub> getListGroupClub(Long groupId, String privacy, String keyword,Long ownerId);
}
