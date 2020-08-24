package com.sy.yuanfei;

import com.sy.yuanfei.common.config.CasConfig;
import com.sy.yuanfei.common.config.ShiroConfig;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.Import;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@Import(value = {ShiroConfig.class, CasConfig.class})
@EnableJpaRepositories(basePackages = {"com.sy.yuanfei.mapper"})
//持久化类扫描
@EntityScan(basePackages = {"com.sy.yuanfei.model"})
public class SlmemberApplication {

    public static void main(String[] args) {
        SpringApplication.run(SlmemberApplication.class, args);
    }

}
