public class LeaveStationTask implements Runnable {
   // attributes
    private int vehicleNumber;

    // constructor
    public LeaveStationTask(int vehicleNumber){
        this.vehicleNumber = vehicleNumber;
    }

    @Override
    public void run(){
        // printing vehicle leaving the fuel station
        System.out.println("Vehicle " + vehicleNumber + " left the fuel station.");
    }


}
