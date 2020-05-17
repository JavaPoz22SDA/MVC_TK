package pl.sda.mvc;

import java.util.List;

public class GiantView {

    public void displayGiant(GiantModel giantModel) {
        System.out.println(giantModel.toString());
    }

    public void displayGiantCollection(List<GiantModel> giantModels) {
        for (GiantModel giantModel : giantModels) {
            System.out.println(giantModel.toString());
        }
    }
}
