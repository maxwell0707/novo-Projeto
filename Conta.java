package inicial;

public class Conta {

	private String nomeTitular;
	private int numeroConta;
	private double saldo;

	public Conta(String nomeTitular, int numeroConta, double valorDeposito) {

		this.nomeTitular = nomeTitular;
		this.numeroConta = numeroConta;
		this.saldo = valorDeposito;
	}

	public Conta(String nomeTitular, int numeroConta) {

		this.nomeTitular = nomeTitular;
		this.numeroConta = numeroConta;

	}

	public String getNomeTitular() {
		return nomeTitular;
	}

	public void setNomeTitular(String nomeTitular) {
		this.nomeTitular = nomeTitular;
	}

	public int getNumeroConta() {
		return numeroConta;
	}

	public double getSaldo() {
		return saldo;
	}

	public void deposito(double deposito) {
		this.saldo += deposito;

	}

	public void saque(double saque) {
		this.saldo -= (saque + 5.0);

	}
	
	public String toString() {
		return "Titular: " 
	+ nomeTitular
	+"\nConta: " 
	+ numeroConta
	+ "\nSaldo: R$ "
	+ saldo;
	
	}

}
