package com.webgame.service;

import com.webgame.dal.User.dao.UserDAO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.EnableTransactionManagement;

/**
 * Created by zeusw on 2017/2/10.
 */
@Component
@Service
public class ServiceTest {
    @Autowired
    UserDAO userDAO;

    public String getString(){
        return String.valueOf(userDAO.count());
    }
}
