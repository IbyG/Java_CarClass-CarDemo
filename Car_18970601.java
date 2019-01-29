
public class Car_18970601 {
	private int yearModel; //holds the car's year model
	private String make; // holds the make of the car
	private int speed; //holds the car's current speed
	
	
	
	/**
	 * 
	 * @param userYearModel
	 * 				- the car's year model 
	 * @param userMake
	 * 				- the car's make (e.g ford, honda etc)
	 */
	public Car_18970601(int userYearModel, String userMake) {
		yearModel = userYearModel;
		make = userMake;
		speed = 0;
	}
	
	/**
	 * no-arg constructor with default values
	 */
	public Car_18970601(){
		yearModel = 2016;
		make = "Subaru";
		speed = 50;
	}
	
	
	/**
	 * 
	 * @param userYearModel - the year model of the car
	 * @param userMake - the make of the car
	 * @param userSpeed - the speed of the car 
	 */
	public Car_18970601(int userYearModel, String userMake, int userSpeed) {
		yearModel = userYearModel;
		make = userMake;
		speed = userSpeed;
		
	}
	
	/**
	 * function that adds 'increase' to speed everytime it is called
	 */
	public void accelerate(int increase) {
		speed  += increase;
	}
	
	/**
	 * subtracts 'decrease' from speed everytime it is called
	 */
	public void Brake(int decrease) {
		speed -= decrease;
		
	}
	
	public void accelerate() {
		speed += 5;
	}
	
	public void Brake() {
		speed -= 5;
	}
	
	/**
	 * 
	 * @return 
	 * 		- returning the year model 
	 */
	public int getYearModel() {
		return yearModel;
	}
	
	/**
	 * 
	 * @return
	 * 		-returning make of the car
	 */
	public String getMake() {
		return make;
	}
	
	/**
	 * 
	 * @return
	 * 		-return the speed of the car 
	 */
	public int getSpeed() {
		return speed;
	}
	
	
}
