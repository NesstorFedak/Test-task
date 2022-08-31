public class Zadanie1 {

    /** Napisz ciało metody createPicture(int n), która dla dowolnego n > 0 stworzy gotowy do wypisania w konsoli wzór.
            *
            * Przykłady:
            *
            * Dla n = 1 w konsoli powinien pojawić się wzór:
            * 1
            *
            * Dla n = 2 w konsoli powinien pojawić się wzór:
            * 2 2 2
            * 2 1 2
            * 2 2 2
            *
            * Dla n = 3 w konsoli powinien pojawić się wzór:
            * 3 3 3 3 3
            * 3 2 2 2 3
            * 3 2 1 2 3
            * 3 2 2 2 3
            * 3 3 3 3 3
            *
            * Dla n = 4 w konsoli powinien pojawić się wzór:
            * 4 4 4 4 4 4 4
            * 4 3 3 3 3 3 4
            * 4 3 2 2 2 3 4
            * 4 3 2 1 2 3 4
            * 4 3 2 2 2 3 4
            * 4 3 3 3 3 3 4
            * 4 4 4 4 4 4 4
            *
            */

    public static String createPicture(int n) {
        int dim = n * 2 - 1;
        int[][] result = new int[dim][dim];
        int fill = n;
        int index = 1;
        int correct = 0;
        int row = 0;
        int column = -1;

        while (dim > 0) {
            for (int i = 0; i < dim - correct; i++) {
                column += index;
                result[row][column] = fill;
            }
            --dim;
            for (int i = 0; i < dim - correct; i++) {
                row += index;
                result[row][column] = fill;
            }
            for (int i = 0; i < dim - correct; i++) {
                column -= index;
                result[row][column] = fill;
            }
            ++correct;
            for (int i = 0; i < dim - correct; i++) {
                row -= index;
                result[row][column] = fill;
            }
            --fill;
        }
        StringBuilder builder = new StringBuilder();
        for (row = 0; row < result.length; row++) {
            for (column = 0; column < result[0].length; column++ ) {
                builder.append(" ").append(result[row][column]);
            }
            builder.append("\n");
        }
        return builder.toString();
    }
    public static void main(String[] args) {
        System.out.println(createPicture(4));
    }
}
