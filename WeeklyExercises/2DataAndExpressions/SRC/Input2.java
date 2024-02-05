import java.util.Scanner;

public class Input2 {

    public static void main(String[] args){
        System.out.println("Please enter your name: ");

        Scanner scan  = new Scanner(System.in);
        String personName = scan.nextLine();
        if (personName.length() < 6) {
            System.out.println(personName + " is a short name");
        }
        else {
            System.out.println(personName + "is a long name");
        }

        System.out.println("Hello " + personName);

        scan.close();
    }
}
