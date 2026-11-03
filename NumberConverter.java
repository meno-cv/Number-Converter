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
                    System.out.println("\n------ BINARY CONVERTER ------");

                    boolean valid2 = false;

                    while (!valid2) {

                        System.out.print("Enter a binary number: ");
                        String binaryNum = input.next();

                        boolean correct = true;
                        long decimal = 0;
                        long place = 1;

                        for (int i = binaryNum.length() - 1; i >= 0; i--) {

                            char digit = binaryNum.charAt(i);

                            if (digit != '0' && digit != '1') {
                                correct = false;
                                break;
                            }

                            decimal += (digit - '0') * place;
                            place *= 2;
                        }

                        if (!correct) {
                            System.out.println("Invalid binary number! Only 0 and 1 are allowed.");
                            continue;
                        }

                        String octal = Long.toOctalString(decimal);
                        String hexadecimal = Long.toHexString(decimal).toUpperCase();

                        System.out.println("\nBinary       : " + binaryNum);
                        System.out.println("Decimal      : " + decimal);
                        System.out.println("Octal        : " + octal);
                        System.out.println("Hexadecimal  : " + hexadecimal);

                        valid2 = true;
                    }

                    break;

                case 3:
                    System.out.println("\n------ OCTAL CONVERTER ------");

                    boolean valid3 = false;

                    while (!valid3) {

                        System.out.print("Enter an octal number: ");
                        String octalNum = input.next();

                        boolean correct = true;
                        long decimal = 0;
                        long place = 1;

                        for (int i = octalNum.length() - 1; i >= 0; i--) {

                            char digit = octalNum.charAt(i);

                            if (digit < '0' || digit > '7') {
                                correct = false;
                                break;
                            }

                            decimal += (digit - '0') * place;
                            place *= 8;
                        }

                        if (!correct) {
                            System.out.println("Invalid octal number! Only digits 0 to 7 are allowed.");
                            continue;
                        }

                        String binary = Long.toBinaryString(decimal);
                        String hexadecimal = Long.toHexString(decimal).toUpperCase();

                        System.out.println("\nOctal        : " + octalNum);
                        System.out.println("Decimal      : " + decimal);
                        System.out.println("Binary       : " + binary);
                        System.out.println("Hexadecimal  : " + hexadecimal);

                        valid3 = true;
                    }

                    break;

               case 4:
    System.out.println("\n------ HEXADECIMAL CONVERTER ------");

    boolean valid4 = false;

    while (!valid4) {

        System.out.print("Enter a hexadecimal number: ");
        String hexNum = input.next();

        boolean correct = true;
        long decimal = 0;

        for (int i = 0; i < hexNum.length(); i++) {

            char digit = Character.toUpperCase(hexNum.charAt(i));
            int value;

            if (digit >= '0' && digit <= '9') {
                value = digit - '0';
            } else if (digit >= 'A' && digit <= 'F') {
                value = digit - 'A' + 10;
            } else {
                correct = false;
                break;
            }

            decimal = decimal * 16+value;
        }

        if (!correct) {
            System.out.println("Invalid hexadecimal number! Use digits 0-9 and letters A-F.");
            continue;
        }


        String binary = Long.toBinaryString(decimal);
        String octal = Long.toOctalString(decimal);

        System.out.println("\nHexadecimal  : " + hexNum.toUpperCase());
        System.out.println("Decimal      : " + decimal);
        System.out.println("Binary       : " + binary);
        System.out.println("Octal        : " + octal);

        valid4 = true;
    }

    break;

                case 5:
    System.out.println("\n------ ROMAN NUMERAL CONVERTER ------");
    System.out.println("1. Decimal to Roman");
    System.out.println("2. Roman to Decimal");
    System.out.print("Enter your choice: ");

    if (!input.hasNextInt()) {
        System.out.println("Invalid input! Please enter 1 or 2.");
        input.nextLine();
        break;
    }

    int option2 = input.nextInt();

    int[] values = {1000, 900, 500, 400, 100, 90, 50, 40, 10, 9, 5, 4, 1};
    String[] symbols = {"M", "CM", "D", "CD", "C", "XC", "L", "XL", "X", "IX", "V", "IV", "I"};

    switch (option2) {

        case 1:
            System.out.print("Enter a decimal number (1-3999): ");

            if (!input.hasNextInt()) {
                System.out.println("Invalid input! Please enter a number.");
                input.nextLine();
                break;
            }

            int decimalNum = input.nextInt();

            if (decimalNum < 1 || decimalNum > 3999) {
                System.out.println("Please enter a number between 1 and 3999.");
                break;
            }

            int temp = decimalNum;
            String roman = "";

            for (int i = 0; i < values.length; i++) {

                while (temp >= values[i]) {
                    roman += symbols[i];
                    temp -= values[i];
                }
            }

            System.out.println("Decimal      : " + decimalNum);
            System.out.println("Roman        : " + roman);

            break;

        case 2:
            System.out.print("Enter a Roman numeral: ");
            String romanNum = input.next().toUpperCase();

            int total = 0;
            boolean correct = true;

            for (int i = 0; i < romanNum.length(); i++) {

                int current = 0;
                int next = 0;

                switch (romanNum.charAt(i)) {
                    case 'I':
                        current = 1;
                        break;
                    case 'V':
                        current = 5;
                        break;
                    case 'X':
                        current = 10;
                        break;
                    case 'L':
                        current = 50;
                        break;
                    case 'C':
                        current = 100;
                        break;
                    case 'D':
                        current = 500;
                        break;
                    case 'M':
                        current = 1000;
                        break;
                    default:
                        correct = false;
                }

                if (!correct) {
                    break;
                }

                if (i + 1 < romanNum.length()) {

                    switch (romanNum.charAt(i + 1)) {
                        case 'I':
                            next = 1;
                            break;
                        case 'V':
                            next = 5;
                            break;
                        case 'X':
                            next = 10;
                            break;
                        case 'L':
                            next = 50;
                            break;
                        case 'C':
                            next = 100;
                            break;
                        case 'D':
                            next = 500;
                            break;
                        case 'M':
                            next = 1000;
                            break;
                    }
                }

                if (current < next) {
                    total -= current;
                } else {
                    total += current;
                }
            }

            if (!correct || romanNum.isEmpty()) {
                System.out.println("Invalid Roman numeral!");
                break;
            }

            int check = total;
            String convertedRoman = "";

            for (int i = 0; i < values.length; i++) {

                while (check >= values[i]) {
                    convertedRoman += symbols[i];
                    check -= values[i];
                }
            }

            if (total < 1 || total > 3999 || !convertedRoman.equals(romanNum)) {
                System.out.println("Invalid Roman numeral!");
            } else {
                System.out.println("Roman        : " + romanNum);
                System.out.println("Decimal      : " + total);
            }

            break;

        default:
            System.out.println("Invalid choice! Please select 1 or 2.");
    }
    

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
