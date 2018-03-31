package com.weixindev.account.test;

import org.jasypt.encryption.StringEncryptor;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;

import com.weixindev.account.AccountServApplication;


@RunWith(SpringJUnit4ClassRunner.class)
@WebAppConfiguration
@SpringBootTest(classes = AccountServApplication.class)
public class Jasyptest {
	
	@Autowired
	StringEncryptor encryptor;
	
	 @Value("${spring.datasource.username}")
	 private String username;
    @Value("${spring.datasource.password}")
    private String password;
	
	@Test
	public void getPass() {
		String result = encryptor.encrypt("root");
        System.out.println(result+"----------------"); 
        Assert.assertTrue(result.length() > 0);
	}
	
	@Test
	public void getPass2() {
		String result = encryptor.decrypt("EbfYkitulv73I2p0mXI50JMXoaxZTKJ7");
        System.out.println(result+"----------------"); 
	}
	
	@Test
    public void test() {
        System.out.println("连接数据库userName" + username +",password" + password);
    }
}
