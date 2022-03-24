
public class Cliente {
	private String nome;
	private String cpf;
	private String profissao;
	
	private static int total;

	public Cliente(String nome) {
		this.nome = nome;
		Cliente.total++;
	}

	public String getNome() {
		return this.nome;
	}

	public String getCpf() {
		return this.cpf;
	}

	public void setCpf(String novoCpf) {
		this.cpf = novoCpf;
	}

	public String getProfissao() {
		return this.profissao;
	}

	public void setProfissao(String novaProfissao) {
		this.profissao = novaProfissao;
	}

	public static int getTotal() {
		return Cliente.total;
	}
}
