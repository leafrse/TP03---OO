package Model;

import java.util.ArrayList;

public class Farmacia {
	/**
	 * É uma lista de objetos do tipo "Seringa", que armazena as seringas presentes
	 * na farmácia.
	 */
	private ArrayList<Seringa> seringas = new ArrayList<Seringa>();
	/**
	 * É uma lista de objetos do tipo "ToxinaButolinica", que armazena as seringas
	 * presentes na farmácia.
	 */
	private ArrayList<ToxinaButolinica> toxina = new ArrayList<ToxinaButolinica>();

	/**
	 * O construtor Farmacia() é responsável por criar uma instância de Farmacia sem
	 * receber nenhuma seringa ou toxina como parâmetro. O construtor
	 * Farmacia(ArrayList<Seringa> seringas) permite criar uma instância de Farmacia
	 * com uma lista pré-existente de seringas.
	 */
	public Farmacia(ArrayList<Seringa> seringas) {
		this.seringas = seringas;
	}

	public Farmacia() {
	}

	public Seringa getSeringa(int pos) {
		return seringas.get(pos);
	}

	public void setSeringas(ArrayList<Seringa> seringas) {
		this.seringas = seringas;
	}

	public void setSeringa(Seringa seringa) {
		seringas.add(seringa);
	}

	public void setSeringa(int pos, Seringa seringa) {
		seringas.set(pos, seringa);
	}

	public ArrayList<ToxinaButolinica> getToxina() {
		return toxina;
	}

	public ArrayList<Seringa> getSeringas() {
		return seringas;
	}

	public void setToxina(ArrayList<ToxinaButolinica> toxina) {
		this.toxina = toxina;
	}

	public void setToxina(ToxinaButolinica toxina) {
		this.toxina.add(toxina);

	}

	public void setToxina(int pos, ToxinaButolinica toxina) {
		this.toxina.set(pos, toxina);
	}

	public int getQntSeringa() {

		return seringas.size();
	}

	public ToxinaButolinica getToxina(int pos) {
		return toxina.get(pos);
	}

	public int getQntToxina() {
		return toxina.size();
	}
}
