import java.util.ArrayList;

public class RentalsDept {
    private ArrayList<Vehicle> vehicles;
    private ArrayList<CustomerSlip> slips;


    public RentalsDept(ArrayList<Vehicle> vehicles, ArrayList<CustomerSlip> slips) {
        this.vehicles = vehicles;
        this.slips = slips;
    }

    public void PrintAllVehicles(){
        for(int i = 0; i < vehicles.size(); i++){
            System.out.println(vehicles.get(i).getModel() + " " + vehicles.get(i).getVin());
        }
    }

    public void AddVehicle(Vehicle vehicle) {
        vehicles.add(vehicle);
    }

    public Vehicle GetVehicle(String vin) {
        System.out.println("Vin entered" + " " + vin);
        for(int i = 0; i < vehicles.size(); i++) {
            if(vehicles.get(i).getVin().equals(vin)) {
                return vehicles.get(i);
            }
        }
        return null;
    }

    public void AddSlip(CustomerSlip slip) {
        slips.add(slip);
    }

    public int HowManySedansOfColor(String color) {
        int count = 0;
        for(int i = 0; i < vehicles.size(); i++) {
            if(vehicles.get(i) instanceof Sedan && vehicles.get(i).getColor().equals(color)) {
                count++;
            }
        }
        return count;
    }
    public int HowManyBakkiesOfColor(String color) {
        int count = 0;
        for(int i = 0; i < vehicles.size(); i++) {
            if(vehicles.get(i) instanceof Bakkie && vehicles.get(i).getColor().equals(color)) {
                count++;
            }
        }
        return count;
    }
    public int HowManyBakkiesinYear(int year) {
        int count = 0;
        for(int i = 0; i < vehicles.size(); i++) {
            if(vehicles.get(i) instanceof Bakkie && vehicles.get(i).getYear() == year) {
                count++;
            }
        }
        return count;
    }




    public String GetBiggestBakkie() {
        //since the first element in the array can be either a bakkie or a sedan, we will have to use the smallest number possible instead of using the first vehicle's volume
        String biggestBakkie = "No Bakkie found";
        double biggestBakkieVolume = Double.NEGATIVE_INFINITY;
        for(int i = 0; i < vehicles.size(); i++) {
            if(vehicles.get(i) instanceof Bakkie && vehicles.get(i).getVolume() > biggestBakkieVolume) {
                biggestBakkie = vehicles.get(i).getModel() + " " +vehicles.get(i).getVin();
                biggestBakkieVolume = vehicles.get(i).getVolume();
            }
        }
        return biggestBakkie;
    }

    public String GetBiggestBoot() {
        //since the first element in the array can be either a bakkie or a sedan, we will have to use the smallest number possible instead of using the first vehicle's volume
        String biggestBoot = "No Sedan found";
        double biggestBootVolume = Double.NEGATIVE_INFINITY;
        for(int i = 0; i < vehicles.size(); i++) {
            if(vehicles.get(i) instanceof Sedan && vehicles.get(i).getVolume() > biggestBootVolume) {
                biggestBoot = vehicles.get(i).getModel() + " " +vehicles.get(i).getVin();
                biggestBootVolume = vehicles.get(i).getVolume();
            }
        }
        return biggestBoot;
    }

    public double GetAverageKilometers() {
        double sum = 0;
        for(int i = 0; i < slips.size(); i++) {
            sum += slips.get(i).GetKilometres();
        }
        return sum / slips.size();
    }

    public double GetAverageHours() {
        double sum = 0;
        for(int i =0; i<slips.size(); i++) {
            sum+=slips.get(i).GetHours();
        }
        return sum / slips.size();
    }

}