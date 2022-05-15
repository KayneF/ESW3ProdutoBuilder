package model;

public class Jogo {

    private String nome;
    private JogoConsole console;
    private double valor;


    // GETTER & SETTERS
    public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public JogoConsole getConsole() {
		return console;
	}
	public void setConsole(JogoConsole console) {
		this.console = console;
	}
	public double getValor() {
		return valor;
	}
	public void setValor(double valor) {
		this.valor = valor;
	}

	
    @Override
    public String toString() {
        return "\n# Jogo Eletronico #" +
                "\nNome: " + this.getNome() +
                "\nConsole: " + this.getConsole() +
                "\nValor: " + this.getValor() + "\n";
    }

}
