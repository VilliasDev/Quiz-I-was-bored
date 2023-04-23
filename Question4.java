import java.util.*;

public class Question4 {
    public static void main() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Why did I put every Question in a class and a separate file?");
        String answer = scanner.nextLine();
        if (answer.equals("You pretend to be smarter than you are.")) {
            System.out.println("Exactly, WAIT WHAT?");
            Question5.main();
        } else {
            System.out.println("Wrong.");
            main();
        }
    }
}
