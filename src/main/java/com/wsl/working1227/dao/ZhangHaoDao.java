package com.wsl.working1227.dao;


import com.wsl.working1227.entity.ZhangHao;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ZhangHaoDao {
    ZhangHao findAll(String name);
}

