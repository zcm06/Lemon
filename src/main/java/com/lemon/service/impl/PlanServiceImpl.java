package com.lemon.service.impl;

import com.lemon.dao.PlanRepository;
import com.lemon.entity.Plan;
import com.lemon.service.PlanService;
import com.lemon.utils.Func;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Example;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class PlanServiceImpl implements PlanService {

    @Autowired
    private PlanRepository planRepository;

    @Override
    public Plan findOne(Plan plan) throws Exception {
        if (Func.checkNullOrEmpty(plan)) {
            throw new Exception("参数为空");
        }
        Example<Plan> example = Example.of(plan);
        Optional<Plan> optional = planRepository.findOne(example);
        return optional.get();
    }

    @Override
    public Plan saveWeight(Plan plan) throws Exception {
        if (Func.checkNullOrEmpty(plan)) {
            throw new Exception("参数为空");
        }
        return planRepository.save(plan);
    }
}
