package com.henu.zyx;

import java.util.Arrays;

public class 线性表 {
	 
	public static class SequenceList<T>{
		private int defaultSize = 16;
		private int capacity;
		private Object[] elementData;
		private int size = 0;
		//默认数组长度创建空序线性表
		public SequenceList(){
			capacity = defaultSize;
			elementData = new Object[capacity];
		}
		//以一个初始化元素来创建顺序线性表
		public SequenceList(T element){
			  this();
			  elementData[0] = element;
			  size++;
		}
		public SequenceList(T element,int initSize){
			capacity = 1;
			
			while(capacity<initSize){
				capacity<<=1;
			}
			elementData = new Object[capacity];
			elementData[0] = element;
			size++;
		}
		// 获取顺序线性表的大小
		public int length(){
			return size++;
		}
		// 获取顺序线性表中索引 为i处的元素
		@SuppressWarnings("unchecked")
		public T get(int i){
			if(i < 0 || i > size - 1){
				throw new IndexOutOfBoundsException("线性表索引越界");
			}
			return (T)elementData[i];
		}
		// 查找顺序线性表中指定元素的索引
		public int locate(T element){
			for(int i=0;i<size;i++){
				if(elementData[i].equals(element)){
					return i;
				}
			}
			return -1;
		}
		//插入
		public void insert(T element,int index){
			if(index<0||index>size){
				throw new IndexOutOfBoundsException("线表索引越界");
			}
			ensureCapacity(size+1);
			//所有元素向后移动一位
			System.arraycopy(elementData, index, element, index+1, size-index);
			elementData[index] = element;
			size++;
		}
		//开始处插入
		public void add(T element){
			insert(element,size);
		}
		//扩充底层数组长度，麻烦，性能差
		private void ensureCapacity(int minCapacity){
			//如果原有长度小于所需长度
			if(minCapacity>capacity){
				while(capacity<minCapacity){
					capacity <<=1;
				}
				elementData = Arrays.copyOf(elementData, capacity);
			}
		}
		//删除指定位置索引处元素
		@SuppressWarnings("unchecked")
		public T delete(int index){
			if(index <0||index>size-1){
				throw new IndexOutOfBoundsException("越界了");
			}
			T oldValue = (T)elementData[index];
			int numMoved = size - index - 1;
			if(numMoved>0){
				System.arraycopy(elementData, index+1, elementData, index, numMoved);
			}
			//清空最后一个元素
			elementData[--size] = null;
			return oldValue;
		}
		//删除最后一个元素
		public T remove(){
			return delete(size-1);
		}
		public boolean empty(){
			return size ==0;
		}
		//清空线表
		public void clear(){
			//底层所有元素为null
			Arrays.fill(elementData, null);
			size=0;
		}
		public String toString(){
			if(size == 0){
				return "[]";
			}else{
				StringBuilder sb = new StringBuilder("[");
				for(int i=0;i<size;i++){
					sb.append(elementData[i].toString()+",");
				}
				int len = sb.length();
				return sb.delete(len-2, len).append("]").toString();
			}
		}
	}

}
