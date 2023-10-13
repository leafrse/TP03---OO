package Controle;

import Model.*;

/**
 * Controle principal e entrada de dados para model e view
 * 
 * @author Rafael Siqueira Soares - 221022195
 * 
 */

public class Controle {
	private Dados d;

	/**
	 * O construtor Controle() inicializa a variável d do tipo Dados, que representa
	 * um objeto de armazenamento de dados.
	 */

	public Controle() {
		d = new Dados();
	}

	public Controle(Controle dados) {

	}

	public Seringa getSeringa(int pos) {

		return d.getSeringa(pos);
	}

	public ToxinaButolinica getToxina(int pos) {
		return d.getToxina(pos);
	}

	public int getQntESeringa() {

		return d.getQntSeringa();
	}

	public int getQntEToxina() {
		return d.getQntToxina();
	}

//Pesquisa por nome(caso queira trocar para pesquisa por codigo insira a função citada abaixo no lugar dessa função )
	public String[] getNomesSeringas() {
		String[] nomes = new String[d.getQntSeringa()];

		for (int i = 0; i < d.getQntSeringa(); i++) {
			// nomes[i] = Integer.toString(d.getSeringa(i).getCodigoCadastrado();-- caso
			// queira mudar para o codigo
			nomes[i] = d.getSeringa(i).getNome();
		}

		return nomes;
	}

	public String[] getNomesToxinas() {
		String[] nomes = new String[d.getQntToxina()];

		for (int i = 0; i < d.getQntToxina(); i++) {
			// nomes[i] = Integer.toString(d.getToxina(i).getCodigoCadastrado(); --caso
			// queira mudar para o codigo
			nomes[i] = d.getToxina(i).getNome();
		}

		return nomes;
	}

	public String[] getNomes() {
		String[] nomes = new String[d.getQntSeringa() + d.getQntToxina()];
		int i;
		for (i = 0; i < d.getQntSeringa(); i++) {
			nomes[i] = getNomesSeringas()[i];
		}

		for (int j = 0; j < d.getQntToxina(); j++) {
			nomes[i] = getNomesToxinas()[j];
			i++;
		}
		System.out.println("saiu:" + i);
		return nomes;
	}

	/**
	 * Insere ou edita uma seringa com base nos dados fornecidos. Os dados devem
	 * estar em um array de strings na seguinte ordem: [posição, nome, tipo, código
	 * cadastrado, quantidade, preço unitário, volume, concentração.
	 */
	public boolean inserirEditarSeringa(String[] Dados) {
		if (!Dados[3].matches("[0-9]+")) {
			return false;

		} else {
			// System.out.println(Dados[0]);
			Seringa s = new Seringa(Dados[1], Dados[2], Integer.parseInt(Dados[3]), Double.parseDouble(Dados[4]),
					Integer.parseInt(Dados[5]), Double.parseDouble(Dados[6]), Double.parseDouble(Dados[7]));
			d.inserirEditarSeringa(Integer.parseInt(Dados[0]), s);
			return true;
		}
		/**
		 * Insere ou edita uma toxina com base nos dados fornecidos. Os dados devem
		 * estar em um array de strings na seguinte ordem: posição, nome, tipo, código
		 * cadastrado, quantidade, lote, concentração.
		 */
	}// posicao 0 do vetor(dadosSeringa)indica onde os dados devem ser inserido

	public boolean inserirEditarToxina(String[] Dados) {
		if (!Dados[3].matches("[0-9]+")) {
			return false;
		} else {

			ToxinaButolinica t = new ToxinaButolinica(Dados[1], Dados[2], Integer.parseInt(Dados[3]),
					Double.parseDouble(Dados[4]), Integer.parseInt(Dados[5]), Dados[6], Double.parseDouble(Dados[7]));
			d.inserirEditarToxina(Integer.parseInt(Dados[0]), t);
			return true;

		}
	}

	/**
	 * Remove a seringa na posição fornecida.
	 */
	public boolean removerSeringa(int i) {
		Seringa srg = d.getSeringa(i);
		d.removerSeringa(i);
		if (d.getSeringa(i).equals(srg)) {
			return false;
		} else {
			return true;
		}
	}

	/**
	 * Remove a Toxina na posição fornecida.
	 */
	public boolean removerToxina(int posicao) {
		ToxinaButolinica t = d.getToxina(posicao);
		d.removerToxina(posicao);
		if (d.getToxina(posicao).equals(t)) {
			return false;
		} else {
			return true;
		}
	}

	/**
	 * Realiza uma busca por um termo (nome) nas seringas e toxinas
	 * armazenadas e retorna um array de strings contendo os resultados
	 * correspondentes.
	 */
	public String[] buscar(String busca) {
		String[] nomes = new String[d.getQntSeringa() + d.getQntToxina()];
		int x = 0;
		for (int i = 0; i < d.getQntSeringa(); i++) {
			if (busca.equals(d.getSeringa(i).getNome())) {
				nomes[x] = d.getSeringa(i).getNome();
				x++;

			}
		}
		for (int i = 0; i < d.getQntToxina(); i++) {
			if (busca.equals(d.getToxina(i).getNome())) {
				nomes[x] = d.getToxina(i).getNome();
				x++;
			}
		}
		return nomes;
	}

}
