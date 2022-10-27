package homework7;
// Input number is Odd or Even
import java.util.Scanner;
public class Programme1OddEvenTernaryOperator {

    public static void main(String[]args){
        //Scanner declaration for reading input from console
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter the number:");
        int number = scanner .nextInt();
        isItOddOrEvenNumber(number);
        //closing the scanner object
        scanner.close();
    }

    private static void isItOddOrEvenNumber(int number) {
        //ternary operator is used
        String evenOrOdd= (number%2==0)?"Even" : "Odd";
        System.out.println("The"+number+"is"+evenOrOdd+"number");
    }
}
