package org.pap.wiki.chats;

import java.io.IOException;
import java.net.UnknownHostException;

public class RodaCliente {
	public static void main(String[] args) 
			throws UnknownHostException,	IOException {
		new Cliente("127.0.0.1", 10000).executa();
	}
}