import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.HashMap;

public class F1Manager {

    public F1Manager() {
//Every car on the grid with their name easily accesable
        Car playerCar = new Car(Game.teamName); //
        Car Redbull = new Car("Redbull");
        Car Ferrari = new Car("Ferrari");
        Car Mercedes = new Car("Mercedes");
        Car Mclaren = new Car("Mclaren");
        Car Aston_Martin = new Car("Aston Martin");
        Car Alpine = new Car("Alpine");
        Car Williams = new Car("Williams");
        Car Haas = new Car("Haas");
        Car Stake = new Car("Stake");

        HashMap<String, String> team = new HashMap<String, String>();

        team.put(playerCar.name, Game.driverName);
        team.put(Redbull.name, "Verstappen");
        team.put(Ferrari.name, "Leclerc");
        team.put(Mercedes.name, "Hamilton");
        team.put(Mclaren.name, "Norris");
        team.put(Aston_Martin.name, "Alonso");
        team.put(Alpine.name, "Gasly");
        team.put(Williams.name, "Albon");
        team.put(Haas.name, "Hulkenberg");
        team.put(Stake.name, "Bottas");

        System.out.println(team.get(Redbull.name));

    }

}
