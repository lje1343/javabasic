package pm;

public class Exam6 {

	public static void main(String[] args) {
		/*
		외부 클래스 external class
		public 클래스의 외부에 추가로 정의한 클래스를 말한다.
		1개의 자바 소스 파일에는 최대 1개의 public 클래스만 존재할 수 있고
		그 클래스 명은 파일명과 일치해야만 한다.
		
		즉, 1개의 소스 파일안에 public 클래스를 제외한 모든 클래스는 외부클래스이다.
		public 클래스가 아니면 다른 클래스에서 임포트 할 수 없으므로 
		외부 클래스는 같은 패키지안에서만 사용할 수 있는 것이다.
		*/
		
		// 다른 패키지인 am 패키지 내의 class B는 public 선언이 불가능한 외부 클래스이므로
		// 다른 패키지에서는 불러올 수가 없다.
//		am.B b = new am.B();
//		b.print();
		
	}

}
