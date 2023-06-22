package com.tasks3.linkedlist;

public class LinkedList {
    private static Node head;
    private static Integer length = 0;

/* Конструктор без аргументів */
    public LinkedList() {
        if(head == null){
            head = new Node();
            head.setNext(null);
            head.setData(-1);
        }
    }
/* Додати елемент в кінець списку */
    public void add(Integer data) {
        Node lastNode = head;
        while(lastNode.getNext() != null){
            lastNode = lastNode.getNext();
        }
        Node newNode = new Node();        
        newNode.setData(data);
        newNode.setNext(null);
        lastNode.setNext(newNode);
        length++;
    }

/* Отримати елемент по індексу, повертає null якщо такий елемент недоступний */
    public Integer get(int index) {
        if(index < 0 | index > length | length == 0)
            return null;
        
        if(length == 1){
            return head.getData();
        }

        int i = 0;
        Node currNode = head;
        while(i!=index){
            currNode = currNode.getNext();
            i++;
        };
        return currNode.getData();
    }
/* Вилучення елементу за індексом, повертає true у разі успіху або false в іншому випадку */
    public boolean delete(int index) {
        if(index < 0 | index > length | length == 0){
            return false;
        }

        if(index == 0){
            head = head.getNext();
            length--;
            return true;
        }

        Node currNode = head;
        Node prevNode;
        for(int i = 0; i < length; i++){
            prevNode = currNode;
            if(i == index){
                prevNode.setNext(currNode.getNext());
                length--;
                return true;
            }            
            currNode = currNode.getNext();
        }
        return true;
    }

/*Поверта розмір списку: якщо елементів в списку нема то повертає 0 (нуль)*/
    public int size() {
        return length;
    }
}
