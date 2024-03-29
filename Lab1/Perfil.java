
public class Perfil {
	//atributos
	private char sexo;
	private String dataNascimento;
	private String cidade;
	private String estado; 
	private String telefone;
	private boolean fumante;
	private int tempoHabilitacao;
	
	public Perfil (char sexo, String dataNascimento, String cidade, String estado, String telefone, boolean fumante, int tempoHabilitacao) {
		this.sexo = sexo;
		this.dataNascimento = dataNascimento;
		this.cidade = cidade;
		this.estado = estado;
		this.telefone = telefone;
		this.fumante = fumante;
		this.tempoHabilitacao = tempoHabilitacao;
	}
	
	//gets e sets
	public char getSexo() {
		return sexo;
	}
	public void setSexo(char sexo) {
		this.sexo = sexo;
	}
	public String getDataNascimento() {
		return dataNascimento;
	}
	public void setDataNascimento(String dataNascimento) {
		this.dataNascimento = dataNascimento;
	}
	public boolean getFumante() {
		return fumante;
	}
	public void setFumante(boolean fumante) {
		this.fumante = fumante;
	}
	public String getCidade() {
		return cidade;
	}
	public void setCidade(String cidade) {
		this.cidade = cidade;
	}
	public String getEstado() {
		return estado;
	}
	public void setEstado(String estado) {
		this.estado = estado;
	}
	public String getTelefone() {
		return telefone;
	}
	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}
	public int getTempoHabilitacao() {
		return tempoHabilitacao;
	}
	public void setTempoHabilitacao(int tempoHabilitacao) {
		this.tempoHabilitacao = tempoHabilitacao;
	}
	
	public String toString () {
		String out = "Sexo: " + getSexo() + "\n";
		out = out +"Data de Nascimento: " + getDataNascimento() + "\n";
		out = out + "Estado: " + getEstado() + "\n";
		out = out + "Telefone: " + getTelefone() + "\n";
		out = out + "Fumante: " + getFumante() + "\n";
		out = out + "Tempo de Habilitação: " + getTempoHabilitacao() + "\n";
		return out;
	}
}
