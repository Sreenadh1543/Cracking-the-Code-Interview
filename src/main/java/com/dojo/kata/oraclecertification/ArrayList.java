package com.dojo.kata.oraclecertification;

import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class ArrayList {

    public static void main(String[] args) {

        List<String> cityNames = new java.util.ArrayList<String>() {
            {
                add("Afganisthan");
                add("Bhutan");
                add("Nepal");
                add("India");
            }

        };


        for (Iterator<String> cityName = cityNames.iterator(); cityName.hasNext(); ) {

            if (cityName.next() == "India")
                cityName.remove();

        }

        System.out.println(cityNames);


        for (ListIterator<String> cityName = cityNames.listIterator(); cityName.hasNext(); ) {

            System.out.println(cityName.next());
            System.out.println(cityName.nextIndex());
            System.out.println(cityName.previousIndex()); //-1 indicates this
        }
    }
}
