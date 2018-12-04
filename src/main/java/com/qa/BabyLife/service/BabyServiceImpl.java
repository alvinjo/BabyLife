package com.qa.BabyLife.service;

import com.qa.BabyLife.util.PredictLifespan;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class BabyServiceImpl implements IBabyService {

    @Autowired
    PredictLifespan lifespan;

    @Override
    public String predictLifeSpan() {
        return lifespan.predictLifespan();
    }
}
