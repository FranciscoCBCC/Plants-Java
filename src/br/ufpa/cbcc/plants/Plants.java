package br.ufpa.cbcc.plants;

public abstract class Plants extends Personagem {
	public Plants(){
		
	};
	
	abstract void defenderSe();
	abstract void atacar();
	abstract void fazerFotoss�ntese();
	abstract void crescer();
    

    private float recarga;
    private int alcance;
}
