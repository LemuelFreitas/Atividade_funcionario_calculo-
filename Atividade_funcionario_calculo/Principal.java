package Atividade_funcionario_calculo;


public class Principal {
	public static void main(String[] args) {
	Funcionario funcionario = new Funcionario(1,"luis_Fernando",4000,"(15)586886","vila rio branco");
	System.out.println("\nFuncionario: ");
	System.out.println("ID: "+ funcionario.getId());
	System.out.println("Nome: "+ funcionario.getNome());
	System.out.println("Matricula: "+ funcionario.getMatricula());
	System.out.println("Telefone: "+ funcionario.getTelefone());
	System.out.println("Endereço: "+ funcionario.getEndereco());
	System.out.println(funcionario.calculaSalario(10, 10));
	
	Jornada jornada = new Jornada("luis_Fernando",1,4000,"(15)586886","vila rio branco");
	System.out.println("\nJornada: ");
	System.out.println("ID: "+ jornada.getId());
	System.out.println("Nome: "+ jornada.getNome());
	System.out.println("Matricula: "+ jornada.getMatricula());
	System.out.println("Telefone: "+ jornada.getTelefone());
	System.out.println("Endereço: "+ jornada.getEndereco());
	System.out.println(jornada.calculaSalario(10, 25));
	
	Horista horista = new Horista("luis_Fernando",1,4000,"(15)586886","vila rio branco");
	System.out.println("\nHorista: ");
	System.out.println("ID: "+ horista.getId());
	System.out.println("Nome: "+ horista.getNome());
	System.out.println("Matricula: "+ horista.getMatricula());
	System.out.println("Telefone: "+ horista.getTelefone());
	System.out.println("Endereço: "+ horista.getEndereco());
	System.out.println(horista.calculaSalario(10, 25));
	
	PessoaJuridica pj = new PessoaJuridica("luis_Fernando",1,4000,"(15)586886","vila rio branco");
	System.out.println("\nPessoa Juridica: ");
	System.out.println("ID: "+ pj.getId());
	System.out.println("Nome: "+ pj.getNome());
	System.out.println("Matricula: "+ pj.getMatricula());
	System.out.println("Telefone: "+ pj.getTelefone());
	System.out.println("Endereço: "+ pj.getEndereco());
	System.out.println(pj.calculaSalarioPJ(35, 25));
}
}