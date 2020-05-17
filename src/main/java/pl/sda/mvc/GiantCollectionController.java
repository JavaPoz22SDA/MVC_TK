package pl.sda.mvc;

import java.util.List;

public class GiantCollectionController {
    GiantView giantView;
    List<GiantModel> giantModels;

    public GiantCollectionController(GiantView giantView, List<GiantModel> giantModels) {
        this.giantView = giantView;
        this.giantModels = giantModels;
    }

    public Health getHealth(int index) {
        return this.giantModels.get(index).getHealth();
    }

    public void setHealth(Health h, int index) {
        this.giantModels.get(index).setHealth(h);
    }

    public Fatigue getFatigue(int index) {
        return this.giantModels.get(index).getFatigue();
    }

    public void setFatigue(Fatigue f, int index) {
        this.giantModels.get(index).setFatigue(f);
    }

    public Nourishment getNourishment(int index) {
        return this.giantModels.get(index).getNourishment();
    }

    public void setNourishment(Nourishment n, int index) {
        this.giantModels.get(index).setNourishment(n);
    }

    public void updateView() {
        this.giantView.displayGiantCollection(this.giantModels);
    }
}

