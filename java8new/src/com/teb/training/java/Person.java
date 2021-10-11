package com.teb.training.java;


public class Person {

    private String name;
    private String surname;
    private int    height;
    private int    weight;

    public String getName() {
        return this.name;
    }

    public Person setName(final String nameParam) {
        this.name = nameParam;
        return this;
    }

    public String getSurname() {
        return this.surname;
    }

    public Person setSurname(final String surnameParam) {
        this.surname = surnameParam;
        return this;
    }

    public int getHeight() {
        return this.height;
    }

    public Person setHeight(final int heightParam) {
        this.height = heightParam;
        return this;
    }

    public int getWeight() {
        return this.weight;
    }

    public Person setWeight(final int weightParam) {
        this.weight = weightParam;
        return this;
    }


}
