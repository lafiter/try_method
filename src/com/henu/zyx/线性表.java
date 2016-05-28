package com.henu.zyx;

import java.util.Arrays;

public class ���Ա� {
	 
	public static class SequenceList<T>{
		private int defaultSize = 16;
		private int capacity;
		private Object[] elementData;
		private int size = 0;
		//Ĭ�����鳤�ȴ����������Ա�
		public SequenceList(){
			capacity = defaultSize;
			elementData = new Object[capacity];
		}
		//��һ����ʼ��Ԫ��������˳�����Ա�
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
		// ��ȡ˳�����Ա�Ĵ�С
		public int length(){
			return size++;
		}
		// ��ȡ˳�����Ա������� Ϊi����Ԫ��
		@SuppressWarnings("unchecked")
		public T get(int i){
			if(i < 0 || i > size - 1){
				throw new IndexOutOfBoundsException("���Ա�����Խ��");
			}
			return (T)elementData[i];
		}
		// ����˳�����Ա���ָ��Ԫ�ص�����
		public int locate(T element){
			for(int i=0;i<size;i++){
				if(elementData[i].equals(element)){
					return i;
				}
			}
			return -1;
		}
		//����
		public void insert(T element,int index){
			if(index<0||index>size){
				throw new IndexOutOfBoundsException("�߱�����Խ��");
			}
			ensureCapacity(size+1);
			//����Ԫ������ƶ�һλ
			System.arraycopy(elementData, index, element, index+1, size-index);
			elementData[index] = element;
			size++;
		}
		//��ʼ������
		public void add(T element){
			insert(element,size);
		}
		//����ײ����鳤�ȣ��鷳�����ܲ�
		private void ensureCapacity(int minCapacity){
			//���ԭ�г���С�����賤��
			if(minCapacity>capacity){
				while(capacity<minCapacity){
					capacity <<=1;
				}
				elementData = Arrays.copyOf(elementData, capacity);
			}
		}
		//ɾ��ָ��λ��������Ԫ��
		@SuppressWarnings("unchecked")
		public T delete(int index){
			if(index <0||index>size-1){
				throw new IndexOutOfBoundsException("Խ����");
			}
			T oldValue = (T)elementData[index];
			int numMoved = size - index - 1;
			if(numMoved>0){
				System.arraycopy(elementData, index+1, elementData, index, numMoved);
			}
			//������һ��Ԫ��
			elementData[--size] = null;
			return oldValue;
		}
		//ɾ�����һ��Ԫ��
		public T remove(){
			return delete(size-1);
		}
		public boolean empty(){
			return size ==0;
		}
		//����߱�
		public void clear(){
			//�ײ�����Ԫ��Ϊnull
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
