import java.util.*;

public class Game {
    public static String teamName;
    public static String driverName;
    public static int money = 10000;
    public static int raceGoal;
    public static Double worstTeamRating;
    HashMap<String, Car> team = new HashMap<String, Car>();
    Scanner input = new Scanner(System.in);

    Car playerCar = new Car(teamName, 64, 64, 61, 60, 0); //
    Car Redbull = new Car("Redbull", 96, 97, 90, 99, 0);
    Car Ferrari = new Car("Ferrari", 90, 87, 80, 87, 0);
    Car Mercedes = new Car("Mercedes", 81, 82, 84, 80, 0);
    Car Mclaren = new Car("Mclaren", 76, 79, 77, 81, 0);
    Car Aston_Martin = new Car("Aston Martin", 80, 77, 75, 80, 0);
    Car Alpine = new Car("Alpine", 73, 72, 67, 75, 0);
    Car Williams = new Car("Williams", 73, 80, 70, 69, 0);
    Car Haas = new Car("Haas", 68, 71, 66, 67, 0);
    Car Stake = new Car("Stake", 61, 64, 60, 64, 0);


    public Game() {

        System.out.println("\n \n F1 Manager!"); // \n = Break

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
                System.out.println("Menu \n\n1.Next Race \n2.Upgrades \n3.Standings \n4.Constructor Rating");
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
        PredictedPosition();
        Random random = new Random();
        System.out.println("Your goal for this race is p" + raceGoal + "\nIf you succeed you will earn a 10000$ bonus!");


        team.put(Redbull.name, Redbull);
        team.put(Ferrari.name, Ferrari);
        team.put(Mercedes.name, Mercedes);
        team.put(Mclaren.name, Mclaren);
        team.put(Aston_Martin.name, Aston_Martin);
        team.put(Alpine.name, Alpine);
        team.put(Williams.name, Williams);
        team.put(Haas.name, Haas);
        team.put(Stake.name, Stake);

        for (Car carName : team.values()) {
            carName.points = random.nextDouble(carName.pointSystem());
        }

        ArrayList<Double> racingGrid = new ArrayList<>();
        racingGrid.add(playerCar.points);
        racingGrid.add(Redbull.points);
        racingGrid.add(Mclaren.points);
        racingGrid.add(Mercedes.points);
        racingGrid.add(Aston_Martin.points);
        racingGrid.add(Haas.points);
        racingGrid.add(Williams.points);
        racingGrid.add(Ferrari.points);
        racingGrid.add(Stake.points);
        racingGrid.add(Alpine.points);

        Collections.sort(racingGrid);
        Collections.reverse(racingGrid);

        for ()
    }

    ;

    public void Upgrades() {
        System.out.println("Your balance is " + money + "$");
        Random random = new Random();

        int upgradeChoice = 0;
        int randPrice = random.nextInt(2001) + 3000; //Randomizes the price for the upgrade from 3000 to 4000
        int remainMoney = money - randPrice; //The remaining money the user would have if they proceeded with the purchase
        int randAmount = random.nextInt(4); //Randomizes how much the upgrade will do from 0-3. Example: Engine has 60 and buying this upgrade might get it to 63. But if the user is unlucky, the upgrade may fail and wont gain any points.

        try {
            System.out.println("What do you want to upgrade? \n1. Engine\n2. Aerodynamics\n3. Reliability\n4. Weight \n5. Information about Research & Development \n6. Game Menu");
            upgradeChoice = input.nextInt();

            switch (upgradeChoice) { //switch case is easier to cope with when there is so many options for the user to make. it also has its own "defualt" which can do things if the users input doesnt match what is should
                case 1: // FYI, case 1-4 has all the same code, only that it upgrades different parts

                    if (money >= randPrice) { //this if statement check if the user has enough money to buy the upgrade, otherwise they will be sent back to the menu
                        System.out.println("This upgrade costs " + randPrice + "$, you have " + money + "$ currently. \nIf you proceed with this purchase, you will have " + remainMoney + "$ remaining. Would you still like to proceed? y/n");
                        String upgradeProceed = input.next();

                        switch (upgradeProceed) {
                            case "y":
                                money -= randPrice; //User pays for the upgrade and "money" will have that same value throughout the code bc of the -=
                                playerCar.engine += randAmount; //the attribute upgrades 0-3 points and stays that way bc +=. in this case its the engine
                                System.out.println(playerCar.engine - randAmount + " -> " + playerCar.engine);
                                System.out.println("Your engine went up with " + randAmount + " points for " + randPrice + "$");
                                break;
                            case "n":
                                System.out.println("Going back...");
                                break;
                            default:
                                System.out.println("Please type in 'y' for yes, and 'n' for no.");
                                break;
                        }
                        Upgrades();
                    } else {
                        System.out.println("Insufficient funds... You only have " + money);
                        Upgrades();
                    }
                    break;

                case 2:

                    if (money >= randPrice) {
                        System.out.println("This upgrade costs " + randPrice + "$, you have " + money + "$ currently. \nIf you proceed with this purchase, you will have " + remainMoney + "$ remaining. Would you still like to proceed? y/n");
                        String upgradeProceed = input.next();

                        switch (upgradeProceed) {
                            case "y":
                                money -= randPrice;

                                playerCar.aerodynamics += randAmount;
                                System.out.println(playerCar.aerodynamics - randAmount + " -> " + playerCar.aerodynamics);
                                System.out.println("Your aerodynimcs went up with " + randAmount + " points for " + randPrice + "$");
                                break;
                            case "n":
                                System.out.println("Going back...");
                                break;
                            default:
                                System.out.println("Please type in 'y' for yes, and 'n' for no.");
                                break;
                        }
                        Upgrades();
                    } else {
                        System.out.println("Insufficient funds... You only have " + money);
                        Upgrades();
                    }
                    break;

                case 3:

                    if (money >= randPrice) {
                        System.out.println("This upgrade costs " + randPrice + "$, you have " + money + "$ currently. \nIf you proceed with this purchase, you will have " + remainMoney + "$ remaining. Would you still like to proceed? y/n");
                        String upgradeProceed = input.next();

                        switch (upgradeProceed) {
                            case "y":
                                money -= randPrice;

                                playerCar.reliability += randAmount;
                                System.out.println(playerCar.reliability - randAmount + " -> " + playerCar.reliability);
                                System.out.println("Your reliability went up with " + randAmount + " points for " + randPrice + "$");
                                break;
                            case "n":
                                System.out.println("Going back...");
                                break;
                            default:
                                System.out.println("Please type in 'y' for yes, and 'n' for no.");
                                break;
                        }
                        Upgrades();
                    } else {
                        System.out.println("Insufficient funds... You only have " + money);
                        Upgrades();
                    }
                    break;

                case 4:

                    if (money >= randPrice) {
                        System.out.println("This upgrade costs " + randPrice + "$, you have " + money + "$ currently. \nIf you proceed with this purchase, you will have " + remainMoney + "$ remaining. Would you still like to proceed? y/n");
                        String upgradeProceed = input.next();

                        switch (upgradeProceed) {
                            case "y":
                                money -= randPrice;

                                playerCar.weight += randAmount;
                                System.out.println(playerCar.weight - randAmount + " -> " + playerCar.weight);
                                System.out.println("Your weight went up with " + randAmount + " points for " + randPrice + "$");
                                break;
                            case "n":
                                System.out.println("Going back...");
                                break;
                            default:
                                System.out.println("Please type in 'y' for yes, and 'n' for no.");
                                break;
                        }
                        Upgrades();

                    } else {
                        System.out.println("Insufficient funds... You only have " + money);
                        Upgrades();
                    }
                    break;

                case 5:
                    System.out.println("Research and Upgrades are your chance to make your cars performance better. \nWhen you buy an upgrade, your rating will go up by 1 to 3 points for that attribute. \nThere is a chance to fail your research and therefore pay for nothing. \nTo upgrade, simply type in 1 to 4 to upgrade the attribute you want!\n");
                    break;

                case 6:
                    MainMenu();
                    break;
            }
            Upgrades();

        } catch (InputMismatchException e) {
            System.out.println("Please try again! Type in the numbers on the side of the path to continue. \n In this case, type 1, 2, 3 or 4");
            input.nextLine();
        }

    }

    ;

    private void Standings() {
        System.out.println("Max is p1");
    }

    ;

    private void BotStats() {
        System.out.println("Cars bot stat");
        DisplayStats();

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
        teamName = input.next();
        System.out.println(teamName + " is a great name for your team! \nNow we only need your driver-name! \nDriver Name:");
        driverName = input.next();
        System.out.println(driverName + ", Perfect!");

    }

    private void DisplayStats() {


        //team.put(playerCar.name, playerCar);
        team.put(Redbull.name, Redbull);
        team.put(Ferrari.name, Ferrari);
        team.put(Mercedes.name, Mercedes);
        team.put(Mclaren.name, Mclaren);
        team.put(Aston_Martin.name, Aston_Martin);
        team.put(Alpine.name, Alpine);
        team.put(Williams.name, Williams);
        team.put(Haas.name, Haas);
        team.put(Stake.name, Stake);

        System.out.println(teamName + ": Engine: " + playerCar.engine + ", Aerodynamic: " + playerCar.aerodynamics +
                " , Reliability: " + playerCar.reliability + " , Weight: " + playerCar.weight + "\n");
        for (Car carName : team.values()) {
            System.out.println(carName.name + ": Engine: " + carName.engine + ", Aerodynamic: " + carName.aerodynamics +
                    " , Reliability: " + carName.reliability + " , Weight: " + carName.weight);
            System.out.println();
        }
    }

    private void PredictedPosition() {
        ArrayList<Double> allCars = new ArrayList<>();
        allCars.add(playerCar.averageStats());
        allCars.add(Redbull.averageStats());
        allCars.add(Ferrari.averageStats());
        allCars.add(Mercedes.averageStats());
        allCars.add(Stake.averageStats());
        allCars.add(Mclaren.averageStats());
        allCars.add(Aston_Martin.averageStats());
        allCars.add(Alpine.averageStats());
        allCars.add(Williams.averageStats());
        allCars.add(Haas.averageStats());
        // Sort every car based on their average stat (lowest to highest)
        //This is to make a prediction on where the user should end up in the race to earn a money bonus.
        Collections.sort(allCars);

        double gridPlacement = allCars.indexOf(playerCar.averageStats()); //this places the players car in a positional ranking based on average stats

        if (gridPlacement < 4) {
            raceGoal = 5;
        } else if (gridPlacement <= 4 & gridPlacement < 2) {
            raceGoal = 3;
        } else if (gridPlacement >= 2) {
            raceGoal = 1;
        }

        worstTeamRating = Collections.min(allCars);
    }
}





