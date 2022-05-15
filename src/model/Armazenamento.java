package model;

public class Armazenamento {

	private ArmazenamentoTipo tipo;
    private String fabricante;
    private int capacidade;
    private double valor;


    // GETTER & SETTERS
    public ArmazenamentoTipo getTipo() {
		return tipo;
	}
	public void setTipo(ArmazenamentoTipo tipo) {
		this.tipo = tipo;
	}
    public String getFabricante() {
        return fabricante;
    }
	public void setFabricante(String fabricante) {
        this.fabricante = fabricante;
    }
    public int getCapacidade() {
        return capacidade;
    }
    public void setCapacidade(int capacidade) {
        this.capacidade = capacidade;
    }
    public double getValor() {
        return valor;
    }
    public void setValor(double valor) {
        this.valor = valor;
    }

    @Override
    public String toString() {
        return "\n# Equipamento de Armazenamento #" +
                "\nTipo: " + this.getTipo() +
                "\nFabricante: " + this.getFabricante() +
                "\nCapacidade: " + this.getCapacidade() +
                "\nValor: " + this.getValor() + "\n";
    }
}
