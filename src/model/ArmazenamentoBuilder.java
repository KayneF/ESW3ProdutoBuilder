package model;

public class ArmazenamentoBuilder {

	private Armazenamento armazenamento;
	
	
	// BUILDER
	public ArmazenamentoBuilder() {
		this.armazenamento = new Armazenamento();
	}
	public static ArmazenamentoBuilder builder() {
		return new ArmazenamentoBuilder();
	}
	
	
	//
	public ArmazenamentoBuilder addTipo(ArmazenamentoTipo tipo) {
		this.armazenamento.setTipo(tipo);
		return this;
	}
	public ArmazenamentoBuilder addFabricante(String fabricante) {
		this.armazenamento.setFabricante(fabricante);
		return this;
	}
	public ArmazenamentoBuilder addCapacidade(int capacidade) {
		this.armazenamento.setCapacidade(capacidade);
		return this;
	}
	public ArmazenamentoBuilder addValor(double valor) {
		this.armazenamento.setValor(valor);
		return this;
	}
	
	
	//
	public Armazenamento get() {
		this.armazenamento.setTipo(this.armazenamento.getTipo());
		this.armazenamento.setFabricante(this.armazenamento.getFabricante());
		this.armazenamento.setCapacidade(this.armazenamento.getCapacidade());
		this.armazenamento.setValor(this.armazenamento.getValor());
		return this.armazenamento;
	}
}
