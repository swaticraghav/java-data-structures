package com.data.structures.test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

import com.data.structures.ArrayFlirtations;

class ArrayFlirtationsTest {

	ArrayFlirtations array = new ArrayFlirtations();

	@Test
	void test() {
		assertTrue(true);
	}

	@Test
	void xTest() {

		String[] input = { "Hu", "Person", "Animal" };
		array.x(input);
		assertArrayEquals(new String[] { "HU", "PERSON", "ANIMAL" }, input);

	}

	@Test
	void yTest() {
		int[] input = { 1, 2, 3, 4, 5 };
		array.y(input);
		assertArrayEquals(new int[] { 2, 3, 4, 5, 6 }, input);
	}

}
