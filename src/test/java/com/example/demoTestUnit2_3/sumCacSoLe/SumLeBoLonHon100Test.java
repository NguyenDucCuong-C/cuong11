package com.example.demoTestUnit2_3.sumCacSoLe;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SumLeBoLonHon100Test {

    @Test
    void tongLeBoLonHon100() {

        int[] arr = {5, 6, 7, 8, 9, 10};

        assertEquals(21, SumLeBoLonHon100.tongLeBoLonHon100(arr));
    }


    @Test
    void tongLeBoLonHon100_BienDuoi() {

        int[] arr = {1};

        assertEquals(1, SumLeBoLonHon100.tongLeBoLonHon100(arr));
    }

    @Test
    void tongLeBoLonHon100_BienTren() {

        int[] arr = {99};

        assertEquals(99, SumLeBoLonHon100.tongLeBoLonHon100(arr));
    }

    @Test
    void tongLeBoLonHon100_BienTrenBoQuaSoLonHon100() {

        int[] arr = {100};

        assertEquals(0, SumLeBoLonHon100.tongLeBoLonHon100(arr));
    }

  @Test
    void tongLeBoLonHon100_BoQuaSoLonHon100() {

        int[] arr = {4,6,3,7,654,33,112,100};

        assertEquals(43, SumLeBoLonHon100.tongLeBoLonHon100(arr));
    }


    @Test
    void testEvenNumber() {
        assertTrue(SumLeBoLonHon100.isEven(2), "2 là số chẵn");
        assertTrue(SumLeBoLonHon100.isEven(10), "10 là số chẵn");
        assertTrue(SumLeBoLonHon100.isEven(0), "0 là số chẵn");
    }

}