package homework7;
import java.util.Scanner;
/*Input any year like (ex 2007 ) and find out if it is leap year
or not ?
 */
public class Programme2LeapYear {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Please enter the Year:");
        int year = scanner.nextInt();
        Programme2LeapYear leapYear=new Programme2LeapYear();
        leapYear.isItLeapYear(year);
        //closing the scanner object
        scanner.close();

    }

    private void isItLeapYear(int year) {
        if (year % 4 == 0 && year % 100 != 0 || year % 400 == 0) {
            System.out.println("The year " + year + " is leap year ");
            return;
        }
        System.out.println("The year " + year + " is not a leap year ");

    }

}
