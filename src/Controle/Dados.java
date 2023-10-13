package Controle;

import Model.*;

public class Dados {
	private Farmacia farm;
	

	public Dados() {
		fillWithSomeData();
	}
	
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
	
	public void inserirEditarSeringa(int pos, Seringa seringa) {
		System.out.println("pos:" + pos +" | " + "total: " + farm.getQntSeringa());
		if (pos == farm.getQntSeringa()) {
			farm.setSeringa(seringa);
		} else farm.setSeringa(pos, seringa);
	}
	
	public void inserirEditarToxina(int pos, ToxinaButolinica toxina) {
		if (pos == farm.getQntToxina()) {
			farm.setToxina(toxina);
		} else farm.setToxina(pos, toxina);
	}

	public void removerToxina(int posicao) {
		farm.getToxina().remove(posicao);
	}


	public void removerSeringa(int posicao) {
		farm.getSeringas().remove(posicao);
	}
	
}
