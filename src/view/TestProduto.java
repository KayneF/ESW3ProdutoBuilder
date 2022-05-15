package view;

import java.util.ArrayList;

import model.Armazenamento;
import model.ArmazenamentoBuilder;
import model.ArmazenamentoTipo;
import model.Calcado;
import model.CalcadoBuilder;
import model.CalcadoTamanho;
import model.CalcadoTipo;
import model.Camiseta;
import model.CamisetaBuilder;
import model.CamisetaTamanho;
import model.Jogo;
import model.JogoBuilder;
import model.JogoConsole;

public class TestProduto {
	
	public static void main(String[] args) {
		
		ArrayList<Object> produto = new ArrayList<Object>();
		
		// CALÇADOS
		Calcado calcado1 = CalcadoBuilder.builder()
				.addTipo(CalcadoTipo.SOCIAL)
				.addCor("Preto")
				.addTamanho(CalcadoTamanho.T40)
				.addValor(109.90)
				.get();
				produto.add(calcado1);
		
		Calcado calcado2 = CalcadoBuilder.builder()
				.addTipo(CalcadoTipo.TENNIS)
				.addCor("Branco")
				.addTamanho(CalcadoTamanho.T42)
				.addValor(239.90)
				.get();
				produto.add(calcado2);
		
		Calcado calcado3 = CalcadoBuilder.builder()
				.addTipo(CalcadoTipo.TENNIS)
				.addCor("Cinza")
				.addTamanho(CalcadoTamanho.T39)
				.addValor(189.90)
				.get();
				produto.add(calcado3);
				
				
		// CAMISETAS
		Camiseta camiseta1 = CamisetaBuilder.builder()
				.addMarca("Polho")
				.addCor("Azul")
				.addTamanho(CamisetaTamanho.M)
				.addValor(59.90)
				.get();
				produto.add(camiseta1);
		
		Camiseta camiseta2 = CamisetaBuilder.builder()
				.addMarca("Lagoste")
				.addCor("Verde")
				.addTamanho(CamisetaTamanho.G)
				.addValor(39.90)
				.get();
				produto.add(camiseta2);
		
		Camiseta camiseta3 = CamisetaBuilder.builder()
				.addMarca("GoodKat")
				.addCor("Rosa")
				.addTamanho(CamisetaTamanho.P)
				.addValor(49.90)
				.get();
				produto.add(camiseta3);
				
				
		// JOGOS
		Jogo jogo1 = JogoBuilder.builder()
				.addNome("O Bom da Guerra")
				.addConsole(JogoConsole.PLAYSTATION)
				.addValor(49.90)
				.get();
				produto.add(jogo1);
		
		Jogo jogo2 = JogoBuilder.builder()
				.addNome("A Lenda do Zelda")
				.addConsole(JogoConsole.SWITCH)
				.addValor(59.90)
				.get();
				produto.add(jogo2);
				
		Jogo jogo3 = JogoBuilder.builder()
				.addNome("Antônio Gavião Skatista Profissional 2")
				.addConsole(JogoConsole.XBOX)
				.addValor(39.90)
				.get();
				produto.add(jogo3);
				
		
		// ARMAZENAMENTO
		Armazenamento arm1 = ArmazenamentoBuilder.builder()
				.addTipo(ArmazenamentoTipo.NVME)
				.addFabricante("Oeste Digital")
				.addCapacidade(500)
				.addValor(1000.00)
				.get();
				produto.add(arm1);
				
		Armazenamento arm2 = ArmazenamentoBuilder.builder()
				.addTipo(ArmazenamentoTipo.SSD)
				.addFabricante("Tio Sung")
				.addCapacidade(1000)
				.addValor(800.00)
				.get();
				produto.add(arm2);
				
		Armazenamento arm3 = ArmazenamentoBuilder.builder()
				.addTipo(ArmazenamentoTipo.HDD)
				.addFabricante("Portão do Mar")
				.addCapacidade(2000)
				.addValor(500.00)
				.get();
				produto.add(arm3);
		
		
		System.out.println(produto.toString());
	}
}
