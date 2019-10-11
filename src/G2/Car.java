package G2;

public class Car extends Vehicle {
	
	@Override
	public void sound() {
		System.out.println("Vrum Vrum");
	}
	
	public Car(String colour) {
		super();
		this.setWheelCount(4);
		this.setDoorCount(5);
		this.setColour(colour);
		this.cost();

	}
	

	@Override
	public String toString() {
		return "Car [Wheel count " + getWheelCount() + " with doors numbering " + getDoorCount() + " and of colour "
				+ getColour() + " and of cost " + cost() +  "]" ;
	}
}
