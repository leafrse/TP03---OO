package view;

import Controle.Controle;

import java.awt.event.*;
import javax.swing.*;

// Tela de cadastro
public class Info implements ActionListener {
  private JFrame aba = new JFrame("Informacoes");
  private JLabel idNome = new JLabel("Nome do produto: ");
  private JTextField nome;
  private JLabel idTipo = new JLabel("Tipo de produto:");
  private JTextField tipoP;
  private JLabel idCodP = new JLabel("Codigo de produto ");
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
  private String[] novaP = new String[8];
  private static Controle dados;
  private int posicao;
  private int op;

  public void infoP(Controle Dados, int pos, int opcao) {

    dados = Dados;
    posicao = pos;
    op = opcao;
    
    aba.setSize(400, 300);
    aba.setLayout(null);

    nome = new JTextField();
    tipoP = new JTextField();
    valor = new JTextField();

    idNome.setBounds(30, 20, 180, 25);
    nome.setBounds(180, 20, 180, 25);
    idTipo.setBounds(30, 50, 180, 25);
    tipoP.setBounds(180, 50, 180, 25);
    idCodP.setBounds(30, 80, 180, 25);
    idValor.setBounds(30, 110, 180, 25);
    valor.setBounds(180, 110, 180, 25);

    switch (opcao) {
      case 1:

        size = new JTextField();
        qntE = new JTextField();
        expess = new JTextField();
        codigo = new JLabel(Integer.toString(dados.getSeringa(posicao).getCodigoCadastrado()));

        codigo.setBounds(180, 80, 180, 25);
        idSize.setBounds(30, 140, 150, 25);
        size.setBounds(180, 140, 180, 25);
        idQntE.setBounds(30, 170, 150, 25);
        qntE.setBounds(180, 170, 180, 25);
        idExpess.setBounds(30, 200, 150, 25);
        expess.setBounds(180, 200, 180, 25);

        nome.setText(dados.getSeringa(posicao).getNome());
        tipoP.setText(dados.getSeringa(posicao).getTipo());
        valor.setText(Double.toString(dados.getSeringa(posicao).getValor()));
        codigo.setText(Integer.toString(dados.getSeringa(posicao).getCodigoCadastrado()));
        size.setText(Double.toString(dados.getSeringa(posicao).getTamanho()));
        qntE.setText(Integer.toString(dados.getSeringa(posicao).getQuantidadeEstoque()));
        expess.setText(Double.toString(dados.getSeringa(posicao).getExpessuraDaAgulha()));


        aba.add(idSize);
        aba.add(size);
        aba.add(idQntE);
        aba.add(qntE);
        aba.add(idExpess);
        aba.add(expess);

        break;

      case 2:

        qntE = new JTextField();
        func = new JTextField();
        qntA = new JTextField();
        codigo = new JLabel(Integer.toString(dados.getToxina(posicao).getCodigoCadastrado()));

        codigo.setBounds(180, 80, 180, 25);
        idQntE.setBounds(30, 200, 150, 25);
        qntE.setBounds(180, 200, 180, 25);
        idFunc.setBounds(30, 140, 150, 25);
        func.setBounds(180, 140, 180, 25);
        idQntA.setBounds(30, 170, 150, 25);
        qntA.setBounds(180, 170, 180, 25);

        nome.setText(dados.getToxina(posicao).getNome());
        tipoP.setText(dados.getToxina(posicao).getTipo());
        valor.setText(Double.toString(dados.getToxina(posicao).getValor()));
        codigo.setText(Integer.toString(dados.getToxina(posicao).getCodigoCadastrado()));
        qntE.setText(Integer.toString(dados.getToxina(posicao).getQuantidadeEstoque()));
        func.setText(dados.getToxina(posicao).getFuncionalidade());
        qntA.setText(Double.toString(dados.getToxina(posicao).getQuantidadePorAmpola()));

        aba.add(idQntE);
        aba.add(qntE);
        aba.add(idFunc);
        aba.add(func);
        aba.add(idQntA);
        aba.add(qntA);

        break;

    }

    botaoExcluir.setBounds(30, 230, 150, 25);
    botaoSalvar.setBounds(180, 230, 150, 25);

    aba.add(idNome);
    aba.add(nome);
    aba.add(idTipo);
    aba.add(tipoP);
    aba.add(idCodP);
    aba.add(codigo);
    aba.add(idValor);
    aba.add(valor);
    aba.add(botaoExcluir);
    aba.add(botaoSalvar);

    aba.setVisible(true);

    botaoExcluir.addActionListener(this);
    botaoSalvar.addActionListener(this);

  }

  public void actionPerformed(ActionEvent e) {
    Object src = e.getSource();

    if (src == botaoSalvar) {
			 	
				boolean res;
				if (op == 1)// cadastro seringa
				{
					novaP[0] = Integer.toString(posicao);
					novaP[6] = size.getText();
					novaP[7] = expess.getText();
				}
					
				
				else if (op == 2) {
					novaP[0] = Integer.toString(posicao);
					novaP[6] = func.getText();
					novaP[7] = qntA.getText();
				}
					
				 // edicao de dados
				
				novaP[1] = nome.getText();
				novaP[2] = tipoP.getText();
				novaP[3] = codigo.getText();
				novaP[4] = valor.getText();
				novaP[5] = qntE.getText();
				
				if (op == 1 ) {
					
					res = dados.inserirEditarSeringa(novaP);

				} else {
					
					res = dados.inserirEditarToxina(novaP);

				}
				if (res) {
					mensagemSucessoCadastro();

				} else
					mensagemErroCadastro();

		}

    if (src == botaoExcluir) {
				// Excluir seringa
				boolean res = false;
				if (op == 1) {
					res = dados.removerSeringa(posicao);
					if (res) {
            mensagemSucessoCadastro();
          } else {
            mensagemErroExclusao();
            }
						
				}
				if (op == 2) {
					res = dados.removerToxina(posicao);
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

  public void mensagemErroExclusao() {
    JOptionPane.showMessageDialog(null, "ERRO AO EXCLUIR OS DADOS!\n ");
  }

}
