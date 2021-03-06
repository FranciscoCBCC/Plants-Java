package br.ufpa.cbcc.zumbi;
import javax.swing.JOptionPane;

import br.ufpa.cbcc.plants.Atacavel;
import br.ufpa.cbcc.plants.Personagem;


public class Zumbi extends Personagem{
	public Zumbi(){
		super();
		//System.out.print("Construtor padrao de Zumbi criado");
	}
	
	public Zumbi(String nomePersonagem, int resistencia, int dano, int codigo, int vida){
		super(nomePersonagem, resistencia, dano, codigo, vida);
	}
	
	public Zumbi(Zumbi copia){
		super((Personagem)copia);
	}
	
	@Override
	public void verificarSatus(boolean ativo) {
		if (ativo != true){
    		System.out.println("Zumbi inativo");
    	}
    	else {
    		System.out.println("Zumbi Ativo");
    	}	
	}

	@Override
	public void diminuirHp(int vida, int resistencia) {
		System.out.println("O HP do Zumbi diminuiu");
	}	
	
	@Override
	public void atacar(){
		//System.out.println("Zumbi atacou");
		JOptionPane.showMessageDialog(null, "Zumbi atacou");
	}
	
	@Override
	public void defenderSe(){
		//System.out.print("Zumbi defendeu-se");
		JOptionPane.showMessageDialog(null, "Zumbi defendeu-se");
	}
	
	public void duplicar() {
		JOptionPane.showMessageDialog(null,"O Zumbi duplicou-se");
	}

}
