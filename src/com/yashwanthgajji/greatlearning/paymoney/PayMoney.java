package com.yashwanthgajji.greatlearning.paymoney;

public class PayMoney {

    private final int[] transactions;   //all transactions
    private final int[] preSumArray;    //to store sum of transactions at every transaction

    //constructor
    public PayMoney(int[] transactions) {
        this.transactions = transactions;
        preSumArray = new int[transactions.length];
        calculatePreSumArray();
    }

    //method to calculate preSumArray
    private void calculatePreSumArray() {
        if(transactions.length!=0) {
            preSumArray[0] = transactions[0];
            for(int i=1;i<transactions.length;i++) {
                preSumArray[i] = preSumArray[i-1] + transactions[i];
            }
        }
    }

    //Function to check if target amount is achieved in given transactions
    public int isTargetAchieved(int targetAmount) {
        int numberOfTransactionsToAchieveTarget = -1;
        for(int i=0;i<preSumArray.length;i++) {
            if(preSumArray[i]>=targetAmount) {
                numberOfTransactionsToAchieveTarget = i + 1;
                break;
            }
        }
        return numberOfTransactionsToAchieveTarget;
    }
}
