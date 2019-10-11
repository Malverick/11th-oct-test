package G2;

public class Truck extends Vehicle {

	public Truck(String colour) {
		this.setColour(colour);
		this.setDoorCount(2);
		this.setWheelCount(6);
		this.cost();
	}
	@Override
	public void sound() {
		System.out.println("Rumble");
	}
	@Override
	public String toString() {
		return "Truck [Wheel count " + getWheelCount() + " with doors numbering " + getDoorCount() + " and of colour "
				+ getColour() +  " and of cost " + cost() + "]";
	}
}
