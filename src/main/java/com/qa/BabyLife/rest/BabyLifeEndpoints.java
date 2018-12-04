package com.qa.BabyLife.rest;

import com.qa.BabyLife.service.IBabyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping("/lifespan")
@RestController
public class BabyLifeEndpoints {


    @Autowired
    IBabyService service;

    @GetMapping("predict")
    public String predictLifespan(){
        return service.predictLifeSpan();
    }

}
