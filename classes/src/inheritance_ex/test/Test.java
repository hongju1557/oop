package inheritance_ex.test;

import inheritance_ex.animal.Cat;
import inheritance_ex.animal.Dog;

public class Test {
	public static void main(String[] args) {
		Dog dog1 = new Dog();
		
		dog1.eat();
		dog1.bark();
		
		Cat cat1 = new Cat();
		
		cat1.eat();
		cat1.cry();
	}
}
