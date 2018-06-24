package pl.pwlctk.Day23_06.task4;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

class Sum {
    static List<Integer> readFile() {
        String path = "src\\pl\\pwlctk\\Day23_06\\task4\\numbers.txt";
        String line;
        List<Integer> list = new ArrayList<>();
        try {
            BufferedReader br = new BufferedReader(new FileReader(path));
            while ((line = br.readLine()) != null) {
                list.add(Integer.parseInt(line));
            }
            br.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return list;
    }
}





