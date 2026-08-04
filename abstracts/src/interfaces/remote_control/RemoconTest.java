package interfaces.remote_control;

public class RemoconTest {

	public static void main(String[] args) {
		//부모 인터페이스 타입으로 인스턴스 생성(다형성 이용)
		RemoteControl remocon = new Television();
		
		//기능 테스트
		remocon.turnOn();
		remocon.setVolume(16); //10
		remocon.setVolume(-3); //0
		remocon.setMute(true); //무음모드 활성화
		remocon.setMute(false); //무음모드 해제
		remocon.turnOff();
		
		//배터리 교환
		RemoteControl.replaceBattery();
		

	}

}
