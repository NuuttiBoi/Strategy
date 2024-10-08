package org.example;

public class SortContext {
    private SortStrategy sortStrategy;

    public void setSortStrategy(SortStrategy sortStrategy) {this.sortStrategy = sortStrategy;}

    public void sort(int[] array) {
        sortStrategy.sort(array);
    }
}
