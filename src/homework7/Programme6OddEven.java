package homework7;
import java.util.Scanner;

/**
 * Write a java programme to input any number and find out if it's odd or even
 */
public class Programme6OddEven {
    public static void main(String[] args) {
        //Scanner declaration for reading input form console
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number you want to check");
        int number = scanner.nextInt();
        Programme6OddEven oddEven = new Programme6OddEven();
        System.out.println(number + "is" + oddEven.isItEvenOrOddNumber(number) + "number");
scanner.close();

    }
public String isItEvenOrOddNumber(int number){
        if (number % 2 == 0){
            return "Even";

        }else{
            return "Odd";
        }
}

}

