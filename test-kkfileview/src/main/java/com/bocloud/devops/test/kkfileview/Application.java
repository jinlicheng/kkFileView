package com.bocloud.devops.test.kkfileview;

import cn.keking.config.AppBanner;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.web.ServerProperties;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.util.StopWatch;

/**
 * @author kelvin
 */
@SpringBootApplication
public class Application {
    private static final Logger logger = LoggerFactory.getLogger(Application.class);

    public static void main(String[] args) {
        StopWatch stopWatch = new StopWatch();
        stopWatch.start();
        ConfigurableApplicationContext context = new SpringApplicationBuilder(Application.class)
                .logStartupInfo(false)
                .banner(new AppBanner())
                .run(args);
        stopWatch.stop();
        Integer port = context.getBean(ServerProperties.class).getPort();
        logger.info("kkFileView 服务启动完成，耗时:{}s，演示页请访问: http://127.0.0.1:{} ", stopWatch.getTotalTimeSeconds(), port);
    }
}
