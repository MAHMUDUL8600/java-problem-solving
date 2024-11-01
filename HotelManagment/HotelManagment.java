public class Hotel {
    private String hotelName;
    private double pricePerDay;

    public Hotel(String hotelName, double pricePerDay) {
        this.hotelName = hotelName;
        this.pricePerDay = pricePerDay;
    }

    public String getHotelName() {
        return hotelName;
    }

    public double getPricePerDay() {
        return pricePerDay;
    }

    public static void displayHotels(String spot) {
        switch (spot.toLowerCase()) {
            case "kuakata":
                System.out.println("Hotels in Kuakata:");
                System.out.println("1. Hotel Graver Inn International - 1000/- per day");
                System.out.println("2. Sikder Resort & Villas - 1000/- per day");
                System.out.println("3. Hotel Nilanjona - 1000/- per day");
                break;
            case "cox's bazar":
                System.out.println("Hotels in Cox's Bazar:");
                System.out.println("1. Hotel Sea Uttara - 1500/- per day");
                System.out.println("2. Long Beach Hotel - 1500/- per day");
                System.out.println("3. Hotel Sea Moon - 1500/- per day");
                break;
            case "sylhet":
                System.out.println("Hotels in Sylhet:");
                System.out.println("1. Hotel Mira Garden - 2000/- per day");
                System.out.println("2. Hotel Supreme - 2000/- per day");
                System.out.println("3. Hotel Rose View - 2000/- per day");
                break;
        }
    }
}
