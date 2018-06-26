import java.util.Scanner;

class UserChoise {
    public static void main(String[] args) {
        double sum = 0;
        double avg = 0;
        double[] arr = {3, 13, 40, 7, 56};

        for (int i = 0; i < arr.length; i++) {
            sum = sum + arr[i];
        }
        System.out.println("Sum is " + sum);

        avg = (sum / arr.length);
        System.out.println("average is " + avg);

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > avg) {
                System.out.println(arr[i]);
            }
        }
    }
}
