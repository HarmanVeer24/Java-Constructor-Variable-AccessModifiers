class HotelBook{
    public static void main(String[] args) {
        // Using the default constructor
        HotelBooking defaultBooking = new HotelBooking();
        System.out.println("Default Booking:");
        defaultBooking.displayBookingDetails();

        // Using the parameterized constructor
        HotelBooking customBooking = new HotelBooking("Harman Veer Singh", "Premium", 2);
        System.out.println("Custom Booking:");
        customBooking.displayBookingDetails();

        // Using the copy constructor
        HotelBooking copiedBooking = new HotelBooking(customBooking);
        System.out.println("Copied Booking:");
        copiedBooking.displayBookingDetails();
    }
}
//defining the HotelBooking class
class HotelBooking {
    String HotelGuestName;
    String HotelRoomType;
    int nights;

    // Default Constructor
    public HotelBooking() {
        this.HotelGuestName = "Unknown Guest";
        this.HotelRoomType = "Standard";
        this.nights = 1;
    }

    // Parameterized Constructor
    public HotelBooking(String HotelGuestName, String HotelRoomType, int nights) {
        this.HotelGuestName = HotelGuestName;
        this.HotelRoomType = HotelRoomType;
        this.nights = nights;
    }

    // Copy Constructor
    public HotelBooking(HotelBooking otherBooking) {
        this.HotelGuestName = otherBooking.HotelGuestName;
        this.HotelRoomType = otherBooking.HotelRoomType;
        this.nights = otherBooking.nights;
    }

    // Method to display booking details
    public void displayBookingDetails() {
        System.out.println("Guest Name: " + HotelGuestName);
        System.out.println("Room Type: " + HotelRoomType);
        System.out.println("Nights: " + nights);
        System.out.println();
    }
}
//output
//Default Booking:
//Guest Name: Unknown Guest
//Room Type: Standard
//Nights: 1
//
//Custom Booking:
//Guest Name: Harman Veer Singh
//Room Type: Premium
//Nights: 2
//
//Copied Booking:
//Guest Name: Harman Veer Singh
//Room Type: Premium
//Nights: 2
