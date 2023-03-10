package ua.lviv.lgs;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class VerkhovnaRada {
    private static VerkhovnaRada instance;
    private static ArrayList<Fraction> fractions;
    String fractionName;

    public static VerkhovnaRada getInstance() {
        if (instance == null) {
            instance = new VerkhovnaRada();
        }
        return instance;
    }

    public static void addFraction() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the name of the faction:");
        String factionName = scanner.nextLine();
        Iterator<Fraction> factIter = fractions.iterator();
    }

//    public void removeFaction() {
//        Scanner scanner = new Scanner(System.in);
//        System.out.println("Enter the name of the faction:");
////        String factionName = scanner.nextLine();
//        Iterator<Fraction> factRemove = factions.iterator();
//        factions.remove(factRemove);
//    }

    public static void removeFraction() {
        Scanner scanner = new Scanner(System.in);
   System.out.println("Enter the name of the fraction:");
        Iterator<Fraction> factRemove = fractions.iterator();
        while (factRemove.hasNext()) {
            Fraction currentFraction = factRemove.next();
            if (currentFraction.equals(fractions)) {
                factRemove.remove();
                System.out.println("Фракцію " + fractions + " видалено.");
            }
        }
    }

    public static void displayAllFractions() {
        System.out.println("All factions:");
//        for (Deputy factionName : factions) {
//            System.out.println(factionName);
           // factions.forEach(System.out::println);
            Iterator<Fraction> factionsIterator = fractions.iterator();
        }


    public static void displayFraction() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter fraction name: ");
        Iterator<Fraction> fractDisplay = fractions.iterator();
        while (fractDisplay.hasNext()){
            Fraction currentFract = fractDisplay.next();
            System.out.println(currentFract);
    }


}


    public static void setFractions(ArrayList<Fraction> fractions) {
        VerkhovnaRada.fractions = fractions;
    }
}
