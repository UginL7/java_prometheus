package com.week4;

public class Sort {
    public static void sort(int[] array, Comparator comp) {
		for (int gap = array.length / 2; gap > 0; gap /= 2) {
			for (int i = gap; i < array.length; i++) {
				int val = array[i];
				int j;
				for (j = i; j >= gap && comp.compare(array[j - gap], val) < 0; j -= gap) {
					array[j] = array[j - gap];
				}
				array[j] = val;
			}
		}
	}
}
