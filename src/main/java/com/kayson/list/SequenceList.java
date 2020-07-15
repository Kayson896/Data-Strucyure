package com.kayson.list;

/**
 * 顺序表
 * @auther kayson
 * @create 2020-07-15 17:07
 */
public class SequenceList<T> {
    final int maxSize = 10;
    private T[] listArray;
    private int length;

    public SequenceList() {
        length = 0;
        //由于不能实例化一个泛型对象，
        // 所以在构造器中可以先实例化一个Object数组，然后把它转换为一个泛型数组。
        listArray = (T[]) new Object[maxSize];
    }

    public SequenceList(int n) {
        if (n < 0) {
            System.out.println("error:n<0");
            System.exit(1);
        }
        length = 0;
        listArray = (T[]) new Object[n];
    }

    public boolean add(T object, int pos) {
        if (pos < 1 || pos > length + 1) {
            System.out.println("error:wrong pos");
            return false;
        }
        if (length == listArray.length) {
            T[] p = (T[]) new Object[length * 2];
            for (int i = 0; i < length; i++) {
                p[i] = listArray[i];
                listArray = p;
            }
        }
        for (int i = length; i > pos; i--) {
            listArray[i] = listArray[i - 1];
        }
        listArray[pos - 1] = object;
        length++;
        return true;
    }

    public T remove(int pos) {
        if (isEmpty()) {
            System.out.println("The Sequencelist is empty.");
            return null;
        } else {
            if (pos < 1 || pos > length) {
                System.out.println("error:wrong pos");
                return null;
            }else {
                T x = listArray[pos - 1];
                for (int i = pos - 1; i < length - 1; i++) {
                    listArray[i] = listArray[i + 1];
                }
                length--;
                return x;
            }
        }
    }

    public int find(T objetc) {
        if (isEmpty()) {
            System.out.println("error:The Sequencelist is empty.");
            return -1;
        } else {
            for (int i = 0; i < length; i++) {
                if (listArray[i].equals(objetc))
                    return i + 1;
            }
            return -1;
        }
    }

    public T value(int pos) {
        if (isEmpty()) {
            System.out.println("error:empty.");
            return null;
        } else {
            if (pos < 0 || pos > length) {
                System.out.println("error:wrong pos.");
                return null;
            }
            return listArray[pos - 1];
        }
    }

    public boolean modify(T object, int pos) {
        if (isEmpty()){
            System.out.println("error:empty.");
            return false;
        }else {
            if (pos<0||pos>length){
                System.out.println("error:wrong pos.");
                return false;
            }
            listArray[pos-1] = object;
            return true;
        }
    }

    public boolean isEmpty() {
        return length==0;
    }

    public int size() {
        return length;
    }

    public void nextOrder() {
        if (isEmpty()){
            System.out.println("empty.");
        }else {
            for (int i = 0; i < length; i++) {
                System.out.println(listArray[i]);
            }
        }
    }

    public void clear() {
        length = 0;
    }
}
