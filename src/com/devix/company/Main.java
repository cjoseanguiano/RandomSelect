package com.devix.company;

import java.util.Random;

public class Main {

    public static void main(String[] args) {

        String[] array = {"A", "B", "C", "D"};
        Random random = new Random();

        int select = random.nextInt(array.length);

        System.out.println("Random with String " + array[select]);
    }
}
