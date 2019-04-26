package com.liuchaolong;

public class LinkList<E> extends AbstractList<E> {
	
	private static class Node<E> {
		public Node<E> next;
		public E element;
		
		public Node(Node<E> next, E element) {
			super();
			this.next = next;
			this.element = element;
		}
	}
	
	/**
	 * 第一个节点
	 */
	private Node<E> first;
	
	/**
	 * 清除所有元素
	 */
	public void clear() {
		first = null;
		size = 0;
	}
	
	/**
	 * 获取index位置的元素
	 * @param index
	 * @return
	 */
	public E get(int index) {
		rangeCheck(index);
		return node(index).element;
	}
	
	/**
	 * 设置index位置的元素
	 * @param index
	 * @param element
	 * @return 原来的元素
	 */
	public E set(int index, E element) {
		Node<E> node = node(index);
		E oldElement = node.element;
		node.element = element;
		return oldElement;
	}
	
	/**
	 * 在index位置插入一个元素
	 * @param index
	 * @param element
	 */
	public void add(int index, E element) {
		rangeCheckForAdd(index);
		
		if (index == 0) {
			first = new Node<E>(first, element);
		}
		else {
			Node<E> prev = node(index - 1);
			prev.next = new Node<E>(prev.next, element);
		}
		
		size ++;
	}
	
	/**
	 * 删除index位置的元素
	 * @param index
	 * @return
	 */
	public E remove(int index) {
		rangeCheck(index);
		
		Node<E> node = first;
		if (index == 0) {
			first = first.next;
		}
		else {
			Node<E> prev = node(index - 1);
			node = prev.next;
			prev.next = node.next;
		}
		size --;
		return node.element;
	}
	
	/**
	 * 查看元素的索引
	 * @param element
	 * @return
	 */
	public int indexOf(E element) {
		if (element == null) {
			
		}
		
		return ELEMENT_NOT_FOUND;
	}
	
	private Node<E> node(int index) {
		rangeCheck(index);
		
		Node<E> node = first;
		for (int i = 0; i < index; i++) {
			node = first.next;
		}
		
		return node;
	}
	

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		// 自定义类的打印方法
		StringBuilder stringBuilder = new StringBuilder();
		stringBuilder.append("size=").append(size).append(",[");
		Node<E> node = first;
		for (int i = 0; i < size; i++) {
			if (i > 0) {
				stringBuilder.append(" ,");
			}
			stringBuilder.append(node.element);
			node = node.next;
		}
		stringBuilder.append("]");
		return stringBuilder.toString();
	}
	
	

}
