package com.vietfintex.marketplace.persistence.repo;
import com.vietfintex.marketplace.persistence.model.GroupMember;
import org.springframework.data.jpa.repository.JpaRepository;

import java.math.BigInteger;

public interface GroupMemberRepo  extends JpaRepository<GroupMember, BigInteger>, GroupMemberCustomRepo  {
}
