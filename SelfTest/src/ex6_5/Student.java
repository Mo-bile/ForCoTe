package ex6_5;

public class Student {

	String name;
	int ban;
	int no;
	int kor;
	int eng;
	int math;
	
	
	public Student(String name, int ban , int no , int kor , int eng, int math) {
		// TODO Auto-generated constructor stub
		
		this.name = name;
		this.ban = ban;
		this.no = no;
		this.kor = kor;
		this.eng = eng;
		this.math = math;
	
	}
	
	public String info() {
		// TODO Auto-generated method stub
		String i = name+ ',' + ban+ ',' + no+ ',' +kor+ ','+eng+ ','+math;
		
		return i ;
	}
//c, e
}
