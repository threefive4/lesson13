package ua.lviv.lgs;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.Scanner;

public class Fraction {
    private ArrayList<Deputy> deputies;
    private String fractionName;

    public Fraction(String fractionName) {
        this.fractionName = fractionName;
        deputies = new ArrayList<>();
    }

    public String getFractionName() {
        return fractionName;
    }

    public void setFractionName(String fractionName) {
        this.fractionName = fractionName;
    }


    public void addDeputy() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter weight: ");
        int weight = scanner.nextInt();
        System.out.println("Enter height: ");
        int height = scanner.nextInt();
        System.out.print("Enter deputy first name: ");
        String firstName = scanner.nextLine();
        System.out.print("Enter deputy last name: ");
        String lastName = scanner.nextLine();
        System.out.print("Enter deputy age: ");
        int age = scanner.nextInt();
        System.out.print("Enter deputy bribe amount: ");
        int bribeAmount = scanner.nextInt();
        System.out.print("Is the deputy a bribe taker? ");
        boolean bribeTaker = scanner.nextBoolean();
        Deputy deputy = new Deputy(weight, height, firstName, lastName, age, bribeTaker);
        deputies.add(deputy);
    }

    public void removeDeputy() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter deputy last name: ");
        String name = scanner.nextLine();
        Iterator<Deputy> iterator = deputies.iterator();
        while (iterator.hasNext()) {
            Deputy deputy = iterator.next();
            if (deputy.getLastName().equals(name)) {
                iterator.remove();
                System.out.println("Deputy removed.");
                return;
            }
        }
        System.out.println("Deputy not found.");
    }

    public void printBribeTakers() {
        System.out.println("Bribe takers:");
        for (Deputy deputy : deputies) {
            if (deputy.isBribeTaker()) {
                System.out.println(deputy);
            }
        }
    }

    public void printBiggestBribeTaker() {
        Deputy biggestBribeTaker = Collections.max(deputies, Comparator.comparingInt(Deputy::getBribeSize));
        System.out.println("Biggest bribe taker: " + biggestBribeTaker);
    }

    public void printDeputies() {
        System.out.println("Deputies:");
        for (Deputy deputy : deputies) {
            System.out.println(deputy);
        }
    }

    public void clear() {
        deputies.clear();
        System.out.println("Fraction cleared.");
    }


}
