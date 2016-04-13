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
    
    @Override
	public void verificarSatus(boolean ativo) {
		if (ativo != true){
    		System.out.println("Cereja inativa");
    	}
    	else {
    		System.out.println("Cereja Ativa");
    	}		
	}
    
    protected boolean prontoParaExplodir;
    
    public static void main(String[] args) {
		Cereja cereja = new Cereja();
		Ervilha ervilha = new Ervilha();
		Girassol girassol = new Girassol();
		
		cereja.atacar();
		cereja.defenderSe();
		cereja.crescer();
		cereja.fazerFotossíntese();
		
		ervilha.atacar();
		ervilha.defenderSe();
		ervilha.crescer();
		ervilha.fazerFotossíntese();
		
		girassol.atacar();
		girassol.defenderSe();
		girassol.crescer();
		girassol.fazerFotossíntese();
	}	
}
