package polymorphism.animal;

public class Human extends Animal {

	

	//우클릭 - source - override/implements
	
	@Override
	public void move() {
		System.out.println("사람이 두 발로 걷습니다.");
	}

}
