package com.hlb.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.sql.DataSource;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 * Created by Fly on 2019/3/27.
 */
@Service
public class UserServiceImpl implements UserService {
    @Autowired
    private DataSource dataSource;

    @Override
    public void getAll() throws SQLException {
        Connection connection = dataSource.getConnection();
        PreparedStatement pst = connection.prepareStatement("select * from tb_user");
        ResultSet resultSet = pst.executeQuery();
        while (resultSet.next()) {
            System.out.println(resultSet.getObject(1)+":"+resultSet.getObject(2)+":"+resultSet.getObject(3));
        }
    }
}