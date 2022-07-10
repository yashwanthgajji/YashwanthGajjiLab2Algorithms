package com.yashwanthgajji.greatlearning.traveler;

import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class Driver {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of currency denominations");
        int numberOfDenominations = sc.nextInt();
        Currency currency = new Currency();
        System.out.println("Enter the currency denominations value");
        for(int i=0;i<numberOfDenominations;i++) {
            currency.addDenomination(sc.nextInt());
        }
        System.out.println("Enter the amount you want to pay");
        int amountToPay = sc.nextInt();
        TreeMap<Integer, Integer> notes = Money.getMinimumNotes(currency, amountToPay);
        displayNotes(notes, amountToPay);
    }

    //Function to display notes
    private static void displayNotes(TreeMap<Integer, Integer> notes, int amount) {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("To pay " + amount + " you need\n");
        for(Map.Entry<Integer, Integer> e: notes.entrySet()) {
            stringBuilder.append(e.getValue() + " notes of denomination " + e.getKey()+"\n");
        }
        System.out.println(stringBuilder);
    }
}
