package software.daveturner.samples.puzzles;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ParkingSystemTest {

    ParkingSystem system;

    @Test
    public void ensureBoundariesAreProtected() {
        system = new ParkingSystem(0,0,0);
        assertFalse(system.addCar(-1));
        assertFalse(system.addCar(122));
    }

    @Test
    public void ensureInitializedToZeroReturnsExpected() {
        system = new ParkingSystem(0,0,0);
        assertFalse(system.addCar(1));
        assertFalse(system.addCar(2));
        assertFalse(system.addCar(3));
    }

    @Test
    public void ensureBasicScenario() {
        system = new ParkingSystem(2,0,0);
        assertTrue(system.addCar(1));
        assertTrue(system.addCar(1));
        assertFalse(system.addCar(1));
    }

    @Test
    public void ensureAdvancedScenario() {
        system = new ParkingSystem(2,2,2);
        assertTrue(system.addCar(1));
        assertTrue(system.addCar(1));
        assertTrue(system.addCar(2));
        assertTrue(system.addCar(2));
        assertFalse(system.addCar(1));
        assertTrue(system.addCar(3));
        assertTrue(system.addCar(3));
        assertFalse(system.addCar(2));
        assertFalse(system.addCar(3));
        assertFalse(system.addCar(2));
        assertFalse(system.addCar(3));
    }

}