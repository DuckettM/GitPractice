import java.util.Scanner;

public class sum {
    public static void main(String [] args){
        System.out.println("Enter the 1st integer");
        Scanner first = new Scanner(System.in);
        int one = first.nextInt();

        System.out.println("Enter the 2nd integer");
        Scanner second = new Scanner(System.in);
        int two = second.nextInt();

        int sum = calculateSum(one, two);
        System.out.println("The sum is " + sum);
    }
    public static int calculateSum(int a, int b) {
        return a + b;
    }

}
