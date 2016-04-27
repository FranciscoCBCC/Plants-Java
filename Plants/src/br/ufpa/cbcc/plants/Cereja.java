package br.ufpa.cbcc.plants;
import javax.swing.JOptionPane;

import br.ufpa.cbcc.zumbi.Zumbi;


public class Cereja extends Plants{
	public Cereja(){
		super();
		//System.out.println("Construtor padrao de Cereja criado");
		prontoParaExplodir = true;
	}
	
	
    public Cereja(String nomePersonagem, int resistencia, int dano, int codigo, int vida, float recarga, int alcance, boolean prontoParaExplodir){
    	super(nomePersonagem, resistencia, dano, codigo, vida, recarga, alcance);
    	this.prontoParaExplodir = prontoParaExplodir;
    }
    
    public Cereja(Cereja copia){
    	super((Plants)copia);
    	this.prontoParaExplodir = copia.prontoParaExplodir;
    }
    
    @Override
    public void defenderSe(){
    	//System.out.println("Cereja defendeu-se");
    	JOptionPane.showMessageDialog(null, "Cereja defendeu-se");
    }
    @Override
    public void atacar(){
    	if(ativo){
    		//System.out.println("Cereja atacou");
    		JOptionPane.showMessageDialog(null, "Cereja atacou");
    	}
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
    	JOptionPane.showMessageDialog(null,"Cereja explodiu");
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
    	
}
