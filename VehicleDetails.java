public class VehicleDetails {
    public static void main(String[] args){
        VehicleData vehicle1 = new VehicleData("Harman","Four-wheeler");
        VehicleData vehicle2 = new VehicleData("Aryan","Two-wheeler");
        vehicle1.displayVehicleDetail();
        vehicle2.displayVehicleDetail();
        System.out.println("After updating the registration fee");
        VehicleData.updateVehicleRegistrationFee(200);
        vehicle1.displayVehicleDetail();
        vehicle2.displayVehicleDetail();
    }
}
class VehicleData{
    String OwnerName;
    String VehicleType;
    static int VehicleRegistrationFee = 100;
    //Constructor
    public VehicleData(String OwnerName,String VehicleType){
        this.OwnerName = OwnerName;
        this.VehicleType = VehicleType;
    }

    // Instance method to display course details
    public void displayVehicleDetail() {
        System.out.println("Vehicle Owner Name: " + OwnerName);
        System.out.println("Vehicle Type: " + VehicleType);
        System.out.println("Vehicle registration fee "+VehicleRegistrationFee);
        System.out.println();
    }

    // Class method to update institute name
    public static void updateVehicleRegistrationFee(int NewVehicleRegistrationFee) {
        VehicleRegistrationFee = NewVehicleRegistrationFee;
    }
}
//output
//Vehicle Owner Name: Harman
//Vehicle Type: Four-wheeler
//Vehicle registration fee 100
//
//Vehicle Owner Name: Aryan
//Vehicle Type: Two-wheeler
//Vehicle registration fee 100
//
//After updating the registration fee
//Vehicle Owner Name: Harman
//Vehicle Type: Four-wheeler
//Vehicle registration fee 200
//
//Vehicle Owner Name: Aryan
//Vehicle Type: Two-wheeler
//Vehicle registration fee 200
