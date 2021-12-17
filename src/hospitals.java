import java.util.Scanner;
public class hospitals {

    public static void main(String[] args) {

        while (true) {
            System.out.println("Hospital Directory");
            System.out.println("");
            System.out.println("1. Departments");
            System.out.println("2. Hospital name");
            System.out.println("3. Hospital address");
            System.out.println("4. Patient");
            System.out.println("");
            System.out.println("Enter directory number:");
            Scanner input = new Scanner(System.in);
            int placeholder = input.nextInt();
            if (placeholder == 1) {
                //put a method here that shows different things in department
            } else if (placeholder == 2) {
                //put a method here
            } else if (placeholder == 3) {
                //put a method here
            } else if (placeholder == 4) {
                //put a method here
            } else {
                //put a method here
            }
        }
    }
}
