import java.awt.EventQueue;
import java.io.ObjectInputStream.GetField;
import java.util.Scanner;

import javax.swing.JOptionPane;




public class Main {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		Cliente haroldo = new Cliente();
		haroldo.setNome("Haroldo Sousa");
		
		Conta cc = new ContaCorrente(haroldo);
		Conta poupanca = new ContaPoupanca(haroldo);
		cc.depositar(200);
	
		System.out.println("Acessando Conta Corrente ...");
		System.out.println(".......................... ");
		System.out.println("Titular: "+ haroldo.getNome());
		 
		
		System.out.print("Qual valor vc quer transferir?: ");
		double valor = scan.nextDouble();
	
		cc.transferir(valor,poupanca);
		System.out.println("================================");
		System.out.println(" Valor Transferido:" + valor  );
		System.out.println("================================");
		scan.close();
		//JOptionPane.showMessageDialog(null, "Transferência Realizada!");
		
		System.out.println("\n Abrindo Extrato ...");
		cc.imprimirExtrato();
		System.out.println("================================\n");
		
		poupanca.imprimirExtrato();
	}

	
		
}
		
	
