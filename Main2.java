import java.text.MessageFormat;
import java.util.Scanner;
import java.util.Locale;

public class Main2 {
    public static void main(String[] args) {
        //Робимо локаль США, щоб не вилазило � або ? через те що джава хоче зробити гривню але не може
        Locale.setDefault(Locale.US);

        //Зчитуємо дані з клавіатури
        Scanner scanner = new Scanner(System.in);

        //Введеня даних від користувача int double bool
        System.out.print("Type in an int: ");
        int intVal = scanner.nextInt();

        System.out.print("Type in a double: ");
        double doubleVal = scanner.nextDouble();

        System.out.print("Type in a bool: ");
        boolean boolVal = scanner.nextBoolean();

        scanner.nextLine(); 

        //Введеня даних від користувача string
        System.out.print("Type in a string: ");
        String strVal = scanner.nextLine();

        //Виведення даних
        System.out.println("\n  RESULTS  \n");

        System.out.println("1. [println] Int: " + intVal + ", Double: " + doubleVal + ", Bool: " + boolVal + ", String: \"" + strVal + "\"");

       String msg2 = MessageFormat.format("2. MessageFormat | String: {0}, Integer: {1}, Double: {2}, Boolean: {3}", strVal, intVal, doubleVal, boolVal);
        System.out.println(msg2);

        String msg3 = MessageFormat.format("3. MessageFormat | order: Boolean: {3}, Double: {2}, Integer: {1}, String: {0}", strVal, intVal, doubleVal, boolVal);
        System.out.println(msg3);

        String msg4 = MessageFormat.format("4. MessageFormat | styles: Currency: {0,number,currency}, Percentage: {1,number,percent}", doubleVal, doubleVal);
        System.out.println(msg4);

        System.out.format("5. format | Int: %d | Double: %f | Bool: %b | String: %s%n", intVal, doubleVal, boolVal, strVal);

        System.out.format("6. format | Numericals Decimal: %d | Hexadecimal: %x | Octal: %o%n", intVal, intVal, intVal);

        System.out.format("7. format | Precision: Precision 2 decimals: %.2f | Scientific notation: %e%n", doubleVal, doubleVal);

        System.out.format("8. format | Spaces: String left space: [%15s] | String right space: [%-15s]%n", strVal, strVal);

        System.out.format("9. format | Flags: Zero-padded: %08d | With sign: %+d%n", intVal, intVal);

        System.out.format("10. format | Advanced: Short  string: %.3s | Number with separators: %,d%n", strVal, intVal);

        scanner.close();
    }
}