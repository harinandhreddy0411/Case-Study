package railway;

import java.util.ArrayList;

public class Train {

	private String trainID;
	private String trainName;
	private String sourceStation;
	private String destination;
	private String departureTime;
	private String arrivalTime;
	private int    availableSeats;

	private ArrayList<Ticket> tickets;

	public Train(String trainID, String trainName, String sourceStation,
			String destination, String departureTime,
			String arrivalTime, int availableSeats) {
		this.trainID        = trainID;
		this.trainName      = trainName;
		this.sourceStation  = sourceStation;
		this.destination    = destination;
		this.departureTime  = departureTime;
		this.arrivalTime    = arrivalTime;
		this.availableSeats = availableSeats;
		this.tickets        = new ArrayList<Ticket>();
	}

	public boolean checkAvailability(String source, String destination) {
		if (this.sourceStation.equalsIgnoreCase(source)
				&& this.destination.equalsIgnoreCase(destination)
				&& this.availableSeats > 0) {
			System.out.println("  [" + trainName + "] " + source
					+ " to " + destination
					+ " | Seats available: " + availableSeats);
			return true;
		}
		return false;
	}

	public void updateSeats(String trainID, String seatNumber) {
		if (this.trainID.equals(trainID) && availableSeats > 0) {
			availableSeats--;
			System.out.println("Seat " + seatNumber + " reserved on "
					+ trainName + ". Remaining seats: " + availableSeats);
		} else {
			System.out.println("No seats available on " + trainName);
		}
	}


	public void addTicket(Ticket ticket) {
		tickets.add(ticket);
	}

	public void getSchedule() {
		System.out.println("  " + trainID + " | " + trainName
				+ " | " + sourceStation + " to " + destination
				+ " | Dep: " + departureTime
				+ " | Arr: " + arrivalTime
				+ " | Seats: " + availableSeats);
	}

	public String            getTrainID()        { return trainID; }
	public String            getTrainName()      { return trainName; }
	public String            getSourceStation()  { return sourceStation; }
	public String            getDestination()    { return destination; }
	public String            getDepartureTime()  { return departureTime; }
	public String            getArrivalTime()    { return arrivalTime; }
	public int               getAvailableSeats() { return availableSeats; }
	public ArrayList<Ticket> getTickets()        { return tickets; }

	public void setTrainName(String trainName)         { this.trainName = trainName; }
	public void setSourceStation(String sourceStation) { this.sourceStation = sourceStation; }
	public void setDestination(String destination)     { this.destination = destination; }
	public void setDepartureTime(String departureTime) { this.departureTime = departureTime; }
	public void setArrivalTime(String arrivalTime)     { this.arrivalTime = arrivalTime; }
	public void setAvailableSeats(int availableSeats)  { this.availableSeats = availableSeats; }

}
