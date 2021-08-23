package Overriding;

import java.util.ArrayList;

class AA extends ArrayList {
	public void aa() {
		System.out.println("나만의 기능입니다.");
	}
	public Object get(int i) {
		return "내가만든 get이다.";
	}
	public boolean add(Object o) {
		System.out.println("추가하는 기능입니다,");
		return true;
	}
	
//	//Overriding
//	public Object get(int modCount) {
//		return super.get(modCount) + "내가 만든 기능";
//	}
}

//상속을 받지 못하게 할 때 final 사용. 변경하지 말고 있는 그대로 쓸 때 final키워드 사용.
final class BB {
//	String s = new String();
//	String ss;
//	public void testT() {
	public void bb() {
		System.out.println("bb의 기능입니다.");
	}
	}
	
class CC {
	BB b = new BB();
	public void bb() {
		b.bb();
		System.out.println("cc의 기능입니다.");
	}
}

public class Ex02_Main {

	public static void main(String[] args) {

		AA a = new AA();
//		ArrayList arr = new ArrayList();
//		String s;
		a.add("월요일 힘내자!");
		System.out.println("저장값: " + a.get(0));
		
	}

}
