package com.otus.algo.algebraic_algorythms_lesson_02;

public class Power {

    public Power() {}

    public int iteration(int num, int degree){
        if (degree == 0) return 1;
        if (degree == 1) return num;
        int result = 1;
        for (int i = 0; i < degree; i++) {
            result *= num;
        }
        return result;
    }

    public int multiplication(int num, int degree){
        if (degree == 0) return 1;
        if (degree == 1) return num;
        int result = num;
        int start = 2;
        while (start * 2 <= degree){
            result = num;
            start *= 2;
            for (int i = 2; i < start + 1; i++)
                result = result * num;
        }
        while (start < degree){
            result = result * num;
            start += 1;
        }
        return result;
    }


    public int bitDecomposition(int num, int degree){
        if (degree == 0) return 1;
        if (degree == 1) return num;
        String binary = Integer.toBinaryString(degree);
        int result = 1;
        char[] chars = binary.toCharArray();
        int counter = 0;
        int temp = 1;
        for (int i = chars.length - 1; i >= 0; i--) {

            if (counter != 0) temp *= 2;

            if (chars[i] == '1'){
                for (int j = 0; j < temp; j++) result *= num;
            }
            counter++;
        }
        return result;
    }


}
