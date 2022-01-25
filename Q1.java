import java.util.Scanner;

public class Q1
{
    private static final double PI = 3.14159;
    public static void main(String [] args)
    {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a radius of circle: ");
        float radius = input.nextFloat();

        double area = radius * radius * PI;
        System.out.println("The area of the circle of radius " + radius + " is: " + area );
    }
}