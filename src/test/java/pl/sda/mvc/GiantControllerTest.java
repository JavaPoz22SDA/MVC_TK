package pl.sda.mvc;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

import static org.junit.jupiter.api.Assertions.*;

class GiantControllerTest {

    private GiantModel giantModel;
    private GiantController giantController;
    private GiantView giantView;

    @BeforeEach
    public void setUp() {
        System.out.println("Przed");
        giantModel = Mockito.mock(GiantModel.class);
        giantView = Mockito.mock(GiantView.class);
        giantController = new GiantController(giantModel, giantView);
    }

    @Test
    public void testSetHealth() {
        //Mockito.verify(giantModel,Mockito.times(0));

        for (final Health health: Health.values()){
            giantController.setHealth(health);
            Mockito.verify(giantModel,Mockito.times(1)).setHealth(health);
        }

        giantController.getHealth();
        Mockito.verify(giantModel).getHealth();
    }

    @Test
    public void testSetFatigue() {
        giantController.setHealth(Health.HEALTHY);
        Mockito.when(giantController.getHealth()).thenReturn(Health.HEALTHY);
        assertEquals(Health.HEALTHY, giantController.getHealth());
    }
}