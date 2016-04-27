package br.ufpa.cbcc.plants;


public interface Atacavel {
	//void verificarAcerto();
	public void verificarSatus(boolean ativo);
    public void diminuirHp(int vida);
    public void diminuirHp(int vida, int resistencia); 
}
