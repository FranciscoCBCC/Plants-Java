package br.ufpa.cbcc.plants;

public abstract class Personagem implements Atacavel {
	public Personagem(){
		System.out.println("Construtor padrao de Personagem criado");
	}
	
    public Personagem(String nomePersonagem, int vida, int dano, int codigo){
    	this.nomePersonagem = nomePersonagem;
    	this.vida = vida;
    	this.dano = dano;
    	this.codigo = codigo;
    }
    
    public void verificarStatus(boolean ativo){
    	if (ativo != true){
    		System.out.println("Personagem inativo");
    	}
    	else {
    		System.out.println("Personagem Ativo");
    	}
    }
    
    public void diminuirHp(int vida){
    	System.out.println("O HP de Personagem diminuiu");
    }
    
    abstract void defenderSe();
    abstract void atacar();
    
    protected String nomePersonagem;
    protected int resistencia;
    protected int dano;
    protected boolean ativo;
    protected int codigo;
    protected int vida;   
}
