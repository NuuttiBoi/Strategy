package org.example;

import java.util.Arrays;
import java.util.Random;

public class Main {
    private Random random;
    private static int[] array1 = new int[30];
    private static int[] array2 = new int[100000];
    private static CountSort countSort = new CountSort();
    private static CycleSort cycleSort = new CycleSort();
    private static QuickSort quickSort = new QuickSort();

    public static void giveNumbers(){
        for (int i = 0; i < array1.length; i++) {
            array1[i] = new Random().nextInt(100);
        }
        for (int i = 0; i < array2.length; i++) {
            array2[i] = new Random().nextInt(100);
        }
    }
    public static void main(String[] args) {
        SortContext context = new SortContext();
        giveNumbers();

        context.setSortStrategy(cycleSort);
        for (int j : array1) {
            System.out.println(j);
        }
        context.sort(array1);
        for (int j : array1) {
            System.out.println(j);
        }
        System.out.println("Sort1 done");
        giveNumbers();
        context.setSortStrategy(quickSort);
        for (int j : array1) {
            System.out.println(j);
        }
        System.out.println("Sort2");
        context.sort(array1);
        for (int j : array1) {
            System.out.println(j);
        }

        System.out.println("Sort2 done");
        giveNumbers();
        context.setSortStrategy(countSort);
        for (int j : array1) {
            System.out.println(j);
        }
        System.out.println("Sort3");
        context.sort(array1);
        for (int j : array1) {
            System.out.println(j);
        }

    }
}