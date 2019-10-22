import java.util.Scanner;

public class Main {
    public static void main(String[] args){

        Scanner key = new Scanner(System.in);
        System.out.println("enter 3 numbers");

        int num1, num2, num3, num4, num5, num6, num7, num8, num9, num10;

        num1 = key.nextInt();
        num2 = key.nextInt();
        num3 = key.nextInt();
        num4 = key.nextInt();
        num5 = key.nextInt();
        num6 = key.nextInt();
        num7 = key.nextInt();
        num8 = key.nextInt();
        num9 = key.nextInt();
        num10 =key.nextInt();

        int average = (num1+num2+num3+num4+num5+num6+num7+num8+num9+num10)/10;
        System.out.println("The average is " + average);
    }
}

