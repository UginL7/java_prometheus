package com.week4;

/**
 * Hello world!
 */
public final class App {
    private App() {
    }

    /**
     * Says hello to the world.
     * @param args The arguments of the program.
     */
    public static void main(String[] args) {
        int[] array = {1,5,2,4,10,6,0,3,10};
		Comparator comp = new Comparator();
		
		//Change your code here
		Sort.sort(array, comp);
		//Change your code here
		
		for (int i = 0; i < array.length; i++) {
			System.out.print(array[i] + " ");
		}
    }
}
