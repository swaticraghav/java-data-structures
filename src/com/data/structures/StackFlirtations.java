package com.data.structures;

import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Deque;

public class StackFlirtations {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Deque<String> stack = new ArrayDeque<>();
		stack.push("First Request");
		stack.push("Second Request");
		stack.push("Third Request");
		
		System.out.println(stack);
		System.out.println(stack.peek());
		System.out.println(stack.pop());
		System.out.println(stack);
		System.out.println(stack.poll());
		System.out.println(stack);
		
		Deque<Integer> stack_1 = new ArrayDeque<>(Arrays.asList(2, 79, 3));
		System.out.println(stack_1);
		stack_1.poll();
		System.out.println(stack_1.peek());
	}

}
