package com.liuchaolong;

public class ArrayList<E> {
	/**
	 * 元素的个数
	 */
	private int size;
	/**
	 * 所有元素
	 */
	private E[] elements;
	
	private static final int DEFAULT_CAPACITY = 10;
	private static final int ELEMENT_NOT_FOUND = -1;
	
	public ArrayList(int capacity){
		capacity = (capacity < DEFAULT_CAPACITY) ? DEFAULT_CAPACITY : capacity;
		elements = (E[])new Object[capacity];
	}
	
	public ArrayList() {
		this(DEFAULT_CAPACITY);
	}
	
	/**
	 * 清除所有元素
	 */
	public void clear() {
		size = 0;
	}
	
	/**
	 * 元素的数量
	 * @return
	 */
	public int size() {
		return size;
	}
	
	/**
	 * 是否为空
	 * @return
	 */
	public boolean isEmpty() {
		return size == 0;
	}
	
	/**
	 * 是否包含某个元素
	 * @param element
	 * @return
	 */
	public boolean contains(E element) {
		return indexOf(element) != ELEMENT_NOT_FOUND;
	}
	
	/**
	 * 添加元素到尾部
	 * @param element
	 */
	public void add(E element) {
		elements[size++] = element;
	}
	
	/**
	 * 获取index位置的元素
	 * @param index
	 * @return
	 */
	public E get(int index) {
		if (index < 0 || index >= size) {
			throw new IndexOutOfBoundsException("Index:" + index + ", Size" + size);
		}
		return elements[index];
	}
	
	/**
	 * 设置index位置的元素
	 * @param index
	 * @param element
	 * @return 原来的元素
	 */
	public E set(int index, E element) {
		E oldElement = elements[index];
		elements[index] = element;
		return oldElement;
	}
	
	/**
	 * 在index位置插入一个元素
	 * @param index
	 * @param element
	 */
	public void add(int index, E element) {
		
	}
	
	/**
	 * 删除index位置的元素
	 * @param index
	 * @return
	 */
	public E remove(int index) {
		return null;
	}
	
	/**
	 * 查看元素的索引
	 * @param element
	 * @return
	 */
	public int indexOf(E element) {
		for (int i = 0; i < size; i++) {
			if (elements[i] == element) return -1;
		}
		return ELEMENT_NOT_FOUND;
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		// 自定义类的打印方法
		StringBuilder stringBuilder = new StringBuilder();
		stringBuilder.append("size=").append(size).append(",[");
		for (int i = 0; i < size; i++) {
			stringBuilder.append(elements[i]);
			if (i != size - 1) {
				stringBuilder.append(", ");
			}
		}
		stringBuilder.append("]");
		return stringBuilder.toString();
	}

}
