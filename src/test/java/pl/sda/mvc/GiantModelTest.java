package pl.sda.mvc;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class GiantModelTest {
    final GiantModel giantModel=new GiantModel(Health.HEALTHY,Fatigue.TIRED,Nourishment.HUNGRY);

    @Test
    public void testSetHealth(){

        for (final Health health:Health.values()){
             giantModel.setHealth(health);
            assertEquals(health,giantModel.getHealth());
        }
    }
    @Test
    public void testSetFatigue(){

        for (final Fatigue fatigue:Fatigue.values()){
            giantModel.setFatigue(fatigue);
            assertEquals(fatigue,giantModel.getFatigue());
        }
    }
    @Test
    public void testSetNourishment(){

        for (final Nourishment nourishment:Nourishment.values()){
            giantModel.setNourishment(nourishment);
            assertEquals(nourishment,giantModel.getNourishment());
        }
    }

}