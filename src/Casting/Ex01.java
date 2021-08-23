package Casting;

class A01 {
	public void getText() {
		System.out.println("A클래스");
	}
}

class B01 extends A01 {
	public void getText() {
		System.out.println("B클래스");
	}
}


class C01 extends A01 {
	public void getText() {
		System.out.println("C클래스");
	}
}

public class Ex01 {

	public static void main(String[] args) {
		
		/*
		 * Up Casting(형 변환)
		 * - 자식 형태의 값을 부모 형태로 변환하는 것.
		 * Down Casting
		 * -부모 형태에서 자식 형태로 변환하는 것.
		 */
		
		/*
		B01 b = new B01();
		b.getText();
		C01 c = new C01();
		c.getText();
		*/
		
		//Up Casting
		A01 a = new B01(); //자식 형태의 값을 부모 형태로 저장. 하나의 변수를 만들어서 같이 사용.
		a.getText();
		a = new C01();
		a.getText();
	}
}
