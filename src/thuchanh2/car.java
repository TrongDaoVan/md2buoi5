package thuchanh2;

public class car {
    private String name;
    private String engine;

    public static int numberofCars;

    public car(String name, String engine) {
        this.name = name;
        this.engine = engine;
        numberofCars++;
    }

}
