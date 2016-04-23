package br.ufpa.cbcc.zumbi;
import br.ufpa.cbcc.plants.Atacavel;
import br.ufpa.cbcc.plants.Personagem;


public class Zumbi extends Personagem implements Atacavel{
	public Zumbi(){
		super();
		//System.out.print("Construtor padrao de Zumbi criado");
	}
	
	@Override
	public void verificarSatus(boolean ativo) {
		if (ativo != true){
    		System.out.println("Zumbi inativo");
    	}
    	else {
    		System.out.println("Zumbi Ativo");
    	}	
	}

	@Override
	public void diminuirHp(int vida, int resistencia) {
		System.out.println("O HP do Zumbi diminuiu");
	}	
	
	@Override
	public void atacar(){
		System.out.println("Zumbi atacou");
	}
	
	@Override
	public void defenderSe(){
		System.out.print("Zumbi defendeu-se");
	}

}
