package com.leszko.calculator;

import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;

/**
 * Calculator service.
 */
@Service
public class Calculator {
    public final static int NUMBER1 = 3;

    @Cacheable("sum")
    public int sum(int a, int b) {
        return a + b;
    }
}