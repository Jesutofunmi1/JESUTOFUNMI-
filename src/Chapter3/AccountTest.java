package Chapter3;

import java.util.Scanner;

public class AccountTest {

    public static void main(String[] args) {
        Account myAccount = new Account();
        Scanner userInput = new Scanner(System.in);

        System.out.printf("Initial name is: %s%n%n%n", myAccount.getName());

        System.out.println("Please enter the name: ");

        String theName = userInput.nextLine();
        myAccount.setName(theName);
        System.out.println();

        System.out.printf("Name in object myAccount is: %n%s%n",
        myAccount.getName());
    }
}
