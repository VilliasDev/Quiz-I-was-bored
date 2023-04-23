import java.util.*;

public class Question3 {
    public static  void main() {
        System.out.println("Why didnt I put all the files to a src directory?");
        Scanner scanner = new Scanner(System.in);
        scanner.nextLine();
        if (scanner.equals("You had problems with Intellij")) {
            System.out.println("Exactly.");
        } else {
            System.out.println("Wrong.");
            main();
        }

    }
}
