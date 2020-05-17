package pl.sda.mvc;

public class Main {
    public static void main(String[] args) {
        GiantModel giantModel = new GiantModel(Health.HEALTHY, Fatigue.TIRED, Nourishment.HUNGRY);
        GiantView giantView = new GiantView();

        GiantController giantController = new GiantController(giantModel, giantView);

        giantController.updateView();
        giantController.setHealth(Health.DEAD);
        giantController.updateView();
    }
}
