import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.HashMap;

public class F1Manager {
    //ArrayList<Car> cars = new ArrayList<>();

    HashMap<String, String> team = new HashMap<String, String>();

    team.put("Redbull", "Verstappen");
    public F1Manager() {

        Car playerCar = new Car("playerCar");
        Car Redbull = new Car("Redbull");
        Car Ferrari = new Car("Ferrari");


        /*
        Car Mercedes = new Car();
        Car Mclaren = new Car();
        Car Aston_Martin = new Car();
        Car Alpine = new Car();
        Car Williams = new Car();
        Car Haas = new Car();
        Car Stake = new Car();

         */
    }

}
