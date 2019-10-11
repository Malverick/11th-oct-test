package G2;

import java.util.ArrayList;
import java.util.List;

public class Garage {
	private List<Vehicle> vehicles = new ArrayList<>();

	public void addVehicle(Vehicle vehicle) {
		this.vehicles.add(vehicle);
	}

	public List<Vehicle> getVehicles() {
		return this.vehicles;
	}

	public void delVehicle(int id) {
		this.vehicles.remove(id);
	}

	public void delVehicle(Vehicle vehicle) {
		this.vehicles.remove(vehicle);
	}

	public void clearVehicles() {
		this.vehicles.removeAll(vehicles);
	}
}
