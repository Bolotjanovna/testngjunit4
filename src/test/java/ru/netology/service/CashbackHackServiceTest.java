package ru.netology.service;


import static org.junit.Assert.assertEquals;


public class CashbackHackService{
    @org.junit.Test
    public void testRemain() {
        CashbackHackService service = new CashbackHackService();
        int amount = 900;
        int actual = service.remain(amount);
        int expected = 100;
        assertEquals(expected, actual);
    }
    @org.junit.Test
    public void testBoundary() {
        CashbackHackService service = new CashbackHackService();
        int amount = 1000;
        int actual = service.remain(amount);
        int expected = 1;
        assertEquals(actual, expected);
    }
}