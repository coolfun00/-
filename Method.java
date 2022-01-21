public class Method {
	public static void main(String[] args) {
		// 2. MyMath ��ü ����
		MyMath mm = new MyMath();
		// 3. MyMath ��ü ��� (��ü�� �޼��� ȣ��)
		long result = mm.max(5, 3); // �� �߿� ū ���� ��ȯ�ϴ� �޼���
		long result1 = mm.add(5L, 3L); // add�޼��� ȣ�� 
		long result2 = mm.subtract(5L, 3L);
		long result3 = mm.multiply(5L, 3L);
		double result4 = mm.divide(5L, 3L);
		mm.printGugudan(3); // ������ 3���� ���
		
		System.out.println("max(5L, 3L) = " + result);
		System.out.println("add(5L, 3L) = " + result1);
		System.out.println("subtract(5L, 3L) = " + result2);
		System.out.println("multiply(5L, 3L) = " + result3);
		System.out.println("divide(5L, 3L) = " + result4);	
	}

}

// 1. MyMath Ŭ���� �ۼ�(�޼��� �ۼ�)
class MyMath {
	void printGugudan(int dan) {
		if(!(2<=dan && dan<=9))
			return; // �Է¹��� ��(dan)�� 2~9�� �ƴϸ�, �޼��� �����ϰ� ���ư���
		
		for(int i=1; i<=9; i++) {
			System.out.printf("%d * %d = %d\n", dan, i, dan * i);
		}
//		return;(��������)
	}
	
	long add(long a, long b) {
		long result = a + b;
		return result;
	//  return a + b; // ���� �� ���� �̿� ���� �� �ٷ� ������ �� �� �ִ�.
	}
	// Q. �� ���� �޾Ƽ� �� �߿� ū ���� ��ȯ�ϴ� �޼��带 �ۼ��Ͻÿ�.
	long max(long a, long b) {
		long result = 0;
		if(a>b) {
			result = a;
		} else {
			result = b;
		}
		// ���� �ڵ带 ���׿����ڸ� ����Ͽ� ������ �ϸ� return a > b ? a : b;�� �ȴ�.
		return result;
	}
	long subtract(long a, long b) { return a - b;}
	long multiply(long a, long b) { return a * b;}
	double divide(double a, double b) {
		return a / b;
	}	
}
