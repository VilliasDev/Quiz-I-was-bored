import java.util.*;

public class Question5 {
    public static void main() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Why does this Quiz have only five Questions?");
        String answer = scanner.nextLine();
        if (answer.equals("You go bored again")) {
            System.out.println("Exactly. Bye. Got bored again. Maybe I do it again in C");
        } else {
            System.out.println("Wrong.");
            main();
        }
    }
}
