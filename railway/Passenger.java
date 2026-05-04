package railway;

import java.util.ArrayList;

public class Passenger extends Person {

	private String passengerID;
	private String password;

	private ArrayList<Ticket> tickets;

	public Passenger(String passengerID, String name,
			String phoneNumber, String password) {
		super(name, phoneNumber, "");
		this.passengerID = passengerID;
		this.password    = password;
		this.tickets     = new ArrayList<Ticket>();
	}


	public void Register(String passengerID, String name,
			String phoneNumber, String password) {
		this.passengerID = passengerID;
		this.password    = password;
		setName(name);
		setPhoneNumber(phoneNumber);
		System.out.println("Passenger registered: " + name + " (ID: " + passengerID + ")");
	}

	public boolean login(String passengerID, String password) {
		if (this.passengerID.equals(passengerID) && this.password.equals(password)) {
			System.out.println("Login successful. Welcome, " + getName());
			return true;
		}
		System.out.println("Login failed — incorrect credentials.");
		return false;
	}

	public void searchTrain(String source, String destination,
			ArrayList<Train> trainList) {
		System.out.println("Searching trains: " + source + " to " + destination);
		boolean found = false;
		for (Train t : trainList) {
			if (t.checkAvailability(source, destination)) {
				found = true;
			}
		}
		if (!found) {
			System.out.println("No trains found for this route.");
		}
	}

	public void bookTrain(String trainID, String seatNumber,
			Train train, double fare) {

		String ticketID  = "TKT-" + passengerID + "-" + System.currentTimeMillis();
		String journeyID = "JRN-" + trainID;

		Ticket ticket = new Ticket(ticketID, passengerID, trainID,
				seatNumber, journeyID, fare);

		ticket.generateTicket(passengerID, trainID, seatNumber, fare);


		train.updateSeats(trainID, seatNumber);

		train.addTicket(ticket);

		tickets.add(ticket);
	}

	public void cancelTrain(String ticketID) {
		for (Ticket t : tickets) {
			if (t.getTicketID().equals(ticketID)) {
				t.cancelTicket(ticketID);
				return;
			}
		}
		System.out.println("Ticket " + ticketID + " not found in your bookings.");
	}

	@Override
	public void display() {
		System.out.println("Passenger : " + getName()
				+ " | ID: " + passengerID
				+ " | Phone: " + getPhoneNumber()
				+ " | Bookings: " + tickets.size());
	}

	public String            getPassengerID() { return passengerID; }
	public ArrayList<Ticket> getTickets()     { return tickets; }

}
