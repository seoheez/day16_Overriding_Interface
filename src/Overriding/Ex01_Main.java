package Overriding;

public class Ex01_Main {

	public static void main(String[] args) {
		/*
		 **Overriding
		 * - 상속받은 자식 메서드의 내용을 변경(업데이트)하는 것.
		 * - 부모 메서드의 형식과 동일하게 자식 메서드를 만드는 것.
		 *   1) 반환 타입이 같아야 한다.
		 *   2) 매개변수의 개수와 타입이 같아야 한다.
		 *   3) 접근 제한자가 부모와 같거나 커야 한다.
		 *     - private < package < protected < public   
		 */
		
		
//		Ferrari fe = new Ferrari(2021, 350);
//		fe.speed();
		
		NewFerrari fe = new NewFerrari(2022, 400);
		fe.speed(); fe.autoSystem();
	}

}
