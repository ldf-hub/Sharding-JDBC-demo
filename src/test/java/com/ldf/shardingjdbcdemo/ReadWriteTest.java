package com.ldf.shardingjdbcdemo;

import com.ldf.shardingjdbcdemo.entity.User;
import com.ldf.shardingjdbcdemo.mapper.UserMapper;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@SpringBootTest
public class ReadWriteTest {

    @Autowired
    private UserMapper userMapper;


    /**
     * 读写分离：写入数据的测试
     */
    @Test
    public void testInsert(){

        User user = new User();
        user.setUname("张三丰");
        userMapper.insert(user);
    }

    /**
     * 读写分离：事务测试
     */
    @Transactional//开启事务
    @Test
    public void testTrans(){

        User user = new User();
        user.setUname("铁锤");
        userMapper.insert(user);

        List<User> users = userMapper.selectList(null);
    }


    /**
     * 读写分离：负载均衡测试
     */
    @Test
    public void testSelectAll(){

        List<User> users1 = userMapper.selectList(null);
        List<User> users2 = userMapper.selectList(null);
        List<User> users3 = userMapper.selectList(null);
        List<User> users4 = userMapper.selectList(null);
        List<User> users5 = userMapper.selectList(null);
        List<User> users6 = userMapper.selectList(null);
        List<User> users7 = userMapper.selectList(null);
        List<User> users8 = userMapper.selectList(null);
        List<User> users9 = userMapper.selectList(null);
        List<User> users10 = userMapper.selectList(null);
        List<User> users11 = userMapper.selectList(null);
        List<User> users12 = userMapper.selectList(null);
        List<User> users13 = userMapper.selectList(null);
        List<User> users14 = userMapper.selectList(null);
        List<User> users15 = userMapper.selectList(null);
//        users.forEach(System.out::println);
    }

}
