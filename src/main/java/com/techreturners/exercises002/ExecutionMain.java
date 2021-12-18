package com.techreturners.exercises002;

import com.techreturners.exercises003.Pigeon;
import com.techreturners.exercises004.Parrot;
import com.techreturners.exercises004.Penguin;

public class ExecutionMain {

	public static void main(String[] args) {
		
		Pigeon pippa = new Pigeon("Pippa", "Grey");		
		Penguin pingu = new Penguin("Pingu", "Black & White");	
		Parrot parrot = new Parrot("Parrot","Green");
		pippa.speak();
		pippa.fly();
		pippa.eatPizza();
		pippa.sleep();
		pippa.spin();
		pippa.doTheCaterpillar();
		pippa.jump();
		pingu.speak();
		pingu.fly();
		pingu.spin();
		pingu.doTheCaterpillar();
		pingu.jump();
		parrot.speak();
		parrot.fly();
		parrot.spin();
		parrot.doTheCaterpillar();
		parrot.jump();
	}

}
