package cadastro.model;

public class PessoaFisica {
	private String Nome, CPF, RG, Endereco, Bairro, CEP, Cidade, Estado, Telefone, Celular;
	char Sexo;
	
	public void setNome(String nome){
		this.Nome = nome;
	}
	
	public String getNome(){
		return Nome;
	}
	
	public void setCPF(String CPF){
		this.CPF = CPF;
	}
	
	public String getCPF(){
		return CPF;
	}
	
	public void setRG(String RG){
		this.RG = RG;
	}
	
	public String RG(){
		return RG;
	}
	
	public void setEndereco(String Endereco){
		this.Endereco = Endereco;
	}
	
	public String Endereco(){
		return Endereco;
	}
	
	public void setBairro(String Bairro){
		this.Bairro = Bairro;
	}
	
	public String Bairro(){
		return Bairro;
	}
	
	public void setCEP(String CEP){
		this.CEP = CEP;
	}
	
	public String CEP(){
		return CEP;
	}
	
	public void setCidade(String Cidade){
		this.Cidade = Cidade;
	}
	
	public String getCidade(){
		return Cidade;
	}
	
	public void setEstado(String Estado){
		this.Estado = Estado;
	}
	
	public String getEstado(){
		return Estado;
	}
	
	public void setTelefone(String Telefone){
		this.Telefone = Telefone;
	}
	
	public String getTelefone(){
		return Telefone;
	}
	
	public void setCelular(String Celular){
		this.Celular = Celular;
	}
	
	public String Celular(){
		return Celular;
	}
	
	public void setSexo(char Sexo){
		this.Sexo = Sexo;
	}
	
	public char getSexo(){
		return Sexo;
	}
}
