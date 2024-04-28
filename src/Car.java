public class Car {
    public String name;
    public int engine;
    public int aerodynamics;
    public int reliability;
    public int weight;

    //The Cars attributes is linked to an array
    public Car(String name, int engineStats, int aerodynamicStats, int reliabilityStats, int weightStats) {
        this.name = name;

        engine = engineStats;
        aerodynamics = aerodynamicStats;
        reliability = reliabilityStats;
        weight = weightStats;
        avarageStats();

        //DisplayStats();
    }

    //This takes the 4 values of each car and makes an average rating for the car. This is used to see where each cars performance is, compared to each other.
    private double avarageStats() {
        double sum = 0.0;
        sum += engine;
        sum += aerodynamics;
        sum += reliability;
        sum += weight;
        return sum / 4;
    }

}
