package abstracts_class.animal;

//추상클래스 - 공통된 내용을 반드시 구현하도록 하는 클래스
public abstract class Animal {
	
	//일반 메서드
	public void breathe() {
		System.out.println("숨을 쉽니다.");
	}
	
	//추상 메서드 - 선언만 있고 구현이 없다
	//구현은 상속받은 클래스에서 반드시 구현해야 한다
	public abstract void cry();
}
