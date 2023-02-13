package com.fwy.utils;

public class SumUtils {

    public static int Sum(int start, int end) {
        if (start < end) {
            int i = 0;
            int sum = 0;
            for (i = start; i <= end; i++) {
                sum = sum + i;
            }
            return sum;
        } else {
            throw new IllegalArgumentException("");
        }
    }

    public static void main(String[] args) {
        System.out.println(SumUtils.Sum(1, 100));
    }
}
