package com.tasks3.carddeck;

import java.util.Random;

public class Deck {
    private Integer deckSize = 36;
    private Card[] deck = new Card[deckSize];

    public Deck(){
        Card card = null;
        int added = 0;
        boolean isExist = false;
        do{
            do{
                isExist = false;
                card = generateCard();
                for(int j = 0; j < added; j++){
                    if(card.getRank() == deck[j].getRank() & card.getSuit() == deck[j].getSuit()){
                        isExist = true;
                    }
                }
            }while(isExist == true);
            deck[added++] = card;
        }while(added < deckSize);
    }

    //Перемішує колоду у випадковому порядку 
    public void shuffle() {
        Random rnd = new Random();
        Integer positionInDeck = 0;

        Card[] tmpDeck = new Card[deckSize];
        for(Integer i = 0; i < deckSize; i++){
            do{
                positionInDeck = rnd.nextInt(deckSize);
                
            }while(deck[positionInDeck] == null);
            tmpDeck[i] = deck[positionInDeck];
            deck[positionInDeck] = null;
        }
        deck = tmpDeck;
    }
    
    /* * Впорядкування колоди за мастями та значеннями 
    * Порядок сотрування: 
    * Спочатку всі карти з мастю HEARTS, потім DIAMONDS, CLUBS, SPADES 
    * для кожної масті порядок наступний: Ace,King,Queen,Jack,10,9,8,7,6 
    * Наприклад 
    * HEARTS Ace 
    * HEARTS King 
    * HEARTS Queen 
    * HEARTS Jack 
    * HEARTS 10 
    * HEARTS 9 
    * HEARTS 8 
    * HEARTS 7 
    * HEARTS 6 
    * І так далі для DIAMONDS, CLUBS, SPADES */
    public void order() {
        int n = 0;
        int nSuit = 0;
        int nRange = 0;
        Card[] sorted = new Card[deckSize];

        for(Card card:deck){
            switch(card.getSuit().getName()){
                case "HEARTS":
                    nSuit = 0;
                    break;
                case "DIAMONDS":
                    nSuit = 9;
                    break;
                case "CLUBS":
                    nSuit = 18;
                    break;
                case "SPADES": 
                    nSuit = 27;
                    break;
            }
            switch(card.getRank().getName()){
                case "Ace":
                    nRange = 0;
                    break;
                case "King":
                    nRange = 1;
                    break;
                case "Queen":
                    nRange = 2;
                    break;
                case "Jack":
                    nRange = 3;
                    break;
                case "10":
                    nRange = 4;
                    break;
                case "9":
                    nRange = 5;
                    break;
                case "8":
                    nRange = 6;
                    break;
                case "7":
                    nRange = 7;
                    break;
                case "6":
                    nRange = 8;
                    break;

            }
            n = nSuit + nRange;
            sorted[n] = card;
        }
        deck = sorted;
    }
    
    //Повертає true у випадку коли в колоді ще доступні карти
    public boolean hasNext() {
        return deckSize > 0 ? true : false;
    }
    
    //"Виймає" одну карту з колоди, коли буде видано всі 36 карт повертає null
    //Карти виймаються з "вершини" колоди. Наприклад перший виклик видасть SPADES 6 потім
    //SPADES 7, ..., CLUBS 6, ..., CLUBS Ace і так далі до HEARTS Ace
    public Card drawOne() {
        deckSize--;
        return generateCard();
    }

    private Card generateCard(){
        Random rnd = new Random();
        Rank rank = Rank.values[rnd.nextInt(Rank.values.length)];
        Suit suit = Suit.values[rnd.nextInt(Suit.values.length)];
        return new Card(rank, suit);
    }

    private void printDeck(){
        for(int i = 0; i < deckSize; i++){
            System.out.println("( " + i + " ) : " + deck[i].getRank().getName() + " " + deck[i].getSuit().getName());
        }
    }
}
