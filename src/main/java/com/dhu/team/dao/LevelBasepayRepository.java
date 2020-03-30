package com.dhu.team.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.dhu.team.bean.LevelBasePay;

import java.util.List;

@Repository
public interface LevelBasepayRepository extends JpaRepository<LevelBasePay,Integer> {
    List<LevelBasePay> findAll();
}
