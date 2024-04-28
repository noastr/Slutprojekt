public class Car {
    public String name;
    public int engine;
    public int aerodynamics;
    public int reliability;
    public int weight;
    public double points;


    //The Cars attributes is linked to an array
    public Car(String name, int engineStats, int aerodynamicStats, int reliabilityStats, int weightStats, int pointsRandom) {
        this.name = name;

        engine = engineStats;
        aerodynamics = aerodynamicStats;
        reliability = reliabilityStats;
        weight = weightStats;
        points = pointsRandom;

        averageStats();

        //DisplayStats();
    }

    //This takes the 4 values of each car and makes an average rating for the car. This is used to see where each cars performance is, compared to each other.
    public double averageStats() {
        double sum = 0.0;
        sum += engine;
        sum += aerodynamics;
        sum += reliability;
        sum += weight;
        return sum / 4;
    }

    public double pointSystem() {
        points = averageStats() - Game.worstTeamRating + 1;
        return points;
    }

}
