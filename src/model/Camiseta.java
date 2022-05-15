package model;

public class Camiseta {

    
    private String marca;
    private String cor;
    private CamisetaTamanho tamanho;
    private double valor;


    // GETTER & SETTERS
    public String getMarca() {
		return marca;
	}
	public void setMarca(String marca) {
		this.marca = marca;
	}
	public String getCor() {
		return cor;
	}
	public void setCor(String cor) {
		this.cor = cor;
	}
	public CamisetaTamanho getTamanho() {
		return tamanho;
	}
	public void setTamanho(CamisetaTamanho tamanho) {
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
        return "\n# Camiseta #" +
                "\nMarca: " + this.getMarca() +
                "\nCor: " + this.getCor() +
                "\nTamanho: " + this.getTamanho() +
                "\nValor: " + this.getValor() + "\n";
    }

}
