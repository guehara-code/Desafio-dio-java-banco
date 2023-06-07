
import java.util.List;
import java.util.ArrayList;

public class Main {

	public static void main(String[] args) {

		List<Conta> listaContas;
		listaContas = new ArrayList<Conta>();

		Cliente joao = new Cliente();
		joao.setNome("Joao");

		Conta cc1 = new ContaCorrente(joao);
		Conta poupanca1 = new ContaPoupanca(joao);

		cc1.depositar(100);
		cc1.transferir(20, poupanca1);

		listaContas.add(cc1);
		listaContas.add(poupanca1);

		Cliente pedro = new Cliente();
		pedro.setNome("Pedro");

		Conta cc2 = new ContaCorrente(pedro);
		Conta poupanca2 = new ContaPoupanca(pedro);

		listaContas.add(cc2);
		listaContas.add(poupanca2);

		cc2.depositar(200);
		cc2.transferir(40, poupanca2);

		Cliente ricardo = new Cliente();
		ricardo.setNome("Ricardo");

		Conta cc3 = new ContaCorrente(ricardo);
		Conta poupanca3 = new ContaPoupanca(ricardo);

		listaContas.add(cc3);
		listaContas.add(poupanca3);

		cc3.depositar(300);
		cc3.transferir(80, poupanca3);



		Banco bancoDio = new Banco();
		bancoDio.setNome("bancoDio");
		bancoDio.setContas(listaContas);
		bancoDio.printContas();

	}

}
