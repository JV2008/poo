package POO2;

public class Cliente {
	
	//Atributos
	int id;
	String nome;
	int idade;
	long cpf;
	int rg;
	String endereco;
	String profissao;
	int telefone;
	String sexo;
	
	//métodos
	String pede;
	String parcela;
	String compra;
	String paga;
	//Declaração dos atributos
	
	public int getId () {
		return id;
	}
	public void setId(int id) {

		this.id = id;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome){	
		this.nome = nome;
	}
	public int getIdade () {
		return idade;
	}
	public void setIdade(int idade) {

		this.idade = idade;
	}
	public long getCPF() {
		return cpf;
	}
	public void setCPF(long cpf){	
		this.cpf = cpf;
	}
	public int getRg () {
		return rg;
	}
	public void setRg(int rg) {

		this.rg = rg;
	}
	
	public String getEndereço() {
		return endereco;
	}
	public void setEndereço(String endereco){	
		this.endereco = endereco;
	}
	public String getProfissao() {
		return profissao;
	}
	public void setProfissao(String profissao){	
		this.profissao = profissao;
	}
	public int getTelefone () {
		return telefone;
	}
	public void setTelefone(int telefone) {

		this.telefone = telefone;
	}
	public String getSexo() {
		return sexo;
	}
	public void setSexo(String sexo){	
		this.sexo = sexo;
	}
	public String getpede() {
		return pede;
	}
	public void setpede(String pede){	
		this.pede = pede;
	}
	public String getparcela() {
		return parcela;
	}
	public void setparcela(String parcela){	
		this.parcela = parcela;
	}
	public String getcompra() {
		return compra;
	}
	public void setcompra(String compra){	
		this.compra = compra;
	}
	public String getpaga() {
		return compra;
	}
	public void setpaga(String paga){	
		this.paga = paga;
	}
}
