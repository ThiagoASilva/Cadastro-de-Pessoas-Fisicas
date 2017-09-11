package cadastro.pessoafisica;

import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class ExibirCadastro extends JFrame{
	
	JLabel ln = new JLabel("Nome: ");
	JLabel lNome = new JLabel();
	JLabel lc = new JLabel("CPF: ");
	JLabel lCPF = new JLabel();
	JLabel lr = new  JLabel("RG: ");
	JLabel lRG = new JLabel();
	JLabel ls = new JLabel("Sexo: ");
	JLabel lSexo = new JLabel();
	JButton btnFechar = new JButton("Fechar");

	public static void main(String args[]) {
		
	}
	
	public ExibirCadastro() {
		
	}
	
	public void exibir(String nome, String cpf, String rg, String sexo) {
		ExibirCadastro EC = new ExibirCadastro();
		Container paine = this.getContentPane();		
		
		paine.add(ln);
		ln.setBounds(30, 30, 39, 30);
		paine.add(lc);
		lc.setBounds(30, 60, 28, 30);
		paine.add(lr);
		lr.setBounds(30, 90, 22, 30);
		paine.add(ls);
		ls.setBounds(30, 120, 35, 30);
		
		paine.add(lNome);
		lNome.setBounds(70, 30, 500, 30);
		paine.add(lCPF);
		lCPF.setBounds(70, 60, 90, 30);
		paine.add(lRG);
		lRG.setBounds(70, 90, 75, 30);
		paine.add(lSexo);
		lSexo.setBounds(70, 120, 100, 30);
		
		paine.add(btnFechar);
		btnFechar.setBounds(350, 140, 80, 30);
		btnFechar.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				ExibirCadastro.this.dispose();
				TelaCadastro.ativarCampos(true);
				
			}
		});
		
		lNome.setText(nome);
		lCPF.setText(cpf);
		lRG.setText(rg);
		lSexo.setText(sexo);					
		
		this.setLocation(300, 300);
		this.setTitle("Casdastro: " + nome);
		this.setLayout(null);
		this.setSize(500, 300);
		this.setVisible(true);
	}
}
