import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Component;
import java.awt.Dimension;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;
import java.net.UnknownHostException;

import javax.swing.DefaultListModel;
import javax.swing.JFrame;
import javax.swing.JList;
import javax.swing.JOptionPane;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;

public class ClienteSocketSwing extends JFrame {
	/**
	 * 
	 */
	private static final long serialVersionUID = -5261903818373181455L;
	private JTextArea taEditor = new JTextArea("Digite aqui sua mensagem");
	private JTextArea taVisor = new JTextArea();
	private JList liUsuarios = new JList();
	private PrintWriter escritor;
	private BufferedReader leitor;
	private JScrollPane scrolltaVisor = new JScrollPane(taVisor);

	public ClienteSocketSwing() {
		setTitle("Chat com sockets");
		setLocationRelativeTo(null);
		setLayout(new BorderLayout());
		liUsuarios.setBackground(Color.GRAY);
		taEditor.setBackground(Color.white);

		taEditor.setPreferredSize(new Dimension(400, 40));
		// taVisor.setPreferredSize(new Dimension (350, 100));
		taVisor.setEditable(false);
		liUsuarios.setPreferredSize(new Dimension(100, 140));

		add(taEditor, BorderLayout.SOUTH);
		add(scrolltaVisor, BorderLayout.CENTER);
		add(new JScrollPane(liUsuarios), BorderLayout.WEST);

		pack();
		setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);

		String[] usuarios = new String[] {"teste"};
		preencherListaUsuarios(usuarios);
	}

	private void preencherListaUsuarios(String[] usuarios) {
		DefaultListModel modelo = new DefaultListModel();
		liUsuarios.setModel(modelo);
		for (String usuario : usuarios) {
			modelo.addElement(usuario);
		}

	}

	private void iniciarEscritor() {
		taEditor.addKeyListener(new KeyListener() {

			@Override
			public void keyTyped(KeyEvent e) {
			}

			@Override
			public void keyPressed(KeyEvent e) {
				if (e.getKeyCode() == KeyEvent.VK_ENTER) {
					// escrevendo para o servidor
					if (taVisor.getText().isEmpty()) {
						return;
					}
					Object usuario = liUsuarios.getSelectedValue();
					if (usuario != null) {
						// jogando no visor
						taVisor.append("Eu:");
						taVisor.append(taEditor.getText());
						taVisor.append("\n");

						escritor.println(Comandos.MENSAGEM + usuario);
						escritor.println(taEditor.getText());
						// limpando o visor
						taEditor.setText("");
						e.consume();
					} else {
						if (taVisor.getText().equalsIgnoreCase(Comandos.SAIR)) {
							System.exit(0);

						}
						JOptionPane.showMessageDialog(ClienteSocketSwing.this, "selecione um usuário");
						return;
					}

				}
			}

			@Override
			public void keyReleased(KeyEvent e) {
			}
		});
	}

	public void iniciarChat() {
		try {
			final Socket cliente = new Socket("127.0.0.1", 9999);
			escritor = new PrintWriter(cliente.getOutputStream(), true);
			leitor = new BufferedReader(new InputStreamReader(cliente.getInputStream()));
		} catch (UnknownHostException e) {
			System.out.println("o endereço passado é inválido");
			e.printStackTrace();
		} catch (IOException e) {
			System.out.println("o servidor pode estar fora do ar");
			e.printStackTrace();
		}

	}

	public static void main(String[] args) {
		ClienteSocketSwing cliente = new ClienteSocketSwing();
		cliente.iniciarChat();
		cliente.iniciarEscritor();
		cliente.iniciarLeitor();
		//cliente.atualizarListaUsuarios();
		
	}

	private void atualizarListaUsuarios() {
		escritor.println(Comandos.LISTA_USUARIOS);
	}

	private void iniciarLeitor() {
		// lendo mensagens do servidor
		try {
			while (true) {
				String mensagem = leitor.readLine();
				if (mensagem == null || mensagem.isEmpty())
					continue;
				//recebe o texto
				if(mensagem.equals(Comandos.LISTA_USUARIOS)) {
					String[] usuarios = leitor.readLine().split(",");
					preencherListaUsuarios(usuarios);
				}else if(mensagem.equals(Comandos.LOGIN)) {
					String login= JOptionPane.showInputDialog("Qual o seu login? ");
					escritor.println(login);
				}else if(mensagem.equals(Comandos.LOGIN_NEGADO)){
					JOptionPane.showMessageDialog(ClienteSocketSwing.this, "o login é inválido");	
				}else if(mensagem.equals(Comandos.LOGIN_ACEITO)) {
					atualizarListaUsuarios();
				}else {
					taVisor.append(mensagem);
					taVisor.append("\n");
					taVisor.setCaretPosition(taVisor.getDocument().getLength());
				}
			}
		} catch (IOException e) {
			System.out.println("Impossível ler a mensagem do servidor");
			e.printStackTrace();
		}

	}

	private DefaultListModel getListaUsuarios() {
		return (DefaultListModel) liUsuarios.getModel();

	}
}
