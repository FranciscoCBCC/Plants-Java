package br.ufpa.cbcc.plants;

public class Cereja extends Plants{
	Cereja(){
		
	};
    Cereja(const Cereja &){
    	
    };
    @Override
    public void defenderSe();
    @Override
    public void atacar();
    @Override
    public void fazerFotossíntese();
    @Override
    public void crescer();
    public void explodir();
    
    protected boolean prontoParaExplodir;
}
