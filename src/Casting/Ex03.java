package Casting;

import java.util.ArrayList;

class AAA {
	public String getText() {return "AAA클래스"; }
}
public class Ex03 {

	public static void main(String[] args) {
//		AAA a = new AAA();//같음. //getText가 있음.  
		Object a = new AAA();//부모 형태로 바꾸면 getText가 없음.
		
		//Down Casting -부모형태로 받아서 자식형태로 다시 변환.
		AAA aa = (AAA)a;//형 변환
		aa.getText();
		
		ArrayList arr = new ArrayList();
		arr.add("test");
		String s = (String)arr. get(0);
		
	}

}
