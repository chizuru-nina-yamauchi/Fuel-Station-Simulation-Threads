public class Main {
    public static void main(String[] args){
        // set the numbers for each values
        int initialFuelSupply = 500;
        int numberOfVehicles = 10;

        // create a FuelStation object with initialFuelSupply(500)
        FuelStation fuelStation = new FuelStation(initialFuelSupply);

        // create and start multiple threads for RefuelTask class and LeaveStationTask class
        for(int i = 1; i <= numberOfVehicles; i++){
            Thread refuelThread = new Thread(new RefuelTask(fuelStation, i)); // refuel i vehicles
            refuelThread.start();
            Thread leaveStationThread = new Thread(new LeaveStationTask(i)); // vehicle of index i leaves the fuel station
            leaveStationThread.start();

        }

        //wait for all the threads to finish
        try{
            Thread.sleep(8000); // sleep for 8 seconds to allow threads to finish
        }catch(InterruptedException e){
            e.printStackTrace();
        }

        //print the final fuel supply
        System.out.println("Final fuel supply: " + fuelStation.getCurrentFuelSupply() + " liters.");

    }


}
