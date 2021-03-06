package br.ufpa.cbcc.plants;


	public abstract class Plants extends Personagem{
		
	public Plants(){
		super();
		//System.out.println("Construtor padrao de Plants criado");
		this.recarga = 0;
		this.alcance = 0;		
	}
	
	public Plants(String nomePersonagem, int resistencia, int dano, int codigo, int vida, float recarga, int alcance){
		super(nomePersonagem, resistencia, dano, codigo, vida);
		this.recarga = recarga;
		this.alcance = alcance;
	}
	
	public Plants(Plants copia){
		super((Personagem)copia);
		this.recarga = copia.recarga;
		this.alcance = copia.alcance;
	}
	
	public void verificarStatus(boolean ativo){
    	if (ativo != true){
    		System.out.println("Plants inativo");
    	}
    	else {
    		System.out.println("Plants Ativo");
    	}
    }
	
	public void diminuirHp(int vida, int resistencia){
    	System.out.println("O HP de Plants diminuiu");
    }
	
	public abstract void defenderSe();
	public abstract void atacar();
	abstract void fazerFotossíntese();
	abstract void crescer();
    

    private float recarga;
    private int alcance;
}
