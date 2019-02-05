package com.lemon.service;

import com.lemon.entity.Weight;
import org.springframework.stereotype.Service;

@Service
public interface WeightService {

    public Weight findOne(Weight weight)throws Exception;

    public Weight saveWeight(Weight weight)throws Exception;
}
