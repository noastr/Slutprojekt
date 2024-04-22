import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.HashMap;

public class F1Manager {

    public F1Manager() {
//Car objects with different stats
        Car playerCar = new Car("playerCar");
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

        //team.put("");
        team.put("Redbull", "Verstappen");
        team.put("Ferrari", "Leclerc");
        team.put("Mercedes", "Hamilton");
        team.put("Mclaren", "Norris");
        team.put("Aston Martin", "Alonso");
        team.put("Alpine", "Gasly");
        team.put("Williams", "Albon");
        team.put("Haas", "Hulkenberg");
        team.put("Stake", "Bottas");

        System.out.println(team.get("Redbull"));

    }

}
