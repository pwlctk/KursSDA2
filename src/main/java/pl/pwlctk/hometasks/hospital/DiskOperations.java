package pl.pwlctk.hometasks.hospital;


import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Queue;
import java.util.Scanner;

class DiskOperations {

    static Hospital readPatientsData(String fileName) {
        Hospital szpital = new Hospital();
        String path = "src/main/resources/";
        try {
            File file = new File(path + fileName);
            Scanner scanner = new Scanner(file);
            String[] patientData;
            while (scanner.hasNext()) {
                patientData = scanner.nextLine().split(";");
                szpital.addPatient(patientData[0], patientData[1], patientData[2], Integer.parseInt(patientData[3]));
            }
            scanner.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        return szpital;
    }

    static void savePatientsData(Queue queue, String fileName) {
        String path = "src/main/resources/" + fileName;
        StringBuilder content = new StringBuilder();
        //poprawione, aby na końcu pliku nie było zbędnego entera
        while (queue.size() > 1) {
            content.append(queue.poll()).append("\n");
        }
        content.append(queue.poll());
        try {
            Files.write(Paths.get(path), content.toString().getBytes());
        } catch (
                IOException e) {
            System.out.println("Coś nie wyszło :(");
            e.printStackTrace();
        }
    }
}
