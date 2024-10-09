package org.example;

import java.util.Arrays;

public class CycleSort implements SortStrategy{

    @Override
    public void sort(int[] array){
        System.out.println("Cycle sort");
        cycleSort(array, array.length);
        System.out.println(Arrays.toString(array));
    }

    public static void cycleSort(int arr[], int n)
    {
        int writes = 0;

        for (int cycle_start = 0; cycle_start <= n - 2; cycle_start++) {
            int item = arr[cycle_start];

            int pos = cycle_start;
            for (int i = cycle_start + 1; i < n; i++)
                if (arr[i] < item)
                    pos++;

            if (pos == cycle_start)
                continue;

            while (item == arr[pos])
                pos += 1;

            if (pos != cycle_start) {
                int temp = item;
                item = arr[pos];
                arr[pos] = temp;
                writes++;
            }

            while (pos != cycle_start) {
                pos = cycle_start;

                for (int i = cycle_start + 1; i < n; i++)
                    if (arr[i] < item)
                        pos += 1;

                while (item == arr[pos])
                    pos += 1;

                if (item != arr[pos]) {
                    int temp = item;
                    item = arr[pos];
                    arr[pos] = temp;
                    writes++;
                }
            }
        }
    }

}
