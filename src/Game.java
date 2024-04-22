import java.util.InputMismatchException;
import java.util.Scanner;

public class Game {
    public static String teamName;
    public static String driverName;

    public Game() {
        Scanner input = new Scanner(System.in);
        System.out.println("\n \n F1 Manager!"); // \n = Break
        int money = 1000000;


        //This is a simple menu. Either the user start the game or they quit the game.
        boolean menuBoolean = true;
        while (menuBoolean) {
            boolean valid = false;

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
                System.out.println("if valid ts");
                TeamSettings();
            }
        }
        System.out.print("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n"); //"clears" the console

        boolean gameBoolean = true;
        while (gameBoolean) {
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
    }

    ;

    public void TeamSettings() {
        Scanner input = new Scanner(System.in);

        System.out.println("Team Name:");
        teamName = input.nextLine();
        System.out.println(teamName + "...What a great name for your team! \nNow we only need your driver-name! \nDriver Name:");
        driverName = input.nextLine();
        System.out.println(driverName + " Perfect.");

    }

}
