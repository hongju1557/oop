package inheritance_ex.test;

import inheritance_ex.car.Car;
import inheritance_ex.car.EV;

public class CarTest {
	
	//CarTest.main() 진입점(new를 사용하지 않기 위해 static 붙임)
	public static void main(String[] args) {
		Car car = new Car("현대자동차", "Sonata");
		EV ev = new EV("기아자동차", "KIA", 50);
		ev.accelerate(80);
		ev.brake(20);
		ev.charge(70);
		
		car.showInfo();
		ev.showInfo();
	}
}
