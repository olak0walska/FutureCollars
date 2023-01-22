package org.example.lesson9task5;

import java.util.List;

public class BubbleSort<T extends Comparable<T>> {

    public void sort(List<T> list) {
        for (int i = 0; i < list.size() - 1; i++) {
            for (int j = 0; j < list.size() - i - 1; j++) {
                T temp = list.get(j);
                list.set(j, list.get(j + 1));
                list.set(j + 1, temp);
            }
        }
    }
}