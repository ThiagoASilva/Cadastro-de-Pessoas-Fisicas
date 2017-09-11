package cadastro.pessoafisica;

import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class TelaCadastro extends JFrame{
	
	JLabel Lname = new JLabel("Nome");
	static JTextField TxtNome = new JTextField(); 
	JLabel LCPF = new JLabel("CPF");
	static JTextField TxtCPF = new JTextField(); 
	JLabel LRG = new JLabel("RG");
	static JTextField TxtRG = new JTextField(); 
	JLabel LSexo = new JLabel("Sexo");
	static String[] Sexos = {"Masculino", "Feminino", "--Selecione--"};
	static JComboBox CBoxSexo = new JComboBox(Sexos);	
	static JButton btnCadastrar = new JButton("Cadastrar");
	ExibirCadastro EC = new ExibirCadastro();
	
	public static void main(String args[]){
		
		TelaCadastro t = new TelaCadastro();		
	}
	
	public TelaCadastro(){		
		super("Cadastrar Pessoa Física");
		Container paine = this.getContentPane();
		
		paine.add(Lname);
		Lname.setBounds(30, 60, 33, 50);
		
		paine.add(TxtNome);
		TxtNome.setBounds(73, 70, 500, 30);
		
		paine.add(LCPF);
		LCPF.setBounds(610, 60, 22, 50);
		
		paine.add(TxtCPF);
		TxtCPF.setBounds(642, 70, 90, 30);
		
		paine.add(LRG);
		LRG.setBounds(752, 60, 16, 50);
		
		paine.add(TxtRG);
		TxtRG.setBounds(779, 70, 75, 30);
		
		paine.add(LSexo);
		LSexo.setBounds(30, 120, 33, 50);
		
		CBoxSexo.setSelectedIndex(2);
		paine.add(CBoxSexo);
		CBoxSexo.setBounds(73, 130, 100, 30);
		
		paine.add(btnCadastrar);
		btnCadastrar.setBounds(752, 190, 100, 30);	
		btnCadastrar.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				
				ativarCampos(false);
				if(verificarCampos()){
										
					EC.exibir(TxtNome.getText(), TxtCPF.getText(), TxtRG.getText(), CBoxSexo.getSelectedItem().toString());					
					
				}
				
			}
		});
		
		paine.setLayout(null);
		this.setSize(900, 860);
		this.setVisible(true);
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
	}
	
	public static void ativarCampos(boolean ativar) {
		if(ativar){
			TxtNome.setEditable(true);
			TxtCPF.setEditable(true);
			TxtRG.setEditable(true);
			CBoxSexo.setEnabled(true);
			btnCadastrar.setEnabled(true);
		}else {
			TxtNome.setEditable(false);
			TxtCPF.setEditable(false);
			TxtRG.setEditable(false);
			CBoxSexo.setEnabled(false);
			btnCadastrar.setEnabled(false);
		}
	}
	
	public boolean verificarCampos() {
		boolean ok = false;
		String MsgDeErro = "Verifique o(s) campo(s) ";
		
		if(TxtNome.getText().isEmpty()) {
			MsgDeErro = MsgDeErro + "Nome";		
			if(TxtCPF.getText().isEmpty()) {MsgDeErro = MsgDeErro + ", CPF";}if(TxtRG.getText().isEmpty()) {MsgDeErro = MsgDeErro + ", RG";}if(CBoxSexo.getSelectedItem().toString().equals("--Selecione--")) {MsgDeErro = MsgDeErro + ", Sexo";}
			
		}else if(TxtCPF.getText().isEmpty()) {			
			MsgDeErro = MsgDeErro + "CPF";
			if(TxtRG.getText().isEmpty()) {MsgDeErro = MsgDeErro + ", RG";}if(CBoxSexo.getSelectedItem().toString().equals("--Selecione--")) {MsgDeErro = MsgDeErro + ", Sexo";}
			
		}else if(TxtRG.getText().isEmpty()) {			
			MsgDeErro = MsgDeErro + "RG";
			if(CBoxSexo.getSelectedItem().toString().equals("--Selecione--")) {MsgDeErro = MsgDeErro + ", Sexo";}
			
			
		}else if(CBoxSexo.getSelectedItem().toString().equals("--Selecione--")) {
			MsgDeErro = MsgDeErro + "Sexo";
			
		}else {
			ok = true;
		}
					
		if(ok == false) {
			
			MensagemBox msgBox = new MensagemBox();
			msgBox.exibirMensagem("Erro!", MsgDeErro + ".");
		}
				
		return ok;
	}
	

}
