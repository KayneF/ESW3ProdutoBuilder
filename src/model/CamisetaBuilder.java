package model;

public class CamisetaBuilder {

	private Camiseta camiseta;
	
	
	// BUILDER
	public CamisetaBuilder() {
		this.camiseta = new Camiseta();
	}
	public static CamisetaBuilder builder() {
		return new CamisetaBuilder();
	}
	
	
	//
	public CamisetaBuilder addMarca(String marca) {
		this.camiseta.setMarca(marca);
		return this;
	}
	public CamisetaBuilder addCor(String cor) {
		this.camiseta.setCor(cor);
		return this;
	}
	public CamisetaBuilder addTamanho(CamisetaTamanho tamanho) {
		this.camiseta.setTamanho(tamanho);
		return this;
	}
	public CamisetaBuilder addValor(double valor) {
		this.camiseta.setValor(valor);
		return this;
	}
	
	
	//
	public Camiseta get() {
		this.camiseta.setMarca(this.camiseta.getMarca());
		this.camiseta.setCor(this.camiseta.getCor());
		this.camiseta.setTamanho(this.camiseta.getTamanho());
		this.camiseta.setValor(this.camiseta.getValor());
		return this.camiseta;
	}
	
}
