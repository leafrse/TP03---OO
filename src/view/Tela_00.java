package view;
import Controle.*;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

//equivalente a telamenu da professora


public class Tela_00 implements ActionListener {

	private static JFrame aba = new JFrame("Farmax Fornecimentos");
	private static JLabel menuP = new JLabel("Menu Principal: ");
	private static JButton menuC = new JButton("Menu para Compras:");
	private static JButton menuE = new JButton("Menu de Estoque: ");
	private static Controle dados = new Controle();

	public Tela_00() {
		menuP.setFont(new Font("Arial", Font.BOLD, 20));
		menuP.setBounds(130, 15, 155, 35);
		menuC.setBounds(130, 130, 155, 35);
		menuE.setBounds(130, 70, 155, 35);
		aba.setLayout(null);
		aba.add(menuP);
		aba.add(menuC);
		aba.add(menuE);
     
		aba.setSize(400, 250);
		aba.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		aba.setVisible(true);
	}

	public static void main(String[] args) {
		Tela_00 tela = new Tela_00();
		menuC.addActionListener(tela);
		
		menuE.addActionListener(tela);
			
			
	}
	
	public void actionPerformed(ActionEvent e) {
				if (e.getSource() == menuC) {
					new DadosC().editar(dados);
			
				}if (e.getSource() == menuE){
					new Estoque().mostrarDadosP(dados, 1);
					
				}
				
			}

}

