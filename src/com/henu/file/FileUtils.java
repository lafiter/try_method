package com.henu.file;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOError;
import java.io.IOException;

public class FileUtils {

	/**
	 * @param args
	 */
	public static void listDirectory(File dir){
		if(!dir.exists()){
			throw new IllegalArgumentException("目录："+dir+"不存在");
		}
		if(!dir.isDirectory()){
			throw new IllegalArgumentException(dir+"不是目录");
		}
		File[] files = dir.listFiles();
		if(files!=null && files.length>0){
			for(File file:files){
				if(file.isDirectory()){
					listDirectory(file);
				}else{
					System.out.println(file);
				}
			}
		}
//		String[] filenames = dir.list();
//		for(String string:filenames){
//			System.out.println(dir+"\\"+string);
//		}
	}
	public static void main(String[] args) throws IOException{
		File file = new File("file/demo.bat");
		 
		FileInputStream fis = new FileInputStream(file);
		FileOutputStream fos = new FileOutputStream(file);
        
	}

}
