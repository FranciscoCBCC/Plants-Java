package br.ufpa.cbcc.plants;

public class Ervilha extends Plants{
	Ervilha(){
		System.out.println("Construtor padrao de Ervilha criado");
	}
	
	Ervilha(int qtErvilha, int levelAttack){
		super(100,100);
		this.qtErvilha = qtErvilha;
		this.levelAttack = levelAttack;
	}
	
	@Override
    public void defenderSe(){
		System.out.println("Ervilha defendeu-se");
    }
	
	@Override
    public void atacar(){
		System.out.println("Ervilha atacou");		
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
