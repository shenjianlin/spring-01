package com.spring.mapper;

import com.spring.domain.UserDo;
import lombok.extern.slf4j.Slf4j;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import static org.junit.Assert.*;

/**
 * Created by ASUS on 2017/4/19.
 */
@Slf4j
public class UserDoMapperTest extends BaseSpringTest {

    //运行时才扫描   @Autowired(required = false) 加上userDoMapper 就不会报错
    @Autowired(required = false)
    private UserDoMapper userDoMapper;

    @Before
    public void setUp() throws Exception {

    }

    @After
    public void tearDown() throws Exception {

    }
    @Test
    public  void TestFindById(){
        UserDo user=new UserDo();
        user.setUserId(1004);

        //按照主键查询
        UserDo res=userDoMapper.selectOne(user);

        log.info("查询结果 UserDo : {}",res.toString());
    }
    @Test
    public void testModifyUser(){
        UserDo user = new UserDo();
        user.setUserId(1004);
        user.setRealName("沙瑞金b");

        Integer res = userDoMapper.updateByPrimaryKeySelective(user);

        log.info("影响的行数 ：{}", res);
    }

    @Test
    public void testDelUser(){
        UserDo user = new UserDo();
        user.setUserId(1012);

        Integer res = userDoMapper.delete(user);

        log.info("影响的行数 ：{}", res);
    }

}
