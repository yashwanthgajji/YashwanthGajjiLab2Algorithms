package com.yashwanthgajji.greatlearning.traveler;

import java.util.Collections;
import java.util.TreeSet;

public class Currency {

    private TreeSet<Integer> denominations; //A tree set to store denominations in descending order

    //constructor
    Currency() {
        denominations = new TreeSet<>(Collections.reverseOrder());
    }

    //Function to add denomination to TreeSet
    public void addDenomination(int denomination) {
        denominations.add(denomination);
    }

    //Getter
    public TreeSet<Integer> getDenominations() {
        return denominations;
    }
}
