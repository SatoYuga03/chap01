package code01_04;

public class Main {

	//	final
	public static void main(String[] args) {
		final double PI = 3.14;
		int pie = 5;
		System.out.println("半径" + pie + "㎝のパイの面積は");
		System.out.println(pie * pie * PI);
		System.out.println("パイの半径を倍にします");
		pie = 10;
		System.out.println("半径" + pie + "cmのパイの面積は");
		System.out.println(pie * pie * PI);

		final int aa = 500;
		System.out.println(aa);

		int b = aa + 500;
		System.out.println(b);

		int a = 3;
		int c = 5;
		int d = a * c;
		System.out.println("立幅" + a + "横幅" + c + "の長方形の面積は、" + d);

	}
}
