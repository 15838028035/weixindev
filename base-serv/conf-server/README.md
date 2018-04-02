
#配置管理开发工具包
整合spring cloud Bus 事件消息总线用于集群（例如：配置变化时间）中传播状态变化，与spring cloud config 联合实现热部署


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

/**
 * 通过@EnableConfigServer注解激活配置服务.
 * 说明：
 * 在application.properties中有个git.uri的配置，目前配置的是https://github.com/15838028035/weixindev/
 * 获取git上的资源信息遵循如下规则：
 * /{application}/{profile}[/{label}]
 * /{application}-{profile}.yml
 * /{label}/{application}-{profile}.yml
 * /{application}-{profile}.properties
 * /{label}/{application}-{profile}.properties
 *
 * 例如本例：可使用以下路径来访问microservice-config-client-dev.properties：
 * http://localhost:8040/microservice-config-client-dev.properties
 * http://localhost:8040/mhttps://github.com/15838028035/weixindev/icroservice-config-client/dev
 * ...
 */
@SpringBootApplication
@EnableConfigServer
public class ConfigServerApplication {
  public static void main(String[] args) {
    SpringApplication.run(ConfigServerApplication.class, args);
  }
}