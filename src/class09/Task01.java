package class09;
import java.util.Scanner;
public class Task01 {
    public static void main(String[] args) {

        // Task 1: Print numbers from 1 to 50 except those that are divisible by 3

        for (int i = 1; i <=50 ; i++) {
            if(i%3!=0){
                System.out.println(i);
            }
        }
        System.out.println("***********************");


    }
}
