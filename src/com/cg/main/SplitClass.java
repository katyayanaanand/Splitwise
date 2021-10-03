package com.cg.main;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;

public class SplitClass {

	public static void main(String[] args) throws Exception {
		File file =new File(args[0]);
		BufferedReader br= new BufferedReader(new FileReader(file));
		String st;
		while((st=br.readLine()) != null) {
			String str[]= st.split(" ");
			String cmd= str[0];
			switch(cmd) {
			case "SHOW" :
				
			break;
			case "EXPENSE":
				
			break;
			}
		}
		
		br.close();
	}

}
