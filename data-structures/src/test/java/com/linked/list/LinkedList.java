package com.linked.list;

import org.junit.Test;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class LinkedList {

	@Test
	public void createNode() {
		Node node1 = Node.builder().value("3").build();
		log.info("node1={}", node1);
	}
}
