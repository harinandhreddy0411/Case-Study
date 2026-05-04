package railway;

public class Ticket {

	private String ticketID;
	private String passengerID;
	private String trainID;
	private String seatNumber;
	private String journeyID;
	private double fare;
	private String bookingStatus;

	public Ticket(String ticketID, String passengerID, String trainID,
			String seatNumber, String journeyID, double fare) {
		this.ticketID      = ticketID;
		this.passengerID   = passengerID;
		this.trainID       = trainID;
		this.seatNumber    = seatNumber;
		this.journeyID     = journeyID;
		this.fare          = fare;
		this.bookingStatus = "CONFIRMED";
	}

	public void generateTicket(String passengerID, String trainID,
			String seatNumber, double fare) {
		this.passengerID   = passengerID;
		this.trainID       = trainID;
		this.seatNumber    = seatNumber;
		this.fare          = fare;
		this.bookingStatus = "CONFIRMED";
		System.out.println("Ticket generated: " + ticketID);
		displayTicket();
	}

	public void displayTicket() {
		System.out.println("---------- TICKET ----------");
		System.out.println("Ticket ID    : " + ticketID);
		System.out.println("Passenger ID : " + passengerID);
		System.out.println("Train ID     : " + trainID);
		System.out.println("Seat         : " + seatNumber);
		System.out.println("Journey ID   : " + journeyID);
		System.out.println("Fare         : Rs." + fare);
		System.out.println("Status       : " + bookingStatus);
		System.out.println("----------------------------");
	}

	public void cancelTicket(String ticketID) {
		if (this.ticketID.equals(ticketID)) {
			this.bookingStatus = "CANCELLED";
			System.out.println("Ticket " + ticketID + " cancelled.");
		} else {
			System.out.println("Ticket ID " + ticketID + " not found.");
		}
	}

	public String getTicketID()      { return ticketID; }
	public String getPassengerID()   { return passengerID; }
	public String getTrainID()       { return trainID; }
	public String getSeatNumber()    { return seatNumber; }
	public String getJourneyID()     { return journeyID; }
	public double getFare()          { return fare; }
	public String getBookingStatus() { return bookingStatus; }

	public void setBookingStatus(String bookingStatus) {
		this.bookingStatus = bookingStatus;
	}

}
