package digitalbank;

public class TesteFuncionario {

	public static void main(String[] args) {
		Funcionario funcionario1 = new Funcionario();

		funcionario1.setNome("João Paulo");
		funcionario1.setCpf("11230");
		funcionario1.setSalario(1000.00);

		System.out.println(funcionario1.getNome());
		System.out.println(funcionario1.getBonificacao());

	}

}
