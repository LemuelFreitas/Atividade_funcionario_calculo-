package Atividade_funcionario_calculo;

public class Horista extends Funcionario{
	
	public Horista(String nome, int matricula, long id, String telefone, String endereco) {
		super(matricula, nome, id, telefone, endereco);
	
	}
	
	@Override
	public double calculaSalario (double SalarioHora, double HorasTrabalhadas) {

return SalarioHora * HorasTrabalhadas;
}
}
