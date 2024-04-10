public class Car {
    int engineRating;
    int aerodynamicRating;
    int suspensionRating;
    int durabilityRating;
    public static int[] carStats = new int[4];

    //The Cars attributes is linked to an array so the value is easier to make
    public Car(int engineStats,int aerodynamicStats, int suspensionStats, int durabilityStats){
        carStats[0] = engineStats;
        carStats[1] = aerodynamicStats;
        carStats[2] = suspensionStats;
        carStats[3] = durabilityStats;

        System.out.println(engineStats + "carclassprint");

        }
    }

