package com.example.sqlhandling.Repostory;

import com.example.sqlhandling.Entitys.UserDetail;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface repo extends JpaRepository<UserDetail,Integer> {

    @Query(value ="SELECT * FROM USER_DETAIL WHERE USER_ID=?1",nativeQuery = true)
    UserDetail getUserById(int userid);

    @Query(value ="SELECT * FROM USER_DETAIL WHERE USER_ID=?1 AND USER_ADDRESS=?2",nativeQuery = true)
    UserDetail getUserByIdandAddress(int userid,String address);
}
