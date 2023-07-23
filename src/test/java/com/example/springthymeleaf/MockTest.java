package com.example.springthymeleaf;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class MockTest {

    @Test
    public void shouldBeValid() {
        assertEquals(addition(2, 4), 6.0);
    }

    public double addition(double a, double b) {
        return a + b;
    }
}