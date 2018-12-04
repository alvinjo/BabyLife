package com.qa.BabyLife.util;

import java.util.Random;

public class PredictLifespan {

    public String predictLifespan(){
        return new Random().nextInt(80)+"";
    }

}
