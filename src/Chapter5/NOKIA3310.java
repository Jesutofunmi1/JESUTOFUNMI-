package Chapter5;

/*import java.util.Scanner;

public class NOKIA3310 {
    public static void main(String[] args) {

        Scanner keyboardInput = new Scanner(System.in);

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
                 """;

        System.out.println(prompt);
        int userResponse = keyboardInput.nextInt();
        switch (userResponse) {
            String prompt;

                System.out.println(prompt);
                int choice = keyboardInput.nextInt();
            case 1:
                prompt = """
                        1. PHONEBOOK
                        1 Search
                        2 Search Nos,
                        3 Add name
                        4 Erase
                        5 Edit
                        6 Assign tone
                        7 Send b'card
                        8 Option
                        """;
                int PhoneNumber = keyboardInput.nextInt();
                switch (PhoneNumber) {

                    case 1:
                        System.out.println("Search");
                        break;
                    case 2:
                        System.out.println("Search Nos");
                        break;
                    case 3:
                        System.out.println("Add Name");
                        break;
                    case 4:
                        System.out.println("Erase");
                        break;
                    case 5:
                        System.out.println("Edit");
                        break;
                    case 6:
                        System.out.println("Assign tone");
                        break;
                    case 7:
                        System.out.println(" Send b'card");
                        break;
                    case 8:
                        System.out.println("Option");
                        break;

                        case 1:
                        prompt = """
                                1. Type of View
                                2. Memory status 
                                """;
                        System.out.println(prompt);
                        userResponse = keyboardInput.nextInt();
                        switch (userResponse) {
                            case 1:
                                System.out.println("Type of View");
                                break;
                            case 2:
                                System.out.println("Memory status");
                                break;
                        }
                    default:
                        System.out.println("YOU NO SABI USE NOKIA 3310");
                }
                break;

            case 2:
                prompt = """
                        2 MESSAGE
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
                         """;
                System.out.println(prompt);
                userResponse = keyboardInput.nextInt();
                switch (userResponse) {

                    case 1:
                        System.out.println("Write messages");
                        break;
                    case 2:
                        System.out.println("Inbox");
                        break;
                    case 3:
                        System.out.println("Outbox");
                        break;
                    case 4:
                        System.out.println("Picture messages");
                        break;
                    case 5:
                        System.out.println("Templates");
                        break;
                    case 6:
                        System.out.println("Smileys");
                        break;
                    case 7:
                        System.out.println("Message settings");
                        break;
                    case 8:
                        System.out.println("Info Service");
                        break;
                    case 9:
                        System.out.println("Voice mailbox number");
                        break;
                    case 10:
                        System.out.println("Service command editor");
                        break;


                    case 1:
                        prompt = """
                                 1. SET 1
                                """;
                        System.out.println(prompt);
                        userResponse = keyboardInput.nextInt();
                        switch (userResponse) {
                            case 1:
                                System.out.println("Set 1");
                                break;

                            case 1:
                                prompt = """
                                        1. Message centre number
                                        2. Message sent as 
                                        3. Message validity
                                        """;
                                System.out.println(prompt);
                                userResponse = keyboardInput.nextInt();
                                switch (userResponse) {
                                    case 1:
                                        System.out.println("Message centre number");
                                        break;

                                    case 2:
                                        System.out.println("Message sent as ");
                                        break;
                                    case 3:
                                        System.out.println("Message validity");
                                        break;
                                }
                            default:
                                System.out.println("All the best for nokia 3310");
                                break;
                        }
                    case 2:
                        prompt = """
                                1. Delivery reports
                                2. Reply via same centre
                                3. Character support
                                """;
                        System.out.println(prompt);
                        userResponse = keyboardInput.nextInt();
                        switch (userResponse) {
                            case 1:
                                System.out.println("Delivery reports");
                                break;
                            case 2:
                                System.out.println("Reply via same centre");
                                break;
                            case 3:
                                System.out.println("Character support");
                        }
                                break;


                            int userResponse = keyboardInput.nextInt();
                            switch (userResponse) {
                                case 3:
                                    String CHAT = """
                                            3. CHAT
                                            """;
                                    System.out.println("CASE SETLLED ON CHAT ");
                            }
                            break;

                            case 4:
                                String s = """
                                        4.CALL REGISTER
                                         1. Missed Calls 
                                         2. Received calls
                                         3. Dialled numbers
                                         4. Erase recent call lists
                                         5  Show call duration
                                            1. Last call duration
                                            2. All calls' duration
                                            3. Received calls' duration
                                            4. Dialled calls' duration
                                            5. Clear timers
                                         6. Show call costs 
                                            1. Last call cost
                                            2. All calls' cost
                                            3. Clear counters
                                         7. Call cost settings
                                            1. Call cost limit
                                            2. Show costs in
                                         8. Prepaid credit         
                                          """;
                            case 1:
                                System.out.println("Missed calls");
                                break;
                            case 2:
                                System.out.println("Received calls");
                                break;
                            case 3:
                                System.out.println("Dialled numbers");
                                break;
                            case 4:
                                System.out.println("Erase recent calls");
                        }
                                break;
                            case 5:
                                prompt = """
                                        1. Last call duration
                                        2. All calls duration
                                        3. Received calls' duration
                                        4. Dialled calls' duration
                                        5. Clear timers
                                        """;
                                System.out.println("SHOW CALL DURATION");
                                userResponse = keyboardInput.nextInt();
                                switch (userResponse) {
                                    case 1:
                                        System.out.println("Last call duration");
                                        break;
                                    case 2:
                                        System.out.println("All calls duration");
                                        break;
                                    case 3:
                                        System.out.println("Received calls duration");
                                        break;
                                    case 4:
                                        System.out.println("Dialled calls' duration");
                                        break;
                                    case 5:
                                        System.out.println("Clear timers");
                                }
                                        break;
                                    case 6:
                                        prompt = """
                                                1. Last call cost
                                                2. All call cost
                                                3.Clear counter
                                                 """;
                                        System.out.println("SHOW CALL COST");
                                        userResponse = keyboardInput.nextInt();
                                        switch (userResponse) {
                                            case 1:
                                                System.out.println("Last call cost");
                                                break;
                                            case 2:
                                                System.out.println(" All call cost");
                                                break;
                                            case 3:
                                                System.out.println("Clear counter");
                                        }
                                                break;

                                            case 7:
                                                prompt = """
                                                        1. CALL COST SETTINGS
                                                        1. Call cost limit
                                                        2. Show cost in
                                                        """;
                                                System.out.println("CALL COST SETTINGS");
                                        userResponse = keyboardInput.nextInt();
                                        switch (userResponse) {
                                            case 1:
                                                System.out.println("Call cost limit");
                                                break;
                                            case 2:
                                                System.out.println("Show cost in");
                                                break;
                                            default:
                                                System.out.println("Coding is sweet when your code runs well");
                                                break;
                                        }
                                            case 8:
                                                prompt = """
                                                        PREPAID CREDIT
                                                        """;
                                                System.out.println("Finally, well done Man");
                                        }
                                }


                }

        }
    }

                     */
