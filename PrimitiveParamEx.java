class Data { int x; }

public class PrimitiveParamEx {
	public static void main(String[] args) {
		Data d = new Data(); // ��ü����
		d.x = 10;
		System.out.println("main() : x = " + d.x);
		
		change(d.x);
		System.out.println("After Change(d.x)");
		System.out.println("main() : x = " + d.x);
	}
	
	static void change(int x) { // �⺻�� �Ű�����(�б⸸ ����)
		x = 1000;
		System.out.println("change() : x = " + x);
	}
}

/*
�⺻�� �Ű����� �ܰ躰 ����

      1                                        2                                        3
change x(10)                          change x(1000)
main d(0x100) -> x(10)<0x100>         main d(0x100) -> x(10)<0x100>        main d(0x100) -> x(10)<0x100>

1. change�޼��尡 ȣ��Ǹ鼭 'd.x'�� change�޼����� �Ű����� x�� �����
2. change�޼��忡�� x�� ���� 1000���� ����
3. change�޼��尡 ����Ǹ鼭 �Ű����� x�� ���ÿ��� ���ŵ�

change�޼��忡�� main�޼���κ��� �Ѱܹ��� d.x�� ���� 1000���� �����ߴµ��� main�޼��忡���� d.x�� ���� �״���ε� �� ������ ���� �ִ� �ܰ躰
������ ���� �� �� �ִ�.
'd.x'�� ���� ����� ���� �ƴ϶� change�޼����� �Ű����� x�� ���� ����� ���̴�. ��, ������ �ƴ� ���纻�� ����� ���̶� �������� �ƹ��� ������ 
��ġ�� ���Ѵ�. ��ó�� �⺻�� �谳������ ������ ����� ���� ���� ���� ���� �� ������ �� �� ����.
*/