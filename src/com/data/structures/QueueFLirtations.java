package com.data.structures;

import java.util.ArrayDeque;
import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;

public class QueueFLirtations {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Queue<String> queue = new ArrayDeque<>();
		queue.offer("B Request");
		queue.offer("A Request");
		queue.offer("C Request");

		System.out.println(queue);
		System.out.println(queue.peek());
		queue.poll();
		System.out.println(queue);

		System.out.println();

		Queue<String> queue_two = new LinkedList<>();
		queue_two.offer("B Request");
		queue_two.offer("A Request");
		queue_two.offer("C Request");

		System.out.println(queue_two);
		System.out.println(queue_two.peek());
		queue_two.poll();
		System.out.println(queue_two);

		System.out.println();

		Queue<String> queue_three = new PriorityQueue<>();
		queue_three.offer("B Request");
		queue_three.offer("A Request");
		queue_three.offer("C Request");

		System.out.println(queue_three);
		System.out.println(queue_three.peek());
		queue_three.poll();
		System.out.println(queue_three);

	}

}
