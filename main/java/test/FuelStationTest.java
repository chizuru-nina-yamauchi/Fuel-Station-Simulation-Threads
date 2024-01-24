import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FuelStationTest {

    @Test
    void refuelWithSufficientFuel_SuccessRefuel() {
        FuelStation fuelStation = new FuelStation(100); // fuelSupply is 100
        int vehicleNumber = 1; // vehicle's number is just 1
        int refuelAmount = 30;// the amount to refuel is 30

        assertDoesNotThrow(() -> fuelStation.refuel(refuelAmount,vehicleNumber));

        assertEquals(70, fuelStation.getCurrentFuelSupply()); // initial fuel supply is 100 liters and now used 30 liters.
    }
}