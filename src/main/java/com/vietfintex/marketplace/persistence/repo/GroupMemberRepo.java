package com.vietfintex.marketplace.persistence.repo;
import com.vietfintex.marketplace.persistence.model.GroupMember;
import com.vietfintex.marketplace.persistence.model.Store;
import com.vietfintex.marketplace.web.dto.GroupMemberDTO;
import org.springframework.data.jpa.repository.JpaRepository;

import java.math.BigInteger;
import java.util.List;

public interface GroupMemberRepo  extends JpaRepository<GroupMember, BigInteger>, GroupMemberCustomRepo  {
    List<GroupMemberDTO> getByUserId(Long userID);
}
