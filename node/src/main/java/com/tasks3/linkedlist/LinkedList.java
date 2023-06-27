package com.tasks3.linkedlist;

public class LinkedList {
    private Node head = null;
    private Integer length = 0;

    public LinkedList() {}

    public void add(Integer data) {
        Node newNode = new Node();
        newNode.setData(data);
        newNode.setNext(null);
        
        if(head != null){
            Node lastNode = head;
            while(lastNode.getNext() != null){
                lastNode = lastNode.getNext();
            }            
            lastNode.setNext(newNode);                
        }else{
            head = newNode;
        }
        length++;
    }

    public Integer get(int index) {
        if(index < 0 | index >= length | length == 0){
            return null;
        }
    
        int i = 0;
        Node currNode = head;
        while(i!=index){
            currNode = currNode.getNext();
            i++;
        };
        return currNode.getData();
    }

    public boolean delete(int index) {
        if(index < 0 | index >= length | length == 0){
            return false;
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

    public int size() {
        return length;
    }
}
