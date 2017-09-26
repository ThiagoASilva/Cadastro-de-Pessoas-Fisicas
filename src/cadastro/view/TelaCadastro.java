package cadastro.view;

import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFormattedTextField;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JRadioButton;
import javax.swing.JTextField;
import javax.swing.text.MaskFormatter;

public class TelaCadastro extends JFrame{
	
	JLabel Lname = new JLabel("Nome");
	static JTextField TxtNome = new JTextField(); 
	JLabel LCPF = new JLabel("CPF");
	static JFormattedTextField TxtCPF = null; 
	JLabel LRG = new JLabel("RG");
	static JFormattedTextField TxtRG = null; 
	JLabel LSexo = new JLabel("Sexo");
	/*static String[] Sexos = {"Masculino", "Feminino", "--Selecione--"};
	static JComboBox CBoxSexo = new JComboBox(Sexos);*/	
	static JButton btnImprimir = new JButton("Imprimir");
	static JButton btnSalvar = new JButton("Salvar");
	JLabel LEnd = new JLabel("Endereço");
	static JTextField TxtEndereco = new JTextField();
	JLabel LEst = new JLabel("Estado");	
	static String[] Est = { "----------", "AC","AL","AP","AM","BA","CE","DF","ES","GO","MA","MT","MS","MG","PA","PB","PR","PE","PI","RJ","RN","RS","RO","RR","SC","SP","SE","TO"};
	static JComboBox CBoxEstado = new JComboBox(Est);
	JLabel LCep = new JLabel("CEP");
	static JFormattedTextField TxtCep = null;
	JLabel LTel = new JLabel("Telefone");
	static JFormattedTextField TxtTelefone = null;
	JLabel LCel = new JLabel("Celular");
	static JFormattedTextField TxtCelular = null;
	JLabel LBairro = new JLabel("Bairro"); 
	static JTextField TxtBairro = new JTextField();
	ExibirCadastro EC = new ExibirCadastro();		
	static JRadioButton[] RbtnSexo = new JRadioButton[2];
	static ButtonGroup btnGrupo = new ButtonGroup();
	JLabel LCidade = new JLabel("Cidade");
	static JTextField TxtCidade = new JTextField();
	static JButton btnLimpar = new JButton("Limpar tudo");
	
	cadastro.model.PessoaFisica PessoaFisica = new cadastro.model.PessoaFisica();
	
	MaskFormatter formatcpf = null;
	MaskFormatter formatrg = null;
	MaskFormatter formatcep = null;
	MaskFormatter formatTelefone = null;
	MaskFormatter formatCelular = null;
	
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
		
		try{
			formatcpf = new MaskFormatter("###.###.###-##");
			TxtCPF = new JFormattedTextField(formatcpf);
		}catch(Exception ex){
			ex.printStackTrace();
		}
		
		paine.add(TxtCPF);
		TxtCPF.setBounds(642, 70, 90, 30);
		
		try{
			formatrg = new MaskFormatter("##.###.###-A");
			TxtRG = new JFormattedTextField(formatrg);
		}catch(Exception ex){
			ex.printStackTrace();
		}
		
		paine.add(LRG);
		LRG.setBounds(752, 60, 16, 50);
		
		paine.add(TxtRG);
		TxtRG.setBounds(779, 70, 75, 30);
		
		paine.add(LSexo);
		LSexo.setBounds(30, 120, 33, 50);
		
		RbtnSexo[0] = new JRadioButton("Masculino");
		RbtnSexo[1] = new JRadioButton("Feminimo");
		btnGrupo.add(RbtnSexo[0]);
		btnGrupo.add(RbtnSexo[1]);
		
		paine.add(RbtnSexo[0]);
		paine.add(RbtnSexo[1]);
		RbtnSexo[0].setBounds(73, 130, 83, 30);
		RbtnSexo[1].setBounds(183, 130, 100, 30);
	/*	CBoxSexo.setSelectedIndex(2);
		paine.add(CBoxSexo);
		CBoxSexo.setBounds(73, 130, 100, 30); */
		
		
		paine.add(LEnd);
		LEnd.setBounds(335, 130, 54, 30);
		
		paine.add(TxtEndereco);
		TxtEndereco.setBounds(399, 130, 300, 30);
		
		paine.add(LBairro);
		LBairro.setBounds(709, 130, 35, 30);
		
		paine.add(TxtBairro);
		TxtBairro.setBounds(754, 130, 100, 30);
		
		try{
			formatcep= new MaskFormatter("#####-###");
			TxtCep = new JFormattedTextField(formatcep);
		}catch(Exception ex){
			ex.printStackTrace();
		}
		
		paine.add(LCep);		
		LCep.setBounds(30, 190, 40, 30);
				
		paine.add(TxtCep);
		TxtCep.setBounds(80, 190, 70, 30);
		
		paine.add(LEst);
		LEst.setBounds(160, 190, 40, 30);
		
		CBoxEstado.setSelectedIndex(0);
		paine.add(CBoxEstado);			
		CBoxEstado.setBounds(210, 190, 70, 30);
		
		paine.add(LCidade);
		LCidade.setBounds(290, 190, 40, 30);
		
		paine.add(TxtCidade);
		TxtCidade.setBounds(340, 190, 200, 30);
		
		paine.add(LTel);
		LTel.setBounds(550, 190, 50, 30);
		
		try{
			formatTelefone = new MaskFormatter("(##)####-####");
			TxtTelefone = new JFormattedTextField(formatTelefone);
		}catch(Exception ex){
			ex.printStackTrace();
		}
		paine.add(TxtTelefone);
		TxtTelefone.setBounds(610, 190, 89, 30);
		
		paine.add(LCel);
		LCel.setBounds(709, 190, 40, 30);
		
		try{
			formatCelular = new MaskFormatter("(##)#####-####");
			TxtCelular = new JFormattedTextField(formatCelular);
		}catch(Exception ex){
			ex.printStackTrace();
		}
		paine.add(TxtCelular);
		TxtCelular.setBounds(761, 190, 93, 30);
		
		paine.add(btnImprimir);
		btnImprimir.setBounds(755, 250, 100, 30);	
		btnImprimir.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				
				ativarCampos(false);
				if(verificarCampos()){
										
					if(RbtnSexo[0].isSelected()){
						
						EC.exibir(TxtNome.getText(), TxtCPF.getText(), TxtRG.getText(), "Masculino", TxtEndereco.getText(), TxtBairro.getText(), TxtCep.getText(), CBoxEstado.getSelectedItem().toString(), TxtCidade.getText(), TxtTelefone.getText(), TxtCelular.getText());						
					
					}else{
						EC.exibir(TxtNome.getText(), TxtCPF.getText(), TxtRG.getText(), "Feminino", TxtEndereco.getText(), TxtBairro.getText(), TxtCep.getText(), CBoxEstado.getSelectedItem().toString(), TxtCidade.getText(), TxtTelefone.getText(), TxtCelular.getText());
					}
					
				}
				
			}
		});
		
		paine.add(btnSalvar);
		btnSalvar.setBounds(645, 250, 100, 30);
		
		btnSalvar.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				
				PessoaFisica.setNome(TxtNome.getText());
				PessoaFisica.setCPF(TxtCPF.getText());
				PessoaFisica.setRG(TxtRG.getText());
				PessoaFisica.setEndereco(TxtEndereco.getText());
				PessoaFisica.setBairro(TxtBairro.getText());
				PessoaFisica.setCidade(TxtCidade.getText());
				PessoaFisica.setCEP(TxtCep.getText());
				PessoaFisica.setTelefone(TxtTelefone.getText());
				PessoaFisica.setCelular(TxtCelular.getText());				
			}
		});
		
		paine.add(btnLimpar);
		btnLimpar.setBounds(30, 250, 200, 30);
		btnLimpar.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				limparCampos();
				
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
			/*CBoxSexo.setEnabled(true);*/
			btnImprimir.setEnabled(true);
			
			RbtnSexo[0].setEnabled(true);
			RbtnSexo[1].setEnabled(true);
			TxtEndereco.setEditable(true);
			TxtBairro.setEditable(true);
			TxtCep.setEditable(true);
			CBoxEstado.setEnabled(true);
			TxtCidade.setEditable(true);
			TxtTelefone.setEditable(true);
			TxtCelular.setEditable(true);
			
		}else {
			TxtNome.setEditable(false);
			TxtCPF.setEditable(false);
			TxtRG.setEditable(false);
			/*CBoxSexo.setEnabled(false);*/
			btnImprimir.setEnabled(false);
			
			RbtnSexo[0].setEnabled(false);
			RbtnSexo[1].setEnabled(false);
			TxtEndereco.setEditable(false);
			TxtBairro.setEditable(false);
			TxtCep.setEditable(false);
			CBoxEstado.setEnabled(false);
			TxtCidade.setEditable(false);
			TxtTelefone.setEditable(false);
			TxtCelular.setEditable(false);
		}
	}
	
	public boolean verificarCampos() {
		boolean ok = false;
		String MsgDeErro = "Verifique o(s) campo(s) ";
		
		if(TxtNome.getText().isEmpty()) {
			MsgDeErro = MsgDeErro + "Nome";		
			
			if(TxtCPF.getText().equals("   .   .   -  ")) {MsgDeErro = MsgDeErro + ", CPF";}if(TxtRG.getText().isEmpty()){MsgDeErro = MsgDeErro + ", RG";}if(RbtnSexo[0].isSelected() == true || RbtnSexo[1].isSelected() == true){}else{MsgDeErro = MsgDeErro + ", Sexo";}if(TxtEndereco.getText().isEmpty()){MsgDeErro = MsgDeErro + ", Endereço";}if(TxtBairro.getText().isEmpty()){MsgDeErro = MsgDeErro + ", Bairro";}if(TxtCep.getText().isEmpty()){MsgDeErro = MsgDeErro + ", CEP";}if(CBoxEstado.getSelectedItem().toString().equals("----------")){MsgDeErro = MsgDeErro + ", Estado";}if(TxtCidade.getText().isEmpty()){MsgDeErro = MsgDeErro + ", Cidade";}if(TxtTelefone.getText().isEmpty()){MsgDeErro = MsgDeErro + ", Telefone";}if(TxtCelular.getText().isEmpty()){MsgDeErro = MsgDeErro + ", Celular";}
			
		}else if(TxtCPF.getText().equals("   .   .   -  ")) {
			
			MsgDeErro = MsgDeErro + "CPF";
			if(TxtNome.getText().isEmpty()) {MsgDeErro = MsgDeErro + "Nome";}if(TxtRG.getText().isEmpty()){MsgDeErro = MsgDeErro + ", RG";}if(RbtnSexo[0].isSelected() == true || RbtnSexo[1].isSelected() == true){}else{MsgDeErro = MsgDeErro + ", Sexo";}if(TxtEndereco.getText().isEmpty()){MsgDeErro = MsgDeErro + ", Endereço";}if(TxtBairro.getText().isEmpty()){MsgDeErro = MsgDeErro + ", Bairro";}if(TxtCep.getText().isEmpty()){MsgDeErro = MsgDeErro + ", CEP";}if(CBoxEstado.getSelectedItem().toString().equals("----------")){MsgDeErro = MsgDeErro + ", Estado";}if(TxtCidade.getText().isEmpty()){MsgDeErro = MsgDeErro + ", Cidade";}if(TxtTelefone.getText().isEmpty()){MsgDeErro = MsgDeErro + ", Telefone";}if(TxtCelular.getText().isEmpty()){MsgDeErro = MsgDeErro + ", Celular";}
			
		}else if(TxtRG.getText().isEmpty()) {
			
			MsgDeErro = MsgDeErro + "RG";
			if(TxtCPF.getText().equals("   .   .   -  ")) {MsgDeErro = MsgDeErro + ", CPF";}if(RbtnSexo[0].isSelected() == true || RbtnSexo[1].isSelected() == true){}else{MsgDeErro = MsgDeErro + ", Sexo";}if(TxtEndereco.getText().isEmpty()){MsgDeErro = MsgDeErro + ", Endereço";}if(TxtBairro.getText().isEmpty()){MsgDeErro = MsgDeErro + ", Bairro";}if(TxtCep.getText().isEmpty()){MsgDeErro = MsgDeErro + ", CEP";}if(CBoxEstado.getSelectedItem().toString().equals("----------")){MsgDeErro = MsgDeErro + ", Estado";}if(TxtCidade.getText().isEmpty()){MsgDeErro = MsgDeErro + ", Cidade";}if(TxtTelefone.getText().isEmpty()){MsgDeErro = MsgDeErro + ", Telefone";}if(TxtCelular.getText().isEmpty()){MsgDeErro = MsgDeErro + ", Celular";}
			
						
		}else if(!RbtnSexo[0].isSelected() == true || RbtnSexo[1].isSelected() == true) {
			
			MsgDeErro = MsgDeErro + "Sexo";
			if(TxtCPF.getText().equals("   .   .   -  ")) {MsgDeErro = MsgDeErro + ", CPF";}if(TxtRG.getText().isEmpty()){MsgDeErro = MsgDeErro + ", RG";}if(TxtEndereco.getText().isEmpty()){MsgDeErro = MsgDeErro + ", Endereço";}if(TxtBairro.getText().isEmpty()){MsgDeErro = MsgDeErro + ", Bairro";}if(TxtCep.getText().isEmpty()){MsgDeErro = MsgDeErro + ", CEP";}if(CBoxEstado.getSelectedItem().toString().equals("----------")){MsgDeErro = MsgDeErro + ", Estado";}if(TxtCidade.getText().isEmpty()){MsgDeErro = MsgDeErro + ", Cidade";}if(TxtTelefone.getText().isEmpty()){MsgDeErro = MsgDeErro + ", Telefone";}if(TxtCelular.getText().isEmpty()){MsgDeErro = MsgDeErro + ", Celular";}
			
		}else if(TxtEndereco.getText().isEmpty()){
				
				MsgDeErro = MsgDeErro + "Endereço";
				if(TxtCPF.getText().equals("   .   .   -  ")) {MsgDeErro = MsgDeErro + ", CPF";}if(TxtRG.getText().isEmpty()){MsgDeErro = MsgDeErro + ", RG";}if(RbtnSexo[0].isSelected() == true || RbtnSexo[1].isSelected() == true){}else{MsgDeErro = MsgDeErro + ", Sexo";}if(TxtBairro.getText().isEmpty()){MsgDeErro = MsgDeErro + ", Bairro";}if(TxtCep.getText().isEmpty()){MsgDeErro = MsgDeErro + ", CEP";}if(CBoxEstado.getSelectedItem().toString().equals("----------")){MsgDeErro = MsgDeErro + ", Estado";}if(TxtCidade.getText().isEmpty()){MsgDeErro = MsgDeErro + ", Cidade";}if(TxtTelefone.getText().isEmpty()){MsgDeErro = MsgDeErro + ", Telefone";}if(TxtCelular.getText().isEmpty()){MsgDeErro = MsgDeErro + ", Celular";}
				
		}else if(TxtBairro.getText().isEmpty()){
			
			MsgDeErro = MsgDeErro + "Bairro";
			if(TxtCPF.getText().equals("   .   .   -  ")) {MsgDeErro = MsgDeErro + ", CPF";}if(TxtRG.getText().isEmpty()){MsgDeErro = MsgDeErro + ", RG";}if(RbtnSexo[0].isSelected() == true || RbtnSexo[1].isSelected() == true){}else{MsgDeErro = MsgDeErro + ", Sexo";}if(TxtEndereco.getText().isEmpty()){MsgDeErro = MsgDeErro + ", Endereço";}if(TxtCep.getText().isEmpty()){MsgDeErro = MsgDeErro + ", CEP";}if(CBoxEstado.getSelectedItem().toString().equals("----------")){MsgDeErro = MsgDeErro + ", Estado";}if(TxtCidade.getText().isEmpty()){MsgDeErro = MsgDeErro + ", Cidade";}if(TxtTelefone.getText().isEmpty()){MsgDeErro = MsgDeErro + ", Telefone";}if(TxtCelular.getText().isEmpty()){MsgDeErro = MsgDeErro + ", Celular";}
			
		}else if(TxtCep.getText().isEmpty()){
			
			MsgDeErro = MsgDeErro + "CEP";
			if(TxtCPF.getText().equals("   .   .   -  ")) {MsgDeErro = MsgDeErro + ", CPF";}if(TxtRG.getText().isEmpty()){MsgDeErro = MsgDeErro + ", RG";}if(RbtnSexo[0].isSelected() == true || RbtnSexo[1].isSelected() == true){}else{MsgDeErro = MsgDeErro + ", Sexo";}if(TxtEndereco.getText().isEmpty()){MsgDeErro = MsgDeErro + ", Endereço";}if(TxtBairro.getText().isEmpty()){MsgDeErro = MsgDeErro + ", Bairro";}if(CBoxEstado.getSelectedItem().toString().equals("----------")){MsgDeErro = MsgDeErro + ", Estado";}if(TxtCidade.getText().isEmpty()){MsgDeErro = MsgDeErro + ", Cidade";}if(TxtTelefone.getText().isEmpty()){MsgDeErro = MsgDeErro + ", Telefone";}if(TxtCelular.getText().isEmpty()){MsgDeErro = MsgDeErro + ", Celular";}
			
		}else if(CBoxEstado.getSelectedItem().toString().equals("----------")){
			
			MsgDeErro = MsgDeErro + "Estado";
			if(TxtCPF.getText().equals("   .   .   -  ")) {MsgDeErro = MsgDeErro + ", CPF";}if(TxtRG.getText().isEmpty()){MsgDeErro = MsgDeErro + ", RG";}if(RbtnSexo[0].isSelected() == true || RbtnSexo[1].isSelected() == true){}else{MsgDeErro = MsgDeErro + ", Sexo";}if(TxtEndereco.getText().isEmpty()){MsgDeErro = MsgDeErro + ", Endereço";}if(TxtBairro.getText().isEmpty()){MsgDeErro = MsgDeErro + ", Bairro";}if(TxtCep.getText().isEmpty()){MsgDeErro = MsgDeErro + ", CEP";}if(TxtCidade.getText().isEmpty()){MsgDeErro = MsgDeErro + ", Cidade";}if(TxtTelefone.getText().isEmpty()){MsgDeErro = MsgDeErro + ", Telefone";}if(TxtCelular.getText().isEmpty()){MsgDeErro = MsgDeErro + ", Celular";}
			
		}else if(TxtCidade.getText().isEmpty()){
			
			MsgDeErro = MsgDeErro + "Cidade";
			if(TxtCPF.getText().equals("   .   .   -  ")) {MsgDeErro = MsgDeErro + ", CPF";}if(TxtRG.getText().isEmpty()){MsgDeErro = MsgDeErro + ", RG";}if(RbtnSexo[0].isSelected() == true || RbtnSexo[1].isSelected() == true){}else{MsgDeErro = MsgDeErro + ", Sexo";}if(TxtEndereco.getText().isEmpty()){MsgDeErro = MsgDeErro + ", Endereço";}if(TxtBairro.getText().isEmpty()){MsgDeErro = MsgDeErro + ", Bairro";}if(TxtCep.getText().isEmpty()){MsgDeErro = MsgDeErro + ", CEP";}if(CBoxEstado.getSelectedItem().toString().equals("----------")){MsgDeErro = MsgDeErro + ", Estado";}if(TxtTelefone.getText().isEmpty()){MsgDeErro = MsgDeErro + ", Telefone";}if(TxtCelular.getText().isEmpty()){MsgDeErro = MsgDeErro + ", Celular";}
			
		}else if(TxtTelefone.getText().isEmpty()){
			
			MsgDeErro = MsgDeErro + "Telefone";
			if(TxtCPF.getText().equals("   .   .   -  ")) {MsgDeErro = MsgDeErro + ", CPF";}if(TxtRG.getText().isEmpty()){MsgDeErro = MsgDeErro + ", RG";}if(RbtnSexo[0].isSelected() == true || RbtnSexo[1].isSelected() == true){}else{MsgDeErro = MsgDeErro + ", Sexo";}if(TxtEndereco.getText().isEmpty()){MsgDeErro = MsgDeErro + ", Endereço";}if(TxtBairro.getText().isEmpty()){MsgDeErro = MsgDeErro + ", Bairro";}if(TxtCep.getText().isEmpty()){MsgDeErro = MsgDeErro + ", CEP";}if(CBoxEstado.getSelectedItem().toString().equals("----------")){MsgDeErro = MsgDeErro + ", Estado";}if(TxtCidade.getText().isEmpty()){MsgDeErro = MsgDeErro + ", Cidade";}if(TxtCelular.getText().isEmpty()){MsgDeErro = MsgDeErro + ", Celular";}
			
		}else if(TxtCelular.getText().isEmpty()){
			
			MsgDeErro = MsgDeErro + "Celular";
			if(TxtCPF.getText().equals("   .   .   -  ")) {MsgDeErro = MsgDeErro + ", CPF";}if(TxtRG.getText().isEmpty()){MsgDeErro = MsgDeErro + ", RG";}if(RbtnSexo[0].isSelected() == true || RbtnSexo[1].isSelected() == true){}else{MsgDeErro = MsgDeErro + ", Sexo";}if(TxtEndereco.getText().isEmpty()){MsgDeErro = MsgDeErro + ", Endereço";}if(TxtBairro.getText().isEmpty()){MsgDeErro = MsgDeErro + ", Bairro";}if(TxtCep.getText().isEmpty()){MsgDeErro = MsgDeErro + ", CEP";}if(CBoxEstado.getSelectedItem().toString().equals("----------")){MsgDeErro = MsgDeErro + ", Estado";}if(TxtCidade.getText().isEmpty()){MsgDeErro = MsgDeErro + ", Cidade";}if(TxtTelefone.getText().isEmpty()){MsgDeErro = MsgDeErro + ", Telefone";}
			
		}else {
			ok = true;
		}
					
		if(ok == false) {
			
			MensagemBox msgBox = new MensagemBox();
			msgBox.exibirMensagem("Erro!", MsgDeErro + ".");
		}
				
		return ok;
	}
	
	public void limparCampos(){
		TxtNome.setText("");
		TxtCPF.setText("");
		TxtRG.setText("");
		TxtEndereco.setText("");
		TxtBairro.setText("");
		TxtCep.setText("");
		TxtCidade.setText("");
		TxtTelefone.setText("");
		TxtCelular.setText("");
		btnGrupo.clearSelection();
		CBoxEstado.setSelectedIndex(0);		
		
		
	}
	

}
