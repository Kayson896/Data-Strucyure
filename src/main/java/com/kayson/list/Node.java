package com.kayson.list;

/**
 * 结点类
 * @auther kayson
 * @create 2020-07-15 18:43
 */
public class Node<T> {
    T data;
    Node<T> next;

    public Node(Node<T> next) {
        this.next = next;
    }

    public Node(T data, Node<T> next) {
        this.data = data;
        this.next = next;
    }

    public T getData() {
        return data;
    }

    public Node<T> getNext() {
        return next;
    }
}
