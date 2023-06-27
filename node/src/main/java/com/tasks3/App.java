package com.tasks3;

import java.net.CacheRequest;

import com.tasks3.carddeck.Card;
import com.tasks3.carddeck.Deck;
import com.tasks3.fibonacci.Fibonacci;
import com.tasks3.linkedlist.LinkedList;

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
        App app = new App();
        app.task_3_1();
    }

    private void task_3_3(){
        Fibonacci fibonacci = new Fibonacci();
        fibonacci.getNumber(10);
    }

    private void task_3_2(){
        Deck deck = new Deck();

        System.out.println("shuffle:");
        deck.shuffle();
        
        System.out.println("order:");
        deck.order();
        
        for(int i = 0; i < 40; i++){
            Card card = deck.drawOne();
            if(card != null)
                System.out.println("( " + card.toString() + " ) : " + card.getRank().getName() + " " + card.getSuit().getName());
        }
    }


    private void task_3_1(){
        LinkedList list = new LinkedList();

        for(int i = 0; i < 1; i++){
            list.add(i);
        }

        System.out.println("Size : " + list.size());

        for(int i = 0; i < list.size(); i++){
            System.out.println(i + " = " + list.get(i));
        }
        System.out.println("-------------");

        list.get(0);
        list.delete(1);

        System.out.println("Size : " + list.size());
        for(int i = 0; i < list.size(); i++){
            System.out.println(i + " = " + list.get(i));
        }        
    }
}
