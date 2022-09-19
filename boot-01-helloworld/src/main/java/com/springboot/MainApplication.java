package com.springboot;

import ch.qos.logback.core.db.DBHelper;
import com.springboot.bean.Pet;
import com.springboot.bean.User;
import com.springboot.config.MyConfig;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

/**
 * @author:Chen
 * @Date:2022/9/6
 * @Description:主程序类
 * @SpringBootApplication:告诉这是一个SpringBoot应用
 */
@SpringBootApplication
public class MainApplication {
    public static void main(String[] args) {
        //SpringApplication.run(MainApplication.class, args);

        // 1、返回IOC容器
        ConfigurableApplicationContext run = SpringApplication.run(MainApplication.class, args);

        // 2、查看容器里的组件
        String[] names = run.getBeanDefinitionNames();
        for (String name: names) {
            System.out.println(name);
        }


        boolean tomcatPet = run.containsBean("tom");
        boolean user01 = run.containsBean("User01");
        System.out.println(user01);
        System.out.println(tomcatPet);
/*        // 3、从容器中获取组件
        Pet tom1 = run.getBean("tom", Pet.class);
        Pet tom2 = run.getBean("tom", Pet.class);
        System.out.println(tom1==tom2);

        MyConfig bean = run.getBean(MyConfig.class);
        System.out.println(bean);

        // 4、com.springboot.config.MyConfig$$EnhancerBySpringCGLIB$$4f6639bb@24e8de5c
        // 如果configuration(proxyBeanMethods=true)代理对象调用方法，Springboot就会检查这个组件是否保持组件单实例
        User user = bean.User01();
        User user1 = bean.User01();
        System.out.println(user == user1);

        User user01 = run.getBean("User01",User.class);
        Pet tom = run.getBean("tom", Pet.class);
        System.out.println(user01.getPet() == tom);

        // 5、获取组件
        String[] beanNamesForType = run.getBeanNamesForType(User.class);
        System.out.println("===========");
        for (String s: beanNamesForType) {
            System.out.println(s);
        }
        DBHelper bean1 = run.getBean(DBHelper.class);
        System.out.println(bean1);*/


    }
}
