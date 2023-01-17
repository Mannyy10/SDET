package class09;

public class ArrayDemo02 {
    public static void main(String[] args) {

        // 10 20 30 45 50

        int sum=0;
        int[] numbers={10,20,30,45,50};
        //System.out.println(numbers.length);
        for (int i = 0; i <numbers.length ; i++) {
            sum=sum+numbers[i]; // adding all the numbers
            //System.out.println(numbers[i]);

        }
        System.out.println(sum);
    }
}
