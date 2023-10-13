package Model;

public class ToxinaButolinica extends Produto {
	private String funcionalidade;
	private double quantidadePorAmpola;
//Declaração das variaveis já citadas na classe produto e de novas variaveis especificas para esse tipo de classe(ToxinaButolinica)
	public ToxinaButolinica(String nome, String tipo, int codigoCadastrado, double valor, int quantidadeEstoque,
			String funcionalidade, double quantidadePorAmpola) {
		super(nome, tipo, codigoCadastrado, valor, quantidadeEstoque, quantidadePorAmpola);

		setFuncionalidade(funcionalidade);
		setQuantidadePorAmpola(quantidadePorAmpola);

	}
	
//Gets e sets das variaveis especificas da classe ToxinaButolinica
	public String getFuncionalidade() {
		return funcionalidade;
	}

	public void setFuncionalidade(String funcionalidade) {
		this.funcionalidade = funcionalidade;
	}

	public double getQuantidadePorAmpola() {
		return quantidadePorAmpola;
	}

	public void setQuantidadePorAmpola(double quantidadePorAmpola) {
		this.quantidadePorAmpola = quantidadePorAmpola;
	}

	public String toString() {
		return "Nome: " + nome + "\n" + " Tipo: " + tipo + "\n" + "Código Cadastrado: " + codigoCadastrado + "\n"
				+ "Valor:  " + valor + "\n" + "Quantidade em estoque: " + quantidadeEstoque + "\n"
				+ "Quantidade Por ampola: " + quantidadePorAmpola + " ml" + "\n" + "Funcionalidade: " + funcionalidade;

	}

}
