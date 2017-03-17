package task1;

import java.util.Arrays;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Integer[] a = new Integer[10];
		for (int i = 0; i < 10; i++) {
			a[i] = i;
		}
		System.out.println(Arrays.toString(a));
		NewList<Integer> test = new NewList<>();
		test.createDeleteAndShow(a);
	}

}
