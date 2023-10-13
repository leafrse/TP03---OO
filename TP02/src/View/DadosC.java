package View;

//tela detalhe pessoal 
import java.awt.event.*;
import javax.swing.*;
import Controle.*;

// Aba de registro do produto (parte principal do registro)

public class DadosC implements ActionListener {
	// inicialização dos componentes
	private JFrame aba;
	private JPanel telinha = new JPanel();
	private JLabel idNome = new JLabel("Nome do produto: ");
	private JTextField nome;
	private JLabel idTipo = new JLabel("Tipo de produto:");
	private JTextField tipoP;
	private JLabel idCodP = new JLabel("Código de produto ");
	private JLabel codigo;
	private JLabel idValor = new JLabel("Valor: ");
	private JTextField valor;
	private JLabel idSize = new JLabel("Tamanho: ");
	private JTextField size;
	private JLabel idExpess = new JLabel("Expessura da Agulha: ");
	private JTextField expess;
	private JLabel idQntE = new JLabel("Quantidade em estoque");
	private JTextField qntE;
	private JLabel idFunc = new JLabel("Funcionalidade");
	private JTextField func;
	private JLabel idQntA = new JLabel("Quantidade Por Ampola");
	private JTextField qntA;
	private JButton botaoExcluir = new JButton("Excluir");
	private JButton botaoSalvar = new JButton("Salvar");
	private JButton seringa = new JButton("Seringa");
	private JButton toxina = new JButton("Toxina");
	private String[] novaP = new String[8];
	private static Controle dadosC;
	private int posicao;
	private int op = 1;

	public void telinhas(int op) {

		telinha.removeAll();
		telinha.setBounds(0, 0, 390, 310);

		nome = new JTextField();
		tipoP = new JTextField();
		valor = new JTextField();

		idNome.setBounds(30, 50, 180, 25);
		nome.setBounds(180, 50, 180, 25);
		idTipo.setBounds(30, 80, 180, 25);
		tipoP.setBounds(180, 80, 180, 25);
		idCodP.setBounds(30, 110, 180, 25);
		idValor.setBounds(30, 140, 180, 25);
		valor.setBounds(180, 140, 180, 25);

		seringa.setBounds(60, 10, 100, 30);
		toxina.setBounds(210, 10, 100, 30);

		telinha.add(seringa);
		telinha.add(toxina);
		telinha.add(idNome);
		telinha.add(nome);
		telinha.add(idTipo);
		telinha.add(tipoP);
		telinha.add(idCodP);
		telinha.add(idValor);
		telinha.add(valor);
		// Métodos para configurar os campos do formulário de acordo com o tipo de
		// produto selecionado

		if (op == 1) {

			size = new JTextField();
			qntE = new JTextField();
			expess = new JTextField();
			codigo = new JLabel(Integer.toString(dadosC.getQntESeringa() + dadosC.getQntEToxina() + 1));

			idSize.setBounds(30, 170, 150, 25);
			size.setBounds(180, 170, 180, 25);
			idQntE.setBounds(30, 200, 150, 25);
			qntE.setBounds(180, 200, 180, 25);
			idExpess.setBounds(30, 230, 150, 25);
			expess.setBounds(180, 230, 180, 25);

			telinha.add(idSize);
			telinha.add(size);
			telinha.add(idQntE);
			telinha.add(qntE);
			telinha.add(idExpess);
			telinha.add(expess);

		}
		if (op == 2) {

			qntE = new JTextField();
			func = new JTextField();
			qntA = new JTextField();
			codigo = new JLabel(Integer.toString(dadosC.getQntEToxina() + dadosC.getQntESeringa() + 1));

			idQntE.setBounds(30, 200, 150, 25);
			qntE.setBounds(180, 200, 180, 25);
			idFunc.setBounds(30, 170, 150, 25);
			func.setBounds(180, 170, 180, 25);
			idQntA.setBounds(30, 230, 150, 25);
			qntA.setBounds(180, 230, 180, 25);

			telinha.add(idQntE);
			telinha.add(qntE);
			telinha.add(idFunc);
			telinha.add(func);
			telinha.add(idQntA);
			telinha.add(qntA);

		}

		codigo.setBounds(180, 110, 180, 25);
		telinha.add(codigo);

		botaoSalvar.setBounds(210, 270, 115, 30);
		botaoExcluir.setBounds(60, 270, 115, 30);

		telinha.add(botaoSalvar);
		telinha.add(botaoExcluir);

		telinha.revalidate();
		telinha.repaint();
	}

	public void editar(Controle c) {
		dadosC = c;
		// Configuração do JFrame
		aba = new JFrame("Cadastrar");
		aba.setBounds(400, 50, 400, 310);

		// Preencher dados com dados da Seringa cadastrada
		if (op == 1) {

			telinhas(1);

		}

		if (op == 2) {

			telinhas(2);

		}

		telinha.setLayout(null);

		aba.add(telinha);

		aba.setLayout(null);
		aba.setSize(400, 450);
		aba.setVisible(true);
		// Adiciona o ActionListener aos botões
		seringa.addActionListener(this);
		toxina.addActionListener(this);
		botaoSalvar.addActionListener(this);
		botaoExcluir.addActionListener(this);

	}

	public void actionPerformed(ActionEvent e) {
		Object src = e.getSource();

		if (src == seringa) {
			op = 1;
			// Atualiza para exibir os campos específicos para seringas

			telinhas(op);
		}

		if (src == toxina) {
			op = 2;
			// Atualiza para exibir os campos específicos para toxinas
			telinhas(op);
		}

		if (src == botaoSalvar) {

			boolean res;
			if (op == 1)// cadastro seringa
			{
				novaP[0] = Integer.toString(dadosC.getQntESeringa());
				novaP[6] = size.getText();
				novaP[7] = expess.getText();
			}

			else if (op == 2) {
				novaP[0] = Integer.toString(dadosC.getQntEToxina());
				novaP[6] = func.getText();
				novaP[7] = qntA.getText();
			}

			// edicao de dados

			novaP[1] = nome.getText();
			novaP[2] = tipoP.getText();
			novaP[3] = codigo.getText();
			novaP[4] = valor.getText();
			novaP[5] = qntE.getText();

			if (op == 1) {

				res = dadosC.inserirEditarSeringa(novaP);

			} else {

				res = dadosC.inserirEditarToxina(novaP);

			}
			if (res) {
				mensagemSucessoCadastro();

			} else
				mensagemErroCadastro();

		}

		if (src == botaoExcluir) {
			// Excluir seringa
			boolean res = false;
			if (op == 3) {
				res = dadosC.removerSeringa(posicao);
				if (res)
					mensagemErroExclusaoSeringa();
			}
			if (op == 4) {
				res = dadosC.removerToxina(posicao);
				if (res)
					mensagemSucessoCadastro();
				else
					mensagemErroCadastro();
			}

		}

	}

	public void mensagemSucessoExclusao() {
		JOptionPane.showMessageDialog(null, "Os dados foram excluidos com sucesso!", null,
				JOptionPane.INFORMATION_MESSAGE);
		aba.dispose();
	}

	public void mensagemSucessoCadastro() {
		JOptionPane.showMessageDialog(null, "Os dados foram salvos com sucesso!", null,
				JOptionPane.INFORMATION_MESSAGE);
		aba.dispose();
	}

	public void mensagemErroCadastro() {
		JOptionPane.showMessageDialog(null, "ERRO AO SALVAR OS DADOS!\n ");
	}

	public void mensagemErroExclusaoSeringa() {
		JOptionPane.showMessageDialog(null, "Ocorreu um erro ao excluir o dado.\n ", null, JOptionPane.ERROR_MESSAGE);

	}
}
