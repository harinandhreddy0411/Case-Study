package railway;

import java.util.ArrayList;

public class Admin extends Person {
	private String adminID;
	private String password;

	public Admin(String adminID, String name,
			String email, String password) {
		super(name, "", email);
		this.adminID  = adminID;
		this.password = password;
	}


	public boolean login(String adminID, String password) {
		if (this.adminID.equals(adminID) && this.password.equals(password)) {
			System.out.println("Admin login successful. Welcome, " + getName());
			return true;
		}
		System.out.println("Admin login failed.");
		return false;
	}


	public void addTrain(String trainID,
			String trainName,
			String sourceStation,
			String destination,
			String departureTime,
			String arrivalTime,
			int    availableSeats,
			ArrayList<Train> trainList) {

		Train newTrain = new Train(trainID, trainName, sourceStation,
				destination, departureTime, arrivalTime, availableSeats);
		trainList.add(newTrain);
		System.out.println("Train added: " + trainName + " (ID: " + trainID + ")");
		newTrain.getSchedule();
	}

	public void updateTrain(String trainID, String newTrainName,
			ArrayList<Train> trainList) {
		for (Train t : trainList) {
			if (t.getTrainID().equals(trainID)) {
				t.setTrainName(newTrainName);
				System.out.println("Train " + trainID + " renamed to: " + newTrainName);
				return;
			}
		}
		System.out.println("Train " + trainID + " not found.");
	}

	public void deleteTrain(String trainID, ArrayList<Train> trainList) {
		trainList.removeIf(t -> t.getTrainID().equals(trainID));
		System.out.println("Train " + trainID + " deleted.");
	}


	public void updateSchedule(String trainID, String newDeparture,
			String newArrival, ArrayList<Train> trainList) {
		for (Train t : trainList) {
			if (t.getTrainID().equals(trainID)) {
				t.setDepartureTime(newDeparture);
				t.setArrivalTime(newArrival);
				System.out.println("Schedule updated for Train " + trainID);
				return;
			}
		}
		System.out.println("Train " + trainID + " not found.");
	}

	@Override
	public void display() {
		System.out.println("Admin : " + getName()
				+ " | ID: " + adminID
				+ " | Email: " + getEmail());
	}

	public String getAdminID() { return adminID; }

}
