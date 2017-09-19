package cadastro.pessoafisica;

import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class MensagemBox extends JFrame{
	
	static String Titulo = "";
	static String Mensagem = "";
	JLabel label = new JLabel();
	JButton btnOk = new JButton("OK");

	public static void Main(String args[]) {
		
	}
	public void exibirMensagem(String titulo, String mensagem) {
		MensagemBox Mb = new MensagemBox();
		
		Titulo = titulo;
		Mensagem = mensagem;
		
		Container paine = this.getContentPane();
	
		
		label.setText(Mensagem);
		paine.add(label);
		label.setBounds(10, 10, 610, 30);
		
		paine.add(btnOk);
		btnOk.setBounds(260, 50, 80, 30);
		btnOk.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				MensagemBox.this.dispose();
				TelaCadastro.ativarCampos(true);
			}
		});
		
		this.setLocation(300, 300);
		this.setTitle(Titulo);
		this.setLayout(null);
		this.setSize(620, 130);
		this.setVisible(true);
	}
	
	public MensagemBox() {
		super(Titulo);
		
		
	}
}
