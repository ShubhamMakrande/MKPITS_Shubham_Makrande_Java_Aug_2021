package com.example.spring4demo;

public class Account4 {
    public class Account1 {
        emp3 eob;

        public emp3 getEob() {
            return eob;
        }

        public Account1(emp3 eob) {
            this.eob = eob;
        }

        void trans()
        {
            System.out.println(eob.getName()+"transaction processed by id" +eob.getId()+  "sucessfully");
        }

    }

}
