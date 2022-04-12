package com.company;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
	// write your code here
         String name = "Felipe";
         String id = "125.855.999-13";
         String years = "28";


        ArrayList<String>people = new ArrayList<>();

        people.add(name);
        people.add(id);
        people.add(years);


        for (String identify : people){
            System.out.println(identify);
        }

    }
}
