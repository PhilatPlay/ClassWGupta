package com.thevarungupta.Day4;

import java.util.TreeSet;

public class Demo11 {
    public static void main(String[] args) {
        // create TreeSet and add element
        TreeSet<String> treeSet = new TreeSet<>();
        treeSet.add("Mark");
        treeSet.add("Watson");
        treeSet.add("John");
        treeSet.add("Apple");

        // This was added Later..
        System.out.println("Last: "+ treeSet.pollLast());
        System.out.println("First: "+ treeSet.pollFirst());

        for(String name: treeSet){
            System.out.println(name);
        }

    }
}
