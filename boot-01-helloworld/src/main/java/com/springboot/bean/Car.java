package com.springboot.bean;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

/**
 * @author cbr
 * @version 1.0
 * @date 2022-09-19
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
@Component   // 需要将组件注册到容器中，只有这样才能拥有SpringBoot的功能
@ConfigurationProperties(prefix="mycar")
public class Car {
    private String brand;
    private Integer price;
}
