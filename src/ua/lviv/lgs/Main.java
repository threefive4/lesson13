package ua.lviv.lgs;

import java.util.ArrayList;
import java.util.Scanner;

public class Main extends VerkhovnaRada{
    private static Scanner scanner = new Scanner(System.in);
    private ArrayList<Fraction> fractions;
    public static void main(String[] args) {
        boolean isExit = false;
        while (!isExit) {
            System.out.println("Введіть:");
            System.out.println("1 щоб додати фракцію");
            System.out.println("2 щоб видалити конкретну фракцію");
            System.out.println("3 щоб вивести усі фракції");
            System.out.println("4 щоб очистити конкретну фракцію");
            System.out.println("5 щоб вивести конкретну фракцію");
            int choice = scanner.nextInt();
switch (choice) {
            case 1:
                addFraction();
                break;
            case 2:
                removeFraction();
                break;
            case 3:
                displayAllFractions();
                break;
            case 4:
                Scanner remove = new Scanner(System.in);
                System.out.println("Name of fraction: ");
                removeFraction();
                break;
            case 5:
                displayFraction();
                break;
            case 11:
                isExit = true;
                break;
            default:
                System.out.println("Некоректний ввід, спробуйте ще раз");
                break;
        }
    }
}


}
