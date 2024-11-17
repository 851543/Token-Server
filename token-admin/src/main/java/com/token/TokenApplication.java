package com.token;

import com.alibaba.druid.spring.boot.autoconfigure.DruidDataSourceAutoConfigure;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

/**
 * 启动程序
 *
 * @author token
 */
@SpringBootApplication(exclude = {
        DataSourceAutoConfiguration.class
})
public class TokenApplication {
    public static void main(String[] args) {
        SpringApplication.run(TokenApplication.class,args);
        System.out.println("   _               _                     \n" +
                "  | |_     ___    | |__    ___    _ _    \n" +
                "  |  _|   / _ \\   | / /   / -_)  | ' \\   \n" +
                "  _\\__|   \\___/   |_\\_\\   \\___|  |_||_|  \n" +
                "_|\"\"\"\"\"|_|\"\"\"\"\"|_|\"\"\"\"\"|_|\"\"\"\"\"|_|\"\"\"\"\"| \n" +
                "\"`-欢-迎-'\"`-你-使-'\"`-用-T-'\"`-O-K-'\"`-E-N-' \n" +
                "\n");
    }
}
