package org.example;

import java.util.Arrays;
import java.util.Random;



/*
Used source material from https://www.geeksforgeeks.org/sorting-algorithms/
 */

public class Main {
    private Random random;
    private static int[] array1 = new int[30];
    private static int[] array2 = new int[100000];
    private static long beforeTime;
    private static long afterTime;
    private static CountSort countSort = new CountSort();
    private static CycleSort cycleSort = new CycleSort();
    private static QuickSort quickSort = new QuickSort();

    public static void giveNumbers(){
        for (int i = 0; i < array1.length; i++) {
            array1[i] = new Random().nextInt(30);
        }
        for (int i = 0; i < array2.length; i++) {
            array2[i] = new Random().nextInt(10000);
        }
    }
    public static void main(String[] args) {
        SortContext cycle = new SortContext();
        SortContext count = new SortContext();
        SortContext quick = new SortContext();

        giveNumbers();

        cycle.setSortStrategy(cycleSort);
        count.setSortStrategy(countSort);
        quick.setSortStrategy(quickSort);

        beforeTime = System.currentTimeMillis();
        cycle.sort(array1);
        cycle.sort(array2);
        afterTime = System.currentTimeMillis();
        long cycleTime = afterTime- beforeTime;
        System.out.println("Cycle Sort Done! Time: " + cycleTime + " ms");

        giveNumbers();

        beforeTime = System.currentTimeMillis();
        count.sort(array1);
        count.sort(array2);
        afterTime = System.currentTimeMillis();
        long countTime = afterTime- beforeTime;
        System.out.println("Count Sort Done! Time: " + countTime + " ms");

        giveNumbers();

        beforeTime = System.currentTimeMillis();
        quick.sort(array1);
        quick.sort(array2);
        afterTime = System.currentTimeMillis();
        long quickTime = afterTime- beforeTime;
        System.out.println("Quick Sort Done! Time: " + quickTime + " ms");


        System.out.println("Times Taken For Sorting:");
        System.out.println("Cycle Sort: " + cycleTime + " ms");
        System.out.println("Count Sort: " + countTime + " ms");
        System.out.println("Quick Sort: " + quickTime + " ms");


    }
}