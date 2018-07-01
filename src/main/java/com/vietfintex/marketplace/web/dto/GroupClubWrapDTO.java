package com.vietfintex.marketplace.web.dto;

import com.fasterxml.jackson.annotation.JsonInclude;

import java.io.Serializable;
import java.math.BigInteger;

@JsonInclude(JsonInclude.Include.NON_EMPTY)
public class GroupClubWrapDTO implements Serializable {
    private static final long serialVersionUID = 1L;

    private Long userLoginId;
    private GroupClubDTO groupClubDTO;

    public Long getUserLoginId() {
        return userLoginId;
    }

    public void setUserLoginId(Long userLoginId) {
        this.userLoginId = userLoginId;
    }

    public GroupClubDTO getGroupClubDTO() {
        return groupClubDTO;
    }

    public void setGroupClubDTO(GroupClubDTO groupClubDTO) {
        this.groupClubDTO = groupClubDTO;
    }
}
