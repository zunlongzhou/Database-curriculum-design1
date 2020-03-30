package com.dhu.team.service.impl;

import com.dhu.team.dao.LevelBasepayRepository;
import com.dhu.team.service.LevelBasePayService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.dhu.team.bean.LevelBasePay;

import java.util.List;

@Service
public class LevelBasePayServiceImpl implements LevelBasePayService{

    @Autowired
    private LevelBasepayRepository levelBasepayRepository;

    @Override
    public List<LevelBasePay> findAllLevelBasePay() {
        return levelBasepayRepository.findAll();
    }
}
