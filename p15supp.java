class Airplane {
    private String flightNumber;
    private String destination;
    private String departureTime;

    // Constructor to initialize the attributes
    public Airplane(String flightNumber, String destination, String departureTime) {
        this.flightNumber = flightNumber;
        this.destination = destination;
        this.departureTime = departureTime;
    }

    // Method to check flight status (a glimpse into the future)
    public void checkFlightStatus() {
        System.out.println("Flight " + flightNumber + " to " + destination + " is on schedule.");
    }

    // Method to delay the flight (for those unpredictable cosmic disturbances)
    public void delayFlight() {
        System.out.println("Flight " + flightNumber + " is experiencing a slight delay.");
    }

    // Admin method to update flight details
    public void updateFlightDetails(String newFlightNumber, String newDestination, String newDepartureTime) {
        this.flightNumber = newFlightNumber;
        this.destination = newDestination;
        this.departureTime = newDepartureTime;
        System.out.println("Flight details updated successfully!");
    }

    // User method to view flight details
    public void viewFlightDetails() {
        System.out.println("Flight " + flightNumber + " to " + destination + " departs at " + departureTime);
    }

    public static void main(String[] args) {
        // Example usage
        Airplane myFlight = new Airplane("AI123", "New York", "10:00 AM");
        myFlight.viewFlightDetails();
        myFlight.checkFlightStatus();
        myFlight.delayFlight();
        // Admin update
        myFlight.updateFlightDetails("AI456", "London", "11:30 AM");
        myFlight.viewFlightDetails();
    }
}
