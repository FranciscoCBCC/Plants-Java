package br.ufpa.cbcc.plants;

	public abstract class Plants extends Personagem implements Atacavel{
		
	public Plants(){
		System.out.println("Construtor padrao de Plants criado");
	}
	
	public Plants(float recarga, int alcance){
		this.recarga = recarga;
		this.alcance = alcance;
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
	
	abstract void defenderSe();
	abstract void atacar();
	abstract void fazerFotossíntese();
	abstract void crescer();
    

    private float recarga;
    private int alcance;
}
