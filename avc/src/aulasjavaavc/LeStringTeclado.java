package aulasjavaavc;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
public class LeStringTeclado {
	
	public static void main(String[] args) throws IOException {
		
		InputStream is = new FileInputStream("teste.txt");
		System.out.println();
		
		InputStreamReader isr = new InputStreamReader(is);
		
		BufferedReader bfr = new BufferedReader(isr);
		
		String s = bfr.readLine();
			System.out.println("Conteúdo do arquivo: " + s+"\n\n");
		while (s != null) {
			System.out.println(s);
			s = bfr.readLine();
		}
	}
}
