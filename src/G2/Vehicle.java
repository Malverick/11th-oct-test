package G2;

abstract public class Vehicle {
	private int wheelCount;
	private int doorCount;
	private String colour;
	private int cost;
	

	public void sound() {
		System.out.println("Generic Sound");
	}
	public int cost() {
		cost = 1000 * doorCount + 2000 * wheelCount;
		return cost;
	}
	
	public void crash() {
		System.out.println("Crunch");
	}
	
	@Override
	public String toString() {
		return "Vehicle [Wheel count " + wheelCount + " with doors numbering " + doorCount + " and of colour " + colour + "]";
	}
	public int getDoorCount() {
		return doorCount;
	}

	public void setDoorCount(int doorCount) {
		this.doorCount = doorCount;
	}

	public String getColour() {
		return colour;
	}

	public void setColour(String colour) {
		this.colour = colour;
	}

	public void vehiclesMain(){
		System.out.println("This is a vehicle");
		System.out.println("The vehicle has " + wheelCount + " Wheels.");
	}

	public int getWheelCount() {
		return wheelCount;
	}

	public void setWheelCount(int wheelCount) {
		this.wheelCount = wheelCount;
	}
	
	
	
}
