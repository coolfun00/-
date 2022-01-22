class Data { int x; }

public class PrimitiveParamEx {
	public static void main(String[] args) {
		Data d = new Data(); // 객체생성
		d.x = 10;
		System.out.println("main() : x = " + d.x);
		
		change(d.x);
		System.out.println("After Change(d.x)");
		System.out.println("main() : x = " + d.x);
	}
	
	static void change(int x) { // 기본형 매개변수(읽기만 가능)
		x = 1000;
		System.out.println("change() : x = " + x);
	}
}

/*
기본형 매개변수 단계별 과정

      1                                        2                                        3
change x(10)                          change x(1000)
main d(0x100) -> x(10)<0x100>         main d(0x100) -> x(10)<0x100>        main d(0x100) -> x(10)<0x100>

1. change메서드가 호출되면서 'd.x'가 change메서든의 매개변수 x에 복사됨
2. change메서드에서 x의 값을 1000으로 변경
3. change메서드가 종료되면서 매개변수 x는 스택에서 제거됨

change메서드에서 main메서드로부터 넘겨받은 d.x의 값을 1000으로 변경했는데도 main메서드에서는 d.x의 값이 그대로인데 그 이유는 위에 있는 단계별
과정을 통해 알 수 있다.
'd.x'의 값이 변경된 것이 아니라 change메서드의 매개변수 x의 값이 변경된 것이다. 즉, 원본이 아닌 복사본이 변경된 것이라 원본에는 아무런 영향을 
미치지 못한다. 이처럼 기본형 배개변수는 변수에 저장된 값만 읽을 수만 있을 뿐 변경할 수 는 없다.
*/