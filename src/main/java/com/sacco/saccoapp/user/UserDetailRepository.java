package com.sacco.saccoapp.user;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface UserDetailRepository extends JpaRepository<UserDetail,Long> {

    @Query("SELECT s from UserDetail s where s.memberNo=?1")
    Optional<UserDetail> findUserDetailByMemberNo(String memberNo);

}
