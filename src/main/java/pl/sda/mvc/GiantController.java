package pl.sda.mvc;

public class GiantController {
    private GiantModel giantModel;
    private GiantView giantView;

    public GiantController(GiantModel giantModel, GiantView giantView) {
        this.giantModel = giantModel;
        this.giantView = giantView;
    }

    public Health getHealth(){
        return this.giantModel.getHealth();
    }
    public void setHealth(Health h){
        this.giantModel.setHealth(h);
    }

    public Fatigue getFatigue(){
        return this.giantModel.getFatigue();
    }
    public void setFatigue(Fatigue f){
        this.giantModel.setFatigue(f);
    }

    public Nourishment getNourishment(){
        return this.giantModel.getNourishment();
    }
    public void setNourishment(Nourishment n){
        this.giantModel.setNourishment(n);
    }

    public void updateView(){
        this.giantView.displayGiant(this.giantModel);
    }
}
