package com.qa.BabyLife;

import com.qa.BabyLife.util.PredictLifespan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class BabyLifeApplication {

	public static void main(String[] args) {
		SpringApplication.run(BabyLifeApplication.class, args);
	}

	@Bean
	public PredictLifespan predictLifespan(){
		return new PredictLifespan();
	}

}
