package polymorphism.animal;

public class AnimalTest {

	public static void main(String[] args) {
		/*Human human = new Human();
		human.move();
		
		Eagle eagle = new Eagle();
		eagle.move();*/
		
		//다형성을 사용한 자동 타입으로 객체 생성
		/*Animal human = new Human();
		human.move();*/
		
		//배열로 객체 생성 및 사용
		Animal[] animals = {
				new Human(), 
				new Eagle()
				};
		
		//1개 독수리 출력
		animals[0].move();
		animals[1].move();
		System.out.println("==============");
		
		//for문 (자료형 변수 : 배열)
		
		for(Animal animal : animals)
			animal.move();
		
	} //main() 끝
	
	//다형성 - 매개변수의 다형성
	public static void moveAnimal(Animal animal) {
		animal.move();
	}

}
