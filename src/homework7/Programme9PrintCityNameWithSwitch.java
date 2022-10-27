package homework7;
import java.util.Scanner;

/**
 * Input any alphabet from “A to “F” and print their city name accordingly (use if else) if
 * any other alphabet should be invalid entry USING SWITCH STATEMENT
 */
public class Programme9PrintCityNameWithSwitch {
    public static void main(String[] args) {
        //Scanner declaration for reading input form console
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter alphabet between A to F :");
        //Create object and call instance method
        Programme9PrintCityNameWithSwitch cityName = new Programme9PrintCityNameWithSwitch();
        cityName.printCityName("city");
        scanner.close();
    }
        public void printCityName (String city){
            switch (city) {
                case "A" -> System.out.println("Aberdeen");
                case "B" -> System.out.println("Belfast");
                case "C" -> System.out.println("Cambridge");
                case "D" -> System.out.println("Derby");
                case "E" -> System.out.println("Edinburgh");
                case "F" -> System.out.println("Feltham");
                default -> System.out.println("The alphabet you enter is not A to F");
            }
        }
    }












