package com.atguigu.springcloud.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

/**
 * @auther zzyy
 * @create 2020-02-18 17:22
 */
@Data
@AllArgsConstructor     //生成全参数构造函数
@NoArgsConstructor      //生成无参数构造函数
public class Payment implements Serializable {
    private Long id;
    private String serial;
}
