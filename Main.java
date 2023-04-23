
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Question 1: Why did I make this Quiz?");
        String answer = scanner.nextLine();
        if (answer.equals("Because you were bored")) {
            System.out.println("Exactly.");
            Question2.main(args);
        } else {
            System.out.println("Wrong");
            Main.main(args);
        }

    }
}

