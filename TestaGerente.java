package digitalbank;

public class TestaGerente {

	public static void main(String[] args) {
		Gerente gerente1 = new Gerente();

		gerente1.setNome("Paulo Rabello");
		gerente1.setCpf("113934");
		gerente1.setSalario(2000.0);
		gerente1.setSenha(2222);

		System.out.println(gerente1.getNome());
		System.out.println(gerente1.getCpf());
		System.out.println(gerente1.getSalario());

		gerente1.setSenha(2222);
		boolean autenticou = gerente1.autentica(2222);

		System.out.println(autenticou);

	}

}
