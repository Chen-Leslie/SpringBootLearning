package com.springboot.config;

import ch.qos.logback.core.db.DBHelper;
import com.springboot.bean.Car;
import com.springboot.bean.Pet;
import com.springboot.bean.User;
import org.springframework.boot.autoconfigure.condition.ConditionalOnBean;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Conditional;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

/**
 * @author:Chen
 * @Date:2022/9/6
 * @Description:
 *
 * 1.配置类里面使用@Bean标注在方法上给容器注册组件，默认为单实例
 * 2.配置类本身也是组件
 * 3.@Configuration中含有属性proxyBeanMethods:是否是代理Bean的方法
 *   Full(proxyBeanMethods=true)
 *   Lite(proxyBeanMethods=false)
 *   组件依赖
 *   此配置项为true时，外界从MyConfig组件中无论调取多少次内部注册的组件，都是之前注册容器中的单组件单实例对象
 *   SpringBoot会始终检查容器中是否已有该组件对象。
 * 4、@Import({User.class, DBHelper.class})
 *   给容器中自动创造出这两个类型的组件,默认的组件名就是全类名
 */

@Import({User.class, DBHelper.class}) // 导入指定类型组件
@Configuration(proxyBeanMethods = true)// 告诉springboot这是一个配置类
@EnableConfigurationProperties(Car.class) // 开启Car的属性配置绑定功能;把组件自动注册到容器中

public class MyConfig {
    @Bean("tom")  // 以tom为组件名，而不是默认的方法名
    public Pet tomcatPet(){
        return new Pet("tomcat");
    }

    @ConditionalOnBean(name = "tom")
    @Bean // 给容器中添加组件，以方法名作为组件id，返回类型就是组建类型，返回的值就是组件在容器中的实例
    public User User01(){
        User zhangsan = new User("张三", "18");
        zhangsan.setPet(tomcatPet());
        return zhangsan;
    }
}
