package SavingsAccount;

public class CarMain {
	
	    public static void main(String[] args) {
	        Toyota toyota = new Toyota(500, 500, "red", 30);
	        Nissan nissanOne = new Nissan(300, 300, "black", 2021, 35);
	        Nissan nissanTwo = new Nissan(250, 250, "yellow", 2020, 40);
	        Car car = new Car(100, 100, "white");
	        System.out.println("toyota "+toyota.getSalePrice());
	        System.out.println("nissanOne "+nissanOne.getSalePrice());
	        System.out.println("nissanTwo "+nissanTwo.getSalePrice());
	        System.out.println("car  "+car.getSalePrice());
	    }

}


