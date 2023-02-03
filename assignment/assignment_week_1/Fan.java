package assignment_week_1;

class operation{
	final int SLOW =1, MED=2, FAST=3;
	private int speed = SLOW;
	private boolean on = false;
	private double radius = 5;
	String colour = "blue";
	
	public operation(int speed, boolean on, double radius, String colour) {
		super();
		this.speed = speed;
		this.on = on;
		this.radius = radius;
		this.colour = colour;
	}
	
	public int getSpeed() {
		return speed;
	}
	public void setSpeed(int speed) {
		this.speed = speed;
	}
	public boolean isOn() {
		return on;
	}
	public void setOn(boolean on) {
		this.on = on;
	}
	public double getRadius() {
		return radius;
	}
	public void setRadius(double radius) {
		this.radius = radius;
	}
	public String getColour() {
		return colour;
	}
	public void setColour(String colour) {
		this.colour = colour;
	}
	
	public String toString() {
		
		if(on)
			return "Fan speed: "+getSpeed()+" Colour: "+getColour()+" Radius: "+getRadius();
		else
			return " Colour: "+getColour()+" Radius: "+getRadius()+" Fan is turned off";
	}
}

public class Fan {
	public static void main(String[] args) {
		operation o1 = new operation(3,true,10,"yellow");
		System.out.println(o1.toString()); 
		operation o2 = new operation(2,false,5,"blue");
		System.out.println(o2.toString()); 
	}
}
