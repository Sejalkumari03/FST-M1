package Activities;

public class Car {
	
	String color;
	String transmission;
	int make;
	int tyres;
	int doors;
	
	//Constructor
	Car(){
		tyres=4;
		doors=4;
	}
	public void displayCharacteristics(){
		System.out.println("Color of the car: " +color);
		System.out.println("Make of the car: " +make);
		System.out.println("Transmission of the car: " +transmission);
		System.out.println("No of the tyres in the car: " +tyres);
		System.out.println("No of the doors in the car: " +tyres);
	}
	public void accelarate(){
		
		System.out.println("Car is moving forward.");
	}
	public void brake(){
		System.out.println("Car has stopped.");
	}

}
