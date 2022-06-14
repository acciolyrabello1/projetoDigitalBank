package digitalbank;

public class Conta{
	
	public String titular;
	public int agencia;
	public int numero;
	public double saldo;
	
	public Conta(int agencia, int numero) {
		super();
		this.agencia = agencia;
		this.numero = numero;
	}
	
	
	public String getTitular() {
		return titular;
	}



	public void setTitular(String titular) {
		this.titular = titular;
	}



	public int getAgencia() {
		return agencia;
	}



	public void setAgencia(int agencia) {
		this.agencia = agencia;
	}



	public int getNumero() {
		return numero;
	}



	public void setNumero(int numero) {
		this.numero = numero;
	}



	public double getSaldo() {
		return saldo;
	}



	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}



	public void sacar(double v1) {
		if(v1>saldo) {
			System.out.println("saldo insuficiente");
		}else
			this.saldo = saldo - v1;
		System.out.println("saque de R$" + v1 + " na conta de " + titular + " feito com sucesso");
	}
	
	public void depositar(double v2) {
		this.saldo = saldo + v2;
		System.out.println("deposito de R$" + v2 + " na conta de " + titular + " feito com sucesso");
	}
	
	public void transferir(double v3, Conta destino) {
		this.saldo = this.saldo - v3;
		destino.saldo = destino.saldo + v3;
		System.out.println("transferência de R$" + v3 + " da conta de " + titular + " para a conta de " + destino.getTitular() + " feito com sucesso");
	}
	
	
	@Override
	public String toString() {
		return "Conta [Número da conta:" + numero + ", Titular:" + titular + ", Saldo R$" + saldo + "]";
	}
}
