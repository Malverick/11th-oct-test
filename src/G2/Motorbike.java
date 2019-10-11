package G2;

public class Motorbike extends Vehicle {

	public Motorbike(String colour) {
		this.setWheelCount(2);
		this.setDoorCount(0);
		this.setColour(colour);
		this.cost();
	}
	@Override
	public void sound() {
		System.out.println("Wooosh");
	}
	@Override
	public String toString() {
		return "Motorbike [Wheel count " + getWheelCount() + " with doors numbering " + getDoorCount() + " and of colour "
				+ getColour() + " and of cost " + cost() + "]" ;

}
}