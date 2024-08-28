package com.phaete;

import java.util.Objects;

public class Person {
    private String socialSecNum;
    private String name;
    private int age;

    public Person(String socialSecNum, String name, int age) {
        this.socialSecNum = socialSecNum;
        this.name = name;
        this.age = age;
    }

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public String getSocialSecNum() {
        return socialSecNum;
    }

    public void setSocialSecNum(String socialSecNum) {
        this.socialSecNum = socialSecNum;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Person{" +
                "socialSecNum='" + socialSecNum + '\'' +
                ", name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Person person = (Person) o;
        return age == person.age && Objects.equals(socialSecNum, person.socialSecNum) && Objects.equals(name, person.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(socialSecNum, name, age);
    }
}
