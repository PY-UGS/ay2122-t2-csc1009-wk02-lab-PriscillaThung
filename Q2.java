import java.util.Scanner;

public class Q2 {
    public static void main(String [] args)
    {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter 3 numbers: ");
        float n1 = input.nextFloat();
        float n2 = input.nextFloat();
        float n3 = input.nextFloat();

        float avg = (n1 + n2 + n3)/3;
        System.out.print("The average of " + n1 + ", " + n2 + ", " + n3 + " is: " + avg);
    }

}
