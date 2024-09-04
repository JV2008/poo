package POO2;

public class ObjCliente {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Cliente cliente1= new Cliente();
		Cliente cliente2= new Cliente();

		//Atributos 1
		cliente1.setId(01);
		cliente1.setNome("Tom Cruise");
		cliente1.setIdade(60);
		cliente1.setCPF(34787690832l);
		cliente1.setRg(133757697);
		cliente1.setEndereço("New york");
		cliente1.setProfissao("Ator");
		cliente1.setTelefone(994557727);
		cliente1.setSexo("masculino");

		//métodos 1
		cliente1.setpede("Muito");
		cliente1.setparcela("Não");
		cliente1.setcompra("sempre");
		cliente1.setpaga("sim");


		//Atributos 2
		cliente2.setId(02);
		cliente2.setNome("Daniela");
		cliente2.setIdade(60);
		cliente2.setCPF(34787690832l);
		cliente2.setRg(133757697);
		cliente2.setEndereço("New york");
		cliente2.setProfissao("Ator");
		cliente2.setTelefone(994557727);
		cliente2.setSexo("feminiino");

		//métodos 2		
		cliente2.setpede("Sim");
		cliente2.setparcela("Em 3X");
		cliente2.setcompra("sim");
		cliente2.setpaga("Atrasado");

		System.out.println("----Cliente1----");
		//Saída dos Atributos 1
		System.out.println(cliente1.getId());
		System.out.println(cliente1.getNome());
		System.out.println(cliente1.getIdade());
		System.out.println(cliente1.getCPF());
		System.out.println(cliente1.getRg());
		System.out.println(cliente1.getEndereço());
		System.out.println(cliente1.getProfissao());
		System.out.println(cliente1.getTelefone());
		System.out.println(cliente1.getSexo());
		//Saída dos Métodos 1
		System.out.println(cliente2.getpede());
		System.out.println(cliente2.getparcela());
		System.out.println(cliente2.getcompra());
		System.out.println(cliente2.getpaga());
	
		System.out.println("----Cliente2----");
		//Saída dos Atributos 2
		System.out.println(cliente2.getId());
		System.out.println(cliente2.getNome());
		System.out.println(cliente2.getIdade());
		System.out.println(cliente2.getCPF());
		System.out.println(cliente2.getRg());
		System.out.println(cliente2.getEndereço());
		System.out.println(cliente2.getProfissao());
		System.out.println(cliente2.getTelefone());
		System.out.println(cliente2.getSexo());
		//Saída dos Métodos 2
		System.out.println(cliente2.getpede());
		System.out.println(cliente2.getparcela());
		System.out.println(cliente2.getcompra());
		System.out.println(cliente2.getpaga());
	}

}
