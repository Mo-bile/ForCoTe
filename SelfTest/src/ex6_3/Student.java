package ex6_3;

public class Student {
	
	String name;
	int ban;
	int no;
	int kor;
	int eng;
	int math;
	
	
	public int getTotal() {
		// TODO Auto-generated method stub
		 
		return this.kor + this.eng + this.math;
	}
	
	
	public float getAverage() {
		// TODO Auto-generated method stub
		
//		float av = this.getTotal() / (float)3.0;
//		return (float) (Math.round(av * 10) / 10.0);
		
		float a = this.getTotal() / 3f;
		a *= 10; // 살릴 만큼 만 뽑아주기 
		a += 0.5f; // 반올림으로 마지막 자리수 반올림여부 결
		
		float b = (int) a / 10f; 
		// 그외 소수점 작업 위해서 정수 형으로 변환 뒤
		// 실수와 연산해서 다시 실수로 바꾸어주기 
		
		return b;
		
	}
	
	
	
	
}
