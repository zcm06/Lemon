package com.lemon.service.impl;

import com.lemon.dao.WeightRepository;
import com.lemon.entity.Weight;
import com.lemon.service.WeightService;
import com.lemon.utils.Func;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Example;

import java.util.Optional;

public class WeightServiceImpl implements WeightService {

    @Autowired
    private WeightRepository weightRepository;

    @Override
    public Weight findOne(Weight weight) throws Exception {
        if (Func.checkNullOrEmpty(weight)) {
            throw new Exception("参数为空");
        }
        Example<Weight> example = Example.of(weight);
        Optional<Weight> optional = weightRepository.findOne(example);
        return optional.get();
    }

    @Override
    public Weight saveWeight(Weight weight) throws Exception {
        if (Func.checkNullOrEmpty(weight)) {
            throw new Exception("参数为空");
        }
        return weightRepository.save(weight);
    }
}
