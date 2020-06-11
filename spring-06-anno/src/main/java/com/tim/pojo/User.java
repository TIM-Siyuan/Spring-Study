package com.tim.pojo;

import jdk.nashorn.internal.objects.annotations.ScriptClass;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

//等价于<bean id="user" class="com.tim.pojo.User"/>

@Component
@Scope("singleton")
public class User {

    //相当于<property name="name" value="TIM"/>

    @Value("TIM")
    public String name;

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
