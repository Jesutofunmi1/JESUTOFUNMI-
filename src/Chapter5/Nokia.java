package Chapter5;

import java.util.Scanner;

public class Nokia {


    static void MenuList() {

        System.out.println("1. PHONEBOOK");
        System.out.println("2. MESSAGE");
        System.out.println("3. CHAT");
        System.out.println("4. CALL REGISTER");
        System.out.println("5. TONES");
        System.out.println("6. SETTINGS");
        System.out.println("7. CALL DIVERT");
        System.out.println("8. GAMES");
        System.out.println("9. CALCULATOR");
        System.out.println("10. REMINDERS");
        System.out.println("11. CLOCK");
        System.out.println("12. PROFILES");
        System.out.println("13. SIM SERVICES");
        System.out.println("14. Exit to Menu List");
    }

    static void Phonebook() {
        System.out.println("1 Search");
        System.out.println("2 Search Nos");
        System.out.println("3 Add Name");
        System.out.println("4 Erase");
        System.out.println("5 Edit");
        System.out.println("6 Assign Tone");
        System.out.println("7 Send b'cord");
        System.out.println("8 Option");
        System.out.println("9 Speed dials");
        System.out.println("10 Voice tags");
        System.out.println("0 Back to PhoneBook");
    }

    static void Options() {
        System.out.println("1 Type of View");
        System.out.println("2 Memory status");
    }

    static void Message() {
        System.out.println("1. Write messages");
        System.out.println("2. Inbox");
        System.out.println("3. Outbox");
        System.out.println("4. Picture messages");
        System.out.println("5. Templates");
        System.out.println("6. Smileys");
        System.out.println("7. Message settings");
        System.out.println("8. Info service");
        System.out.println("9. Voice mailbox");
        System.out.println("10. Service command editor");
        System.out.println("0 Back to Message ");
    }

    static void MessageSettings() {
        System.out.println("1 Set");
        System.out.println("2 Common");
    }

    static void Set() {
        System.out.println("1 Message centre number");
        System.out.println("2 Message sent as");
        System.out.println("3 Message validity");
    }

    static void Common() {
        System.out.println("1 Delivery reports");
        System.out.println("2 Reply via same centre");
        System.out.println("3 Character support");
    }

    static void CallRegister() {
        System.out.println("1 Missed calls");
        System.out.println("2 Received calls");
        System.out.println("3 Dialled numbers");
        System.out.println("4 Erase recent call lists");
        System.out.println("5 Show call duration");
        System.out.println("6 Show call costs");
        System.out.println("7 Call cost settings");
        System.out.println("8 Prepaid credit");
        System.out.println("0 Back to Call Register");
    }

    static void ShowCallDuration() {
        System.out.println("1 Last Call Duration");
        System.out.println("2 All calls' duration");
        System.out.println("3 Received calls' duration");
        System.out.println("4 Dialled calls' duration");
        System.out.println("5 Clear timers");
    }

    static void ShowCallCosts() {
        System.out.println("1 Last call cost");
        System.out.println("2 All calls' cost");
        System.out.println("3 Clear counters");
    }

    static void CallCostSettings() {
        System.out.println("1 Call cost settings");
        System.out.println("2 Show costs in");
    }
static void Tones() {
        System.out.println("1 Ringing tone");
        System.out.println("2 Ringing volume");
        System.out.println("3 Incoming call alert");
        System.out.println("4 Composer");
        System.out.println("5 Message alert tone");
        System.out.println("6 Keypad tones");
        System.out.println("7 Warning and game tones");
        System.out.println("8 Vibrating alert");
        System.out.println("9 Screen saver");
    }
    static void Settings() {
        System.out.println("1 Call settings");
        System.out.println("2 Phone settings");
        System.out.println("3 Security settings");
        System.out.println("4 Restore factory settings");
    }
    static void CallSettings() {
        System.out.println("1 Automatic redial");
        System.out.println("2 Speed dialing");
        System.out.println("3 Call waiting");
        System.out.println("4 Own number sending");
        System.out.println("5 Phone line in use");
        System.out.println("6 Automatic answer");
    }
    static void PhoneSettings() {
        System.out.println("1 Language");
        System.out.println("2 Cell info display");
        System.out.println("3 Welcome note");
        System.out.println("4 Network selection");
        System.out.println("5 Lights");
        System.out.println("Confirm SIM service actions");
    }
    static void SecuritySettings() {
        System.out.println("1 PIN code request");
        System.out.println("2 Call barring service");
        System.out.println("3 Fixed dialing");
        System.out.println("4 Closed user group");
        System.out.println("5 Phone security");
        System.out.println("6 Change access codes");
    }

    static void ClockTest() {
        System.out.println("1 Alarm clock");
        System.out.println("2 ClockTest settings");
        System.out.println("3 Date setting");
        System.out.println("4 Stopwatch");
        System.out.println("5 Countdown timer");
        System.out.println("6 Auto update of date and timer");
    }
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
                                
                Select an option
                """;
        System.out.println(prompt);
        int userResponse = keyboardInput.nextInt();
        switch (userResponse) {
            case 1 -> {
                prompt = """
                        1 Search
                        2 Search Nos,
                        3 Add name
                        4 Erase
                        5 Edit
                        6 Assign tone
                        7 Send b'cord
                        8 Option
                        9 Speed Dials
                        10 Voice tags
                        0 Back to Menu List
                        """;
                System.out.println(prompt);
                int phoneNumber = keyboardInput.nextInt();
                switch (phoneNumber) {
                    case 1 -> {
                        System.out.println("1 Search");
                        System.out.println("0 Back to Phonebook");
                        int alphaInput = keyboardInput.nextInt();
                        if (alphaInput == 0) {
                            Phonebook();
                        }
                    }
                    case 2 -> {
                        System.out.println("2 Search No");
                        System.out.println("0 Back to Phonebook");
                        int bravoInput = keyboardInput.nextInt();
                        if (bravoInput == 0) {
                            Phonebook();
                        }
                    }
                    case 3 -> {
                        System.out.println("3 Add name");
                        System.out.println("0 Back to PhoneBook");
                        int charlieInput = keyboardInput.nextInt();
                        if (charlieInput == 0) {
                            Phonebook();
                        }
                    }
                    case 4 -> {
                        System.out.println("4 Erase");
                        System.out.println("0 Back to PhoneBook");
                        int deltaInput = keyboardInput.nextInt();
                        if (deltaInput == 0) {
                            Phonebook();
                        }
                    }
                    case 5 -> {
                        System.out.println("5 Edit");
                        System.out.println("0 Back to PhoneBook");
                        int echoInput = keyboardInput.nextInt();
                        if (echoInput == 0) {
                            Phonebook();
                        }
                    }
                    case 6 -> {
                        System.out.println("6 Assign tone");
                        System.out.println("0 Back to PhoneBook");
                        int foxtroxInput = keyboardInput.nextInt();
                        if (foxtroxInput == 0) {
                            Phonebook();
                        }
                    }
                    case 7 -> {
                        System.out.println("7 Send b'cord");
                        System.out.println("0 Back to PhoneBook");
                        int golfInput = keyboardInput.nextInt();
                        if (golfInput == 0) {
                            Phonebook();
                        }
                    }
                    case 8 -> {
                        System.out.println("Press 1 for Type of View:\nPress 2 for Memory Status:\nPress 0 for PhoneBook:");
                        int hotelInput = keyboardInput.nextInt();
                        if (hotelInput == 0) {
                            Phonebook();

                            int Options = keyboardInput.nextInt();
                            switch (Options) {

                                case 1 -> {
                                    System.out.println("1 Type of View");
                                    System.out.println("00 Back to Type of View");
                                    int indiaInput = keyboardInput.nextInt();
                                    if (indiaInput == 0) {
                                        Options();
                                    }
                                }
                                case 2 -> {
                                    System.out.println("2 Memory Status");
                                    System.out.println("00 Back to Type of View");
                                    int jullietInput = keyboardInput.nextInt();
                                    if (jullietInput == 0) {
                                        Options();
                                    }
                                }
                            }
                        }
                    }
                    case 9 -> {
                        System.out.println("9 Speed dials");
                        System.out.println("0 Back to PhoneBook");
                        int kiloInput = keyboardInput.nextInt();
                        if (kiloInput == 0) {
                            Phonebook();
                        }
                    }
                    case 10 -> {
                        System.out.println("Voice tags");
                        System.out.println("0 Back to PhoneBook");
                        int limaInput = keyboardInput.nextInt();
                        if (limaInput == 0) {
                            Phonebook();
                        }
                    }
                    case 0 -> {
                        System.out.println("0 Back to Menu List");
                        int errorInput = keyboardInput.nextInt();
                        if (errorInput == 0) {
                            MenuList();
                        }
                    }
                }
            }

            case 2 -> {
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
                        0  Back to Menu List
                        """;

                System.out.println(prompt);
                userResponse = keyboardInput.nextInt();
                switch (userResponse) {
                    case 1 -> {
                        System.out.println("1 Write messages");
                        System.out.println("0 Back to Message");
                        int mikeInput = keyboardInput.nextInt();
                        if (mikeInput == 0) {
                            Message();
                        }
                    }
                    case 2 -> {
                        System.out.println("2 Inbox");
                        System.out.println("0 Back to Message");
                        int novemberInput = keyboardInput.nextInt();
                        if (novemberInput == 0) {
                            Message();
                        }
                    }
                    case 3 -> {
                        System.out.println("3 Outbox");
                        System.out.println("0 Back to Message");
                        int oscarInput = keyboardInput.nextInt();
                        if (oscarInput == 0) {
                            Message();
                        }
                    }
                    case 4 -> {
                        System.out.println("4 Picture messages");
                        System.out.println("0 Back to Message");
                        int queueInput = keyboardInput.nextInt();
                        if (queueInput == 0) {
                            Message();
                        }
                    }
                    case 5 -> {
                        System.out.println("5 Templates");
                        System.out.println("0 Back to Message");
                        int romeoInput = keyboardInput.nextInt();
                        if (romeoInput == 0) {
                            Message();
                        }
                    }

                    case 6 -> {
                        System.out.println("6 Smileys");
                        System.out.println("0 Back to Message");
                        int sierraInput = keyboardInput.nextInt();
                        if (sierraInput == 0) {
                            Message();
                        }
                    }
                    case 7 -> {
                        System.out.println("Press 1 for Set:\nPress 2 for Common:");
                        System.out.println("0 Back to Message");
                        int tangoInput = keyboardInput.nextInt();
                        if (tangoInput == 0) {
                            Message();
                        }
                        int MessageSettings = keyboardInput.nextInt();
                        switch (MessageSettings) {
                            case 1 -> {
                                System.out.println("Press 1 for Message centre number\nPress 2 for Message sent as\nPress 3 for Message validity");
                                System.out.println("0 Back for Set");
                                int uniformInput = keyboardInput.nextInt();
                                if (uniformInput == 0) {
                                    MessageSettings();
                                }
                                int Set = keyboardInput.nextInt();
                                switch (Set) {
                                    case 1 -> {
                                        System.out.println("1 Message centre number");
                                        System.out.println("00 for Back to Message");
                                        int victorInput = keyboardInput.nextInt();
                                        if (victorInput == 0) {
                                            Set();
                                        }
                                    }
                                    case 2 -> {
                                        System.out.println("Message sent as");
                                        System.out.println("00 Back to Message");
                                        int whiskyInput = keyboardInput.nextInt();
                                        if (whiskyInput == 0) {
                                            Set();
                                        }
                                    }
                                    case 3 -> {
                                        System.out.println("Message validity");
                                        System.out.println("00 Back to Message");
                                        int xylophoneInput = keyboardInput.nextInt();
                                        if (xylophoneInput == 0) {
                                            Set();
                                        }
                                    }
                                }
                            }
                            case 2 -> {
                                System.out.println("Press 1 for Delivery reports\nPress 2 for Reply via same centre\nPress 3 for Character support");
                                System.out.println("0 Back to Message Settings");
                                int estherInput = keyboardInput.nextInt();
                                if (estherInput == 0) {
                                    MessageSettings();
                                }
                                int Common = keyboardInput.nextInt();
                                switch (Common) {
                                    case 1 -> {
                                        System.out.println("Delivery reports");
                                        System.out.println("00 Back to Common");
                                        int loveInput = keyboardInput.nextInt();
                                        if (loveInput == 0) {
                                            Common();
                                        }
                                    }

                                    case 2 -> {
                                        System.out.println("Reply via same centre");
                                        System.out.println("00 Back to Common");
                                        int judithInput = keyboardInput.nextInt();
                                        if (judithInput == 0) {
                                            Common();
                                        }
                                    }
                                    case 3 -> {
                                        System.out.println("Character support");
                                        System.out.println("00 Back to Common");
                                        int amakaInput = keyboardInput.nextInt();
                                        if (amakaInput == 0) {
                                            Common();
                                        }
                                    }
                                }
                            }
                        }
                    }
                    case 8 -> {
                        System.out.println("8 Info Service");
                        System.out.println("0 Back to Message");
                        int allInput = keyboardInput.nextInt();
                        if (allInput == 0) {
                            Message();
                        }
                    }
                    case 9 -> {
                        System.out.println("9 Voice mailbox number");
                        System.out.println("0 Back to Message");
                        int veryInput = keyboardInput.nextInt();
                        if (veryInput == 0) {
                            Message();
                        }
                    }
                    case 10 -> {
                        System.out.println("10 Service command editor");
                        System.out.println("0 Back to Message");
                        int importantInput = keyboardInput.nextInt();
                        if (importantInput == 0) {
                            Message();
                        }
                    }
                }
            }
            case 3 -> {
                System.out.println("Chat");
                System.out.println("0 Back to MenuList");
                int amaraInput = keyboardInput.nextInt();
                if (amaraInput == 0) {
                    MenuList();
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
                        8 Prepaid credit""";

                System.out.println(prompt);
                int CallRegister = keyboardInput.nextInt();
                switch (CallRegister) {
                    case 1 -> {
                        System.out.println("1 Missed calls");
                        System.out.println("0 Back to Call Register");
                        int daraInput = keyboardInput.nextInt();
                        if (daraInput == 0) {
                            CallRegister();
                        }
                    }

                    case 2 -> {
                        System.out.println("2 Received calls");
                        System.out.println("0 Back to Call Register");
                        int dareInput = keyboardInput.nextInt();
                        if (dareInput == 0) {
                            CallRegister();
                        }
                    }
                    case 3 -> {
                        System.out.println("3 Dialled numbers");
                        System.out.println("0 Back to Call Register");
                        int ipeolaInput = keyboardInput.nextInt();
                        if (ipeolaInput == 0) {
                            CallRegister();
                        }
                    }
                    case 4 -> {
                        System.out.println("4 Erase recent call lists");
                        System.out.println("0 Back to Call Register");
                        int nowInput = keyboardInput.nextInt();
                        if (nowInput == 0) {
                            CallRegister();
                        }
                    }
                    case 20 -> {
                        System.out.println("Show call duration");
                        {
                            System.out.println("Press 1 for last call duration:\nPress 2 for all calls' duration\nPress 3 for received calls' duration\nPress 4 Dialled calls' duration\n Press 5 for Clear timers");
                        }
                        System.out.println("0 Back to Call Register");
                        int fanInput = keyboardInput.nextInt();
                        if (fanInput == 0) {
                            CallRegister();
                        }
                        int Options = keyboardInput.nextInt();
                        switch (Options) {
                            case 1 -> {
                                System.out.println("1 Call duration");
                                System.out.println("0 Back to Show Call Duration");
                                int araInput = keyboardInput.nextInt();
                                if (araInput == 0) {
                                    ShowCallDuration();
                                }
                            }
                            case 2 -> {
                                System.out.println("2 All calls' duration");
                                System.out.println("0 Back to Call Register");
                                int noInput = keyboardInput.nextInt();
                                if (noInput == 0) {
                                    ShowCallDuration();
                                }
                            }
                            case 3 -> {
                                System.out.println("3 Received calls' duration");
                                System.out.println("0 Back to Call Register");
                                int feelInput = keyboardInput.nextInt();
                                if (feelInput == 0) {
                                    ShowCallDuration();
                                }
                            }
                            case 4 -> {
                                System.out.println("4 Dialled calls' duration");
                                System.out.println("0 Back to Call Register");
                                int likeInput = keyboardInput.nextInt();
                                if (likeInput == 0) {
                                    ShowCallDuration();
                                }
                            }
                            case 5 -> {
                                System.out.println("5 Clear timers");
                                System.out.println("0 Back to Call Register");
                                int chiInput = keyboardInput.nextInt();
                                if (chiInput == 0) {
                                    ShowCallDuration();
                                }
                            }
                        }
                    }
                    case 21 -> {
                        System.out.println("6 Show call costs");
                        {
                            System.out.println("Press 1 for last call cost:\nPress 2 for All calls' cost\nPress 3 for Clear counters");
                        }
                        System.out.println("0 Back to Call Register");
                        int fanInput = keyboardInput.nextInt();
                        if (fanInput == 0) {
                            CallRegister();
                        }
                        int Options = keyboardInput.nextInt();
                        switch (Options) {
                            case 1 -> {
                                System.out.println("1 Last call cost");
                                System.out.println("00 Back to Show Call Cost");
                                int bikoInput = keyboardInput.nextInt();
                                if (bikoInput == 0) {
                                    ShowCallCosts();
                                }
                            }
                            case 2 -> {
                                System.out.println("2 All call cost");
                                System.out.println("00 Back to Show Call Cost");
                                int letInput = keyboardInput.nextInt();
                                if (letInput == 0) {
                                    ShowCallCosts();
                                }
                            }
                            case 3 -> {
                                System.out.println("3 Clear counters");
                                System.out.println("00 Back to Show Call Cost");
                                int rentInput = keyboardInput.nextInt();
                                if (rentInput == 0) {
                                    ShowCallCosts();
                                }
                            }
                            case 7 -> {
                                System.out.println("Call cost settings");
                                System.out.println("0 Back to Call Register");
                                int gloryInput = keyboardInput.nextInt();
                                if (gloryInput == 0) {
                                    CallCostSettings();
                                }
                            }
                            case 8 -> {
                                System.out.println("Prepaid credit");
                                System.out.println("0 Back to Call Register");
                                int bloodInput = keyboardInput.nextInt();
                                if (bloodInput == 0) {
                                    CallCostSettings();
                                }
                            }
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
                                """;
                        System.out.println(prompt);
                        int Tones = keyboardInput.nextInt();
                        switch (Tones) {
                            case 1 -> {
                                System.out.println("1 Ringing tone");
                                System.out.println("0 Back to Tones");
                                int semiInput = keyboardInput.nextInt();
                                if (semiInput == 0) {
                                    Tones();
                                }
                            }
                            case 2 -> {
                                System.out.println("2 Ringing volume");
                                System.out.println("0 Back to Tones");
                                int loadInput = keyboardInput.nextInt();
                                if (loadInput == 0) {
                                    Tones();
                                }
                            }
                            case 3 -> {
                                System.out.println("3 Incoming call alert");
                                System.out.println("0 Back to Tones");
                                int noahInput = keyboardInput.nextInt();
                                if (noahInput == 0) {
                                    Tones();
                                }
                            }
                            case 4 -> {
                                System.out.println("4 Composer");
                                System.out.println("0 Back to Tones");
                                int nifemiInput = keyboardInput.nextInt();
                                if (nifemiInput == 0) {
                                    Tones();
                                }
                            }
                            case 5 -> {
                                System.out.println("5 Message alert tone");
                                System.out.println("0 Back to Tones");
                                int johnInput = keyboardInput.nextInt();
                                if (johnInput == 0) {
                                    Tones();
                                }
                            }
                            case 6 -> {
                                System.out.println("6 Keypad tones");
                                System.out.println("0 Back to Tones");
                                int ucjInput = keyboardInput.nextInt();
                                if (ucjInput == 0) {
                                    Tones();
                                }
                            }
                            case 7 -> {
                                System.out.println("7 Warning and game tones");
                                System.out.println("0 Back to Tones");
                                int johneryInput = keyboardInput.nextInt();
                                if (johneryInput == 0) {
                                    Tones();
                                }
                            }
                            case 8 -> {
                                System.out.println("8 Vibrating alert");
                                System.out.println("0 Back to Tones");
                                int upInput = keyboardInput.nextInt();
                                if (upInput == 0) {
                                    Tones();
                                }
                            }
                            case 9 -> {
                                System.out.println("9 Screen saver");
                                System.out.println("0 Back to Tones");
                                int downInput = keyboardInput.nextInt();
                                if (downInput == 0) {
                                    Tones();
                                }
                            }
                            default -> System.out.println("Chibuzor is a good coder");
                        }
                    }
                    case 6 -> {
                        prompt = """
                                1 Call settings
                                2 Phone settings
                                3 Security settings
                                4 Restore factory settings
                                """;
                        System.out.println(prompt);
                        int Settings = keyboardInput.nextInt();
                        switch (Settings) {
                            case 1 -> {
                                System.out.println("Call settings");
                                System.out.println("0 Back to Settings");
                                int semiInput = keyboardInput.nextInt();
                                if (semiInput == 0) {
                                    Settings();
                                }
                                System.out.println("Press 1 for Automatic redial:\nPress 2 for Speed dialing:\nPress 3 for Call waiting options\nPress 4 Own number sending\nPress 5 for Phone line in use\nPress 6 for Automatic answer");
                                int Options = keyboardInput.nextInt();
                                switch (Options) {
                                    case 1 -> {
                                        System.out.println("Automatic redial");
                                        System.out.println("0 Back to Call Settings");
                                        int oneInput = keyboardInput.nextInt();
                                        if (oneInput == 0) {
                                            CallSettings();
                                        }
                                    }
                                    case 2 -> {
                                        System.out.println("Speed dialing");
                                        System.out.println("0 Back to Call Settings");
                                        int twoInput = keyboardInput.nextInt();
                                        if (twoInput == 0) {
                                            CallSettings();
                                        }
                                    }
                                    case 3 -> {
                                        System.out.println("Call waiting options");
                                        System.out.println("0 Back to Call Settings");
                                        int threeInput = keyboardInput.nextInt();
                                        if (threeInput == 0) {
                                            CallSettings();
                                        }
                                    }
                                    case 4 -> {
                                        System.out.println("Own number sending");
                                        System.out.println("0 Back to Call Settings");
                                        int fourInput = keyboardInput.nextInt();
                                        if (fourInput == 0) {
                                            CallSettings();
                                        }
                                    }
                                    case 5 -> {
                                        System.out.println("Phone line in use");
                                        System.out.println("0 Back to Call Settings");
                                        int fiveInput = keyboardInput.nextInt();
                                        if (fiveInput == 0) {
                                            CallSettings();
                                        }
                                    }
                                    case 6 -> {
                                        System.out.println("Automatic answer");
                                        System.out.println("0 Back to Call Settings");
                                        int sixInput = keyboardInput.nextInt();
                                        if (sixInput == 0) {
                                            CallSettings();
                                        }
                                    }
                                }
                            }
                            case 2 -> {
                                System.out.println("Phone settings");
                                System.out.println("Press 1 for Language:\nPress 2 for Cell info display:\nPress 3 for Welcome note\nPress 4 Network selection\nPress 5 for Lights\nPress 6 for Confirm SIM service actions");
                                int Options = keyboardInput.nextInt();
                                switch (Options) {
                                    case 1 -> {
                                        System.out.println("Language");
                                        System.out.println("0 Back to Phone settings");
                                        int sevenInput = keyboardInput.nextInt();
                                        if (sevenInput == 0) {
                                            PhoneSettings();
                                        }
                                    }
                                    case 2 -> {
                                        System.out.println("Cell info display");
                                        System.out.println("0 Back to Phone settings");
                                        int eightInput = keyboardInput.nextInt();
                                        if (eightInput == 0) {
                                            PhoneSettings();
                                        }
                                    }
                                    case 3 -> {
                                        System.out.println("Welcome note");
                                        System.out.println("0 Back to Phone settings");
                                        int nineInput = keyboardInput.nextInt();
                                        if (nineInput == 0) {
                                            PhoneSettings();
                                        }
                                    }
                                    case 4 -> {
                                        System.out.println("Network selection");
                                        System.out.println("0 Back to Phone settings");
                                        int tenInput = keyboardInput.nextInt();
                                        if (tenInput == 0) {
                                            PhoneSettings();
                                        }
                                    }
                                    case 5 -> {
                                        System.out.println("Lights");
                                        System.out.println("0 Back to Phone settings");
                                        int elevenInput = keyboardInput.nextInt();
                                        if (elevenInput == 0) {
                                            PhoneSettings();
                                        }
                                    }
                                    case 6 -> {
                                        System.out.println("Confirm SIM service action");
                                        System.out.println("0 Back to Phone settings");
                                        int twelveInput = keyboardInput.nextInt();
                                        if (twelveInput == 0) {
                                            PhoneSettings();
                                        }
                                    }
                                }
                            }
                            case 3 -> {
                                System.out.println("Security settings");
                                System.out.println("Press 1 for PIN code:\nPress 2 for Call barring service:\nPress 3 for Fixed dialing\nPress 4 Closed user group\nPress 5 for Phone security\nPress 6 for Change access codes");
                                int Options = keyboardInput.nextInt();
                                switch (Options) {
                                    case 1 -> {
                                        System.out.println("PIN code request");
                                        System.out.println("0 Back to Security settings");
                                        int thirteenInput = keyboardInput.nextInt();
                                        if (thirteenInput == 0) {
                                            SecuritySettings();
                                        }
                                    }
                                    case 2 -> {
                                        System.out.println("1 Calling service");
                                        System.out.println("0 Back to Security settings");
                                        int forteenInput = keyboardInput.nextInt();
                                        if (forteenInput == 0) {
                                            SecuritySettings();
                                        }
                                    }
                                    case 3 -> {
                                        System.out.println("Fixed dialing");
                                        System.out.println("0 Back to Security settings");
                                        int fifteenInput = keyboardInput.nextInt();
                                        if (fifteenInput == 0) {
                                            SecuritySettings();
                                        }
                                    }
                                    case 4 -> {
                                        System.out.println("Closed user group");
                                        System.out.println("0 Back to Security settings");
                                        int sixteenInput = keyboardInput.nextInt();
                                        if (sixteenInput == 0) {
                                            SecuritySettings();
                                        }
                                    }
                                    case 5 -> {
                                        System.out.println("Phone security");
                                        System.out.println("0 Back to Security settings");
                                        int seventeenInput = keyboardInput.nextInt();
                                        if (seventeenInput == 0) {
                                            SecuritySettings();
                                        }
                                    }
                                    case 6 -> {
                                        System.out.println("Change access codes");
                                        System.out.println("0 Back to Security settings");
                                        int antInput = keyboardInput.nextInt();
                                        if (antInput == 0) {
                                            SecuritySettings();
                                        }
                                    }
                                }
                            }
                            case 4 -> {
                                System.out.println("Restore factory settings");
                                System.out.println("0 Back to Settings");
                                int dorcasInput = keyboardInput.nextInt();
                                if (dorcasInput == 0) {
                                    Settings();
                                }
                            }
                        }
                    }
                    case 7 -> {
                        System.out.println("Call divert");
                        System.out.println("0 Back to MenuList");
                        int charlesInput = keyboardInput.nextInt();
                        if (charlesInput == 0) {
                            MenuList();
                        }
                    }
                    case 8 -> {
                        System.out.println("Games");
                        System.out.println("0 Back to Menu List");
                        int lionInput = keyboardInput.nextInt();
                        if (lionInput == 0) {
                            MenuList();
                        }
                    }
                    case 9 -> {
                        System.out.println("Calculator");
                        System.out.println("0 Back to Menu List");
                        int tigerInput = keyboardInput.nextInt();
                        if (tigerInput == 0) {
                            MenuList();
                        }
                    }
                    case 10 -> {
                        System.out.println("Reminders");
                        System.out.println("0 Back to Menu List");
                        int birdInput = keyboardInput.nextInt();
                        if (birdInput == 0) {
                            MenuList();
                        }
                    }
                    case 11 -> {
                        prompt = """
                                1 Alarm clock
                                2 ClockTest settings
                                3 Date settings
                                4 Stopwatch
                                5 Countdown timer
                                6 Auto update of date and time
                                """;
                        System.out.println(prompt);
                        int ClockTest = keyboardInput.nextInt();
                        switch (ClockTest) {
                            case 1 -> {
                                System.out.println("Alarm clock");
                                System.out.println("0 Back to ClockTest");
                                int segaInput = keyboardInput.nextInt();
                                if (segaInput == 0) {
                                    ClockTest();
                                }
                            }
                            case 2 -> {
                                System.out.println("ClockTest settings");
                                System.out.println("0 Back to ClockTest");
                                int whyInput = keyboardInput.nextInt();
                                if (whyInput == 0) {
                                    ClockTest();
                                }
                            }
                            case 3 -> {
                                System.out.println("Date setting");
                                System.out.println("0 Back to ClockTest");
                                int whatInput = keyboardInput.nextInt();
                                if (whatInput == 0) {
                                    ClockTest();
                                }
                            }
                            case 4 -> {
                                System.out.println("Stopwatch");
                                System.out.println("0 Back to ClockTest");
                                int happyInput = keyboardInput.nextInt();
                                if (happyInput == 0) {
                                    ClockTest();
                                }
                            }
                            case 5 -> {
                                System.out.println("Countdown timer");
                                System.out.println("0 Back to ClockTest");
                                int sadInput = keyboardInput.nextInt();
                                if (sadInput == 0) {
                                    ClockTest();
                                }
                            }
                            case 6 -> {
                                System.out.println("Auto update of date and time");
                                System.out.println("0 Back to ClockTest");
                                int restInput = keyboardInput.nextInt();
                                if (restInput == 0) {
                                    ClockTest();
                                }
                            }
                        }
                    }
                    case 12 -> {
                        System.out.println("Profile");
                        System.out.println("0 Back to Menu List");
                        int igbagboInput = keyboardInput.nextInt();
                        if (igbagboInput == 0) {
                            Phonebook();
                        }
                    }
                    case 13 -> {
                        System.out.println("SIM services");
                        System.out.println("0 Back to Menu List");
                        int akinInput = keyboardInput.nextInt();
                        if (akinInput == 0) {
                            Phonebook();
                        }
                    }
                }
            }
        }
    }
}