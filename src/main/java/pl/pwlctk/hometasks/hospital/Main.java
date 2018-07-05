package pl.pwlctk.hometasks.hospital;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Hospital sor = DiskOperations.readPatientsData("patientsData.txt");
        int choice;
        do {
            choice = showMainMenu(sor);
            switch (choice) {
                case 1:
                    addPatientMenuItem(sor);
                    break;
                case 2:
                    servicePatientMenuItem(sor);
                    break;
                case 3:
                    endDayMenuItem(sor);
                    break;
                default:
                    System.out.println("Proszę wybrać poprawną pozycję!");
            }
        } while (choice != 3);
    }

    private static int showMainMenu(Hospital sor) {
        Scanner in = new Scanner(System.in);
        System.out.println("---------------------------");
        System.out.println("     Obsługa SOR v.0.2     ");
        System.out.println("---------------------------");
        System.out.println();
        System.out.println("Liczba pacjentów w kolejce: " + sor.patientQueueSize());
        System.out.println("Pierwszy w kolejce czeka: " + sor.viewPatient());
        System.out.println();
        System.out.println("1) Dodaj pacjenta");
        System.out.println("2) Obsłuż pacjenta");
        System.out.println("3) Zakończ");
        return in.nextInt();
    }

    private static void endDayMenuItem(Hospital sor) {
        Scanner in = new Scanner(System.in);
        System.out.println("Koniec na dziś, lekarz poszedł do domu!");
        System.out.println("Pozostało pacjentów: " + sor.patientQueueSize());
        if (!sor.queueIsEmpty()) {
            int saveChoice;
            do {
                System.out.println("Czy zapisać pacjentów na kolejny dzień?");
                System.out.println("1) Tak");
                System.out.println("2) Nie");
                saveChoice = in.nextInt();
                if (saveChoice == 1) {
                    DiskOperations.savePatientsData(sor.getPatients(), "patientsData.txt");
                    System.out.println("Pacjenci zapisani.");
                } else if (saveChoice == 2) {
                    System.out.println("Pacjenci nie zostali zapisani!");
                } else {
                    System.out.println("Wprowadź poprawną wartość!");
                }
            } while (saveChoice != 2 && saveChoice != 1);
        }
        System.out.println("Do widzenia!");
    }

    private static void servicePatientMenuItem(Hospital sor) {
        Scanner in = new Scanner(System.in);
        if (!sor.queueIsEmpty()) {
            int nextPatientChoice;
            do {
                System.out.println("Obsłużono pacjenta z dolegliwością: " + sor.handlePatient().getAilment());
                if (!sor.queueIsEmpty()) {
                    System.out.println("Czy obsłużyć następnego pacjenta: " + sor.viewPatient());
                    System.out.println("1) Tak");
                    System.out.println("2) Nie");
                    nextPatientChoice = in.nextInt();
                } else {
                    System.out.println("Nie ma już pacjentów w kolejce!");
                    nextPatientChoice = 2;
                }
            } while (nextPatientChoice != 2);
        }
    }

    private static void addPatientMenuItem(Hospital sor) {
        Scanner in = new Scanner(System.in);
        String name;
        String lastName;
        String ailment;
        int priority;
        int addPatientChoice;
        do {
            System.out.println("Proszę podać dane pacjenta:");
            System.out.println("Imię: ");
            name = in.next();
            System.out.println("Nazwisko: ");
            lastName = in.next();
            System.out.println("Dolegliwość: ");
            in.nextLine(); //Aby można było użyć niżej nextLine()
            ailment = in.nextLine();
            System.out.println("Piorytet: (1 - najniższy, 10 - najwyższy");
            priority = in.nextInt();
            sor.addPatient(name, lastName, ailment, priority);
            System.out.println("Czy dodać kolejnego pacjenta?");
            System.out.println("1) Tak");
            System.out.println("2) Nie");
            addPatientChoice = in.nextInt();
        } while (addPatientChoice != 2);
    }
}
