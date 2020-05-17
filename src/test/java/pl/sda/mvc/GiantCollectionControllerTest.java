package pl.sda.mvc;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class GiantCollectionControllerTest {
    private List<GiantModel> giantModels;
    private GiantCollectionController giantCollectionController;
    private GiantView giantView;

    @BeforeEach
    public void setUp() {
        System.out.println("Przed");
        GiantModel giantModel = new GiantModel(Health.HEALTHY, Fatigue.SLEEPING, Nourishment.HUNGRY);
        GiantModel giantModel1 = new GiantModel(Health.DEAD, Fatigue.TIRED, Nourishment.SATURATED);
        GiantModel giantModel2 = new GiantModel(Health.HEALTHY, Fatigue.SLEEPING, Nourishment.HUNGRY);
        GiantModel giantModel3 = new GiantModel(Health.DEAD, Fatigue.TIRED, Nourishment.SATURATED);
        GiantModel giantModel4 = new GiantModel(Health.HEALTHY, Fatigue.SLEEPING, Nourishment.HUNGRY);
        giantModels= new ArrayList<>();
        giantModels.add(giantModel);
        giantModels.add(giantModel1);
        giantModels.add(giantModel2);
        giantModels.add(giantModel3);
        giantModels.add(giantModel4);
        giantView = new GiantView();
        giantCollectionController = new GiantCollectionController(giantView,giantModels);
    }


    @Test
    public void testSetHealth(){

        giantCollectionController.setHealth(Health.DEAD,4);

        assertEquals(Health.DEAD,giantCollectionController.getHealth(4));

    }
}