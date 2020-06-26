package aulasjavaavc;

import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
public class LeCharTeclado {
	//para tratar o fluxo de sa�da existe a classe abstrata
	//OutputStream
	//para tratar o fluxo de entrada existe a classe abstrata
	//InputStream
	public static void main(String[] args) {
		System.out.println("Digite uma tecla: ");
		InputStream is = System.in;
		System.out.println();
		//IS � a classe que sabe capturar um byte
		//recebendo neste caso de System.in que � a entrada padr�o do sistema (teclado)
		InputStreamReader isr = new InputStreamReader(is);
		//ISR sabe receber um byte e transforma-lo em char
		char c;
		try {
		c = (char) isr.read();
		System.out.println("Voc� digitou a tecla " + c);
		}catch (IOException e) {
			e.printStackTrace();
		}
	}
	
}
