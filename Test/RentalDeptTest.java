import org.junit.Test;

import static org.junit.Assert.*;

public class RentalsDeptTest {

    @Test
    public void AddVehicleTest(){
        RentalsDept rentalsDept = new RentalsDept();
        Sedan sedan = new Sedan("blue", "kr234fep9", "Subaru BRZ", 2020, 20);
        rentalsDept.AddVehicle(sedan);
        Vehicle newVehicle = rentalsDept.GetVehicle("kr234fep9");
        assert(newVehicle.getModel() == "Subaru BRZ");
    }

    @Test
    public void AddSlipTest(){
        RentalsDept rentalsDept = new RentalsDept();
        CustomerSlip slip = new CustomerSlip("Benjamen Salomo", "kr234fep9", 20, 200,203);
        rentalsDept.AddSlip(slip);
        double average = rentalsDept.GetAverageHours();
        assert(average == 20);
    }

    @Test
    public void HowManySedansOfColorTest(){
        Sedan sedan = new Sedan("blue", "kr234fep9", "Subaru BRZ", 2020, 20);
        Sedan sedan2 = new Sedan("blue", "kr2suhius", "VW Jetta", 2021, 20);
        Bakkie bakkie = new Bakkie("blue", "oijoi2676", "Toyota Hilux", 2015, 400);
        Bakkie bakkie2 = new Bakkie("blue", "oijoiu76", "VW Amarok", 2016, 500);
        RentalsDept rentalsDept = new RentalsDept();
        rentalsDept.AddVehicle(sedan);
        rentalsDept.AddVehicle(sedan2);
        rentalsDept.AddVehicle(bakkie);
        rentalsDept.AddVehicle(bakkie2);
        int howMany = rentalsDept.HowManySedansOfColor("blue");
        assert(howMany == 2);
    }

    @Test
    public void HowManyBakkiesOfColorTest(){
        Sedan sedan = new Sedan("silver", "kr234fep9", "Subaru BRZ", 2020, 20);
        Sedan sedan2 = new Sedan("silver", "kr2suhius", "VW Jetta", 2021, 20);
        Bakkie bakkie = new Bakkie("silver", "oijoi2676", "Toyota Hilux", 2015, 400);
        Bakkie bakkie2 = new Bakkie("silver", "oijoiu76", "VW Amarok", 2016, 500);
        RentalsDept rentalsDept = new RentalsDept();
        rentalsDept.AddVehicle(sedan);
        rentalsDept.AddVehicle(sedan2);
        rentalsDept.AddVehicle(bakkie);
        rentalsDept.AddVehicle(bakkie2);
        int howMany = rentalsDept.HowManyBakkiesOfColor("silver");
        assert(howMany == 2);
    }

    @Test
    public void HowManyBakkiesInYearTest(){
        Sedan sedan = new Sedan("blue", "kr234fep9", "Subaru BRZ", 2020, 20);
        Sedan sedan2 = new Sedan("blue", "kr2suhius", "VW Jetta", 2020, 20);
        Bakkie bakkie = new Bakkie("silver", "oijoi2676", "Toyota Hilux", 2020, 400);
        Bakkie bakkie2 = new Bakkie("silver", "oijoiu76", "VW Amarok", 2020, 500);
        RentalsDept rentalsDept = new RentalsDept();
        rentalsDept.AddVehicle(sedan);
        rentalsDept.AddVehicle(sedan2);
        rentalsDept.AddVehicle(bakkie);
        rentalsDept.AddVehicle(bakkie2);
        int howManyIn2020 = rentalsDept.HowManyBakkiesinYear(2020);
        assert(howManyIn2020 == 2);
    }

    @Test
    public void BiggestBakkieTest(){
        Sedan sedan = new Sedan("blue", "kr234fep9", "Subaru BRZ", 2020, 20);
        Sedan sedan2 = new Sedan("blue", "kr2suhius", "VW Jetta", 2020, 30);
        Bakkie bakkie = new Bakkie("silver", "oijoi2676", "Toyota Hilux", 2020, 400);
        Bakkie bakkie2 = new Bakkie("silver", "oijoiu76", "VW Amarok", 2020, 500);
        RentalsDept rentalsDept = new RentalsDept();
        rentalsDept.AddVehicle(sedan);
        rentalsDept.AddVehicle(sedan2);
        rentalsDept.AddVehicle(bakkie);
        rentalsDept.AddVehicle(bakkie2);
        String biggestBakkie = rentalsDept.GetBiggestBakkie();
        assertEquals(biggestBakkie, "VW Amarok oijoiu76");
    }

    @Test
    public void BiggestBootTest(){
        Sedan sedan = new Sedan("blue", "kr234fep9", "Subaru BRZ", 2020, 20);
        Sedan sedan2 = new Sedan("blue", "kr2suhius", "VW Jetta", 2020, 30);
        Bakkie bakkie = new Bakkie("silver", "oijoi2676", "Toyota Hilux", 2020, 400);
        Bakkie bakkie2 = new Bakkie("silver", "oijoiu76", "VW Amarok", 2020, 500);
        RentalsDept rentalsDept = new RentalsDept();
        rentalsDept.AddVehicle(sedan);
        rentalsDept.AddVehicle(sedan2);
        rentalsDept.AddVehicle(bakkie);
        rentalsDept.AddVehicle(bakkie2);
        String biggestBoot = rentalsDept.GetBiggestBoot();
        assertEquals(biggestBoot, "VW Jetta kr2suhius");
    }
    public static double roundOff(double value, int places) {
        double scale = Math.pow(10, places);
        return Math.round(value * scale) / scale;
    }

    @Test
    public void GetAverageKilometersTest(){
        RentalsDept rentalsDept = new RentalsDept();
        CustomerSlip slip = new CustomerSlip("Benjamen Salomo", "kr234fep9", 20, 200,203);
        CustomerSlip slip2 = new CustomerSlip("Douglas Mashonganyika", "kj24mmio45", 30, 300,204);
        CustomerSlip slip3 = new CustomerSlip("Gabriel Ndimulunde", "kj24mkli38", 40, 350,205);
        rentalsDept.AddSlip(slip);
        rentalsDept.AddSlip(slip2);
        rentalsDept.AddSlip(slip3);
        double average = rentalsDept.GetAverageKilometers();
        assert(283.33 ==  roundOff(average,2));
    }

    @Test
    public void GetAverageHoursTest(){
        RentalsDept rentalsDept = new RentalsDept();
        CustomerSlip slip = new CustomerSlip("Benjamen Salomo", "kr234fep9", 20, 200,203);
        CustomerSlip slip2 = new CustomerSlip("Douglas Mashonganyika", "kj24mmio45", 30, 300,204);
        CustomerSlip slip3 = new CustomerSlip("Gabriel Ndimulunde", "kj24mkli38", 40, 350,205);
        rentalsDept.AddSlip(slip);
        rentalsDept.AddSlip(slip2);
        rentalsDept.AddSlip(slip3);
        assert(30 ==  rentalsDept.GetAverageHours());
    }


    
    @Test
    public void GetCarsWithTwoAs(){
        Bakkie bakkie = new Bakkie("silver", "oijoi2676", "Toyota Corolla", 2020, 400);
        Bakkie bakkie2 = new Bakkie("silver", "oijoiu76", "VW Amarok", 2020, 500);
        RentalsDept rentalsDept = new RentalsDept();
        rentalsDept.AddVehicle(bakkie);
        rentalsDept.AddVehicle(bakkie2);
        ArrayList<String> expectedVehicles = new ArrayList<String>();
        expectedVehicles.add("Toyota Corolla");
        expectedVehicles.add("VW Amarok");
        assertEquals(expectedVehicles, rentalsDept.GetCarsWithTwoAs());
    }
}
