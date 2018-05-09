package pacote;

import java.util.concurrent.ThreadLocalRandom;

public class TesteConta {

	public static void main(String[] args) {
		Conta personA = new Conta();
		Conta personB = new Conta();
		
		// setting attributes of personA
		personA.nome = "Joao";
		personA.saldo = 1000.0;
		personA.limite = 1500.0;
		personA.numero = 1;
		
		//setting attributes of personB
		personB.nome = "Joao";
		personB.saldo = 300.0;
		personB.limite = 800.0;
		personB.numero = 2;
		
		while (true) {
			
			// generates random value to be taken from the account A
			double randomNum = ThreadLocalRandom.current().
					nextDouble(1.0, (personA.saldo+1));
			
			//transfer money from personA to personB
			if (personA.sacar(randomNum)) {
				personB.depositar(randomNum);
			}else {
				System.out.println("Tentativa de saque de " + randomNum);
				System.out.println("Saldo personA = " + personA.saldo);
				break;				
			}
			
			/* generates random value to be taken from the account b
			and to be added in account B*/
			randomNum = ThreadLocalRandom.current()
					.nextDouble(1.0, (personB.saldo+1));
			
			//transfer money from personB to personA
			if (personB.sacar(randomNum)) {
				personA.depositar(randomNum);
			}else {
				System.out.println("Tentativa de saque de " + randomNum);
				System.out.println("Saldo personB = " + personB.saldo);
				break;
			}
		}

	}

}
