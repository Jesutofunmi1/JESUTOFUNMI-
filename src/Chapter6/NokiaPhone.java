package Chapter6;

import java.util.Scanner;

public class NokiaPhone {
    static Scanner input = new Scanner(System.in);
    static int userInput;

    public static void main(String[] args) {
        mainMenu();
    }

    private static void mainMenu() {
        String prompt = """
                   Menu List
                   1. PHONEBOOK
                   2. MESSAGE
                   3. CHAT
                   4. CALL REGISTER
                   5. TONES
                   6. SETTINGS
                   7. CALL DIVERT
                   8. GAMES
                   9. CALCULATOR
                   10. REMINDERS
                   11. CLOCK
                   12. PROFILES
                   13. SIM SERVICES
                """;
        System.out.println(prompt);
        userInput = input.nextInt();
        switch (userInput) {
            case 1 -> phonebook();
            case 2 -> message();
            case 3 -> {
                System.out.println("Chat");
                System.out.println("Enter 0 to go back");
                userInput = input.nextInt();
                if (userInput == 0) {
                    mainMenu();
                }
            }
            case 4 -> {
                prompt = """
                        1 Missed calls
                        2 Received calls
                        3 Dialled numbers
                        4 Erase recent call lists
                        5 Show call duration
                        6 Show call costs
                        7 Call cost settings
                        8 Prepaid credit
                        """;
                System.out.println(prompt);
                System.out.println("Enter 0 to go back");
                userInput = input.nextInt();
                switch (userInput) {
                    case 1:
                        System.out.println("Missed calls");
                    case 2:
                        System.out.println("Received calls");
                    case 3:
                        System.out.println("Dialled numbers");
                    case 4:
                        System.out.println("Erase recent call lists");
                    case 5:
                        System.out.println("Show call duration");
                    case 6:
                        System.out.println("Show call costs");
                    case 7:
                        System.out.println("Call cost settings");
                    case 8:
                        System.out.println("Prepaid credit");
                    case 0:
                        mainMenu();
                }
            }
            case 5 -> {
                prompt = """
                        1 Ringing tone
                        2 Ringing volume
                        3 Incoming call alert
                        4 Composer
                        5 Message alert tone
                        6 Keypad tones
                        7 Warning and game tones
                        8 Vibrating alert
                        9 Screen saver

                        0 Back to Main Menu
                        """;
                System.out.println(prompt);
                System.out.println("Enter 0 to go back");
                userInput = input.nextInt();
                switch (userInput) {
                    case 1 -> System.out.println("Ringing tone");
                    case 2 -> System.out.println("Ringing volume");
                    case 3 -> System.out.println("Incoming call alert");
                    case 4 -> System.out.println("Composer");
                    case 5 -> System.out.println("Message alert tone");
                    case 6 -> System.out.println("Keypad tones");
                    case 7 -> System.out.println("Warning and game tones");
                    case 8 -> System.out.println("Vibrating alert");
                    case 9 -> System.out.println("Screen saver");
                    case 0 -> mainMenu();
                }
            }
            case 6 -> {
                prompt = """
                        1 Call settings
                        2 Phone settings
                        3 Security settings
                        4 Restore factory settings

                        0 Back to Main Menu
                        """;
                System.out.println(prompt);

                System.out.println("Enter 0 to go back");
                userInput = input.nextInt();
                switch (userInput) {
                    case 1 -> System.out.println("Call settings");
                    case 2 -> System.out.println("Call Phone settings");
                    case 3 -> System.out.println("Security settings");
                    case 4 -> System.out.println("Restore factory settings");
                    case 0 -> mainMenu();
                }
            }
            case 7 -> {
                System.out.println("Call divert");
                System.out.println("Enter 0 to go back");
                userInput = input.nextInt();
                if (userInput == 0) {
                    mainMenu();
                }
            }
            case 8 -> {
                System.out.println("Games");
                System.out.println("Enter 0 to go back");
                userInput = input.nextInt();
                if (userInput == 0) {
                    mainMenu();
                }
            }
            case 9 -> {
                System.out.println("Calculator");
                System.out.println("Enter 0 to go back");
                userInput = input.nextInt();
                if (userInput == 0) {
                    mainMenu();
                }
            }
            case 10 -> {
                System.out.println("Reminder");
                System.out.println("Enter 0 to go back");
                userInput = input.nextInt();
                if (userInput == 0) {
                    mainMenu();
                }
            }
            case 11 -> {
                prompt = """
                        1 Alarm clock
                        2 Clock settings
                        3 Date settings
                        4 Stopwatch
                        5 Countdown timer
                        6 Auto update of date and time

                        0 Back to Main Menu
                        """;
                System.out.println(prompt);
                System.out.println("Enter 0 to go back");
                userInput = input.nextInt();
                switch (userInput) {
                    case 1 -> System.out.println("Alarm Clock");
                    case 2 -> System.out.println("Clock settings");
                    case 3 -> System.out.println("Date settings");
                    case 4 -> System.out.println("Stopwatch");
                    case 5 -> System.out.println("Countdown timer");
                    case 6 -> System.out.println("Auto update of date and time");
                    case 0 -> mainMenu();
                }
            }
            case 12 -> {
                System.out.println("Profile");
                System.out.println("Enter 0 to go back");
                userInput = input.nextInt();
                if (userInput == 0) {
                    mainMenu();
                }
            }
            case 13 -> {
                System.out.println("Sim Services");
                System.out.println("Enter 0 to go back");
                userInput = input.nextInt();
                if (userInput == 0) {
                    mainMenu();
                }
            }
        }
    }

    private static void message() {
        String prompt;
        prompt = """
                1. Write messages
                2. Inbox
                3. Outbox
                4. Picture messages
                5. Templates
                6. Smileys
                7. Message settings
                8. Info service
                9. Voice mailbox
                10. Service command editor
                11. Back to Main Menu
                """;
        System.out.println(prompt);
        System.out.println("Enter 0 to go back");
        userInput = input.nextInt();
        switch (userInput) {
            case 1 -> {
                System.out.println("Write message");
                System.out.println("0 Back");
                userInput = input.nextInt();
                switch (userInput) {
                    case 1 -> System.out.println("Write message");
                    case 0 -> message();
                }
            }
            case 2 -> {
                System.out.println("Inbox");
                System.out.println("0 Back");
                userInput = input.nextInt();
                switch (userInput) {
                    case 1 -> System.out.println(" Inbox");
                    case 0 -> message();

                }
            }
            case 3 -> {
                System.out.println("Outbox");
                System.out.println("0 Back");
                userInput = input.nextInt();
                switch (userInput) {
                    case 1 -> System.out.println("Outbox");
                    case 0 -> message();
                }
            }
            case 4 -> {
                System.out.println("Picture messages");
                System.out.println("0 Back");
                userInput = input.nextInt();
                switch (userInput) {
                    case 1 -> System.out.println("Picture messages");
                    case 0 -> message();
                }
            }
            case 5 -> {
                System.out.println("Templates");
                System.out.println("0 Back");
                userInput = input.nextInt();
                switch (userInput) {
                    case 1 -> System.out.println("Templates");
                    case 0 -> message();
                }
            }
            case 6 -> {
                System.out.println("Smileys");
                System.out.println("0 Back");
                userInput = input.nextInt();
                switch (userInput) {
                    case 1 -> System.out.println("Smileys");
                    case 0 -> message();
                }
            }
            case 7 -> {
                System.out.println("""
                        1.set
                        2.common
                        0.Back
                        """);
                userInput = input.nextInt();
                switch (userInput) {
                    case 1 -> {
                        System.out.println("""
                            1.message center number
                            2. message sent as
                            3. message validity
                            0. Back
                            """);
                        userInput = input.nextInt();
                        switch (userInput) {
                            case 1 -> {
                                System.out.println("Message center number");
                                System.out.println("0 Back");

                                userInput = input.nextInt();
                                if (userInput == 1) {
                                    System.out.println("Outbox");
                                }
                            }
                            case 0 -> message();
                        }
                    }
                    case 0 -> message();
                }
            }
            case 8 -> System.out.println("Info service");
            case 9 -> System.out.println("Service command editor");
            case 10 -> System.out.println("Back to Main Menu");
            case 0 -> mainMenu();
        }
    }


    private static void phonebook() {
        String prompt;
        prompt = """
                1 Search
                2 Search Nos
                3 Add Name
                4 Erase
                5 Edit
                6 Assign Tone
                7 Send b'cord
                8 Option
                9 Speed dials
                10 Voice tags
                0 Back to Main Menu
                """;
        System.out.println(prompt);
        userInput = input.nextInt();
        switch (userInput) {
            case 1 -> {
                System.out.println("""
                        Search
                        0 Back
                        """);
                userInput = input.nextInt();
                if (userInput == 0) {
                    phonebook();
                }

            }
            case 2 -> {
                System.out.println("""
                        Search Nos
                        0 Back
                        """);

                userInput = input.nextInt();
                if (userInput == 0) {
                    phonebook();
                }
            }
            case 3 -> {
                System.out.println("""
                        Add Name
                        0 Back
                        """);
                userInput = input.nextInt();
                if (userInput == 0) {
                    phonebook();
                }
            }
            case 4 -> {
                System.out.println("""
                        Erase
                        0 Back
                        """);
                userInput = input.nextInt();
                if (userInput == 0) {
                    phonebook();
                }
            }
            case 5 -> {
                System.out.println("""
                        Edit
                        0 Back
                        """);
                userInput = input.nextInt();
                if (userInput == 0) {
                    phonebook();
                }
            }
            case 6 -> {
                System.out.println("""
                        Assign Tone
                        0 Back
                        """);
                userInput = input.nextInt();
                if (userInput == 0) {
                    phonebook();
                }
            }
            case 7 -> {
                System.out.println("""
                        Send b'cord
                        0 Back
                        """);
                userInput = input.nextInt();
                if (userInput == 0) {
                    phonebook();
                }
            }
            case 8 -> {
                System.out.println("""
                        Option
                        0 Back
                        """);
                userInput = input.nextInt();
                if (userInput == 0) {
                    phonebook();
                }
            }
            case 9 -> {
                System.out.println("""
                        Speed dials
                        0 Back
                        """);
                userInput = input.nextInt();
                if (userInput == 0) {
                    phonebook();
                }
            }
            case 10 -> {
                System.out.println("""
                        Voice tags
                        0 Back
                        """);
                userInput = input.nextInt();
                if (userInput == 0) {
                    phonebook();
                }
            }
            case 0 -> mainMenu();
        }
    }
}
