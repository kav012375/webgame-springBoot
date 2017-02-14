package com.webgame.dal.User.dao;

import com.webgame.dal.User.entity.UserDO;
import org.apache.ibatis.annotations.*;
import org.springframework.stereotype.Component;


/**
 * Created by zeusw on 2017/2/13.
 */
@Component
public interface UserDAO {

    //统计注册用户数量
    int count();

    void InsertNewUser(UserDO userDO);

    UserDO FindUserInfoByUserAcct(@Param("USER_ACCT") String user_acct);

}
