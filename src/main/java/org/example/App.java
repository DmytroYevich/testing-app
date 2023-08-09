package org.example;

import java.util.Arrays;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {

    }

    public static String sortAndPrint(int[] params) {
        Arrays.sort(params);
        String result = Arrays.toString(params);
        System.out.println(result);
        return result;
    }
}
