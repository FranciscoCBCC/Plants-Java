package br.ufpa.cbcc.plants;

public abstract class Personagem {
	Personagem(){
		
	}
	
    Personagem(const string &, int, int, int){
    	
    }
    
    abstract void defenderSe();
    abstract void atacar();
    void receberAtaque(){
    	
    }

    protected String nomePersonagem;
    protected int vida;
    protected int resistencia;
    protected int dano;
    protected boolean ativo;
    protected int codigo;
    protected int life;
}
