package com.scaler.collections.collections;

import java.util.*;

public class Client {
    public static void main(String[] args) {
        List<Integer> arrayList = new ArrayList<>();
        List<Integer> linkedList = new LinkedList<>();
        List<Integer> vector = new Vector<>();
        List<Integer> stack = new Stack<>();

        Set<String> hashSet = new HashSet<>();
        Set<String> linkedHashSet= new LinkedHashSet<>();
        Set<String> treeSet = new TreeSet<>();

        hashSet.add("India");
        hashSet.add("Russia");
        hashSet.add("China");
        hashSet.add("Srilanka");
        hashSet.add("Hongkong");

        System.out.println("HashSet-----> "+hashSet);

        linkedHashSet.add("India");
        linkedHashSet.add("Russia");
        linkedHashSet.add("China");
        linkedHashSet.add("Srilanka");
        linkedHashSet.add("Hongkong");

        System.out.println("linkedHashSet-----> "+linkedHashSet);

        treeSet.add("India");
        treeSet.add("Russia");
        treeSet.add("China");
        treeSet.add("Srilanka");
        treeSet.add("Hongkong");

        System.out.println("treeSet-----> "+treeSet);

    }
}
