import java.util.Scanner;

public class Main {


    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int n = input.nextInt();

        for (int i = 1; i <= n; i++)
            printStars(i);

        for (int i = n - 1; i >= 0; i--)
            printStars(i);


    }

    public static void printStars(int count) {

        for (int i = 1; i <= count; i++)
            System.out.print("*");

        System.out.println();

    }


}