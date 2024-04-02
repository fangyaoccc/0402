import java.util.InputMismatchException;
import java.util.NoSuchElementException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        try {
            System.out.print("Enter an integer: ");
            int intValue = scanner.nextInt(); 
            System.out.print("Enter a another int: ");
            int intValue2 = scanner.nextInt(); 
            System.out.println("total is: " +(intValue + intValue2));

            scanner.nextLine(); 
            System.out.print("Enter a string: ");
            String stringValue = scanner.nextLine();
            System.out.println("You entered: " + stringValue);
        } catch (InputMismatchException ime) {
            System.err.println("Input was not of the correct type.");
        } catch (NoSuchElementException nsee) {
            System.err.println("Input operation was aborted prematurely.");
        } catch (IllegalStateException ise) {
            System.err.println("Scanner is closed.");
        } finally {
            scanner.close();
        }
    }
}