package ex5;

public class StudentCard {

	int num;
	boolean isKwang;
	
	
	public StudentCard() {
		// TODO Auto-generated constructor stub
		this(1, true);
	
	}
	
	public StudentCard(int num, boolean isKwang) {
		// TODO Auto-generated constructor stub
		this.num = num;
		this.isKwang = isKwang;
	
	}

	public String info() {
		// TODO Auto-generated method stub
		
		
		return num + (isKwang? "K" : "" );
		
		//리턴타입이 문자열이기 떄문에 + 로 문자열을 붙여서 출력가능
		
	}
	
	
}
