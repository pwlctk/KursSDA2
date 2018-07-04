package pl.pwlctk.hometasks.hospital;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        SorHospital szpital = new SorHospital();
//        szpital.addPatient("Brajan", "Nowak", "Ból głowy", 3);
//        szpital.addPatient("Jan", "Marudny", "Złamana noga, połamana ręka", 9);
//        szpital.addPatient("Juliusz", "Kiszka", "Zatrucie piwem", 4);
//        szpital.addPatient("Rafał", "Kosmo", "Ból brzucha, wymioty", 7);
//        szpital.addPatient("Janusz", "Bąbel", "Alkoholik", 10);

        szpital = DiskOperations.readPatients("patientList.txt");

        Scanner in = new Scanner(System.in);
        int choice;
        do {
            System.out.println("---------------------------");
            System.out.println("     Obsługa SOR v.0.1     ");
            System.out.println("---------------------------");
            System.out.println();
            System.out.println("Liczba pacjętów w kolejce: " + szpital.patientQueueSize());
            System.out.println("Pierwszy w kolejce czeka: " + szpital.viewPatient());
            System.out.println();
            System.out.println("1) Dodaj pacjęta");
            System.out.println("2) Obsłuż pacjęta");
            System.out.println("3) Zakończ");

            choice = in.nextInt();
            switch (choice) {
                case 1:
                    String name;
                    String lastName;
                    String ailment;
                    int priority;
                    int addPatientChoice;
                    do {
                        System.out.println("Proszę podać dane pacjęta:");
                        System.out.println("Imię: ");
                        name = in.next();
                        System.out.println("Nazwisko: ");
                        lastName = in.next();
                        System.out.println("Dolegliwość: ");
                        in.nextLine(); //Aby można było użyć niżej nextLine()
                        ailment = in.nextLine();
                        System.out.println("Piorytet: (1 - najniższy, 10 - najwyższy");
                        priority = in.nextInt();
                        szpital.addPatient(name, lastName, ailment, priority);
                        System.out.println("Czy dodać kolejnego pacjęta?");
                        System.out.println("1) Tak");
                        System.out.println("2) Nie");
                        addPatientChoice = in.nextInt();
                    } while (addPatientChoice != 2);
                    break;
                case 2:
                    if (!szpital.queueIsEmpty()) {
                        int nextPatientChoice;
                        do {
                            System.out.println("Obsłużono pacjęta z dolegliwością: " + szpital.handlePatient().getAilment());
                            if (!szpital.queueIsEmpty()) {
                                System.out.println("Czy obsłużyć następnego pacjęta: " + szpital.viewPatient());
                                System.out.println("1) Tak");
                                System.out.println("2) Nie");
                                nextPatientChoice = in.nextInt();
                            } else {
                                System.out.println("Nie ma już pacjętów w kolejce!");
                                nextPatientChoice = 2;
                            }
                        } while (nextPatientChoice != 2);
                    }
                    break;
                case 3:
                    System.out.println("Koniec na dziś, lekarz poszedł do domu!");
                    System.out.println("Pozostało pacjętów: " + szpital.patientQueueSize());
                    if (!szpital.queueIsEmpty()) {
                        int saveChoice;
                        do {
                            System.out.println("Czy zapisać pacjętów na kolejny dzień?");
                            System.out.println("1) Tak");
                            System.out.println("2) Nie");
                            saveChoice = in.nextInt();
                            if (saveChoice == 1) {
                                DiskOperations.savePatients(szpital.getPatients(), "patientList.txt");
                                System.out.println("Pacjęci zapisani.");
                            } else if (saveChoice == 2) {
                                System.out.println("Pacjęci nie zostali zapisani!");
                            } else {
                                System.out.println("Wprowadź poprawną wartość!");
                            }
                        } while (saveChoice != 2 && saveChoice != 1);
                    }
                    System.out.println("Do widzenia!");
                    break;
                default:
                    System.out.println("Proszę wybrać poprawną pozycję!");
                    break;
            }
        } while (choice != 3);
    }
}
