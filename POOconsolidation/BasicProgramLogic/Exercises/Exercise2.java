import java.util.Scanner;

public class Exercise2 {

    public static void main(String[] args) {
        String status;
        int age;
        Scanner read = new Scanner(System.in);

        System.out.println("Text your age:\n");
        age = read.nextInt();

        //ternary operator
        System.out.println(status = age > 18 ? "Adult" : "Junior");

    }
}
