package com.data.structures.test;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Deque;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Set;
import java.util.TreeSet;

import org.junit.jupiter.api.Test;

import com.data.structures.CollectionsFlirtations;

class CollectionsFlirtationsTest {

	CollectionsFlirtations coll = new CollectionsFlirtations();

	@Test
	void test() {
		// fail("Not yet implemented");s
	}

	@Test
	void addToEndOfLinkedListTest() {
		LinkedList<Integer> input = new LinkedList<>(Arrays.asList(2, 79, 3));
		coll.addToEndOfLinkedList(input, 7);
		assertEquals(Integer.valueOf(7), input.getLast());
	}

	@Test
	void addToStartOfLinkedListTest() {
		LinkedList<Integer> input = new LinkedList<>(Arrays.asList(2, 79, 3));
		coll.addToStartOfLinkedList(input, 7);
		assertEquals(Integer.valueOf(7), input.getFirst());

	}

	@Test
	void removeItemFromTopOfStackTest() {
		Deque<Integer> stack = new ArrayDeque<>(Arrays.asList(2, 79, 3));
		coll.removeItemFromTopOfStack(stack);
		assertEquals(stack.peek(), Integer.valueOf(79));
	}

	@Test
	void removeItemFromFrontOfQueueTest() {
		Queue<Integer> queue = new ArrayDeque<>(Arrays.asList(2, 79, 3));
		coll.removeItemFromFrontOfQueue(queue);
		assertEquals(queue.poll(), 79);
	}

	@Test
	void addItemToTreeSetTest() {
		Set<Integer> set = new TreeSet<>(Arrays.asList(2, 79, 3));
		coll.addItemToTreeSet(set, 3);
		assertEquals(set.size(), Integer.valueOf(3));

	}

}
