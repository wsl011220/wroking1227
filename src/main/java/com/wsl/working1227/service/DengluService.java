package com.wsl.working1227.service;

import com.wsl.working1227.entity.ZhangHao;
import org.springframework.stereotype.Service;

import java.util.List;
public interface DengluService {

    ZhangHao dengLu(String name) ;
    ZhangHao  zhuce(ZhangHao zhangHao);

}
