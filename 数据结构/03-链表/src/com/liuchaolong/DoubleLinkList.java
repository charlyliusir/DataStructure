package com.liuchaolong;

public class DoubleLinkList<E> extends AbstractList<E> {
	
	public Node<E> first;
	public Node<E> last;
	
	private static class Node<E> {
		public Node<E> prev;
		public Node<E> next;
		public E element;
		
		public Node(Node<E> prev, Node<E> next, E element) {
			super();
			this.prev = prev;
			this.next = next;
			this.element = element;
		}
	}

	@Override
	public void clear() {
		// TODO Auto-generated method stub
		first = null;
		last  = null;
		size  = 0;
	}

	@Override
	public E get(int index) {
		// TODO Auto-generated method stub
		return node(index).element;
	}

	@Override
	public E set(int index, E element) {
		// TODO Auto-generated method stub
		
		rangeCheck(index);
		
		Node<E> oldNode = node(index);
		E oldElement    = oldNode.element;
		oldNode.element = element;
		
		return oldElement;
	}

	@Override
	public void add(int index, E element) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public E remove(int index) {
		// TODO Auto-generated method stub
		Node<E> oldNode = first;
		if (index == 0) {
			first = oldNode.next;
		}
		else {
			Node<E> prev = node(index - 1);
		}
		
		
		
		return null;
	}

	@Override
	public int indexOf(E element) {
		// TODO Auto-generated method stub
		Node<E> node = first;
		if (element == null) {
			for (int i = 0; i < size; i++) {
				if (node.element == null) return i;
				node = node.next;
			}
		}
		else {
			for (int i = 0; i < size; i++) {
				if (element.equals(node.element)) return i;
				node = node.next;
			}
		}
		return ELEMENT_NOT_FOUND;
	}

	private Node<E> node(int index) {
		rangeCheck(index);
		// 1. 判断比中间值小, 从前往后遍历, 比中间值大, 从后往前遍历
		if (index < (size >> 1)) {
			Node<E> node = first;
			for (int i = 0; i < index; i++) {
				node = node.next;
			}
			return node;
		}
		else {
			Node<E> node = last;
			for (int i = size - 1; i > index; i--) {
				node = last.prev;
			}
			return node;
		}
	}

}
