
public class Cliente {
	
	private String nome;
	private String cpf;
	private String profissao;

	
	public void setNome(String novoNome) {
		this.nome = novoNome;
	}
	
	public void setCpf(String novoCpf) {
		this.cpf = novoCpf;
	}
	
	public void setProfissao(String novaProfissao) {
		this.profissao = novaProfissao;
	}
	
	public String getNome() {
		return this.nome;
	}
	
	public String getCpf() {
		return this.cpf;
	}
	
	public String getProfissao() {
		return this.profissao;
	}
}
