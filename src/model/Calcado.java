package model;

public class Calcado {

	private CalcadoTipo tipo;
    private String cor;
    private CalcadoTamanho tamanho;
    private double valor;
    

    // GETTER & SETTERS
    public CalcadoTipo getTipo() {
		return tipo;
	}
	public void setTipo(CalcadoTipo tipo) {
		this.tipo = tipo;
	}
    public String getCor() {
		return cor;
	}
	public void setCor(String cor) {
		this.cor = cor;
	}
	public CalcadoTamanho getTamanho() {
		return tamanho;
	}
	public void setTamanho(CalcadoTamanho tamanho) {
		this.tamanho = tamanho;
	}
	public double getValor() {
		return valor;
	}
	public void setValor(double valor) {
		this.valor = valor;
	}
	
    
    @Override
    public String toString() {
        return "\n# Calçado #" +
                "\nTipo: " + this.getTipo() +
                "\nCor: " + this.getCor() +
                "\nTamanho: " + this.getTamanho() +
                "\nValor: " + this.getValor() + "\n";
    }

}
