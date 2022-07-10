package com.yashwanthgajji.greatlearning.paymoney;

import java.util.Scanner;

public class Driver {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the size of the transaction array");
        int numberOfTransactions = sc.nextInt();

        System.out.println("Enter the values of array");
        int[] transactions = new int[numberOfTransactions];
        for(int i=0;i<numberOfTransactions;i++) {
            transactions[i] = sc.nextInt();
        }

        PayMoney payMoney = new PayMoney(transactions);

        System.out.println("Enter the total no of targets that needs to be achieved");
        int numberOfTargets = sc.nextInt();
        for(int i=0;i<numberOfTargets;i++) {
            System.out.println("Enter the value of target");
            int targetAmount = sc.nextInt();

            int numberOfTransactionsToAchieveTarget = payMoney.isTargetAchieved(targetAmount);
            if(numberOfTransactionsToAchieveTarget == -1) {
                System.out.println("Given target is not achieved\n");
            } else {
                System.out.println("Target achieved after " + numberOfTransactionsToAchieveTarget + " transactions\n");
            }
        }
    }
}
