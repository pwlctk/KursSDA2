package pl.pwlctk.day23_06.task4;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

class Sum {
    static List<Integer> readData() {
        String path = "src/main/resources/numbers.txt";
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

    static List<Integer> computeResult(List<Integer> list) {
        List<Integer> sumList = new ArrayList<>();
        sumList.add(list.get(0));
        for (int i = 1; i < list.size(); i++) {
            sumList.add(list.get(i) + sumList.get(i - 1));

        }

        return sumList;

    }
}





