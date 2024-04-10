public class Main {

    static void randomizerMethod(){
        for (int i = 0; i < 3; i++) {
            double randNr = Math.random() * 100;
            int randomRating = (int) randNr;
            System.out.println(randNr);
        }
    }
    public static void main(String[] args) {

        System.out.println("F1 Manager!");
        randomizerMethod();

        Car MaxVerstapebil = new Car(100,99,70, 90);
        Car SophiaFluschr = new Car(15,50, 69, 80);

        //Randomizes the rating for the car's attributes from 0-99


    }
}