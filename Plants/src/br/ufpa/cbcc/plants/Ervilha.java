package br.ufpa.cbcc.plants;

import javax.swing.JOptionPane;

public class Ervilha extends Plants{
	Ervilha(){
		super();
		qtErvilha = 0;
		levelAttack = 0;
		//System.out.println("Construtor padrao de Ervilha criado");
	}
	
	Ervilha(String nomePersonagem, int resistencia, int dano, int codigo, int vida, float recarga, int alcance, int qtErvilha, int levelAttack){
		super(nomePersonagem, resistencia, dano, codigo, vida, recarga, alcance);
		this.qtErvilha = qtErvilha;
		this.levelAttack = levelAttack;
	}
	
	@Override
    public void defenderSe(){
		//System.out.println("Ervilha defendeu-se");
		JOptionPane.showMessageDialog(null, "Ervilha defendeu-se");
    }
	
	@Override
    public void atacar(){
		//System.out.println("Ervilha atacou");	
		JOptionPane.showMessageDialog(null, "Ervilha atacou");
	}
	
	@Override
    public void fazerFotossíntese(){
		System.out.println("Ervilha fazendo fotossintese");
	}
	
	@Override
    public void crescer(){
		System.out.println("Ervilha cresceu");
	}
	
    public void boosterAttack(){
    	System.out.println("Upgrade attack de Ervilha");
    }
    
	@Override
	public void verificarSatus(boolean ativo) {
		if (ativo != true){
    		System.out.println("Ervilha inativa");
    	}
    	else {
    		System.out.println("Ervilha Ativa");
    	}		
	}
	
	private int qtErvilha;
    private int levelAttack;
}
