package cadastro.view;

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
	JLabel le = new JLabel("Endereço:");
	JLabel lEndereco = new JLabel();
	JLabel lb = new JLabel("Bairro:");
	JLabel lBairro = new JLabel();
	JLabel lt = new JLabel("Telefone:");
	JLabel lTelefone = new JLabel();
	JLabel lcl = new JLabel("Celular:");
	JLabel lCelular = new JLabel();
	JLabel lCid = new JLabel("Cidade:");
	JLabel lCidade = new JLabel();
	JLabel les = new JLabel("Estado:");
	JLabel lEstado = new JLabel();
	JLabel lcep = new JLabel("CEP:");
	JLabel lCEP = new JLabel();
	
	JButton btnFechar = new JButton("Fechar");

	public static void main(String args[]) {
		
	}
	
	public ExibirCadastro() {
		
	}
	
	public void exibir(String nome, String cpf, String rg, String sexo, String endereco, String bairro, String cep, String estado, String cidade, String telefone, String celular) {
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
		paine.add(le);
		le.setBounds(30, 150, 80, 30);
		paine.add(lb);
		lb.setBounds(30, 180, 50, 30);
		paine.add(lCid);
		lCid.setBounds(30, 210, 50, 30);
		paine.add(les);
		les.setBounds(30, 300, 50, 30);
		paine.add(lcep);
		lcep.setBounds(30, 270, 50, 30);
		paine.add(lt);
		lt.setBounds(30, 360, 80, 30);
		paine.add(lcl);
		lcl.setBounds(30, 330, 50, 30);
		
		paine.add(lNome);
		lNome.setBounds(70, 30, 500, 30);
		paine.add(lCPF);
		lCPF.setBounds(70, 60, 90, 30);
		paine.add(lRG);
		lRG.setBounds(70, 90, 75, 30);
		paine.add(lSexo);
		lSexo.setBounds(70, 120, 100, 30);
		paine.add(lEndereco);
		lEndereco.setBounds(100, 150, 500, 30);
		paine.add(lBairro);
		lBairro.setBounds(80, 180, 300, 30);
		paine.add(lCidade);
		lCidade.setBounds(80, 210, 100, 30);
		paine.add(lEstado);
		lEstado.setBounds(80, 300, 50, 30);
		paine.add(lCEP);
		lCEP.setBounds(70, 270, 80, 30);
		paine.add(lTelefone);
		lTelefone.setBounds(100, 360, 110, 30);
		paine.add(lCelular);
		lCelular.setBounds(80, 330, 110, 30);
		
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
		lEndereco.setText(endereco);
		lBairro.setText(bairro);
		lCEP.setText(cep);
		lEstado.setText(estado);
		lCidade.setText(cidade);
		lTelefone.setText(telefone);
		lCelular.setText(celular);
		/*lSexo.setText(sexo);*/					
		
		this.setLocation(300, 300);
		this.setTitle("Cadastro: " + nome);
		this.setLayout(null);
		this.setSize(500, 450);
		this.setVisible(true);
	}
}
