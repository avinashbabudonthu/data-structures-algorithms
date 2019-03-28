package com.linked.list;

import org.junit.Before;
import org.junit.Test;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class RemoveNodes {

	private Node head;
	private Node tail;
	private final Iterator iterator = new Iterator();

	@Before
	public void init() {
		Node node1 = Node.builder().value("1").build();
		Node node2 = Node.builder().value("2").build();
		Node node3 = Node.builder().value("3").build();
		Node node4 = Node.builder().value("4").build();
		Node node5 = Node.builder().value("5").build();

		node1.setNext(node2);
		node2.setNext(node3);
		node3.setNext(node4);
		node4.setNext(node5);

		head = node1;
		tail = node5;
	}

	@Test
	public void removeFromFirst() {
		String list = iterator.toString(head);
		log.info("before, head={}, tail={}, list={}", head, tail, list);
	}

	@Test
	public void removeFromLast() {

	}

	@Test
	public void removeByIndex() {

	}

	@Test
	public void removeByValue() {

	}
}
