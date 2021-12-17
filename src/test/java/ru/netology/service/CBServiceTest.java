package ru.netology.service;

import org.junit.Test;

import static org.junit.Assert.*;

public class CBServiceTest {
    @Test
    public void calculateBonusWhenMore1000() {
        CBService service = new CBService();
        int amount = 3700;
        int actual = service.remain(3700);
        int expected = 300;
        assertEquals(actual, expected);
    }

    @Test
    public void calculateBonusWhenEquals1000() {
        CBService service = new CBService();
        int amount = 1000;
        int actual = service.remain(1000);
        int expected = 0;
        assertEquals(actual, expected);
    }

    @Test
    public void calculateBonusWhenLess1000() {
        CBService service = new CBService();
        int amount = 490;
        int actual = service.remain(490);
        int expected = 510;
        assertEquals(actual, expected);
    }
}