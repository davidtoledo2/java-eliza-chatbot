import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        var scanner = new Scanner(System.in);

        System.out.println(Doctor.intro());
        var userInput = "";

        while (!userInput.equalsIgnoreCase("quit")) {
            userInput = scanner.nextLine();
            String response = Doctor.response(userInput);
            System.out.println(response);
        }
        scanner.close();
    }
}