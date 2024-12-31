package com.wsl.working1227.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.extern.apachecommons.CommonsLog;

import java.io.Serializable;

@CommonsLog
@NoArgsConstructor
@AllArgsConstructor
@Data
//【注意】因为使用了二级缓存，所以需要实现序列化
public class ZhangHao implements Serializable {
    private Integer id;
    private String name;
    private Integer password;

    public ZhangHao(String name, String password) {
    }
}


