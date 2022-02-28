package com.example.spring1demo;

public class emp1 {
    private int id;
    private String name;

    public emp1(int id) {
        this.id = id;
    }

    public int getId() {
        return id;
    }

    public emp1(String name) {
        this.name = name;
    }

    public emp1(String name, int id) {
        this.name = name;
        this.id=id;
    }

    public String getName() {
        return name;
    }

    void dis()
    {
        System.out.println("helo"+getId()+""+getName());
    }
}
