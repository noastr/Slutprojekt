public class Car {
    public String name; //the name of the team
    public int engine; //the rating for engine
    public int aerodynamics; // -||- for aero
    public int reliability; // -||- for reliability
    public int weight; // -||- for weight
    public double points; //is the interval that gets randomized for the race-sim


    //The Cars attributes is linked to an array
    public Car(String name, int engineStats, int aerodynamicStats, int reliabilityStats, int weightStats, int pointsRandom) {
        this.name = name;
        engine = engineStats;
        aerodynamics = aerodynamicStats;
        reliability = reliabilityStats;
        weight = weightStats;
        points = pointsRandom;
        averageStats();
    }

    //This takes the 4 values of each car and makes an average rating for the car. This is used to see where each car's performance is, compared to each other.
    public double averageStats() {
        double sum = 0.0;
        sum += engine;
        sum += aerodynamics;
        sum += reliability;
        sum += weight;
        return sum / 4;
    }

    public double pointSystem() { //Makes the interval that each car has to randomize
        points = averageStats() - Game.worstTeamRating + 5;
        return points;
    }

}
