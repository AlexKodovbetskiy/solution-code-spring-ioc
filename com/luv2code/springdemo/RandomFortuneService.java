package com.luv2code.springdemo;

import java.util.*;

public class RandomFortuneService implements FortuneService{
    String[] rand_fortunes = {"You won 1 million", "Ferrari", "lambo","Italy", "Como", "iPA"};
    @Override
    public String getFortune() {
        Random rand = new Random();
        int upperbound = 5;
        int result = rand.nextInt(upperbound);
        return rand_fortunes[result].toString();
    }
}
