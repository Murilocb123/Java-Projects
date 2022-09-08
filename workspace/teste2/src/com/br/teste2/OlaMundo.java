package com.br.teste2;

import java.io.FileInputStream;
import java.io.InputStream;
import java.nio.file.Path;



public class OlaMundo {
	
	public static String path;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("teste");
		
		try {
			Runtime.getRuntime().exec("explorer.exe / open,"+ path);
			InputStream file = new FileInputStream(path);
		}catch(Exception ex){
			System.out.println(ex);
			
		}
		
	}

}
