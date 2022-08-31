import zadanie3.controller.MyController;
import zadanie3.servicee.HttpClientService;

public class Zadanie3 {
    /**
     * Z publicznego API: https://jsonplaceholder.typicode.com pobierz wszystkie zapisane posty znajdujące się pod adresem
     * https://jsonplaceholder.typicode.com/posts tak by po wywołaniu metody getPosts() można było wypisać wszystkie elementy w konsoli,
     * podobnie jak wypisuje je przeglądarka po wejściu w link.
     *
     * Można skorzystać z dowolnych sposobów pobierania danych z API dostępnych dla języka Java.
     * */
    private static final String LINK = "https://jsonplaceholder.typicode.com/posts";
    public static String getPosts() {
        MyController ctrl = new MyController(new HttpClientService());
        return ctrl.run(LINK);
    }
    public static void main(String[] args) {
        System.out.println(getPosts());
    }
}
