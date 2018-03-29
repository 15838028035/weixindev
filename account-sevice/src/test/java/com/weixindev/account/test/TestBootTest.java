package com.weixindev.account.test;

import org.jasypt.encryption.StringEncryptor;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;

import com.weixindev.account.AccountServApplication;

@RunWith(SpringJUnit4ClassRunner.class)
@WebAppConfiguration
@SpringBootTest(classes = AccountServApplication.class)
public class TestBootTest {
	 @Autowired
	    StringEncryptor stringEncryptor;//密码解码器自动注入

	    @Test
	    public void test() {
	        System.out.println(stringEncryptor.encrypt("root"));
	    }
}
