package com.dhu.team.controller;

import com.dhu.team.service.LevelBasePayService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import com.dhu.team.bean.LevelBasePay;

@RestController
@RequestMapping("/test")
public class LevelBasePayController {

    @Autowired
    private LevelBasePayService levelBasePayService;

    @GetMapping("/findAll")
    public List<LevelBasePay> findAllLevelBasePay(){
        return levelBasePayService.findAllLevelBasePay();
    }
}
