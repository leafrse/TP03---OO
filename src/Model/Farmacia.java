package Model;

import java.util.ArrayList;

public class Farmacia {
//funcao geracional de uma seringa e uma toxina dentro do sistema 
	private  ArrayList<Seringa> seringas = new ArrayList<Seringa>();
	private  ArrayList<ToxinaButolinica> toxina = new ArrayList<ToxinaButolinica>();
	//
	public Farmacia(ArrayList<Seringa> seringas) {
		this.seringas = seringas;
	}
	
	public Farmacia() {
	}
	
	public Seringa getSeringa(int pos ) {
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
	public ToxinaButolinica getToxina(int pos ) {
		return toxina.get(pos);
	}

	public int getQntToxina() {
		return toxina.size();
	}
}
