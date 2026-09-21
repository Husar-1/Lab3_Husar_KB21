import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        //Розміри, мінімальні значення, максимальне значення типів даних
        System.out.print("byte: size = " + Byte.BYTES + " byte, min = " + Byte.MIN_VALUE + ", max = " + Byte.MAX_VALUE);
        System.out.print("\nshort: size = " + Short.BYTES + " byte, min = " + Short.MIN_VALUE + ", max = " + Short.MAX_VALUE);
        System.out.print("\nint: size = " + Integer.BYTES + " byte, min = " + Integer.MIN_VALUE + ", max = " + Integer.MAX_VALUE);
        System.out.print("\nlong: size = " + Long.BYTES + " bytes, min = " + Long.MIN_VALUE + ", max = " + Long.MAX_VALUE);
        System.out.print("\nfloat: size = " + Float.BYTES + " byte, min = " + Float.MIN_VALUE + ", max = " + Float.MAX_VALUE);
        System.out.print("\ndouble: size = " + Double.BYTES + " bytes, min = " + Double.MIN_VALUE + ", max = " + Double.MAX_VALUE);
        System.out.print("\nchar: size = " + Character.BYTES + " byte, min = " + (int) Character.MIN_VALUE + ", max = " + (int) Character.MAX_VALUE);
        System.out.print("\nboolean: min = " + Boolean.FALSE + ", max = " + Boolean.TRUE);

        //Ввиводемо пустй рядок
        System.out.println();

        //Сканер - функція яка зчитує дані користувача
        Scanner scanner = new Scanner(System.in);

        //Запрошення даних від користувача для типів лданих, та їх виведення
        System.out.print("\nType in a line for byte: ");
        String textByte = scanner.nextLine();
        byte myByte = Byte.parseByte(textByte);
        System.out.println("Result for byte: " + myByte);

        System.out.print("\nType in a line for short: ");
        String textShort = scanner.nextLine();
        short myShort = Short.parseShort(textShort);
        System.out.println("Result for short: " + myShort);

        System.out.print("\nType in a line for int: ");
        String textInt = scanner.nextLine();
        int myInt = Integer.parseInt(textInt);
        System.out.println("Result for int: " + myInt);

        System.out.print("\nType in a line for long: ");
        String textLong = scanner.nextLine();
        long myLong = Long.parseLong(textLong);
        System.out.println("Result for long: " + myLong);

        System.out.print("\nType in a line for float: ");
        String textFloat = scanner.nextLine();
        float myFloat = Float.parseFloat(textFloat);
        System.out.println("Result for float: " + myFloat);

        System.out.print("\nType in a line for double: ");
        String textDouble = scanner.nextLine();
        double myDouble = Double.parseDouble(textDouble);
        System.out.println("Result for double: " + myDouble);

        System.out.print("\nType in a line for boolean (true or false): ");
        String textBoolean = scanner.nextLine();
        boolean myBoolean = Boolean.parseBoolean(textBoolean);
        System.out.println("Result for boolean: " + myBoolean);

        System.out.print("\nType in a line for char: ");
        String textChar = scanner.nextLine();
        char myChar = textChar.charAt(0);
        System.out.println("Result for char: " + myChar);

        //Перестаємо "сканувати"
        scanner.close();

    }
}