package interfaces.remote_control;

public class Television implements RemoteControl {
	//필드(멤버 변수)
	private int volume;
	

	@Override
	public void turnOn() {
		System.out.println("TV를 켭니다. 현재 상태: ON");
		
	}

	@Override
	public void turnOff() {
		System.out.println("TV를 끕니다. 현재 상태: OFF");
		
	}

	@Override
	public void setVolume(int volume) {
		//상수는 인터페이스 이름으로 직접 접근
		if(volume > RemoteControl.MAX_VOLUME) {
			this.volume = RemoteControl.MAX_VOLUME; //최대 볼륨 제한
		}else if(volume < RemoteControl.MIN_VOLUME) {
			this.volume = RemoteControl.MIN_VOLUME; //최소 볼륨 제한
		}else {
			
			this.volume = volume;
		}
		
		System.out.println("현재 TV 볼륨 : " + this.volume);
	}
	
}
