package pacote;

public class Conta {
	
	String nome;
	double saldo;
	double limite;
	int numero;
	
	boolean sacar (double valor) {
		if (this.saldo >= valor) {
			this.saldo -= valor;
			return true;
		}else {
			System.err.println("Saldo Indisponível");
			return false;
		}		
	}
	
	void depositar (double valor) {
		this.saldo += valor;
	}	

}
