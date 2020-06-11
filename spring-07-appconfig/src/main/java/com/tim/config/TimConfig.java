package com.tim.config;

import com.tim.pojo.User;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

//这个也会被Spring容器托管, 注册到容器中, 因为它本身就是要给@Component
//@Configuration代表这是一个配置类, 就和我们之前看的beans.xml一样

@Configuration
public class TimConfig {
    //注册一个bean, 就相当于我们之前写的一个bean标签
    //这个方法的名字, 就相当于bean标签中的id属性
    //这个方法的返回值, 就相当于bean标签中的class属性

    @Bean
    public User getUser(){
        //返回要注入到bean的对象
        return new User();
    }
}
