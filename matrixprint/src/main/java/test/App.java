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
        int size = 5;
        int count = 1;

        if (size <= 0){
            return;
        }
        
        for(int row = 0; row < size; row++){
            for(int column = 0; column < size; column++){
                if(column == row | column == size-(row+1)){
                    System.out.print(" * ");
                }
                else{
                    System.out.print(String.format("%1$2d ", count));
                }
                count++;
            }
            System.out.println();
        }
    }
}
