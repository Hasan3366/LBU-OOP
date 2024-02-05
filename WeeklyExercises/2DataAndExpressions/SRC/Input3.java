import java.util.Scanner;

public class Input3 {

    public static void main(String[] args) {
        System.out.println("Please enter your name:");
        Scanner scan = new Scanner(System.in);
        String personName = scan.nextLine();

        for (int i = 0; 1 < personName.length(); i++) {
            if (personName.charAt(i) == 'a') {
                System.out.println("Found an A");
            } else {
                System.out.println(personName.charAt(i));
            }
        }

        scan.close();
    }
}
