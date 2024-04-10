public class Main{

    //Randomizes the rating for the car's attributes from 0-99
    public static void randomizerMethod(){
        for (int i = 0; i <= 3; i++) {
            double randNr = Math.random() * 100;
            int randomRating = (int) randNr;
            System.out.println(randomRating);
            Car.carStats[i] = randomRating;
            System.out.println("array "+i +Car.carStats[i]);
        }
    }
    public static void main(String[] args) {

        System.out.println("F1 Manager!");

        randomizerMethod();

        Car MaxVerstapebil = new Car(Car.carStats[0], Car.carStats[1], Car.carStats[2], Car.carStats[3]);
        Car SophiaFluschr = new Car(Car.carStats[0], Car.carStats[1], Car.carStats[2], Car.carStats[3]);

        System.out.println(Car.class);

    }
}