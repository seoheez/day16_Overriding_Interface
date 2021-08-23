package Interface_ex;

interface Test {
//	public int a; //에러
	public static final int a = 12345;
	public final int a1 = 12345;
	public static int a2 = 12345;
	public static String id = "홍길동";
	public static final String pwd = "12345";
	
}

public class Ex03 implements Test{
	public static void main(String[] args) {
		System.out.println(Test.id);
		System.out.println(pwd);
		
	}
	
}
