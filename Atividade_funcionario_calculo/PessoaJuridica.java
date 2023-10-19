package Atividade_funcionario_calculo;

public class PessoaJuridica extends Funcionario{
	
	public PessoaJuridica(String nome, int matricula, long id, String telefone, String endereco) {
		super(matricula, nome, id, telefone, endereco);
	
	}
	
	@Override
	public double calculaSalarioPJ (double ValorBruto, double Imposto) {

return ValorBruto - Imposto;
}
}
