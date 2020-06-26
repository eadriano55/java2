package org.pap.wiki.chats;

import java.io.IOException;

public class RodaServidor {

	public static void main(String[] args) 
			throws IOException {
		new Servidor(10000).executa();
	}
}