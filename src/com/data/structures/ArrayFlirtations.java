package com.data.structures;

import java.util.Arrays;

public class ArrayFlirtations {

	public static void main(String[] args) {

		int[] a = new int[7];
		String[] b = new String[7];

		System.out.println(a);
		System.out.println(Arrays.toString(a));
		System.out.println(Arrays.toString(b));

		b = new String[] { "Wise", "Calm", "Happy" };

		System.out.println(Arrays.toString(b));

		for (String i : b) {
			System.out.println(i);
		}

		for (int i = 0; i < b.length; i++) {
			System.out.println(b[i].toLowerCase());
		}

	}

	public void x(String[] a) {

		for (int i = 0; i < a.length; i++) {
			a[i] = a[i].toUpperCase();
		}
	}

	public void y(int[] a) {
		for (int i = 0; i < a.length; i++) {
			a[i] = a[i] + 1;
		}
	}

}
