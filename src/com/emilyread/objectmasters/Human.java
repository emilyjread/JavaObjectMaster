package com.emilyread.objectmasters;

public class Human {
	public int strength;
	public int intelligence;
	public int stealth;
	public int health;
	
	
	public Human(){
		this.strength = 3;
		this.intelligence = 3;
		this.stealth = 3;
		this.health= 100;
		
	}
	
	public void attack(Human human) {
		human.health-=this.strength;
		System.out.println("Attack!");
		
		
	}
	

}

