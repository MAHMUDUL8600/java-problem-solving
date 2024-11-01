import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Create space for 20 users
        UserRegister[] users = new UserRegister[20];
        int userCount = 0;

        // User Registration
        System.out.print("Register Username: ");
        String username = scanner.next();
        System.out.print("Register Password: ");
        String password = scanner.next();
        users[userCount++] = new UserRegister(username, password);

        // User Sign-In
        System.out.print("Sign in Username: ");
        username = scanner.next();
        System.out.print("Sign in Password: ");
        password = scanner.next();

        if (UserSignIn.signIn(username, password, users)) {
            // Select Spot
            Spot.displaySpots();
            System.out.print("Select Spot (Enter name): ");
            String selectedSpot = scanner.next();

            // Select Hotel
            Hotel.displayHotels(selectedSpot);
            System.out.print("Select Hotel: ");
            String selectedHotel = scanner.next();
            double hotelCost = (selectedSpot.equalsIgnoreCase("kuakata")) ? 1000 :
                    (selectedSpot.equalsIgnoreCase("cox's bazar")) ? 1500 : 2000;

            // Select Food
            Food.displayMenu();
            System.out.print("Select Food: ");
            String selectedFood = scanner.next();
            double foodCost = (selectedFood.equalsIgnoreCase("rice and vegetable")) ? 300 :
                    (selectedFood.equalsIgnoreCase("rice and chicken")) ? 400 : 500;

            // Select Transport
            Paribahan.displayTransport(selectedSpot);
            System.out.print("Select Transport: ");
            String selectedTransport = scanner.next();
            double transportCost = (selectedSpot.equalsIgnoreCase("kuakata")) ? 1000 :
                    (selectedSpot.equalsIgnoreCase("cox's bazar")) ? 1500 : 2000;

            // Select Place of Interest
            PlaceOfInterest.displayPlaces(selectedSpot);
            System.out.print("Select Place of Interest: ");
            String selectedPlaceOfInterest = scanner.next();
            double placeCost = (selectedSpot.equalsIgnoreCase("kuakata")) ? 200 :
                    (selectedSpot.equalsIgnoreCase("cox's bazar")) ? 300 : 400;

            // Calculate Total Cost
            double totalCost = hotelCost + foodCost + transportCost + placeCost;
            Booking booking = new Booking(selectedSpot, selectedHotel, selectedFood, selectedTransport, selectedPlaceOfInterest, totalCost);
            booking.displayBooking();

            // Payment
            System.out.print("Select Payment Method (1. Bkash 2. Nagad): ");
            int paymentMethod = scanner.nextInt();
            Payment payment = (paymentMethod == 1) ? new BkashPayment() : new NagadPayment();
            payment.processPayment(totalCost);
        }
    }
}
