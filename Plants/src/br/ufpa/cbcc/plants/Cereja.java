package br.ufpa.cbcc.plants;

public class Cereja extends Plants{
	Cereja(){
		System.out.println("Construtor padrao de Cereja criado");
	}
	
	
    Cereja(boolean prontoParaExplodir){
    	super(100,100);
    	this.prontoParaExplodir = prontoParaExplodir;
    }
    
    @Override
    public void defenderSe(){
    	System.out.println("Cereja defendeu-se");
    }
    @Override
    public void atacar(){
    	System.out.println("Cereja atacou"); 	
    }
    @Override
    public void fazerFotossíntese(){
    	System.out.println("Cereja fazendo fotossintese");
    }
    @Override
    public void crescer(){
    	System.out.println("Cereja cresceu");
    }
    public void explodir(){
    	System.out.println("Cereja pronta para explodir");
    }
    
    protected boolean prontoParaExplodir;
    
    public static void main(String[] args) {
		Cereja cereja = new Cereja();
		
		cereja.atacar();
		cereja.defenderSe();
		cereja.crescer();
		cereja.fazerFotossíntese();
	}
}
