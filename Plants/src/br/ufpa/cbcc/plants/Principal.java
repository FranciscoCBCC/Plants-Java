package br.ufpa.cbcc.plants;
import br.ufpa.cbcc.zumbi.Zumbi;
import java.util.Scanner;
import javax.swing.JOptionPane;


public class Principal {

	public static void main(String[] args) {
		Cereja cereja = new Cereja();
		Ervilha ervilha = new Ervilha();
		Girassol girassol = new Girassol();
		Zumbi zumbi = new Zumbi();
		
		Personagem persons[] = {cereja, ervilha, girassol, zumbi};
		//Scanner ler = new Scanner(System.in);	
		
		//System.out.println("Plants VS Zombies");
		//System.out.println("\n1) Iniciar Jogo");
		//System.out.println("\n2) Encerrar Jogo");
		try{
		String entrada;
		entrada = JOptionPane.showInputDialog("Plants VS Zombies\n1) Iniciar Jogo\n2) Encerrar Jogo");
		int opcao = Integer.parseInt(entrada);
		//opcao = JOptionPane.showConfirmDialog(null, "Opcao");
		
		
		
		//int opcao = ler.nextInt();
			
		switch(opcao){
			case 1:
				try{
					for(int i=0; i<=persons.length; i++){
						if(persons[i] instanceof Personagem){
							persons[i].atacar();
							persons[i].defenderSe();
						}
						/*if(persons[i] instanceof Ervilha){
							persons[i].atacar();
							persons[i].defenderSe();
						}
						if(persons[i] instanceof Girassol){
							persons[i].atacar();
							persons[i].defenderSe();
						}
						if(persons[i] instanceof Zumbi){
							persons[i].atacar();
							persons[i].defenderSe();
						}*/
					}
				}
				catch (Exception excessao){
					//System.out.print("\n\nExcedeu o limite do array, corrigir laco FOR: "+excessao);
					JOptionPane.showMessageDialog(null, "Excedeu o limite do array, corrigir laco FOR: "+excessao);
				}
				
				case 2:
					JOptionPane.showMessageDialog(null, "Jogo encerrado");
					System.exit(0);
				default:
					JOptionPane.showMessageDialog(null, "Opcao invalida, jogo encerrado");
					System.exit(0);
			}
		}
		catch (Exception NumberFormatException){
			//System.out.print("Opcao Invalida, digite somente numeros");
			JOptionPane.showMessageDialog(null, "Opcao invalida, digite somente numeros, jogo encerrado");
		}
	}
}
