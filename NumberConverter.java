import java.util.Scanner;
public class NumberConverter{
    public static void main(String[] args){

        Scanner input = new Scanner(System.in);


        L1:
        do {
            System.out.println("\n==================================");
            System.out.println("       NUMBER CONVERTER");
            System.out.println("==================================");
            System.out.println("1. Decimal Converter");
            System.out.println("2. Binary Converter");
            System.out.println("3. Octal Converter");
            System.out.println("4. Hexadecimal Converter");
            System.out.println("5. Roman Numeral Converter");
            System.out.println("6. Exit");
            System.out.println("==================================");

            System.out.print("Enter your choice: ");
            
            

            if (!input.hasNextInt()) {
                System.out.println("Invalid input! Please enter a number.");
                input.nextLine();
                continue;
            }

            int option = input.nextInt();

            switch (option) {

                case 1:
                    System.out.println("\n------ DECIMAL CONVERTER ------");

                    boolean valid = false;

                    while (!valid) {

                        System.out.print("Enter a decimal number: ");

                        if (!input.hasNextInt()) {
                            System.out.println("Invalid input! Please enter a non-negative integer.");
                            input.nextLine();
                            continue;
                        }

                        int num = input.nextInt();

                        if (num < 0) {
                            System.out.println("Negative numbers are not allowed!");
                            continue;
                        }

                        String binary = Integer.toBinaryString(num);
                        String octal = Integer.toOctalString(num);
                        String hexadecimal = Integer.toHexString(num).toUpperCase();

                        System.out.println("\nDecimal      : " + num);
                        System.out.println("Binary       : " + binary);
                        System.out.println("Octal        : " + octal);
                        System.out.println("Hexadecimal  : " + hexadecimal);

                        valid = true;
                    }

                    break;

                case 2:
                    System.out.println("\nBinary converter will be added soon!");
                    break;

                case 3:
                    System.out.println("\nOctal converter will be added soon!");
                    break;

                case 4:
                    System.out.println("\nHexadecimal converter will be added soon!");
                    break;

                case 5:
                    System.out.println("\nRoman numeral converter will be added soon!");
                    break;

                case 6:
                    System.out.println("\nThank you for using Number Converter!");
                    break L1;

                default:
                    System.out.println("Invalid option! Please select between 1 and 6.");
            }

            System.out.print("\nDo you want to return to the homepage? (Y/N): ");
            String answer = input.next();

            if (!answer.equalsIgnoreCase("Y")) {
                System.out.println("\nThank you for using Number Converter!");
                break;
            }

        } while (true);

        input.close();
    }
}
