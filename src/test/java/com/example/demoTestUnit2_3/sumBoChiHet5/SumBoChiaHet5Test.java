package com.example.demoTestUnit2_3.sumBoChiHet5;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SumBoChiaHet5Test {

    @Test
    void sum1Den100() {
        assertEquals(4000,  SumBoChiaHet5.TinhTong(100));
    }

     @Test
    void sum1() {
        assertEquals(1,  SumBoChiaHet5.TinhTong(1));
    }

     @Test
    void sumKhongHopLeBienDuoi() {
        Exception exception = assertThrows(IllegalArgumentException.class,
                () -> SumBoChiaHet5.TinhTong(-1));

        assertEquals("Nhập trong khoảng 1 - 100", exception.getMessage());

    }

     @Test
    void sum98() {
        assertEquals(3901,  SumBoChiaHet5.TinhTong(98));
    }

     @Test
    void sumKhongHopLeBienTren() {
         Exception exception = assertThrows(IllegalArgumentException.class,
                 () -> SumBoChiaHet5.TinhTong(101));

         assertEquals("Nhập trong khoảng 1 - 100", exception.getMessage());
    }


}