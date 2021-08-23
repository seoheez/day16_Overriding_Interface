package Overriding;
//상속
public class NewFerrari extends Ferrari{
	
	public NewFerrari(int ye, int speed) {
		super(ye, speed);
	}
	//2022년 새로운 기능 추가
	public void autoSystem() {
		System.out.println("자동 운전 모드를 시작합니다.");
	}
	//부모 복붙해서 똑같이 만들어줌. Overriding
	public void speed() {
		System.out.println(getYe() + "년 페라리 속도는 " + super.getSpeed() + "km입니다.");
		System.out.println("터보 엔진으로 동작합니다.");
	}

}
