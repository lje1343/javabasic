package pm;

public class Exam5 {
		/*
		 예외 던지기
		 에외가 발생했을 때 그 위치에서 바로 예외처리를 할 수도 있지만 
		 호출한 지점으로 예외를 던질수도 있다.	throws
		 
		 예외가 발생했을때 2가지 해결책은 try-catch을 이용하거나 예외를 던지는 것이다.
		 
		 예외를 던지는 기본 문법
		 
		 리턴 타입 메서드명(변수) throws 예외 클래스명{
		 //
		 }
		 
 		 void abc()	{

		 }
 		 void bcd(){
		 	//예외처리
		 }
		 
		 void abc()	{
		 	try{
		 		bcd();
		 	} catch(예외 클래스 타입) {
		 		// 예외처리
		 	}
		 }
		 
		 void bcd()	throws 예외 클래스 타입{
		 	//예외발생을 호출한 지점으로 던지기
		 }
		 
		 
		 */


	public static void main(String[] args) {
		
		A a = new A();
		a.abc();
	}

}

//class A{
//	void abc() {
//		bcd();
//	}
//	
//	void bcd() {
//		try {
//			System.out.println("start");
//			Thread.sleep(1000);
//			System.out.println("stop");
//		}catch(InterruptedException e) {
//			//예외 처리 구문
//		}
//	}
//	
//}


		/*
		 2개의 메서드 abc() bcd()가 있고 bcd()메서드의 내부에는 예외 발생 가능 코드가
		 포함되어 있다. Thread.sleep()은 일반 예외가 발생할수도 있기 때문에
		 메서드 사용을 위해서는 반드시 예외 처리를 해야만 한다.
		 하지만 bcd() 메서드가 직접 예외 처리를 하는 대신 자신을 호출한 메서드로 던지게 된다.
		 즉 예외처리 의무를 자신을 호출한 메서드로 전가했다.
		 따라서, abc() 메서드가 예외를 처리해야만 한다.
		 
		 왜 thread.sleep() 메서드를 사용하려면 예외처리를 필수로 해줘야 하는지 알아보자!		 
		 */


class A{
	void abc() {
		try{
			bcd();
		} catch(InterruptedException e) {
			// 예외 처리 구문
		}
	}
	
	void bcd() throws InterruptedException{
		System.out.println("start");
		Thread.sleep(1000);
		System.out.println("stop");
	}
}




