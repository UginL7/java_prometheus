package test;

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
        int[] array = {30, 2, 10, 4, 6};
		int length = array.length;
        boolean notReady = false;
        int tmp = 0;
        int element = 0;        
        do{
            notReady = false;
            element = array[0];
            for(int i = 1; i < length; i++){                
                if(element > array[i]){
                    tmp = element;
                    element = array[i];
                    array[i] = tmp;
                    array[i-1] = element;
                    notReady = true;
                }
                element = array[i];
            }
        }while(notReady);
		//PUT YOUR CODE HERE
		
		
		//PUT YOUR CODE HERE

		for (int i = 0; i < length; i++) {
			System.out.print(array[i] + " ");
		}        
    }
}
