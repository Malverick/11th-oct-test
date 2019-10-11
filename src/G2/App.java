package G2;

import java.util.Scanner;

public class App {
	public static void main(String[] args) {

		Vehicle car1 = new Car("Blue");
		Vehicle bike1 = new Motorbike("Silver");
		Vehicle truck1 = new Truck("yellow");

		Garage myGarage = new Garage();

		myGarage.addVehicle(car1);
		myGarage.addVehicle(bike1);
		myGarage.addVehicle(truck1);

		for (Vehicle v : myGarage.getVehicles()) {
			System.out.println(v);

		}
//		while (true) {
//
//			System.out.println("Would you like to perform another operation?");
//			Scanner scProceed = new Scanner(System.in);
//			String proceed = scProceed.nextLine();
//			if (proceed.equals("yes")) {
//
//				System.out.println("restarting");
//			} else {
//				System.out.println("Shutting Down");
//				break;
//			}
//		}
		System.out.println("\n");
		System.out.println("What would you like to do?");
		System.out.println("Type 'add' to add a vehicle.");
		System.out.println("Type 'remove' to remove a vehicle.");
		System.out.println("Type 'clear' to clear vehicles.");
		Scanner sc = new Scanner(System.in);
		String userOperation = sc.nextLine();
		switch (userOperation) {
		case "add":
			System.out.println("Which type of vehicle would you like to add?");
			System.out.println("Type 'motorbike', 'car' or 'truck.'");
			String userAVehicle = sc.nextLine();
			switch (userAVehicle) {
			case "motorbike":
				System.out.println("Enter the colour of the motorbike.");
				String newM = sc.nextLine();

				Vehicle gMotorbike = new Motorbike(newM);
				myGarage.addVehicle(gMotorbike);
				break;
			case "car":
				System.out.println("Enter the colour of the car.");
				String newC = sc.nextLine();

				Vehicle gCar = new Car(newC);
				myGarage.addVehicle(gCar);
				break;
			case "truck":
				System.out.println("Enter the colour of the truck.");
				String newT = sc.nextLine();

				Vehicle gTruck = new Truck(newT);
				myGarage.addVehicle(gTruck);
				break;
			}
			break;

		case "remove":
			System.out.println("enter an id, you hoser");
			int id = Integer.parseInt(sc.nextLine());
			myGarage.delVehicle(id);
			break;
		case "Clear":
			myGarage.clearVehicles();
			break;
		default:
			System.out.println("Invalid input.");
		}
		sc.close();
		int count = 0;
		for (Vehicle v : myGarage.getVehicles()) {
			System.out.println("Garage slot " + count + " Contains.");
			System.out.println(v);
			count++;

		}
	}
}
