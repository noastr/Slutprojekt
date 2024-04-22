import java.util.Random;

public class Car {
    public String name;
    public int[] carStats = new int[4];

    //The Cars attributes is linked to an array
    public Car(String name) {
        this.name = name;
        carStats[0] = randomizerCarMethod(); //engineStats
        carStats[1] = randomizerCarMethod(); //aerodynamicStats
        carStats[2] = randomizerCarMethod(); //suspensionStats
        carStats[3] = randomizerCarMethod(); //durabilityStats

        //Places a rating for each attributes from 20-99
        Car.class.getName();
        System.out.println(this.name);
        for (int i : carStats) {
            System.out.print(i + ", ");
        }
        System.out.println();
        System.out.println("Average rating: " + avarageStats());
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

