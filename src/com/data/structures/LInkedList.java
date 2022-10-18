package com.data.structures;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class LInkedList {

	public static void main(String[] args) {

		LinkedList<String> list = new LinkedList<>();
		list.add("Apple");
		list.add("Cat");

		System.out.println(list);

		list.add(1, "Ball");
		System.out.println(list);

		list.removeFirst();
		System.out.println(list);

		List<String> synchronizedList = Collections.synchronizedList(list);
		System.out.println(synchronizedList);

	}

}
