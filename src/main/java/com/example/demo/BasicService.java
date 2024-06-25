package com.example.demo;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

@Service
public class BasicService {

    Logger logger = LoggerFactory.getLogger(BasicService.class);

    public String greetings(){
        return "Wellcome!";
    }


    public int calculateExp(int base, int pow) {
        int result = 1;
        logger.info("Starting calculate " + base + "^" + pow);
        for (int i = 1; i <= pow; i++) {
            result *= 2;
        }
        logger.info("Done. The result is " + result);

        return result;
    }

    public void exception(){
        RuntimeException exception = new RandomError("Random error ");
        logger.warn("this exception has been thrown: "+ exception);
        throw exception;
    }
}
