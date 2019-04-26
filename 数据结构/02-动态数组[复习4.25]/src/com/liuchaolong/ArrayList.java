package com.liuchaolong;

public class ArrayList<E> {
	
	private int size; 		// 数组个数
	private E[] elements; 	// 数组容器
	
	public static int DEFAULT_ELEMENT_CAPACITY = 10;
	public static int ELEMENT_NOT_FOUND = -1;
	
	/**
	 * 数组构造器
	 * @param capacity 数组初始容积
	 */
	public ArrayList(int capacity) {
			capacity = (capacity < DEFAULT_ELEMENT_CAPACITY) ? DEFAULT_ELEMENT_CAPACITY : capacity;
		elements = (E[])new Object[capacity];
	}

	/**
	 * 数组构造器, 使用默认容积 DEFAULT_ELEMENT_CAPACITY
	 */
	public ArrayList() {
		this(DEFAULT_ELEMENT_CAPACITY);
	}
	
	/**
	 * 清空数组
	 */
	public void clear() {
		for (int i = 0; i < size; i++) {
			elements[i] = null;
		}
		size = 0;
	}

	/**
	 * 获取数组大小
	 * @return
	 */
	public int size() {
		return size;
	}
	
	/**
	 * 数组是否为空
	 * @return
	 */
	public boolean isEmpty() {
		return size == 0;
	}
	
	public boolean contains(E element) {
		return indexOf(element) != ELEMENT_NOT_FOUND;
	}
	
	/**
	 * 数组尾部加入元素
	 */
	public void add(E element) {
		add(size, element);
	}	
	
	/**
	 * 获取元素
	 * @param index
	 * @return
	 */
	public E get(int index) {
		rangeCheck(index);
		return elements[index];
	}
	
	/**
	 * 修改索引位置的元素为新的元素
	 * @param index
	 * @param element
	 * @return
	 */
	public E set(int index, E element) {
		rangeCheck(index);
		E oldElement = elements[index];
		elements[index] = element;
		return oldElement;
	}
	
	/**
	 * 添加元素
	 * @param index   索引位置
	 * @param element 添加的元素
	 * @return
	 */
	public void add(int index, E element) {
		rangeCheckOfAdd(index);
		ensureCapacity(size + 1);
		for (int i = size; i > index; i++) {
			elements[i] = elements[i - 1];
		}
		elements[index] = element;
		
		size ++;
	}
	
	/**
	 * 删除元素
	 * @param index 删除元素的索引位置
	 * @return
	 */
	public E remove(int index) {
		rangeCheck(index);
		E oldElement = elements[index];
		for (int i = index + 1; i < size; i++) {
			elements[i - 1] = elements[i];
		}
		elements[--size] = null;
		return oldElement;
	}
	
	/**
	 * 获取元素的索引
	 * @param element
	 * @return
	 */
	public int indexOf(E element) {
		for (int i = 0; i < size; i++) {
			if (element.equals(elements[i])) return i;
		}
		return ELEMENT_NOT_FOUND;
	}
	
	private void outOfBounds(int index) {
		throw new IndexOutOfBoundsException("Index:" + index + " ,Size" + size);
	}
	
	private void rangeCheck(int index) {
		if (index < 0 || index >= size) {
			outOfBounds(index);
		}
	}
	
	private void rangeCheckOfAdd(int index) {
		if (index < 0 || index > size) {
			outOfBounds(index);
		}
	}
	
	/**
	 * 保证最小容积
	 * @param capacity
	 */
	private void ensureCapacity(int capacity) {
		int oldCapacity = elements.length;
		// 判断是否需要扩容
		if (oldCapacity >= capacity) return;
		
		int newCapacity = oldCapacity + (oldCapacity >> 1);
		E[] newElementEs = (E[]) new Object[newCapacity];
		for (int i = 0; i < size; i++) {
			newElementEs[i] = elements[i];
		}
		
		elements = newElementEs;
			
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		StringBuilder stringBuilder = new StringBuilder();
		stringBuilder.append("size:" + size + "  [");
		for (int i = 0; i < size; i++) {
			stringBuilder.append(elements[i]);
			if (i != size - 1) stringBuilder.append(" ,"); 
		}
		stringBuilder.append("]");
		return stringBuilder.toString();
	}

}
