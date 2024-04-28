import java.util.HashMap;

public class F1Manager {

    public F1Manager() {
//Every car on the grid with their name and stats
        Car playerCar = new Car(Game.teamName, 64, 64, 61, 60); //
        Car Redbull = new Car("Redbull", 96, 97, 90, 99);
        Car Ferrari = new Car("Ferrari", 90, 87, 80, 87);
        Car Mercedes = new Car("Mercedes", 81, 82, 84, 80);
        Car Mclaren = new Car("Mclaren", 76, 79, 77, 81);
        Car Aston_Martin = new Car("Aston Martin", 80, 77, 75, 80);
        Car Alpine = new Car("Alpine", 73, 72, 67, 75);
        Car Williams = new Car("Williams", 73, 80, 70, 69);
        Car Haas = new Car("Haas", 68, 71, 66, 67);
        Car Stake = new Car("Stake", 61, 64, 60, 64);

        System.out.println(playerCar);

        HashMap<String, Car> team = new HashMap<String, Car>();

        team.put(playerCar.name, playerCar);
        team.put(Redbull.name, Redbull);
        team.put(Ferrari.name, Ferrari);
        team.put(Mercedes.name, Mercedes);
        team.put(Mclaren.name, Mclaren);
        team.put(Aston_Martin.name, Aston_Martin);
        team.put(Alpine.name, Alpine);
        team.put(Williams.name, Williams);
        team.put(Haas.name, Haas);
        team.put(Stake.name, Stake);


    }


}
