package com.example.spring1demo;

public class emp {
    private int id;
    private String name;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    void dis()
    {
        System.out.println("helo"+getId()+""+getName());
    }
}
