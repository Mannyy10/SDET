package class08;

public class ContinueKeywordDemo01 {
    public static void main(String[] args) {

        for (int i = 0; i < 10; i++) {

            if (i % 3 == 0) {   // Can be written (i==3||i==6||i==9)
                continue; // skip
            } else {
                System.out.println(i); // lines is skipped when 1=3,6,9
            }
            System.out.println("Hello Java");

        }
    }
}
