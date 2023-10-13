package view;

import Controle.*;
import java.awt.*;
import java.awt.event.*;

import javax.swing.*;
import javax.swing.event.*;

public class Estoque implements ActionListener, ListSelectionListener {
	private JLabel titulo;
	private JFrame aba;
	private JButton pesquisarP = new JButton("Buscar");
	private JTextField pesquisar = new JTextField();
	private JButton refreshProduto = new JButton("Refresh");
	private static Controle Dados;
	private JList<String> produtosCadastrados;
	private JScrollPane scroll;

	public void mostrarDadosP(Controle p, int op) {
		Dados = p;

		switch (op) {
			case 1:
				produtosCadastrados = new JList<String>(Dados.getNomes());
				aba = new JFrame("Estoque");
				titulo = new JLabel("--- Menu Estoque ---");
				titulo.setFont(new Font("Arial", Font.BOLD, 20));
				titulo.setBounds(90, 10, 250, 30);
				pesquisar.setBounds(20, 50, 200, 20);
				pesquisarP.setBounds(230, 50, 140, 20);
				scroll = new JScrollPane(produtosCadastrados);
				scroll.setBounds(20, 80, 350, 120);
				produtosCadastrados.setSelectionMode(ListSelectionModel.SINGLE_INTERVAL_SELECTION);
				produtosCadastrados.setVisibleRowCount(10);
				
				refreshProduto.setBounds(200, 207, 100, 30);
				aba.setLayout(null);
				aba.add(titulo);
				aba.add(pesquisar);
				aba.add(pesquisarP);
				aba.getContentPane().add(scroll);
				
				aba.add(refreshProduto);

				aba.setSize(400, 300);
				aba.setVisible(true);
				
				refreshProduto.addActionListener(this);
				produtosCadastrados.addListSelectionListener(this);
				pesquisarP.addActionListener(this);

				break;
			default:
				JOptionPane.showMessageDialog(null, "Opção não encontrada!", null, JOptionPane.ERROR_MESSAGE);

		}
	}

	public void valueChanged(ListSelectionEvent p) {
		if (p.getValueIsAdjusting()) {
			int posi = produtosCadastrados.getSelectedIndex();

			if (posi < Dados.getQntESeringa()) {

				new Info().infoP(Dados, posi, 1);

			} else {

				new Info().infoP(Dados, posi - Dados.getQntESeringa(), 2);

			}
		}

	}

	public void actionPerformed(ActionEvent p) {
		if (p.getSource() == refreshProduto) {
			produtosCadastrados.setListData(Dados.getNomes());
			produtosCadastrados.updateUI();
		}

		if (p.getSource() == pesquisarP) {
			produtosCadastrados.setListData(Dados.buscar(pesquisar.getText()));
			produtosCadastrados.updateUI();
		}

	}
}