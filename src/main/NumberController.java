package com.company;

import java.util.Arrays;
import java.util.NoSuchElementException;

import static java.lang.System.arraycopy;

public class NumberController extends Numbers {

    private String[][] canvas;
    private final String number;

    public NumberController(String number) {
        this.number = number;
    }

    public String[][] getCanvas() {
        return canvas;
    }

    public void setCanvas(String[][] canvas) {
        this.canvas = canvas;
    }

    public String getNumber() {
        return number;
    }

    private void decompose() {
        isNumber(number);
        char[] arr = number.toCharArray();

        for (char c : arr) {
            concatenate(catchNumber(c));
        }
    }

    public void print() {
        decompose();

        for (String[] canva : canvas) {
            for (int j = 0; j < canva.length; j++) {
                System.out.print(canva[j] + " ");
                if ((j+1) % 5 == 0) {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }

    private void concatenate(String[][] concatArr) {
        if (canvas == null) canvas = concatArr;
            else {
                for (int i = 0; i < canvas.length; i++) {
                String[] concatNewArr = Arrays.copyOf(canvas[i], canvas[i].length + concatArr[i].length);
                arraycopy(canvas[i], 0, concatNewArr, 0, canvas[i].length);
                arraycopy(concatArr[i], 0, concatNewArr, canvas[i].length, concatArr[i].length);
                canvas[i] = concatNewArr;
            }
        }
    }

    private void isNumber(String number) {
        try {
            Integer.parseInt(number);
        } catch (NumberFormatException e) {
            System.err.println("Is not number!");
        }
    }

    private String[][] catchNumber(char digit) {
        switch (digit) {
            case '0' -> {
                return ZERO;
            }
            case '1' -> {
                return ONE;
            }
            case '2' -> {
                return TWO;
            }
            case '3' -> {
                return THREE;
            }
            case '4' -> {
                return FOUR;
            }
            case '5' -> {
                return FIVE;
            }
            case '6' -> {
                return SIX;
            }
            case '7' -> {
                return SEVEN;
            }
            case '8' -> {
                return EIGHT;
            }
            case '9' -> {
                return NINE;
            }
            default -> throw new NoSuchElementException("No such element!");
        }
    }

    @Override
    public String toString() {
        return "NumberController{" +
                "canvas=" + Arrays.toString(canvas) +
                ", number=" + number +
                '}';
    }
}
