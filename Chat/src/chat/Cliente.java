package chat;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;
import java.net.UnknownHostException;

public class Cliente {
	public static void main(String[] args) {
		try {
			final Socket cliente = new Socket("127.0.0.1", 10000);
			// ler mensagem do servidor
			new Thread() {
				@Override
				public void run() {
					try {
						BufferedReader leitor = new BufferedReader(new InputStreamReader(cliente.getInputStream()));

						while (true) {
							String mensagem = leitor.readLine();
							System.out.println("servidor diz: " + mensagem);
						}
					} catch (IOException e) {
						System.out.println("n�o foi poss�vel ler a mensagem!");
						e.printStackTrace();
					}
				}
			}.start();
			
			// escrever mensagem para o servidor
			PrintWriter escritor = new PrintWriter(cliente.getOutputStream(), true);
			BufferedReader leitorTerminal = new BufferedReader(new InputStreamReader(System.in));

			while (true) {
				String mensagemTerminal = leitorTerminal.readLine();
				escritor.println(mensagemTerminal);
			}
		} catch (UnknownHostException e) {
			System.out.println("Endere�o inv�lido!");
			e.printStackTrace();
		} catch (IOException e) {
			System.out.println("Servidor pode estar fora do ar!");
			e.printStackTrace();
		}
	}
}
