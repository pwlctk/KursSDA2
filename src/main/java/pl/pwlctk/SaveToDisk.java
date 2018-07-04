package pl.pwlctk;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;
import java.util.Queue;

public class SaveToDisk {
    public static void saveString(String content, String fileName) {
        try {
            String path = "src/main/resources/" + fileName;
            Files.write(Paths.get(path), content.getBytes());
        } catch (IOException e) {
            System.out.println("Coś nie wyszło :(");
            e.printStackTrace();
        }
    }

    public static void saveList(List list, String fileName) {
        String path = "src/main/resources/" + fileName;
        StringBuilder content = new StringBuilder();
        //poprawione, aby na końcu pliku nie było zbędnego entera
        for (int i = 0; i < list.size() - 1; i++) {
            content.append(list.get(i)).append("\n");
        }
        content.append(list.get(list.size() - 1));
        try {
            Files.write(Paths.get(path), content.toString().getBytes());
        } catch (IOException e) {
            System.out.println("Coś nie wyszło :(");
            e.printStackTrace();
        }
    }


}
