package com.data.structures;

import java.util.Deque;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Set;

public class CollectionsFlirtations {

	public void addToEndOfLinkedList(LinkedList<Integer> list, int i) {

		list.add(i);
	}

	public void addToStartOfLinkedList(LinkedList<Integer> list, int k) {
		list.addFirst(k);
	}

	public void removeItemFromTopOfStack(Deque<Integer> stack) {
		stack.pop();
	}

	public void removeItemFromFrontOfQueue(Queue<Integer> queue) {
		queue.poll();
	}

	public void addItemToTreeSet(Set<Integer> treeSet, int k) {
		treeSet.add(k);
	}

}
