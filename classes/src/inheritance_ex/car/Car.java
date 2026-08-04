package inheritance_ex.car;

public class Car {
	//필드
	protected String brand;
	protected String model;
	protected int speed;
	
	//생성자
	public Car(String brand, String model) {
		this.brand = brand;
		this.model = model;
		this.speed = 0;
	}
	
	//메서드 - 가속
	public void accelerate(int amount) {
		//speed = speed + amount
		speed += amount;
		System.out.println(model + "가속-현재속도" + speed + "km/h");
	}
	
	//메서드 - 감속
	public void brake(int amount) {
		//speed = speed = amount
		speed -= amount;
		if(speed<0)
			speed = 0; // 최저 속도 제한
		System.out.println(model + "감속-현재속도" + speed + "km/h");
		
	}
	
	//메서드
	public void showInfo() {
		System.out.println("=== 자동차 정보 ===");
		System.out.println("제조사: " + brand);
		System.out.println("모델명: " + model);
		
	}
}
