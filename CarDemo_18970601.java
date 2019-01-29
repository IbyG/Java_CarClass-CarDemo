
import java.util.Scanner;
public class CarDemo_18970601 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner kb = new Scanner(System.in); //for input by the user. 
		
		//demonstrating the first constructor 
		System.out.println("What year was the first car produced?");
		int year = kb.nextInt();
		System.out.println("What is the make of the first car?");
		String make = kb.next();
		Car_18970601 firstCar = new Car_18970601(year,make); // creating new car object 
		System.out.println("\n"); //newline
		
		// making a default car (no-arg constructor)
		Car_18970601 secondCar = new Car_18970601();
		System.out.println("Second Car has been created with the default class Values \n");
		
		//demonstarting the third constructor 
		System.out.println("What year was the third car produced?");
		year = kb.nextInt();
		System.out.println("What is the make of the third car?");
		make = kb.next();
		System.out.println("What is the speed of the third car?");
		int speed = kb.nextInt();
		Car_18970601 thirdCar = new Car_18970601(year,make, speed); // creating new car object 
		
		
		int retrieveChoice = 0; //choice of seeing car type, model or speed
		int carChoice = 0; // which car they want to view the information about
		
		do {
			System.out.println("If you want to see the car make type (1), year model type (2), "
					+ "speed type (3) or quit (4)" );
			 retrieveChoice = kb.nextInt();
			
			 if (retrieveChoice == 4) { // leaving the do while loop 
				break;
			}
			 
			System.out.println("First car type 1, second car type 2, third car type 3");
			 carChoice = kb.nextInt();
			
			String conjoined = retrieveChoice + "" + carChoice; // concatenating the two integers 
			int conjoinedInt = Integer.parseInt(conjoined); // converting the string to int 
			
			switch (conjoinedInt){ //checking the combination triggering the accessors in the car class
				case 11:
					System.out.print("Make: " + firstCar.getMake()+ "\n");
					break;
				case 12:
					System.out.println("Make: " + secondCar.getMake()+ "\n");
					break;
				case 13:
					System.out.println("Make: " + thirdCar.getMake()+ "\n");
					break;
				case 21:
					System.out.println("Year: " + firstCar.getYearModel()+ "\n");
					break;
				case 22:
					System.out.println("Year: " +secondCar.getYearModel()+ "\n");
					break;
				case 23:
					System.out.println("Year: " +thirdCar.getYearModel()+ "\n");
					break;
				case 31:
					System.out.println("Speed: " +firstCar.getSpeed()+ "\n");
					break;
				case 32:
					System.out.println("Speed: " +secondCar.getSpeed()+ "\n");
					break;
				case 33:
					System.out.println("Speed: " +thirdCar.getSpeed()+ "\n");
					break;
				
				}
		}while(retrieveChoice != 4);
		
		
		//testing the increase and decrease methods from car class
		System.out.println("What Speed would you like to increase  and decrease all 3 cars by? \n");
		int carIncreaseDecrease = kb.nextInt();
		
		kb.close(); //closing the keyboard class 
		
		System.out.println("\n"); //newline
		System.out.println("First Car Accelerate:");
		for (int i = 0; i < 5; i += 1) {
			firstCar.accelerate(carIncreaseDecrease);
			System.out.println(firstCar.getSpeed());
			
		}
		System.out.println("\n"); //newline
		
		System.out.println("Second Car Accelerate:");
		for (int i = 0; i < 5; i += 1) {
			secondCar.accelerate(carIncreaseDecrease);
			System.out.println(secondCar.getSpeed());
		}
		System.out.println("\n"); //newline
		
		System.out.println("Third Car Accelerate:");
		for (int i = 0; i < 5; i += 1) {
			thirdCar.accelerate(carIncreaseDecrease);
			System.out.println(thirdCar.getSpeed());
		}
		System.out.println("\n"); //newline
		
		System.out.println("First Car Decelerate:");
		for (int i = 0; i < 5; i += 1) {
			firstCar.Brake(carIncreaseDecrease);
			System.out.println(firstCar.getSpeed());
		}
		System.out.println("\n"); //newline
		
		System.out.println("Second Car Decelerate:");
		for (int i = 0; i < 5; i += 1) {
			secondCar.Brake(carIncreaseDecrease);
			System.out.println(secondCar.getSpeed());
		}
		System.out.println("\n"); //newline
		
		System.out.println("Third Car Decelerate:");
		for (int i = 0; i < 5; i += 1) {
			thirdCar.Brake(carIncreaseDecrease);
			System.out.println(thirdCar.getSpeed());
		}
		System.out.println("\n"); //newline
		
		System.out.println("First Car Default Accelerate:");
		for (int i = 0; i < 5; i += 1) {
			firstCar.accelerate();
			System.out.println(firstCar.getSpeed());
			
		}
		System.out.println("\n"); //newline
		
		System.out.println("Second Car Default Accelerate:");
		for (int i = 0; i < 5; i += 1) {
			secondCar.accelerate();
			System.out.println(firstCar.getSpeed());
			
		}
		System.out.println("\n"); //newline
		
		System.out.println("Third Car Default Accelerate:");
		for (int i = 0; i < 5; i += 1) {
			thirdCar.accelerate();
			System.out.println(firstCar.getSpeed());
			
		}
		System.out.println("\n"); //newline
		
		
		System.out.println("First Car Default Decelerate:");
		for (int i = 0; i < 5; i += 1) {
			firstCar.Brake();
			System.out.println(firstCar.getSpeed());
			
		}
		System.out.println("\n"); //newline
		
		System.out.println("Second Car Default Decelerate:");
		for (int i = 0; i < 5; i += 1) {
			secondCar.Brake();
			System.out.println(firstCar.getSpeed());
			
		}
		System.out.println("\n"); //newline
		
		System.out.println("Third Car Default Decelerate:");
		for (int i = 0; i < 5; i += 1) {
			thirdCar.Brake();
			System.out.println(firstCar.getSpeed());
			
		}
		System.out.println("\n"); //newline
		
		
		//displaying information one last time before termination
		System.out.println("First Car Specs");
		System.out.println("Make: " +firstCar.getMake());
		System.out.println("Speed: " +firstCar.getSpeed());
		System.out.println("Year: "+firstCar.getYearModel());
		
		System.out.println("\nSecond Car Specs");
		System.out.println("Make: " +secondCar.getMake());
		System.out.println("Speed: " +secondCar.getSpeed());
		System.out.println("Year: "+secondCar.getYearModel());
		
		System.out.println("\nThird Car Specs");
		System.out.println("Make: " + thirdCar.getMake());
		System.out.println("Speed: " +thirdCar.getSpeed());
		System.out.println("Year: "+thirdCar.getYearModel());
		
	
	}

}
