import java.util.Scanner;

public class Main {
    public static void main(String[] args){

        Scanner key = new Scanner(System.in);
        System.out.println("enter 3 numbers");

        int num1, num2, num3;

        num1 = key.nextInt();
        num2 = key.nextInt();
        num3 = key.nextInt();
        int sum = num1+num2+num3;

        System.out.println("The sum is " + sum);
    }
}

