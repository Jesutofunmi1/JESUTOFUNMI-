package Chapter5;

import java.util.Scanner;

public class Nokia3310 {
    static Scanner keyboardInput = new Scanner(System.in);

    public static void main(String[] args) {
        add();
    }

    public static void add() {
        String prompt = """
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
                 14. EXIT

                Select an option:
                 """;
        System.out.println(prompt);
        // String userResponse = keyboardInput.nextLine();
        int userResponse = keyboardInput.nextInt();
        switch (userResponse) {
            case 1: {
//                System.out.println("1");
                phonebook();
            }
        }
    }

    public static void phonebook() {
        String prompt = """
                 1. r
                 2. M
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
                 14. EXIT
                 15.Go back to main menu

                Select an option:
                 """;
        System.out.println(prompt);
        // String userResponse = keyboardInput.nextLine();
        int userResponse = keyboardInput.nextInt();
        switch (userResponse) {
            case 1: {
                System.out.println("1r");

            }
            case 15:
                add();
        }
    }
}


//    static void Menu() {
//        System.out.println("1. PHONEBOOK");
//        System.out.println("2. MESSAGE");
//        System.out.println("3. CHAT");
//        System.out.println("4. CALL REGISTER");
//        System.out.println("5. TONES");
//        System.out.println("6. SETTINGS");
//        System.out.println("7. CALL DIVERT");
//        System.out.println("8. GAMES");
//        System.out.println("9. CALCULATOR");
//        System.out.println("10. REMINDERS");
//        System.out.println("11. CLOCK");
//        System.out.println("12. PROFILES");
//        System.out.println("13. SIM SERVICES");
//        System.out.println("14. EXIT");
//    }
//
//    static void Message() {
//        System.out.println("1 Search");
//        System.out.println("2 Search Nos");
//        System.out.println("3 Add Name");
//        System.out.println("4 Erase");
//        System.out.println("5 Edit");
//        System.out.println("6 Assign Tone");
//        System.out.println("7 Send b'cord");
//        System.out.println("8 Option");
//        System.out.println("9 Speed dials");
//        System.out.println("10 Voice tags");
//        System.out.println("11 GO BACK");
//    }
//
//    public static void main(String[] args) {
//        Scanner keyboardInput = new Scanner(System.in);
//        String prompt = """
//                1. PHONEBOOK
//                2. MESSAGE
//                3. CHAT
//                4. CALL REGISTER
//                5. TONES
//                6. SETTINGS
//                7. CALL DIVERT
//                8. GAMES
//                9. CALCULATOR
//                10. REMINDERS
//                11. CLOCK
//                12. PROFILES
//                13. SIM SERVICES
//                14. EXIT
//
//               Select an option:
//                """;
//        System.out.println(prompt);
//        // String userResponse = keyboardInput.nextLine();
//        int userResponse = keyboardInput.nextInt();
//        switch (userResponse) {
//            case 1 -> {
//                prompt = """
//                        1 Search
//                        2 Search Nos,
//                        3 Add name
//                        4 Erase
//                        5 Edit
//                        6 Assign tone
//                        7 Send b'cord
//                        8 Option
//                        9 Speed Dials
//                        10 Voice tags
//
//                        11 EXIT
//                        """;
//                System.out.println(prompt);
//                int phoneNumber = keyboardInput.nextInt();
//                switch (phoneNumber) {
//                    case 1 -> System.out.println("Search");
//                    case 2 -> System.out.println("Transfer");
//                    case 3 -> System.out.println("Add");
//                    case 4 -> System.out.println("Erase");
//                    case 5 -> System.out.println("Edit");
//                    case 6 -> System.out.println("Assign tone");
//                    case 7 -> System.out.println("Send b'cord");
//                    case 8 -> {
//                        System.out.println("Press 1 for Type of View:\nPress 2 for Memory Status");
//                        int Options = keyboardInput.nextInt();
//                        switch (Options) {
//                            case 1 -> System.out.println("Type of View");
//                            case 2 -> System.out.println("Memory Status");
//                            case 0 -> {
//                                System.out.println("Exit code");
//                                int echoInput = keyboardInput.nextInt();
//                                switch (echoInput) {
//                                    case 0:
//                                        Message();
//
//                                        break;
//
//                                }
//                            }
//                        }
//                    }
//
//                    case 9 -> System.out.println("Speed dials");
//                    case 10 -> System.out.println("Voice tags");
//                    case 11 ->
//                    {   System.out.println("Go back");
//
//                        int alphaInput = keyboardInput.nextInt();
//                        switch (alphaInput) {
//                            case 0:
//                                Message();
//
//                                break;
//
//                        }
//                    }
//                    default -> System.out.println("Useless people everywhere");
//                }
//            }
//            case 2 -> {
//                prompt = """
//                        1. Write messages
//                        2. Inbox
//                        3. Outbox
//                        4. Picture messages
//                        5. Templates
//                        6. Smileys
//                        7. Message settings
//                        8. Info service
//                        9. Voice mailbox
//                        10. Service command editor
//
//                        11. EXIT
//                        """;
//
//                System.out.println(prompt);
//                userResponse = keyboardInput.nextInt();
//                switch (userResponse) {
//                    case 1 -> System.out.println("Write messages");
//                    case 2 -> System.out.println("Inbox");
//                    case 3 -> System.out.println("Outbox");
//                    case 4 -> System.out.println("Picture messages");
//                    case 5 -> System.out.println("Templates");
//                    case 6 -> System.out.println("Smileys");
//                    case 7 -> {
//                        System.out.println("Press 1 for Set:\nPress 2 for Common");
//                        int MessageSettings = keyboardInput.nextInt();
//                        switch (MessageSettings) {
//                            case 1 -> {
//                                System.out.println("Press 1 for Message centre number\nPress 2 for Message sent as\nPress 3 for Message validity");
//                                int Set = keyboardInput.nextInt();
//                                switch (Set) {
//                                    case 1 -> System.out.println("Message centre number");
//                                    case 2 -> System.out.println("Message sent as");
//                                    case 3 -> System.out.println("Message validity");
//                                    case 0 -> System.out.println("Exit code");
//
//                                }
//                            }
//                            case 2 -> {
//                                System.out.println("Press 1 for Delivery reports\nPress 2 for Reply via same centre\n Press 3 for Character support");
//                                int Common = keyboardInput.nextInt();
//                                switch (Common) {
//                                    case 1 -> System.out.println("Delivery reports");
//                                    case 2 -> System.out.println("Reply via same centre");
//                                    case 3 -> System.out.println("Character support");
//                                    case 0 -> System.out.println("Exit code");
//                                }
//                            }
//                        }
//                    }
//                }
//            }
//            case 3 -> System.out.println("Chat");
//
//            case 4 -> {
//                prompt = """
//                        1 Missed calls
//                        2 Received calls
//                        3 Dialled numbers
//                        4 Erase recent call lists
//                        5 Show call duration
//                        6 Show call costs
//                        7 Call cost settings
//                        8 Prepaid credit
//
//                        9 EXIT
//                        """;
//
//                System.out.println(prompt);
//                int CallRegister = keyboardInput.nextInt();
//                switch (CallRegister) {
//                    case 1 -> System.out.println("Missed calls");
//                    case 2 -> System.out.println("Received calls");
//                    case 3 -> System.out.println("Dialled numbers");
//                    case 4 -> System.out.println("Erase recent call lists");
//                    case 5 -> {
//                        System.out.println("Show call duration");
//
//                        System.out.println("Press 1 for last call duration:\nPress 2 for all calls' duration\nPress 3 for received calls' duration\nPress 4 Dialled calls' duration\n Press 5 for Clear timers");
//                        int Options = keyboardInput.nextInt();
//                        switch (Options) {
//                            case 1 -> System.out.println("Call duration");
//                            case 2 -> System.out.println("All calls' duration");
//                            case 3 -> System.out.println("Received calls' duration");
//                            case 4 -> System.out.println("Dialled calls' duration");
//                            case 5 -> System.out.println("Clear timers");
//                            case 0 -> System.out.println("Exit code");
//                        }
//                    }
//                    case 6 -> System.out.println("Show call costs");
//                    case 7 -> System.out.println("Call cost settings");
//                    case 8 -> System.out.println("Prepaid credit");
//                }
//            }
//
//            case 5 -> {
//                prompt = """
//                        1 Ringing tone
//                        2 Ringing volume
//                        3 Incoming call alert
//                        4 Composer
//                        5 Message alert tone
//                        6 Keypad tones
//                        7 Warning and game tones
//                        8 Vibrating alert
//                        9 Screen saver
//
//                        10 EXIT
//                        """;
//                System.out.println(prompt);
//                int Tones = keyboardInput.nextInt();
//                switch (Tones) {
//                    case 1 -> System.out.println("Ringing tone");
//                    case 2 -> System.out.println("Ringing volume");
//                    case 3 -> System.out.println("Incoming call alert");
//                    case 4 -> System.out.println("Composer");
//                    case 5 -> System.out.println("Message alert tone");
//                    case 6 -> System.out.println("Keypad tones");
//                    case 7 -> System.out.println("Warning and game tones");
//                    case 8 -> System.out.println("Vibrating alert");
//                    case 9 -> System.out.println("Screen saver");
//
//                    default -> System.out.println("Chibuzor is a good coder");
//                }
//            }
//            case 6 -> {
//                prompt = """
//                        1 Call settings
//                        2 Phone settings
//                        3 Security settings
//                        4 Restore factory settings
//
//                        5 EXIT
//                        """;
//                System.out.println(prompt);
//                int Settings = keyboardInput.nextInt();
//                switch (Settings) {
//                    case 1 -> {
//                        System.out.println("Call settings");
//                        System.out.println("Press 1 for Automatic redial:\nPress 2 for Speed dialing:\nPress 3 for Call waiting options\nPress 4 Own number sending\nPress 5 for Phone line in use\nPress 6 for Automatic answer");
//                        int Options = keyboardInput.nextInt();
//                        switch (Options) {
//                            case 1 -> System.out.println("Automatic redial");
//                            case 2 -> System.out.println("Speed dialing");
//                            case 3 -> System.out.println("Call waiting options");
//                            case 4 -> System.out.println("Own number sending");
//                            case 5 -> System.out.println("Phone line in use");
//                            case 6 -> System.out.println("Automatic answer");
//                            case 0 -> System.out.println("Exit code");
//                        }
//                    }
//                    case 2 -> {
//                        System.out.println("Phone settings");
//                        System.out.println("Press 1 for Language:\nPress 2 for Cell info display:\nPress 3 for Welcome note\nPress 4 Network selection\nPress 5 for Lights\nPress 6 for Confirm SIM service actions");
//                        int Options = keyboardInput.nextInt();
//                        switch (Options) {
//                            case 1 -> System.out.println("Language");
//                            case 2 -> System.out.println("Cell info display");
//                            case 3 -> System.out.println("Welcome note");
//                            case 4 -> System.out.println("Network selection");
//                            case 5 -> System.out.println("Lights");
//                            case 6 -> System.out.println("Confirm SIM service action");
//                            case 0 -> System.out.println("Exit code");
//                        }
//                    }
//                    case 3 -> {
//                        System.out.println("Security settings");
//                        System.out.println("Press 1 for PIN code:\nPress 2 for Call barring service:\nPress 3 for Fixed dialing\nPress 4 Closed user group\nPress 5 for Phone security\nPress 6 for Change access codes");
//
//                        while (userResponse == 3) {
//                            int Options = keyboardInput.nextInt();
//                            switch (Options) {
//                                case 1 -> System.out.println("PIN code request");
//                                case 2 -> System.out.println("Call barring service");
//                                case 3 -> System.out.println("Fixed dialing");
//                                case 4 -> System.out.println("Closed user group");
//                                case 5 -> System.out.println("Phone security");
//                                case 6 -> System.out.println("Change access codes");
//                                case 0 -> System.out.println("Exit code");
//                            }
//                        }
//                        if (userResponse == 3) {
//                            System.out.println("Thank you!");
//                            System.exit(3);
//                        }
//                    }
//                    case 4 -> System.out.println("Restore factory settings");
//                }
//            }
//            case 7 -> {
//                System.out.println("Call divert");
//            }
//            case 8 -> {
//                System.out.println("Games");
//            }
//            case 9 -> {
//                System.out.println("Calculator");
//            }
//            case 10 -> {
//                System.out.println("Reminders");
//            }
//            case 11 -> {
//                prompt = """
//                        1 Alarm clock
//                        2 Clock settings
//                        3 Date settings
//                        4 Stopwatch
//                        5 Countdown timer
//                        6 Auto update of date and time
//
//                        7 EXIT
//                        """;
//            }
//        }
//        System.out.println(prompt);
//        int Clock = keyboardInput.nextInt();
//        switch (Clock) {
//            case 1 -> System.out.println("Alarm clock");
//            case 2 -> System.out.println("Clock settings");
//            case 3 -> System.out.println("Date setting");
//            case 4 -> System.out.println("Stopwatch");
//            case 5 -> System.out.println("Countdown timer");
//            case 6 -> System.out.println("Auto update of date and time");
//            case 0 -> System.out.println("Exit code");
//        }
//    }
