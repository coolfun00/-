class Data2 { int x; }

public class ReferenceParamEx {
	public static void main(String[] args) {
		Data2 d = new Data2();
		d.x = 10;
		System.out.println("main() : x = " + d.x);
		
		change(d);
		System.out.println("After changed(d)");
		System.out.println("main() : x = " + d.x);
	}
	
	static void change(Data2 d) { // ������ �Ű�����
		d.x = 1000;
		System.out.println("change() : x = " + d.x);
	}
}

/*
������ �Ű����� �ܰ躰 ����

      1                                        2                                        3
change d(0x100)                       change d(0x100)
main d(0x100) -> x(10)<0x100>         main d(0x100) -> x(1000)<0x100>        main d(0x100) -> x(1000)<0x100>

1. change�޼��尡 ȣ��Ǹ鼭 �������� d�� ��(�ּ�)�� �Ű����� d�� �����.
   ���� �Ű����� d�� ����� �ּҰ����� x�� ������ ����
2. change�޼��忡�� �Ű����� d�� x�� ���� 1000���� ����
3. change�޼��尡 ����Ǹ鼭 �Ű����� d�� ���ÿ��� ���ŵ�

change�޼����� �Ű������� ���������� �����߱� ������, x�� ���� �ƴ� �ּҰ� �Ű����� d�� ����Ǿ���. 
���� main�޼����� �������� d�� change�޼����� �������� d�� ���� ��ü�� ����Ű�� �ȴ�.
�׷��� �Ű����� d�� x�� ���� �д� �Ͱ� �����ϴ� ���� ��� ������ ���̴�.
*/