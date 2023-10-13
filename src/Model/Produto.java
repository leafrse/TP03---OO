package Model;

import Controle.Controle;
//Declaração de variaveis presente em ambos produtos 

public abstract class Produto {

	protected String nome;
	protected String tipo;
	protected int codigoCadastrado;
	protected double valor;
	protected int quantidadeEstoque;
	protected double tamanho;
	protected String funcionalidade;
	protected double qntA;

	public Produto(String nome, String tipo, int codigoCadastrado, double valor, int quantidadeEstoque, double tamanho) {

		setNome(nome);
		setTipo(tipo);
		setCodigoCadastrado(codigoCadastrado);
		setValor(valor);
		setQuantidadeEstoque(quantidadeEstoque);
		setSize(tamanho);

	}
//Declarações de gets e sets das variaveis caracteristicas de ambos produtos 
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public int getCodigoCadastrado() {
		return codigoCadastrado;
	}

	public void setCodigoCadastrado(int codigoCadastrado) {
		this.codigoCadastrado = codigoCadastrado;
	}

	public double getValor() {
		return valor;
	}

	public void setValor(double valor) {
		this.valor = valor;
	}

	public int getQuantidadeEstoque() {
		return quantidadeEstoque;
	}

	public void setQuantidadeEstoque(int quantidadeEstoque) {
		this.quantidadeEstoque = quantidadeEstoque;
	}

	public double getSize() {
		return tamanho;
	}

	public void setSize(double tamanho) {
		this.tamanho = tamanho;
	}

	public void mostrarDados(Controle dados, int i) {
		
	}

	public String getFuncionalidade() {

		return funcionalidade;
	}

	public void setFuncionalidade(String funcionalidade) {
		this.funcionalidade = funcionalidade;
	}

	public double getQntA()
	{
		return qntA;
	}

	public void setQntA() {
		this.setQntA();
	}

}
