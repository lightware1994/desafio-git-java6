package br.com.senai.tagua.sa1aplicacao6;

import javax.swing.JOptionPane;

import br.com.senai.taguajava.sa1app6.CalculoBO;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		JOptionPane.showMessageDialog(null, "Empresa Voe, Linhas aéreas");
		
		String resp = JOptionPane.showInputDialog("Informe o preço: ");
		double valor = Double.parseDouble(resp);
		String resp1 = JOptionPane.showInputDialog("Informe a quantidade comprado: ");
		double valor1 = Double.parseDouble(resp1);
		
		CalculoBO frota = new CalculoBO();
		
		JOptionPane.showMessageDialog(null, "O custo unitário de cada avião foi de " + frota.calculoFrota(valor, valor1));
		

	}

}
