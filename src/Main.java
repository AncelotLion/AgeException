import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your age: ");
        int age = scanner.nextInt();

        try {
            chekAge(age);
        }
        catch (Exception e){
            System.out.println("A problem occured: " + e);
        }

    }

    static void chekAge(int age) throws AgeException{
        if (age < 18){
            throw new AgeException("\n" + "You must be 18+ to sign up");
        }
        else {
            System.out.println("You are now signed up!");
        }
    }
}
