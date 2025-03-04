package com.example.demoTestUnit2_3.sumBoChiHet5;

public class SumBoChiaHet5 {
    public static int TinhTong(int num) {


        if(num < 1 || num > 100){
            throw new IllegalArgumentException("Nhập trong khoảng 1 - 100");
        }

        int sum = 0;

        for (int i = 0; i <= num; i++) {
            if (i % 5 != 0) {
                sum += i;
            }
        }

        return sum;
    }
}
