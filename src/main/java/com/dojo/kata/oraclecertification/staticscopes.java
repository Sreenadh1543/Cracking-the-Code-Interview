package com.dojo.kata.oraclecertification;

public class staticscopes {

    public static void main(String[] args) {
        otherClass oc = new otherClass();
    }

    void sample() {

    }


}

class otherClass {

    static {
        System.out.println("In Static scope");
    }

    {
        System.out.println("In scope");
    }

    public otherClass() {
        System.out.println("In Constructor");
    }
}



