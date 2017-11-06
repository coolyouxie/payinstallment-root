package service.common;

import com.alibaba.druid.pool.DruidDataSource;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import javax.sql.DataSource;

/**
 * Created by xieshuai on 2017-11-3.
 */
@Configuration
public class DBConfig {

    @Bean
    @ConfigurationProperties(prefix = "spring.datasource")
    public static DataSource druidDataSource(){
        DruidDataSource druidDataSource = new DruidDataSource();
        return druidDataSource;
    }

}
