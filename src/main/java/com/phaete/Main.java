package com.phaete;

import java.util.*;

public class Main {
    public static void main(String[] args) {

        /**
         * Content of Set and Map session
         */

        // Set
        Set<String> set = new HashSet<>();

        // add values
        set.add("123");
        set.add("456");

        // check if an element exists
        boolean containsElement = set.contains("123");

        // remove an element
        set.remove("456");

        // a set can not contain duplicate items
        System.out.println(set); // -> [123]
        set.add("123"); // 123 is already in the set, so nothing happens
        System.out.println(set); // -> [123]


        // Map -> Key, Value
        Map<String, Person> map = new HashMap<>();

        Person p1 = new Person("123", "John", 30);
        Person p2 = new Person("456", "Jane", 25);

        map.put(p1.getSocialSecNum(), p1);
        map.put(p2.getSocialSecNum(), p2);

        // print whole map
        System.out.println(map);

        // access value at key 123
        System.out.println(map.get("123"));

        // just get values
        System.out.println(map.values());

        // just get keys
        System.out.println(map.keySet());

        // remove object by key
        map.remove("123"); // if the key doesn't exist, nothing happens

        // check if key exists
        boolean isPresent = map.containsKey("123"); // before remove, check if the key actually exists

        /**
         * Challenges
         */

        Student peter = new Student("peter", "parker", 1);
        Student bruce = new Student("bruce", "wayne", 2);
        Student tony = new Student("tony", "stark", 3);

        School school = new School();
        school.addStudent(peter);
        school.addStudent(bruce);
        school.addStudent(tony);

        System.out.println(school);

        Pharmacy pharmacy = new Pharmacy();
        pharmacy.save(new Medication("Aspirin", 10.5, 100));
        pharmacy.save(new Medication("Ibuprofen", 20.2, 150));

        pharmacy.printAll();
    }
}