package Abstract_ex;

abstract class Abstract {
	protected int num;
	public void setNum(int num) {
		//실체화 있는 코드
		this.num = num;
	}
	//추상화
	public abstract void combo(); 
	 
}
class NewAbstract extends Abstract {
	@Override
	public void combo() {
		System.out.println(num + "단 콤보 공격 & 2대 더 때리기" );
	}
}
public class Ex01 {
	public static void main(String[] args) {
		Abstract a = new NewAbstract();
		a.setNum(3);
		a.combo();
			
		
	}

	
}
