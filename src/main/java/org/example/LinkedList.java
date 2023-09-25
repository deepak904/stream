package org.example;

public class LinkedList {
    Node head;
    int size;

    LinkedList() {
        head = null;
        size = 0;
    }

    class Node {
        Node next;
        int data;

        Node(int data) {
            size++;
            this.data = data;
            this.next = null;
        }
    }

    void addFirst(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
            return;
        }
        newNode.next = head;
        head = newNode;
    }

    void addLast(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
            return;
        }
        Node tempNode = head;
        while (tempNode.next != null) {
            tempNode = tempNode.next;
        }

        tempNode.next = newNode;
    }

    void printNode() {
        Node tempNode = head;
        if (head == null) {
            System.out.println("Linked list is empty");
            return;
        }
        while (tempNode != null) {

            System.out.print(tempNode.data + " -> ");
            tempNode = tempNode.next;
        }
        System.out.println("null");
    }

    void deleteFirst() {

        if (head == null) {
            System.out.println("Linked list is empty");
            return;
        }
        size--;
        head = head.next;
    }

    void deleteLast() {
        if (head == null) {
            System.out.println("Linked list is empty");
            return;
        }
        size--;
        if (head.next == null) {
            head = null;
        }
        Node secondNode = head;
        Node lastNode = head.next;

        while (lastNode.next != null) {
            secondNode = secondNode.next;
            lastNode = lastNode.next;
        }
        secondNode.next = null;

    }

    int getSize(){
        return size;
    }

    public static void main(String[] args) {
        LinkedList ll = new LinkedList();
        ll.addFirst(4);
        ll.addFirst(8);
        ll.printNode();
        ll.addLast(10);
        ll.printNode();
        System.out.println(ll.getSize());

        ll.deleteFirst();
        ll.printNode();
        ll.deleteLast();
        ll.printNode();
        System.out.println(ll.getSize());


    }
}
