package Controle;

import Model.*;

public class Dados {
	private Farmacia farm;

	/**
	 * O construtor Dados() é responsável por preencher os dados com algumas
	 * informações de exemplo
	 */
	public Dados() {
		fillWithSomeData();
	}

	/**
	 * O construtor Dados() é responsável por preencher os dados com algumas
	 * informações de exemplo
	 */

//Pré cadastro de uma seringa e toxina dentro do sistema 
	public void fillWithSomeData() {
		Seringa seringa = new Seringa("Gel", "gel", 1, 2.0, 3, 5, 4);
		farm = new Farmacia();
		farm.setSeringa(seringa);
		ToxinaButolinica toxina = new ToxinaButolinica("C344", "Butolinica", 2, 2, 3, "g", 1);
		farm.setToxina(toxina);

	}

	public Farmacia getFarmacia() {
		return farm;
	}

	public void setDados(Farmacia farm) {
		this.farm = farm;
	}

	public Seringa getSeringa(int pos) {
		return farm.getSeringa(pos);
	}

	public int getQntSeringa() {
		return this.farm.getQntSeringa();
	}

	public ToxinaButolinica getToxina(int pos) {
		return farm.getToxina(pos);
	}

	public int getQntToxina() {
		return this.farm.getQntToxina();
	}

	/**
	 * Insere ou edita uma seringa na posição especificada. Se a posição fornecida
	 * for igual à quantidade atual de seringas, a seringa será adicionada ao final
	 * da lista.
	 */
	public void inserirEditarSeringa(int pos, Seringa seringa) {
		System.out.println("pos:" + pos + " | " + "total: " + farm.getQntSeringa());
		if (pos == farm.getQntSeringa()) {
			farm.setSeringa(seringa);
		} else
			farm.setSeringa(pos, seringa);
	}
	/**
	 * Insere ou edita uma toxina na posição especificada. Se a posição fornecida
	 * for igual à quantidade atual de toxina, a seringa será adicionada ao final
	 * da lista.
	 */
	public void inserirEditarToxina(int pos, ToxinaButolinica toxina) {
		if (pos == farm.getQntToxina()) {
			farm.setToxina(toxina);
		} else
			farm.setToxina(pos, toxina);
	}

	/**
	 * Remove a toxina na posição especificada.
	 */
	public void removerToxina(int posicao) {
		farm.getToxina().remove(posicao);
	}
	/**
	 * Remove a Seringa na posição especificada.
	 */
	public void removerSeringa(int posicao) {
		farm.getSeringas().remove(posicao);
	}

}
