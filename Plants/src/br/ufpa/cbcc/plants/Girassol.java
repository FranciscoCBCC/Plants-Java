package br.ufpa.cbcc.plants;


public class Girassol extends Plants{
	Girassol(){
		super();
		quantidadeSois = 0;
		//System.out.println("Construtor padrao de Girassol criado");
	} 
	
	Girassol(String nomePersonagem, int resistencia, int dano, int codigo, int vida, float recarga, int alcance){
		super(nomePersonagem, resistencia, dano, codigo, vida, recarga, alcance);
    	this.quantidadeSois = quantidadeSois;
    }
    
    public void produzirSois(){
    	System.out.println("Girassol produziu sois");
    }
    
    @Override
    public void defenderSe(){
    	System.out.println("Girassol defendeu-se");
    }
    
    @Override
    public void atacar(){
    	System.out.println("Girassol atacou");
    }
    
    @Override
    public void fazerFotossíntese(){
    	System.out.println("Girassol fazendo fotossintese");
    }
    
    @Override
    public void crescer(){
    	System.out.println("Girassol cresceu");
    }
    
    @Override
	public void verificarSatus(boolean ativo) {
		if (ativo != true){
    		System.out.println("Girassol inativo");
    	}
    	else {
    		System.out.println("Girassol Ativo");
    	}		
	}
    
    private int quantidadeSois;
    
}
