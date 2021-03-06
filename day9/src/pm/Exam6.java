package pm;

public class Exam6 {
	public static void main(String[] args) {
		/*
		 추상 클래스
		 추상 메서드는 메서드의 본체가 없는 미완성의 이름뿐인 메서드이다.
		 메서드의 기능을 정의하는 중괄호 안이 비어있는게 아니라  아예 중괄호가 없고
		 아예 내용을 구성하지 않고 세미콜론; 으로 끝난다.
		 
		 추상 클래스의 특징
		 
		 추상 클래스는 미완성 메서드 때문에 객체를 생성할수는 없다.
		 문법적으로 생각하면 A a = new A(); 생성자 자체를 호출할수도 없다.
		 붕어빵 기계로 생각해보면 추상 클래스는 붕어빵 기계의 부품의 하나로 생각할 수 있다.
		 붕어빵 기계의 부품으로는 붕어빵(객체)를 생성할수는 없지만 붕어빵 기계는
		 붕어빵 부품으로 만들어서 최종적으로 붕어빵 기계로 붕어빵을 만들 수 있다.
		 
		 추상 클래스로는 직접 객체를 생성할수는 없지만 이 추상 클래스를 상속한
		 자식 클래스를 생성하면 그 자식 클래스로는 객체를 생성할 수 있다.
		 그리고 이렇게 생성된 객체 내부에는 부모 클래스의 추상 메서드가 구현되어 있을 수 밖에 없다.
		 
		 abstract class A{
			abstract void abc();	// 객체 생성은 불가능
		}
		
		class B extends A{
			void abc() {	// 객체 생성 가능
				
			}
		}
		
		// 자식 클래스로는 객체 생성이 가능하다.
		A a = new B();
		B b = new B();
		
		추상 클래스를 상속하는 자식 클래스는 부모에게 상속받은 미완성 제목뿐인 메서드를 반드시
		완성(오버라이딩) 해야만한다.
		 
		 */
	}

}

