package Atividade_funcionario_calculo;

public class Jornada extends Funcionario{
	
	public Jornada(String nome, int matricula, long id, String telefone, String endereco) {
		super(matricula, nome, id, telefone, endereco);
	
	}
	
	@Override
	public double calculaSalario (double SalarioHora, double HorasTrabalhadas) {

return SalarioHora * HorasTrabalhadas;
}
}