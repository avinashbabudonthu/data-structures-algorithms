package com.linked.list;

import java.util.Objects;

import org.junit.Test;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class LinkedList {

	@Test
	public void createNode() {
		Node node1 = Node.builder().value("3").build();
		log.info("node1={}", node1);
	}

	@Test
	public void createLinkedList() {
		Node node1 = Node.builder().value("3").build();
		Node node2 = Node.builder().value("5").build();

		node1.setNext(node2);

		Node tempNode = node1;
		StringBuilder result = new StringBuilder();
		while (Objects.nonNull(tempNode)) {
			result.append(tempNode.getValue());
			tempNode = tempNode.getNext();
			if (Objects.nonNull(tempNode))
				result.append("->");
		}

		log.info("result={}", result);
	}
}
