package com.henu.reflect;

import java.lang.annotation.Annotation;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

import fkJAVA.Array.HasStatic;

public class ClassUtils {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		 String s = "hello";
		 HasStatic hs = new HasStatic();
		 ClassUtils.print(hs);

	}
	public static void print(Object obj){
		Class c = obj.getClass();
		System.out.println("类的名称是"+c.getName());
		
		Method[] ms = c.getMethods();
		for(int i=0;i<ms.length;i++){
			Class returnType = ms[i].getReturnType();
			System.out.println("返回值类型"+returnType.getName()+"  ");
			System.out.print(ms[i].getName()+"(");
			Class[] paramsTypes = ms[i].getParameterTypes();
			for(Class c1:paramsTypes){
				System.out.print(c1.getName()+",");
			}
			System.out.print(")");
			Annotation[] an = ms[i].getClass().getAnnotations();
			for(Annotation as:an){
				System.out.println("注释:"+as);
			}
			Field[] fs = c.getDeclaredFields();
			for(Field fd:fs){
				Class fieldType = fd.getType();
				String typeName = fieldType.getName();
				String fieldName = fd.getName();
				System.out.println(typeName+fieldName);
			}
		}
		
	}

}
