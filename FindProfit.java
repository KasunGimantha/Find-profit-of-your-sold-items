package com.KaZuN;

import java.util.Scanner;

public class FindProfit {

    public static void main(String args[]) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Price of an item($): ");
        int priceOfAnItem = scanner.nextInt();

        Scanner scanner2 = new Scanner(System.in);
        System.out.println("Production cost of an item($): ");
        int costOfAnItem = scanner2.nextInt();

        Scanner scanner3 = new Scanner(System.in);
        System.out.println("Number of items you sell: ");
        int numberOfItemsSell = scanner3.nextInt();

        System.out.println("Profit: ");
        System.out.println((priceOfAnItem-costOfAnItem)*numberOfItemsSell +"$");

    }

}
