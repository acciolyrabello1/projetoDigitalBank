package digitalbank;

public class TesteContas {

	public static void main(String[] args) {
			
			ContaCorrente c1 = new ContaCorrente (536, 1633);
			ContaPoupanca c2 = new ContaPoupanca (536, 2709);
			
			System.out.println(c1);
			System.out.println(c2);
			System.out.println("------------");
			c1.depositar(1000);
			c2.depositar(500);
			System.out.println(c1);
			System.out.println(c2);
			System.out.println("------------");
			c1.transferir(500, c2);
			System.out.println(c1);
			System.out.println(c2);
			System.out.println("------------");
			c2.sacar(300);
			System.out.println(c2);
			
			System.out.println("CC: " + c1.getSaldo());
			System.out.println("CP: " + c2.getSaldo());

		}
		
	}

