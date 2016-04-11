package br.ufpa.cbcc.plants;

public class Ervilha extends Plants{
	Ervilha(){
		
	};
	@Override
    public void defenderSe();
	@Override
    public void atacar();
	@Override
    public void fazerFotossíntese();
	@Override
    public void crescer();
    public void boosterAttack();

    private int qtErvilha;
    private int levelAttack;
}
