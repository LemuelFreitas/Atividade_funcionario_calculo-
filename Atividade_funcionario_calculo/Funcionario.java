package Atividade_funcionario_calculo;


public class Funcionario {
private long id;
private String nome;
private int matricula;
private String telefone;
private String endereco;
public Funcionario(int matricula, String nome, long id, String telefone, String endereco) {
	this.id = id;
	this.nome = nome;
	this.matricula = matricula;

	this.telefone = telefone;
	this.endereco = endereco;
}
public String getNome() {
	return nome;
}
public void setNome(String nome) {
	this.nome = nome;
}
public int getMatricula() {
	return matricula;
}
public void setMatricula(int matricula) {
	this.matricula = matricula;
}

public String getTelefone() {
	return telefone;
}
public void setTelefone(String telefone) {
	this.telefone = telefone;
}
public String getEndereco() {
	return endereco;
}
public void setEndereco(String endereco) {
	this.endereco = endereco;
}
public long getId() {
	return id;
}
public void setId(long id) {
	this.id = id;
}
public double calculaSalario (double SalarioHora, double HorasTrabalhadas) {

return SalarioHora * HorasTrabalhadas;
}
public double calculaSalarioPJ (double ValorBruto, double Imposto) {

return ValorBruto - Imposto;
}
}
