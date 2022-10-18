package com.data.structures;

import java.util.Comparator;
import java.util.Set;
import java.util.TreeSet;

public class TreeSetFlirtations {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Set<Integer> set = new TreeSet<>();
		set.add(1);
		set.add(23);
		set.add(13);
		set.add(200);
		set.add(150);
		System.out.println(set);
		set.add(13);
		System.out.println(set);

		Set<String> set_two = new TreeSet<>();
		set_two.add("Balls");
		set_two.add("TwinTower");
		set_two.add("Sweat");
		set_two.add("SwatiRaghav");
		System.out.println(set_two);

		Set<String> set_three = new TreeSet<>(Comparator.comparing(String::length));
		set_three.add("Balls");
		set_three.add("TwinTower");
		set_three.add("Sweat");
		set_three.add("SwatiRaghav");
		System.out.println(set_three);

		set.remove(23);
		System.out.println(set);

	}

}
