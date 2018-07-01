package pl.pwlctk.day24_06.task1;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

class Palindrom {

    static List<String> readData() {
        String path = "src/main/resources/palindrom.txt";
        String line;
        List<String> list = new ArrayList<>();
        try {
            BufferedReader br = new BufferedReader(new FileReader(path));
            while ((line = br.readLine()) != null) {
                list.add(line);
            }
            br.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return list;
    }

    private static boolean isPalindrom(String word) {
        if (word.length() % 2 != 0) {
            for (int j = 0; j < word.length() / 2; j++) {
                if (word.charAt(j) != word.charAt(word.length() - 1 - j)) {
                    return false;
                }
            }
        } else {
            return false;
        }
        return true;
    }

    static List<String> showPalindroms(List<String> list) {
        List<String> palindromList = new ArrayList<>();
        for (int i = 0; i < list.size(); i++) {
            if (isPalindrom(list.get(i))) {
                palindromList.add(list.get(i));
            }
        }
        return palindromList;
    }
}
