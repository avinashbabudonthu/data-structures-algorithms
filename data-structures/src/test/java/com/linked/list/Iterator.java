package com.linked.list;

import org.junit.Test;

public class Iterator {

	@Test
	public String toString(Node head) {
		StringBuilder list = new StringBuilder();
		Node tempNode = head;
		while (null != tempNode) {
			list.append(tempNode.getValue());
			tempNode = tempNode.getNext();
			if (null != tempNode) {
				list.append("->");
			}
		}
		return list.toString();
	}
}
