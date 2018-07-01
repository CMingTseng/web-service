package com.vietfintex.marketplace.persistence.repo;

import com.vietfintex.marketplace.persistence.model.GroupMember;

public interface GroupMemberCustomRepo {
    GroupMember findGroupMemberByGroupUser(Long groupMemberId, Long groupId, Long userId);
}
