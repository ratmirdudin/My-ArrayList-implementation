package com.company;

public class Main {

    public static void main(String[] args) {
        MyArraylist<String> strings = new MyArraylist<>();
        System.out.println("strings is empty? " + strings.isEmpty());
        strings.add("MSU");
        strings.add("CMC");
        strings.add("JAVA");
        System.out.println("strings is empty? " + strings.isEmpty());
        System.out.println("Current strings.get(1) = " + strings.get(1));
        strings.update(1, "Student");
        System.out.println("Element strings.get(1) updated. Current strings[1] = " + strings.get(1));
        System.out.println("Current size of strings is " + strings.size());
        strings.delete(1);
        System.out.println("Element strings.get(1) deleted. Current strings[1] = " + strings.get(1));
        System.out.println("Current size of strings is " + strings.size());
    }
}
