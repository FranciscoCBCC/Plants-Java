package br.ufpa.cbcc.plants;


public interface Atacavel {
	//void verificarAcerto();
	void verificarSatus(boolean ativo);
    void diminuirHp(int vida);
    void diminuirHp(int vida, int resistencia); 
}
