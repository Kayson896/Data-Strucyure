package com.kayson.list;

/**
 * 单链表类
 * @auther kayson
 * @create 2020-07-15 18:50
 */
public class LinkList<T> {
    private Node<T> head;
    private int length;

    public LinkList() {
        head = new Node<T>(null);
        length = 0;
    }

    public Node<T> getHead() {
        return head;
    }

    public int getLength() {
        return length;
    }

    public boolean add(T obj, int pos) {
        if (pos < 1 || pos > length + 1) {
            System.out.println("error:wrong pos");
            return false;
        }
        //核心代码
        int num = 1;//pos
        Node<T> p = head;
        Node<T> q = p.next;
        while (num < pos) {
            p = q;
            q = q.next;
            num++;
        }
        p.next = new Node<T>(obj, q);
        length++;
        return true;
    }

    public boolean isEmpty() {
        return length == 0;
    }

    public T remove(int pos) {
        if (isEmpty()) {
            System.out.println("error:empty.");
            return null;
        }else {
            if (pos<1||pos>length){
                System.out.println("error:wrong pos.");
                return null;
            }
            //核心代码
            int num = 1;
            Node<T> p = head;
            Node<T> q = p.next;
            while (num < pos) {
                p = q;
                q = q.next;
                num++;
            }
            p.next = q.next;
            length--;
            return q.data;
        }
    }
    public int find(T obj){
        if (isEmpty()){
            System.out.println("error:empty.");
            return -1;
        }else {
            int num = 1;
            Node<T> p = head.next;
            while (p!=null) {
                if ((p.data).equals(obj)==true){
                    break;
                }else {
                    p = p.next;
                    num++;
                }
            }
            if (p==null)
            return -1;
            return num;
        }
    }
    public T value(int pos){
        if (isEmpty()){
            System.out.println("error:empty.");
            return null;
        }else {
            if (pos<1||pos>length){
                System.out.println("error:wrong pos.");
                return null;
            }
            int num = 1;
            Node<T> q = head.next;
            while (num<pos){
                q = q.next;
                num++;
            }
            return q.data;
        }
    }
    public boolean modify(T obj,int pos){
        if (isEmpty()){
            System.out.println("error:empty.");
            return false;
        }else {
            if (pos<1||pos>length){
                System.out.println("error:wrong pos.");
                return false;
            }
            int num = 1;
            Node<T> q = head.next;
            while (num<pos){
                q = q.next;
                num++;
            }
            q.data = obj;
            return true;
        }
    }
    public int size(){
        return length;
    }
    public void nextOrder(){
        Node<T> q = head.next;
        while (q!=null){
            System.out.println(q.data);
            q = q.next;
        }
    }
    public void clear(){
        length = 0;
        head.next = null;
    }
}
