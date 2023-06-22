package test;

import com.tasks3.carddeck.Card;
import com.tasks3.carddeck.Deck;
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
        app.task_3_2();
    }


    private void task_3_2(){
        Deck deck = new Deck();
        Deck originalDeck = deck;
        Card card;

        System.out.println("shuffle:");
        deck.shuffle();
        while(originalDeck.hasNext()){
            card = originalDeck.drawOne();
            System.out.println(card.getSuit().getName() + " " + card.getRank().getName());
        }

        System.out.println("order:");
        deck.order();        
        while(deck.hasNext()){
            card = deck.drawOne();
            System.out.println(card.getSuit().getName() + " " + card.getRank().getName());
        }
    }


    private void task_3_1(){
        LinkedList list = new LinkedList();
        for(int i = 0; i < 1; i++){
            list.add(i);
        }

        for(int i = 0; i < list.size(); i++){
            System.out.println(i + " = " + list.get(i));
        }
        System.out.println("-------------");

        list.delete(0);

        for(int i = 0; i < list.size(); i++){
            System.out.println(i + " = " + list.get(i));
        }        
    }
}
