package ����;

public class Ȧ���¾��¦�����������ϱ� {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int result1 = 0;
		int result2 = 0;
		int result = 0;

		for (int i = 1; i <= 100; i++) {
			if (i % 2 == 1) {
				System.out.print(i + ",");
				result1 = result1 + i;
			} else {
				System.out.print(-i + ",");
				result2 = result2 - i;
			}
			result = result1 + result2;
		}
		System.out.println("");
		System.out.println("��� : " + result);

	}

}
