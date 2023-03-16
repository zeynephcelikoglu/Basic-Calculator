import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

        double number1, number2;
        int select;

        Scanner input = new Scanner(System.in);
        System.out.println("Enter the first number: ");
        number1 = input.nextDouble();

        System.out.println("Enter the second number: ");
        number2 = input.nextDouble();

        System.out.println("Operations\n1-Addition\n2-Subtraction\n3-Multiplication\n4-Division");

        System.out.println("Choose the operation: ");
        select = input.nextInt();

        switch (select) {
            case 1:
                System.out.println("Result: " + (number1 + number2));
                break;
            case 2:
                System.out.println("Result: " + (number1 - number2));
                break;
            case 3:
                System.out.println("Result: " + (number1 * number2));
                break;
            case 4:
                 System.out.println("Result: " + (number1 / number2));
                 if (number2 != 0) {
                     System.out.println("Result: " + (number1 / number2));
                 }else {
                     System.out.println("A number cannot be divided by 0");
                 }
                 break;
            default:
                System.out.println("Wrong choice");
        }
    }
}