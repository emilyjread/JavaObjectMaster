package com.emilyread.objectmasters;

public class Ninja extends Human{
	public Ninja() {
		this.stealth=10;
	}
	
	public void steal(Human human) {
		human.health-= this.stealth;
		this.health+=this.stealth;
		
		System.out.println("Health stolen. New health: " + human.health + " Ninja health: " + this.health);
	}
	
	public void runAway() {
		this.health-=10;
		System.out.println("Ran away! Ninja health: " + this.health);
	}
	


}
