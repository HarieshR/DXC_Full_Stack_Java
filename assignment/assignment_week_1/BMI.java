package assignment_week_1;
import java.util.Scanner;

class BMI_calc{
	private double weight,height;
	private String name;
	private int age;
	final double KG_PER_POUND = 0.45359237;
	final double M_PER_IN= 0.0254;
	
	public BMI_calc(String name, int age, double weight, double height) {
		this.weight = weight;
		this.height = height;
		this.name = name;
		this.age = age;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public double getBMI(){
		double bmi = weight*KG_PER_POUND /((height*M_PER_IN)*(height*M_PER_IN));
		return bmi;
	}
	
	public String getStatus() {
		double bmi = getBMI();
	
		if(bmi<18.5)
			return ("Underweight");
		else if(18.5 <=bmi|| bmi < 25)
			return("Normal");
		else if(25<= bmi || bmi <30)
			return("Overweight");
		else
			return("Obese");
		
	}
}

public class BMI{
	
	public static void main(String[] args) {
	
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your name: ");
		String name = sc.next();
		System.out.println("Enter your age: ");
		int age = sc.nextInt();
		System.out.println("Enter your height(inch): ");
		double height = sc.nextDouble();
		System.out.println("Enter your weight(pounds): ");
		double weight = sc.nextDouble();

		BMI_calc b = new BMI_calc(name, age, weight, height); 
		
		if(age>20)
			System.out.println("BMI of "+b.getName()+" is "+b.getBMI()+" "+b.getStatus());
		else
			System.out.println("Age must be above 20 to calc BMI");
		
	}
}

