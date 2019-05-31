package main;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

import javax.servlet.annotation.ServletSecurity;

/**
 * sbootConfigServer 主程序
 */
@SpringBootApplication
@EnableConfigServer
public class SbootConfigServer {
    private static Logger logger = LoggerFactory.getLogger(SbootConfigServer.class);
    public static void main(String[] args) {
        logger.info("sbootConfigServer 主程序开始启动。。。。。");
        SpringApplication.run(SbootConfigServer.class, args);
        logger.info("sbootConfigServer 主程序结束启动。。。。。");
    }
}
