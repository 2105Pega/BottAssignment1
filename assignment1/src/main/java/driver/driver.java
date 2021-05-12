package driver;

import beans.Food;
import beans.Animal;

public class driver {
	
	public static void main(String[] args) {
		
		System.out.println("We love Matt");
		
		
		Food tomato = new Food("tomato", "red", 7);
		Food salad = new Food("salad", "green", 13);
		
		Animal dog = new Animal("dog", "brown", 22);
		Animal dolphin = new Animal("dolphin", "blue", 33);
		
		System.out.println(tomato.toString());
		System.out.println(salad.toString());
		System.out.println(dog.toString());
		System.out.println(dolphin.toString());
		
		
	}

}
