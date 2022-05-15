package model;

public class CalcadoBuilder {

	private Calcado calcado;
	
	
	// BUILDER
	public CalcadoBuilder() {
		this.calcado = new Calcado();
	}
	public static CalcadoBuilder builder() {
		return new CalcadoBuilder();
	}
	
	
	//
	public CalcadoBuilder addTipo(CalcadoTipo tipo) {
		this.calcado.setTipo(tipo);
		return this;
	}
	public CalcadoBuilder addCor(String cor) {
		this.calcado.setCor(cor);
		return this;
	}
	public CalcadoBuilder addTamanho(CalcadoTamanho tamanho) {
		this.calcado.setTamanho(tamanho);
		return this;
	}
	public CalcadoBuilder addValor(double valor) {
		this.calcado.setValor(valor);
		return this;
	}
	
	
	//
	public Calcado get() {
		this.calcado.setTipo(this.calcado.getTipo());
		this.calcado.setCor(this.calcado.getCor());
		this.calcado.setTamanho(this.calcado.getTamanho());
		this.calcado.setValor(this.calcado.getValor());
		return this.calcado;
	}
	
}
