package pl.sda.mvc;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        GiantModel giantModel = new GiantModel(Health.HEALTHY, Fatigue.SLEEPING, Nourishment.HUNGRY);
        GiantModel giantModel1 = new GiantModel(Health.DEAD, Fatigue.TIRED, Nourishment.SATURATED);
        GiantModel giantModel2 = new GiantModel(Health.HEALTHY, Fatigue.SLEEPING, Nourishment.HUNGRY);
        GiantModel giantModel3 = new GiantModel(Health.DEAD, Fatigue.TIRED, Nourishment.SATURATED);
        GiantModel giantModel4 = new GiantModel(Health.HEALTHY, Fatigue.SLEEPING, Nourishment.HUNGRY);
        GiantView giantView = new GiantView();

        GiantController giantController = new GiantController(giantModel, giantView);
        giantController.updateView();
        giantController.setHealth(Health.DEAD);
        giantController.updateView();

        List<GiantModel> giantModels= new ArrayList<>();
        giantModels.add(giantModel);
        giantModels.add(giantModel1);
        giantModels.add(giantModel2);
        giantModels.add(giantModel3);
        giantModels.add(giantModel4);
        GiantCollectionController giantCollectionController=new GiantCollectionController(giantView,giantModels);
        System.out.println("Przed zmainą");
        giantCollectionController.updateView();
        giantCollectionController.setHealth(Health.HEALTHY,1);
        System.out.println("Po zmianie");
        giantCollectionController.updateView();

    }
}
