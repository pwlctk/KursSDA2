package pl.pwlctk.Day24_06.task1;

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

    static List<String> showPalindroms(List<String> list) {
        List<String> palindromList = new ArrayList<>();
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).length() % 2 != 0) {
                boolean isPalindrom = true;
                String checkPalindrom = list.get(i);
                for (int j = 0; j < checkPalindrom.length() / 2; j++) {
                    if (checkPalindrom.charAt(j) != checkPalindrom.charAt(checkPalindrom.length() - 1 - j)) {
                        isPalindrom = false;
                    }
                }
                if (isPalindrom) {
                    palindromList.add(list.get(i));
                }
            }
        }
        return palindromList;
    }
}
