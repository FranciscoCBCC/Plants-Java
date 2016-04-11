package br.ufpa.cbcc.plants;

public class Girassol extends Plants{
	Girassol(){
		
	};
    Girassol(const Girassol &){
    	
    };
    public void produzirSois();
    @Override
    public void defenderSe();
    @Override
    public void atacar();
    @Override
    public void fazerFotossíntese();
    @Override
    public void crescer();
    
    private int quantidadeSois;
    
}
