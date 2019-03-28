package com.linked.list;

import java.util.Objects;

import org.junit.Test;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class AddNodes {

	private Node head;
	private Node tail;
	private Long noOfNodes = 0L;
	private final Iterator iterator = new Iterator();

	@Test
	public void add() {
		addAtFirst(null);
		addAtFirst(Node.builder().value("1").build());
		addAtFirst(Node.builder().value("2").build());
		addAtFirst(Node.builder().value("3").build());
		addAtFirst(Node.builder().value("4").build());
		addAtFirst(Node.builder().value("5").build());
		addAtLast(Node.builder().value("6").build());
		addAtLast(Node.builder().value("7").build());
		addAtLast(Node.builder().value("8").build());
	}

	@Test
	public void addByIndex() {
		addByIndex(null, 0);
		addByIndex(Node.builder().value("1").build(), 1);
		addByIndex(Node.builder().value("1").build(), 0);
		addByIndex(Node.builder().value("2").build(), 1);
		addByIndex(Node.builder().value("3").build(), 0);
		addByIndex(Node.builder().value("4").build(), 2);
		addByIndex(Node.builder().value("5").build(), 4);

	}

	private void addAtFirst(Node node) {
		if (Objects.isNull(node)) {
			log.info("invalid argument, node={}", node);
			return;
		}

		// 1st node
		if (0 == noOfNodes) {
			head = tail = node;
			noOfNodes++;
			String list = iterator.toString(head);
			log.info("head={}, tail={}, count={}, list={}", head, tail, noOfNodes, list);
			return;
		}

		// already elements present in the list
		if (noOfNodes > 0) {
			Node tempNode1 = head;
			head = node;
			head.setNext(tempNode1);
			noOfNodes++;

			String list = iterator.toString(head);
			log.info("head={}, tail={}, count={}, list={}", head, tail, noOfNodes, list);
			return;
		}
	}

	private void addAtLast(Node node) {
		if (null == node) {
			log.info("invalid argument, node={}", node);
			return;
		}

		if (0 == noOfNodes) {
			head = tail = node;
			noOfNodes++;
			String list = iterator.toString(head);
			log.info("head={}, tail={}, count={}, list={}", head, tail, noOfNodes, list);
			return;
		}

		if (noOfNodes > 0) {
			tail.setNext(node);
			tail = node;
			noOfNodes++;
			String list = iterator.toString(head);
			log.info("head={}, tail={}, count={}, list={}", head, tail, noOfNodes, list);
			return;
		}
	}

	private void addByIndex(Node node, int index) {
		if (null == node) {
			log.info("invalid argument, node={}", node);
			return;
		}

		if ((0 == noOfNodes && index > 0) || (index > noOfNodes)) {
			log.info("invalid argument, noOfNodes={}, index={}", noOfNodes, index);
			return;
		}

		if (0 == noOfNodes && 0 == index) {
			head = tail = node;
			noOfNodes++;
			String list = iterator.toString(head);
			log.info("head={}, tail={}, count={}, list={}", head, tail, noOfNodes, list);
			return;
		}

		if (0 == index) {
			Node temp = head;
			head = node;
			head.setNext(temp);
			noOfNodes++;
			String list = iterator.toString(head);
			log.info("head={}, tail={}, count={}, list={}", head, tail, noOfNodes, list);
			return;
		}

		Node p1 = head;
		if (noOfNodes >= index) {
			for (int i = 0; i < index - 1; i++) {
				p1 = p1.getNext();
			}

			node.setNext(p1.getNext());
			p1.setNext(node);
			noOfNodes++;
			String list = iterator.toString(head);
			log.info("head={}, tail={}, count={}, list={}", head, tail, noOfNodes, list);
			return;
		}
	}
}