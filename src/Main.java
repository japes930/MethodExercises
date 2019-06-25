import java.util.Scanner;

public class Main {
    public static void main(String[] args){

        Scanner keyboard = new Scanner(System.in);
        System.out.println("Enter the first number : ");
        int num1 = keyboard.nextInt();
        checkIfOdd(num1);
        System.out.println("Enter a 2nd number");
        int num2 = keyboard.nextInt();
        addNumbers(num1, num2);
        System.out.println("Enter a 3rd number");
        int num3 = keyboard.nextInt();
        getAverage(num1, num2, num3);


    }

    private static void checkIfOdd(int x){
        int y = x%2;
        if ( y==0){
            System.out.println(x + " is an even number.");
        } else System.out.println(x + " is an odd number.");

    }

    private static void addNumbers(int x, int y){
        int sum = x + y;
        System.out.println("Sum is: " + sum);
    }

    private static void getAverage(int x, int y, int z){
        int avg = (x + y + z)/3;
        System.out.println("Average of the three numbers is: " + avg);
    }
}
