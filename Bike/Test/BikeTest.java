import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class BikeTest {

    private Bike bike;

    @BeforeEach
    public void bikeSetUp() {
        bike = new Bike();
    }

    @Test
    public void bikeCanBeTurnedOn() {

        bike.turnOn();
        assertTrue(bike.isOn());
    }

    @Test
    public void bikeCanBe_turnedOff() {
        bike.turnOn();
        bike.turnOff();
        assertFalse(bike.isOn());
    }

    @Test
    public void bikeStarts_atSpeedZero() {
        bike.turnOn();
        assertEquals(0, bike.getSpeed());
    }

    @Test
    public void bikeStarts_inGearOne() {

        bike.turnOn();
        bike.getGear();
        assertEquals(1, bike.getGear());
    }

    @Test
    public void bikeAccelerates_byOne_inGearOne() {
        bike.turnOn();
        bike.accelerate();
        assertEquals(1, bike.getSpeed());
    }
    @Test
    public void bikeAccelerates_byTwo_inGearTwo() {

        bike.turnOn();
        for(int count = 0; count < 21; count++) {
            bike.accelerate();
        }
        assertEquals(2, bike.getGear());
        bike.accelerate();
        assertEquals(23, bike.getSpeed());
    }
    @Test
    public void bikeAccelerates_byThree_inGearThree(){

        bike.turnOn();

        while(bike.getSpeed() < 31){
            bike.accelerate();
        }
        assertEquals(3, bike.getGear());
        bike.accelerate();
        assertEquals(34, bike.getSpeed());
    }
    @Test
    public void bikeAccelerates_byFour_inGearFour(){

        bike.turnOn();

        while(bike.getSpeed() < 41){
            bike.accelerate();
        }
        assertEquals(43, bike.getSpeed());
        assertEquals(4, bike.getGear());
        bike.accelerate();
        assertEquals(47, bike.getSpeed());
    }
    @Test
    public void bikeDecelerates_byOne_inGearOne() {
        bike.turnOn();

        bike.accelerate();
        bike.accelerate();
        bike.accelerate();

        bike.decelerate();

        assertEquals(2, bike.getSpeed());
    }
    @Test
    public void bikeChanges_toGearTwo_whenSpeedPasses20() {
        bike.turnOn();

        while(bike.getSpeed() <= 20) {
            bike.accelerate();
        }
        assertEquals(2, bike.getGear());
        assertEquals(21, bike.getSpeed());
    }
    @Test
    public void bikeChanges_toGearThree_whenSpeedPasses30(){

        bike.turnOn();

        while(bike.getSpeed() <= 30) {
            bike.accelerate();
        }
        assertEquals(3, bike.getGear());
        assertEquals(31, bike.getSpeed());
    }
    @Test
    public void bikeChanges_toGearFour_whenSpeedPasses40(){

        bike.turnOn();

        while(bike.getSpeed() <= 40){
            bike.accelerate();
        }
        assertEquals(4, bike.getGear());
        assertEquals(43, bike.getSpeed());
    }
    @Test
    public void bikeCannot_haveNegativeSpeed() {

        bike.turnOn();
        bike.decelerate();
        assertEquals(0, bike.getSpeed());
    }
}
