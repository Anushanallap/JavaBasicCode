package SavingsAccount;

public class Car {
	 private int speed;
	    private double regularPrice;
	    private String color;

	    public Car(int speed, double regularPrice, String color) {
	        this.speed = speed;
	        this.regularPrice = regularPrice;
	        this.color = color;
	    }

	    public double getSalePrice() {
	        return regularPrice;
	    }
	}
	 class Pickup extends Car {
	    private int weight;

	    public Pickup(int speed, double regularPrice, String color, int weight) {
	        super(speed, regularPrice, color);
	        this.weight = weight;
	    }

	    public double getSalePrice() {
	        return super.getSalePrice() * (weight > 2000 ? 0.85 : 0.75);
	    }
	}
	 class Toyota extends Car {
	    private int length;

	    public Toyota(int speed, double regularPrice, String color, int length) {
	        super(speed, regularPrice, color);
	        this.length = length;
	    }

	    public double getSalePrice() {
	        return super.getSalePrice() * (length < 20 ? 0.9 : 0.85);
	    }
	}
	class Nissan extends Car {
	    private int year;
	    public int manufacturerDiscount;

	    public Nissan(int speed, double regularPrice, String color, int year, int manufacturerDiscount) {
	        super(speed, regularPrice, color);
	        this.year = year;
	        this.manufacturerDiscount = manufacturerDiscount;
	    }

	    public double getSalePrice() {
	        return super.getSalePrice() - manufacturerDiscount;
	    }
	}
	
