package ru.netology.service;

import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class CashbackHackServiceTest {

    @org.testng.annotations.Test
    public void testRemain() {
        CashbackHackService service = new CashbackHackService();
        int amount = 900;
        int actual = service.remain(amount);
        int expected = 100;
        assertEquals(actual, expected);
    }
//    @org.testng.annotations.Test
//    public void testBoundary() {
//        CashbackHackService service = new CashbackHackService();
//        int amount = 1000;
//        int actual = service.remain(amount);
//        int expected = 1;
//        assertEquals(actual, expected);
//    }
}