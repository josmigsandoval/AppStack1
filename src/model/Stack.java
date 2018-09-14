package model;

import exceptions.NodeNonExistentException;

public class Stack {

    private Node head;

    public Stack() {
    }

    public void setHead(Node head) {
        this.head = head;
    }

    public Node getHead() {
        return head;
    }

    public void push(Person person) {
        Node n = new Node(person);
        if (!isEmpty()){
            n.setNext(head);
        }
        head = n;
    }

    public Person pop() {
        return null;
    }

    public Person last(){
        return null;
    }
    
    public Person coming(){
        return null;
    }
    
    public int size(){
        return 0;
    }

    public boolean isEmpty() {
        return head == null;
    }

}
