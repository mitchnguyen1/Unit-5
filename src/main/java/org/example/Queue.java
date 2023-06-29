package org.example;

public class Queue<T> {
    private Node<T> front;
    private Node<T> rear;
    private int size;

    // Node class representing individual elements in the queue
    private static class Node<T> {
        private T data;
        private Node<T> next;

        public Node(T data) {
            this.data = data;
        }

    }

    public Queue() {
        front = null;
        rear = null;
        size = 0;
    }


    //enqueue
    public void enqueue(T data) {
        Node<T> newNode = new Node<>(data);
        if (isEmpty()) {
            front = newNode;
            rear = newNode;
        } else {
            rear.next = newNode;
            rear = newNode;
        }
        size++;
    }


    //dequeue
    public T dequeue() {
        if (isEmpty()) {
            throw new IllegalStateException("Queue is empty");
        }
        T removedData = front.data;
        front = front.next;
        if (front == null) {
            // Queue is now empty, update rear as well
            rear = null;
        } else if (front.next == null) {
            // Reset rear when only one element is remaining
            rear = front;
        }
        size--;
        return removedData;
    }







    //peek
    public T peek(){
        if(isEmpty()){
            throw new IllegalStateException("Queue is empty");
        }
        return front.data;
    }

    //size
    public int size(){
        return size;
    }

    //is empty
    public boolean isEmpty(){
        return size == 0;
    }
}

