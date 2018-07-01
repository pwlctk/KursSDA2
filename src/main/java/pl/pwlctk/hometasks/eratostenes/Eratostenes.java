package pl.pwlctk.hometasks.eratostenes;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

class Eratostenes {

    //Tworzę mapę liczb od 2 do n i przypisuje wszędzie wartosć true
    static List<Integer> primeNumbers(int n) {
        Map<Integer, Boolean> numbers = new HashMap<>();
        for (int i = 2; i <= n; i++) {
            numbers.put(i, true);
        }

        //Wykorzystując algorytm Eratostensa sprawdzam czy dana liczba jest liczbą pierwszą i jeżeli nie jest ustawiam wartość na false
        int sqrtN = (int) Math.sqrt(n);
        for (int i = 2; i <= sqrtN; i++) {
            for (int j = i * i; j <= n; j = j + i) {
                numbers.put(j, false);
            }
        }

        //Wrzucam do listy wszystkie klucze(liczby) z mapy, które mają wartość true
        List<Integer> primeNumbers = new ArrayList<>();
        for (Integer number : numbers.keySet()) {
            if (numbers.get(number).equals(true)) {
                primeNumbers.add(number);
            }
        }

        return primeNumbers;
    }
}