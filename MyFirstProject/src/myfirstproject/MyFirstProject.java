package myfirstproject;

import processing.core.PApplet;


public class MyFirstProject extends PApplet {

	public static void main(String[] args) {
		PApplet.main("myfirstproject.MyFirstProject");
	}
	
	public void settings(){
		size (650,650);
	}
	
	public void setup() {
		background(255, 255, 255);
		System.out.println("Oh,hello!");
	}


	public void draw() {
	}
}
