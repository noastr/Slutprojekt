import java.util.Random;

public class Car {
    public String name;
    public int[] carStats = new int[4];

    carStats[0]

    int engineStats;
    int aerodynamicStats;
    int suspensionStats;
    int durabilityStats;

    //The Cars attributes is linked to an array
    public Car(String name, int engineStats, int aerodynamicStats, int suspensionStats, int durabilityStats) {
        this.name = name;


        //Places a rating for each attributes from 20-99
        Car.class.getName();
        System.out.println(this.name);
        System.out.println("Engine: " + carStats[0]);
        System.out.println("Aerodynamic: " + carStats[1]);
        System.out.println("Suspension: " + carStats[2]);
        System.out.println("Durability: " + carStats[3]);
        /*for (int i : carStats) {
            System.out.print(i + ", ");
        }*/
        System.out.println("Average rating: " + avarageStats());
        System.out.println();
    }


    //Randomizes Ints for car stats from 20-99
    Random randomCarGenerator = new Random();

    public int randomizerCarMethod() {
        return (randomCarGenerator.nextInt(21, 100));
    }

    //This takes the 4 values of each car and makes an average rating for the car. This is used to see where each cars performance is, compared to each other.
    public double avarageStats() {
        double sum = 0.0;
        for (int i : carStats) {
            sum = sum + i;
        }
        return (sum / carStats.length);
    }


}

