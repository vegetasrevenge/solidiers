package com.tiy;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	    Marine marine = new Marine();

	    Scanner sc = new Scanner(System.in);

		System.out.println("Name, rank, and number SON!");
	    marine.setName(sc.nextLine());
	    marine.setRank(sc.nextLine());
	    marine.setSerialNumber(Integer.parseInt(sc.nextLine()));

		System.out.println(
			"Name: " + marine.getName() + "\n" +
			"Rank: " + marine.getRank() + "\n" +
			"Serial No.: " + marine.getSerialNumber()
        );

		System.out.println("WHAT is your function??");
		sc.nextLine();
        System.out.println(
			marine.harpoon() + "\n" +
			marine.march() + "\n" +
			marine.handToHand() + "\n" +
			marine.guns() + "\n" +
			marine.speak() + "\n" +
			marine.swim() + "\n" +
			marine.scuba()
		);

		System.out.println("HOW do you act??");
		sc.nextLine();
		System.out.println(
			marine.eat() + "\n" +
			marine.sleep() + "\n" +
			marine.walk()
		);



    }
}
