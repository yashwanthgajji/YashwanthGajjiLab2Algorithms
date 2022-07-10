package com.yashwanthgajji.greatlearning.traveler;

import java.util.Collections;
import java.util.TreeMap;

public class Money {

    //static function to get minimum notes for the amount to pay
    public static TreeMap<Integer, Integer> getMinimumNotes(Currency currency, int amountToPay) {
        //storing the notes in TreeMap
        TreeMap<Integer, Integer> notes = new TreeMap<>(Collections.reverseOrder());
        int amountNeeded = amountToPay;
        for(int i: currency.getDenominations()) {
            if(amountNeeded>=i) {
                int notesNeeded = amountNeeded / i;
                amountNeeded = amountNeeded % i;
                notes.put(i, notesNeeded);
            }
        }
        return notes;
    }
}
