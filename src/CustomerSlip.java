public class CustomerSlip 
{
    //Class Attributes
    private String customerName;
    private String vin;
    private int hours;
    private double kilometres;
    private long slipNo;

    // CustomerSlip Class Constructor
    public CustomerSlip(String customerName, String vin, int hours, double kilometres, long slipNo) {
        this.customerName = customerName;
        this.vin = vin;
        this.hours = hours;
        this.kilometres = kilometres;
        this.slipNo = slipNo;
    }
    
    //Get Methods to return value of private atrributes
    public long GetSlipNo(){return slipNo;}
    public int GetHours() {return hours;}
    public double GetKilometres() {return kilometres;}
}