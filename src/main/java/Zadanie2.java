import java.util.ArrayList;

public class Zadanie2 {

    /**
     * Liczba doskonała to liczba, której suma dzielników bez niej samej równy jest tej liczbie
     * 6 jest liczbą doskonałą, bo jej dzielniki to: 1,2,3,6 a 1+2+3 = 6
     * 28 jest liczbą doskonałą, bo jej dzielniki to: 1,2,4,7,28 a 1+2+4+7 = 28
     *
     * Zadanie: napisz ciało metody findNPerfectNumbers, która znajdzie n pierwszych liczb doskonałych i zwróci je w postaci listy
     */
    public static ArrayList<Integer> findNPerfectNumbers(int n) {
        ArrayList<Integer> resultList = new ArrayList<>();
        int count;
        for (int i = 1; i <= n; i++) {
            count = 0;
            for (int j = 1; j < i; j++) {
                if (i % j == 0) {
                    count += j;
                }
            }
            if (count == i) {
                resultList.add(i);
            }
        }
        return resultList;
    }

    public static void main(String[] args) {
        System.out.println(findNPerfectNumbers(4));
    }
}
