import java.util.InputMismatchException;
import java.util.Scanner;

public class Game {
    public static String teamName;
    public static String driverName;

    Scanner input = new Scanner(System.in);

    public Game() {
        System.out.println("\n \n F1 Manager!"); // \n = Break
        int money = 1000000;

        StartMenu();

        MainMenu();

    }

    public void StartMenu() {
        boolean menuBoolean = true;
        while (menuBoolean) { //This whileloop, loops until the user has used the right input. When the user does, it breaks and continues with the code.
            boolean valid = false; //Valid is used to check whether the user typed in 1 to continue, if the user does the if statement in line 42 continues to the next step.

            //This try-catch checks if the input in valid, and if something is wrong it repeats the segment and scans again
            try {
                System.out.println("\n      Menu \n\n1. Start game \n2. Quit game");
                int choice = input.nextInt();
                if (choice == 1) {
                    valid = true;
                    menuBoolean = false;
                }
                if (choice == 2) {
                    System.exit(0);
                }
            } catch (InputMismatchException e) {
                System.out.println("Please try again! Type in the numbers on the side of the path to continue. \nIn this case, type 1 or 2");
                input.nextLine();
            }

            //if the user typed in "1" it would make valid true and use the method "TeamSettings"
            if (valid == true) {
                TeamSettings();
            }
        }
        System.out.print("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n"); //"clears" the console
    }

    public void MainMenu() {
        boolean gameBoolean = true;
        while (gameBoolean) { //Same concept as in menuBoolean, it won't break until the right input is used, and it's checked with the same try-catch as before as well. In this case it's 1-4
            boolean choice1 = false;
            boolean choice2 = false;
            boolean choice3 = false;
            boolean choice4 = false;

            try {
                System.out.println("Menu \n\n1.Next Race \n2.Upgrades \n3.Standings \n4.Constructor Statitics");
                int choice = input.nextInt();
                if (choice == 1) {
                    choice1 = true;
                    gameBoolean = false;
                    Race();
                }
                if (choice == 2) {
                    choice2 = true;
                    gameBoolean = false;
                }
                if (choice == 3) {
                    choice3 = true;
                    gameBoolean = false;
                }
                if (choice == 4) {
                    choice4 = true;
                    gameBoolean = false;
                }

            } catch (InputMismatchException e) {
                System.out.println("Please try again! Type in the numbers on the side of the path to continue. \n In this case, type 1, 2, 3 or 4");
                input.nextLine();
            }

            if (choice1 == true) {
                Race();
            }
            if (choice2 == true) {
                Upgrades();
            }
            if (choice3 == true) {
                Standings();
            }
            if (choice4 == true) {
                BotStats();
            }

        }
    }

    public void Race() {
        System.out.println("Racing vroom");
    }

    ;

    public void Upgrades() {
        System.out.println("Upgrade");
    }

    ;

    private void Standings() {
        System.out.println("Max is p1");
    }

    ;

    private void BotStats() {
        System.out.println("Cars bot stat");
        new F1Manager();

        System.out.println("Type 'back' to return to the main menu.");
        input.nextLine();
        String blablabla = input.nextLine();
        System.out.println(blablabla);

        // Check if the user has typed "back", doesn't matter if its with or without capital letters
        if (blablabla.equalsIgnoreCase("back")) {
            MainMenu();
        } else {
            // Invalid input, inform user and loops again
            System.out.println("Invalid input. Please type 'back' to return.");
        }
    }

    ;

    public void TeamSettings() {

        System.out.println("Welcome to F1 Manager! \nFirst thing you need to do is creating your team. Please write your team name \nTeam Name:");
        teamName = input.nextLine();
        System.out.println(teamName + " is a great name for your team! \nNow we only need your driver-name! \nDriver Name:");
        driverName = input.nextLine();
        System.out.println(driverName + ", Perfect!");

    }

}
