package abstracts_class.test;

import abstracts_class.animal.Animal;
import abstracts_class.animal.Cat;
import abstracts_class.animal.Dog;

public class AnimalTest {

	public static void main(String[] args) {
		/*Cat cat = new Cat();
		cat.breathe();
		cat.cry();*/
		
		//부모 타입으로 인스턴스 생성 - 다형성
		/*Animal cat = new Cat();
		cat.breathe();
		cat.cry();
		
		Animal dog = new Dog();
		dog.breathe();
		dog.cry();*/
		
		//배열 -> ArrayList 구조
		Animal[] animals = {
				new Cat(),
				new Dog()
				};
		for(Animal animal : animals) {
			animal.breathe();
			animal.cry();
		}

	}

}
