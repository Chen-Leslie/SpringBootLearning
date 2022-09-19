package com.SpringBootLearning.bean;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

/**
 * @author:Chen
 * @Date:2022/9/6
 * @Description:
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class Pet {
    private String name;
    private Double weight;
}
