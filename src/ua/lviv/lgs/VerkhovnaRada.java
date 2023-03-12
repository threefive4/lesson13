package ua.lviv.lgs;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;
import java.util.Scanner;

public class VerkhovnaRada {
    private static VerkhovnaRada instance;

    private static ArrayList<Fraction> fractions = new ArrayList<>();
    ListIterator<Fraction> listFr = fractions.listIterator();

    public ArrayList<Fraction> getFractions() {
        return fractions;
    }

    public VerkhovnaRada() {
    }

    public static VerkhovnaRada getInstance() {
        if (instance == null) {
            instance = new VerkhovnaRada();
        }
        return instance;
    }

    public void addFraction() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the name of the faction:");
        String fractionName = scanner.nextLine();
        Iterator<Fraction> factIter = fractions.iterator();
        Fraction newFraction = new Fraction(fractionName);
        fractions.add(newFraction);
        System.out.println("New fraction added: " + fractionName);
    }


    public void removeFraction() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the name of the fraction:");
        String fractionName = scanner.nextLine();

        Iterator<Fraction> factRemove = fractions.iterator();
        while (factRemove.hasNext()) {
            Fraction currentFraction = factRemove.next();
            if (currentFraction.getFractionName().equals(fractionName)) {
                factRemove.remove();
                System.out.println("Фракцiю " + fractionName + " удалено.");
            }
        }
    }

    public void displayAllFractions() {
        System.out.println("All fractions:");

        Iterator<Fraction> iterator = fractions.iterator();
        while (iterator.hasNext()) {
            Fraction fraction = iterator.next();
            System.out.println(fraction.getFractionName());
        }

    }

    public void displayFraction() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter fraction name: ");
        String fractionName = scanner.nextLine();
        Iterator<Fraction> fractDisplay = fractions.iterator();
        while (fractDisplay.hasNext()) {
            Fraction currentFract = fractDisplay.next();
            System.out.println(currentFract.getFractionName());
        }


    }

}