package questao04;

import java.util.ArrayList;
import java.util.List;

public class Main {

	public static void main(String[] args) {

		List<Integer> a1 = new ArrayList<>();
		a1.add(10);
		a1.add(5);
		a1.add(98);
		a1.add(452);
		List<Integer> a2 = new ArrayList<>();
		a2.add(10);
		a2.add(5);
		a2.add(98);
		a2.add(452);
		List<Integer> a3 = new ArrayList<>();
		a3.add(548);
		a3.add(213);
		a3.add(10);
		List<Integer> a4 = new ArrayList<>();
		a4.add(5);
		a4.add(21);
		a4.add(12);

		List<Integer> a5 = new ArrayList<>();
		a5.add(50);
		a5.add(60);
		a5.add(70);
		List<Integer> a6 = new ArrayList<>();
		a6.add(5);
		a6.add(21);
		a6.add(12);

		List<Integer> a7 = new ArrayList<>();
		a7.add(60);
		a7.add(70);
		List<Integer> a8 = new ArrayList<>();
		a8.add(1);
		a8.add(2);
		a8.add(3);
		System.out.println(MultiplicarArray.multiply(a1, a2));
		System.out.println(MultiplicarArray.multiply(a3, a4));
		System.out.println(MultiplicarArray.multiply(a5, a6));
		System.out.println(MultiplicarArray.multiply(a7, a8));
	}

}
