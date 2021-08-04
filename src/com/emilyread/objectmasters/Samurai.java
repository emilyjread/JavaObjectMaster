package com.emilyread.objectmasters;

public class Samurai extends Human {
	
	public static int samuraiCount= 0;

	public Samurai() {
		this.health=200;
		samuraiCount++;
	}
	
	public void deathBlow(Human human) {
		human.health=0;
		this.health=this.health/2;
		System.out.println("Death Blow! Samurai health now: " + this.health);
	}
	
	public void meditate(){
		this.health*=1.5;
		System.out.println("Ohhhhmmmmmmmm...meditating... Samurai health now: " + this.health);
		
	}
	public static int howMany() {
		return samuraiCount;
		
	}
}
