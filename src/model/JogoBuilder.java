package model;

public class JogoBuilder {

	private Jogo jogo;
	
	
	// BUILDER
	public JogoBuilder() {
		this.jogo = new Jogo();
	}
	public static JogoBuilder builder() {
		return new JogoBuilder();
	}
	
	
	//
	public JogoBuilder addNome(String nome) {
		this.jogo.setNome(nome);
		return this;
	}
	public JogoBuilder addConsole(JogoConsole console) {
		this.jogo.setConsole(console);
		return this;
	}
	public JogoBuilder addValor(double valor) {
		this.jogo.setValor(valor);
		return this;
	}
	
	
	//
	public Jogo get() {
		this.jogo.setNome(this.jogo.getNome());
		this.jogo.setConsole(this.jogo.getConsole());
		this.jogo.setValor(this.jogo.getValor());
		return this.jogo;
	}
}
