package chat;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

public class Server {

	public static void main(String[] args) {
		ServerSocket server = null;
		try {
			server = new ServerSocket(10000);
			System.out.println("Ok, porta 10000 aberta, aguardando conexão cliente!");
			
			while (true) {
				Socket cliente = server.accept();
				new GerenciadorCliente(cliente);
			}
		} catch (IOException e) {
			try {
				if (server != null)
					server.close();
			} catch (IOException e1) {
			}

			System.err.println("porta fechada ou servidor encerrado");
			e.printStackTrace();
		}
	}
}
