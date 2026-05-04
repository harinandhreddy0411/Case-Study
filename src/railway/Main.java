package railway;

import java.util.ArrayList;

public class Main {

	private static ArrayList<Train> trainList = new ArrayList<Train>();

		public static void startSystem() {
		System.out.println("=== Railway Reservation System Started ===\n");

		Train t1 = new Train("TR001", "Rajdhani Express",
				"Chennai", "Mumbai", "06:00", "20:00", 5);
		trainList.add(t1);
	}

	public static void handleBookings() {

		System.out.println("--- Registration & Login ---");

		Passenger passenger = new Passenger("P001", "Arjun Kumar",
				"9876543210", "pass123");
		passenger.Register("P001", "Arjun Kumar", "9876543210", "pass123");


		boolean loggedIn = passenger.login("P001", "pass123");
		if (!loggedIn) {
			return;
		}

		System.out.println("\n--- Search & Book ---");


		passenger.searchTrain("Chennai", "Mumbai", trainList);


		if (!trainList.isEmpty()) {
			Train selected = trainList.get(0);
			passenger.bookTrain(selected.getTrainID(), "S1-12", selected, 450.00);
		}
	}

	public static void handleCancellations(Passenger passenger, String ticketID) {

		System.out.println("\n--- Cancellation ---");

		passenger.cancelTrain(ticketID);
	}

	public static void main(String[] args) {

		startSystem();

		System.out.println("--- Admin: Add Train ---");

		Admin admin = new Admin("A001", "Meena Sharma",
				"admin@railway.com", "adminpass");
		admin.display();

		admin.addTrain(
				"TR002", "Shatabdi Express",
				"Delhi", "Bangalore",
				"07:00", "22:00", 8,
				trainList);

		admin.updateSchedule("TR001", "07:30", "21:00", trainList);

		System.out.println();

		handleBookings();

		System.out.println("\n--- Cancellation Demo ---");

		Passenger p2 = new Passenger("P002", "Riya Thomas",
				"9123456780", "riya2024");
		p2.Register("P002", "Riya Thomas", "9123456780", "riya2024");
		p2.login("P002", "riya2024");

		if (!trainList.isEmpty()) {
			Train t = trainList.get(0);
			p2.bookTrain(t.getTrainID(), "S2-05", t, 450.00);

			String ticketToCancel = p2.getTickets().get(0).getTicketID();
			handleCancellations(p2, ticketToCancel);
		}

		System.out.println("\n=== Railway Reservation System Ended ===");
	}

}
