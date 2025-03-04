package com.example.demoTestUnit2_3.sumCacSoLe;

public class SumLeBoLonHon100 {
    public static int tongLeBoLonHon100(int[] arr) {
        if (arr == null || arr.length < 1) {
            throw new IllegalArgumentException("Mảng không được null");
        }

        int sum = 0;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 != 0 && arr[i] <= 100) {
                sum += arr[i];
            }
        }
        return sum;
    }


        public static boolean isEven(int number) {
            return number % 2 == 0;
        }
}
