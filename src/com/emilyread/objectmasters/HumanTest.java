package com.emilyread.objectmasters;

public class HumanTest {

	public static void main(String[] args) {
//		Human h1=new Human();
//		Human h2= new Human();
		
//		System.out.println("Human 1 initial health: " + h1.health);
//		
//		h2.attack(h1);
//		
//		System.out.println("Human 1 health after attack: " + h1.health);
		
		
		Ninja n1 = new Ninja();
		Ninja n2= new Ninja();
		
		Wizard w1= new Wizard();
		
		Samurai s1 = new Samurai();
		Samurai s2 = new Samurai();
		
		
		n2.steal(n1);
		n1.runAway();
		
		w1.heal(n1);
		w1.fireball(n1);
		
		s1.deathBlow(n1);
		s1.deathBlow(n2);
		s1.meditate();
		
		System.out.println("There are this many Samurai: " + Samurai.howMany());
		
		
		
	}

}

