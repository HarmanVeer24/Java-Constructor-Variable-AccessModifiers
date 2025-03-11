public class CarRent {
    // Main method to test the class
    public static void main(String[] args) {
        // Using default constructor
        CarRental defaultRental = new CarRental();
        System.out.println("Default Rental:");
        defaultRental.displayRentalDetails();

        // Using parameterized constructor
        CarRental customRental = new CarRental("Harman", "Mahindra Thar", 3);
        System.out.println("Custom Rental:");
        customRental.displayRentalDetails();
    }
}
// Car Rental System
class CarRental {
    private String customerName;
    private String carModel;
    private int rentalDays;
    private double DAILY_RATE = 500;

    // Default Constructor
    public CarRental() {
        this.customerName = "Default Customer";
        this.carModel = "Normal Car";
        this.rentalDays = 1;
    }

    // Parameterized Constructor
    public CarRental(String customerName, String carModel, int rentalDays) {
        this.customerName = customerName;
        this.carModel = carModel;
        this.rentalDays = rentalDays;
    }

    // Method to calculate total rental cost
    public double calculateTotalCost() {
        return rentalDays * DAILY_RATE;
    }

    // Method to display rental details
    public void displayRentalDetails() {
        System.out.println("Customer Name: " + customerName);
        System.out.println("Car Model: " + carModel);
        System.out.println("Rental Days: " + rentalDays);
        System.out.println("Total Cost: " + calculateTotalCost());
        System.out.println();
    }
}

