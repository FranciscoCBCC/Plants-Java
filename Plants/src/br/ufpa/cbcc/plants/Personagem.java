package br.ufpa.cbcc.plants;


public abstract class Personagem implements Atacavel,Movimentos {
	public Personagem(){
		//System.out.println("Construtor padrao de Personagem criado");
		nomePersonagem = "Personagem";
		resistencia = 0;
		dano = 0;
		ativo = true;
		codigo = 0;
		vida = 0;
	}
	
    public Personagem(String nomePersonagem, int resistencia, int dano, int codigo, int vida){
    	
    	//System.out.println("Construtor com parametro de Personagem criado");
    	this.nomePersonagem = nomePersonagem;
    	this.resistencia = resistencia;
    	this.dano = dano;
    	this.codigo = codigo;
    	this.vida = vida;
    }
    
    public Personagem(Personagem copia){
		this.nomePersonagem = copia.nomePersonagem;
		this.resistencia = copia.resistencia;
		this.dano = copia.dano;
		this.codigo = copia.codigo;
		this.vida = copia.vida;
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
    
    public abstract void defenderSe();
    public abstract void atacar();
    
    protected String nomePersonagem;
    protected int resistencia;
    protected int dano;
    protected boolean ativo;
    protected int codigo;
    protected int vida;   
}
