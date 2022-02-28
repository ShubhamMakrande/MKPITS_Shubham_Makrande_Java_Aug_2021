package com.example.spring1demo;

public class Account1 {
    emp1 eob;

    public emp1 getEob() {
        return eob;
    }

    public Account1(emp1 eob) {
        this.eob = eob;
    }

    void trans()
    {
        System.out.println(eob.getName()+"transaction processed by id" +eob.getId()+  "sucessfully");
    }

}
