package org.example;

public class Main {
    public static void main(String[] args) {
        int numbers[] = new int[]{2, 5, 8, -8, 19, 2004, -10000};
        int size = numbers.length;
        java.util.Arrays.sort(numbers);
        System.out.println("Max element is " + numbers[size - 1]);
    }
}
