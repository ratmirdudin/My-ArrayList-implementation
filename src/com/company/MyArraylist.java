package com.company;

class MyArraylist<T> {
    private T[] values;

    MyArraylist() {
        values = (T[]) new Object[0];
    }

    public void add(T elem) {
        T[] tmp = values;
        values = (T[]) new Object[tmp.length + 1];
        System.arraycopy(tmp, 0, values, 0, tmp.length);
        values[values.length - 1] = elem;
    }

    public void delete(int index) {
        T[] tmp = values;
        values = (T[]) new Object[tmp.length - 1];
        System.arraycopy(tmp, 0, values, 0, index);
        System.arraycopy(tmp, index + 1, values, index, tmp.length - index - 1);
    }

    public void update(int index, T elem) {
        values[index] = elem;
    }

    public T get(int index) {
        return values[index];
    }


    public int size() {
        return values.length;
    }

    public boolean isEmpty() {
        return values.length == 0;
    }
}
