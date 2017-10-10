import java.util.Scanner;

/**
 * Created by golov on 10.10.2017.
 */
public class AgeIf {
    public static void main(String[] args) {
        String name;
        int age;

        Scanner scanner = new Scanner(System.in);
        System.out.println("What is you name? ");
        name = scanner.nextLine();
        System.out.println("How old are you? ");
        age = scanner.nextInt();

        if (age < 18) {
            System.out.print(name+" yo are to yang");
        } else {
            System.out.print(name+" all ok!");
        }

    }
}
