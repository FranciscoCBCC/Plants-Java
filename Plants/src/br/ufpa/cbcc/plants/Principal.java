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
					for(int i=0; i<persons.length; i++){
						/*if(persons[i] instanceof Personagem){
							persons[i].atacar();
							persons[i].defenderSe();
						}*/
						try{
							Thread.sleep(500);
						if(persons[i] instanceof Cereja){
							((Cereja) persons[i]).explodir();
						}
						if(persons[i] instanceof Ervilha){
							((Ervilha) persons[i]).boosterAttack();
						}
						if(persons[i] instanceof Girassol){
							((Girassol) persons[i]).produzirSois();
						}
						if(persons[i] instanceof Zumbi){
							((Zumbi) persons[i]).duplicar();
						}
						
						}catch(Exception e){
							e.printStackTrace();
						}
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
			JOptionPane.showMessageDialog(null, "Opcao invalida, digite somente numeros, digite novamente: ");
		}
	}
}
