package pl.sda.mvc;

public class Main {
    public static void main(String[] args) {
        GiantModel giantModel = new GiantModel(Health.HEALTHY, Fatigue.SLEEPING, Nourishment.SATURATED);
        GiantView giantView = new GiantView();

        GiantController giantController = new GiantController(giantModel, giantView);


    }
}
