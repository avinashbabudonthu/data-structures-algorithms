package com.linked.list;

import java.util.Objects;

import org.junit.Test;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class AddNodes {

	private Node head;
	private Node tail;
	private Long noOfNodes = 0L;

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

	private void addAtFirst(Node node) {
		if (Objects.isNull(node)) {
			log.info("null argument, node={}", node);
			return;
		}

		// 1st node
		if (null == head && null == tail) {
			head = tail = node;
			noOfNodes++;
			StringBuilder list = new StringBuilder();
			Node tempNode = head;
			while (null != tempNode) {
				list.append(tempNode.getValue());
				tempNode = tempNode.getNext();
				if (null != tempNode) {
					list.append("->");
				}
			}
			log.info("head={}, tail={}, count={}, list={}", head, tail, noOfNodes, list);
			return;
		}

		// already elements present in the list
		if (null != head && null != tail) {
			Node tempNode1 = head;
			head = node;
			head.setNext(tempNode1);
			noOfNodes++;

			Node tempNode2 = head;
			StringBuilder list = new StringBuilder();
			while (null != tempNode2) {
				list.append(tempNode2.getValue());
				tempNode2 = tempNode2.getNext();
				if (null != tempNode2) {
					list.append("->");
				}
			}
			log.info("head={}, tail={}, count={}, list={}", head, tail, noOfNodes, list);
		}
	}

	private void addAtLast(Node node) {
		if (null == node) {
			log.info("null argument, node={}", node);
			return;
		}

		if (null == head && null == tail) {
			head = tail = node;
			noOfNodes++;
			StringBuilder list = new StringBuilder();
			Node tempNode = head;
			while (null != tempNode) {
				list.append(tempNode.getValue());
				tempNode = tempNode.getNext();
				if (null != tempNode)
					list.append("->");
			}
			log.info("head={}, tail={}, count={}, list={}", head, tail, noOfNodes, list);
		}

		if (null != head && null != tail) {
			tail.setNext(node);
			tail = node;
			noOfNodes++;
			StringBuilder list = new StringBuilder();
			Node tempNode = head;
			while (null != tempNode) {
				list.append(tempNode.getValue());
				tempNode = tempNode.getNext();
				if (null != tempNode)
					list.append("->");
			}
			log.info("head={}, tail={}, count={}, list={}", head, tail, noOfNodes, list);
		}
	}
}