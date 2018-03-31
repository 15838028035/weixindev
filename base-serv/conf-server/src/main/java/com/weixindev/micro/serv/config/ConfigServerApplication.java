package com.weixindev.micro.serv.config;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.config.server.EnableConfigServer;
import org.springframework.web.bind.annotation.RequestMapping;

/**
* 通过@EnableConfigServer注解激活配置服务.
* 说明：
* 在application.yml中有个git.uri的配置，目前配置的是https://github.com/15838028035/weixindev/
* 获取git上的资源信息遵循如下规则：
* /{application}/{profile}[/{label}]
* /{application}-{profile}.yml
* /{label}/{application}-{profile}.yml
* /{application}-{profile}.properties
* /{label}/{application}-{profile}.properties
*
* 例如本例：可使用以下路径来访问front-app-dev.properties：
* http://localhost:9004/front-app-dev.properties
* http://localhost:9004/front-app/dev
* ...
*/
@SpringBootApplication
@EnableConfigServer
@EnableDiscoveryClient
public class ConfigServerApplication {
	
	 @RequestMapping("/")
    public String home() {
        return "Hello config!";
    }
	 
	// FIXME encrypt配置文件
	public static void main(String[] args) {
		SpringApplication.run(ConfigServerApplication.class, args);
	}

}
