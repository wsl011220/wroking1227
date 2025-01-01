package com.wsl.working1227.service.Impl;

import com.wsl.working1227.dao.ZhangHaoDao;
import com.wsl.working1227.entity.ZhangHao;
import com.wsl.working1227.service.DengluService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import java.util.List;

@Service("DengluService")
public class DengluServiceImpl implements DengluService {
    @Autowired
    private ZhangHaoDao zhangHaoDao;

    @Override
    public ZhangHao dengLu(String name) {
        return zhangHaoDao.findAll(name);

    }

    @Override
    public ZhangHao zhuce(ZhangHao zhangHao) {
        return null;
    }
}
