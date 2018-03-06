package com.billgrim.server

import com.github.pagehelper.PageHelper
import org.springframework.boot.SpringApplication
import org.springframework.boot.autoconfigure.EnableAutoConfiguration
import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.ComponentScan
import org.springframework.scheduling.annotation.EnableScheduling

@SpringBootApplication
@EnableAutoConfiguration
@ComponentScan
@EnableScheduling
class ServerApplication {

    static void main(String[] args) {
        SpringApplication.run ServerApplication, args
    }

    @Bean
    PageHelper pageHelper() {
        PageHelper pageHelper = new PageHelper()
        Properties properties = new Properties()
        properties.setProperty("offsetAsPageNum", "true")
        properties.setProperty("rowBoundsWithCount", "true")
        properties.setProperty("reasonable", "true")
        properties.setProperty("dialect", "mysql")
        pageHelper.setProperties(properties)
        return pageHelper
    }
}
