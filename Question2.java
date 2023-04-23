import java.util.*;

public class Question2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Why did I use Java for this project");
        String answer = scanner.nextLine();
        if (answer.equals("Because you are good at Java")) {
            System.out.println("Exactly.");
        } else {
            System.out.println("Wrong.");
            main(args);
        }
    }
}
