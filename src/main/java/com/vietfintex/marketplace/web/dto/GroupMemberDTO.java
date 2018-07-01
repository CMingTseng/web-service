package com.vietfintex.marketplace.web.dto;

import com.fasterxml.jackson.annotation.JsonInclude;

import javax.persistence.*;

@JsonInclude(JsonInclude.Include.NON_EMPTY)
public class GroupMemberDTO {
    private Long groupMemberId;
    private Long groupId;
    private Long userId;
    private String status;

    public Long getGroupMemberId() {
        return groupMemberId;
    }

    public void setGroupMemberId(Long groupMemberId) {
        this.groupMemberId = groupMemberId;
    }

    public Long getGroupId() {
        return groupId;
    }

    public void setGroupId(Long groupId) {
        this.groupId = groupId;
    }

    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
}
