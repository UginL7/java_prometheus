package test;


class IntsTest {
    int a, b;
    IntsTest()
    {
        a = 10;
        b = 20;
        }
} 

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


    /*
    * Напишіть застосування, що виконує пошук заданого числа у відсортованому масиві — бінарний пошук
    * У випадку коли число знайдено виведіть на екран його позицію в масиві (позиції нумеруємо з нуля) або -1 в іншому випадку
    */

    public static void main(String[] args) {
        int data[] = { 3, 6, 7, 10, 34, 56, 60 };
        int numberToFind = 10;
        int minIndex = 0;
        int maxIndex = data.length;
        int mid = 0;
        int pos;
  

        if(data.length == 0) {
            System.out.println(-1);
            return;
        }
        if(data.length == 1){
            if(data[0] == numberToFind){
                System.out.println(0);
            } else {
                System.out.println(-1);
            }            
            return;
        }
        if(numberToFind < data[0] | numberToFind > data[data.length-1]){
            System.out.println(-1);
            return;
        }

        do{
            if(minIndex <= maxIndex){
                mid = minIndex + (maxIndex - minIndex)/2;
    
                if(data[mid] == numberToFind){
                    pos = mid;
                    break;
                } else if( data[mid] < numberToFind){
                    minIndex = mid + 1;
                } else {
                    maxIndex = mid -1;
                }
            }else{
                pos = -1;
                break;
            }
        }while(true);

       
        System.out.println(pos);
    }
}
