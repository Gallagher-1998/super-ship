package com.xiaoyun.config;

import com.alibaba.druid.filter.Filter;
import com.alibaba.druid.filter.stat.StatFilter;
import com.alibaba.druid.pool.DruidDataSource;
import com.alibaba.druid.support.http.StatViewServlet;
import com.google.common.collect.Lists;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.web.servlet.ServletRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;



import javax.sql.DataSource;

@Configuration
public class DruidConfig {
    @ConfigurationProperties(prefix = "spring.druid")
    @Bean(initMethod = "init", destroyMethod = "close")
    public DruidDataSource dataSource() {
               DruidDataSource dataSource = new DruidDataSource();
                dataSource.setProxyFilters(Lists.newArrayList(statFilter()));
               return dataSource;
           }

           //这里主要是配置了要打印的sql
            @Bean
    public Filter statFilter() {
               StatFilter filter = new StatFilter();
              filter.setSlowSqlMillis(1);
               filter.setLogSlowSql(true);
                filter.setMergeSql(true);
                return filter;
            }

        @Bean
  public ServletRegistrationBean servletRegistrationBean() {
                return new ServletRegistrationBean(new StatViewServlet(), "/druid/*");
            }

}
