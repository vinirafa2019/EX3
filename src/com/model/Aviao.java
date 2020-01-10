package com.model;

import java.util.Scanner;

public class Aviao extends Veiculo {
	private String Tipo;
	private String Uso;

	public Aviao(String Tipo, String Uso, String Modelo, int Velocidade, int Passageiros, int Combustivel) {
		super(Modelo, Velocidade, Passageiros, Combustivel);
		this.Tipo = Tipo;
		this.Uso = Uso;
	}

	public String getTipo() {
		return Tipo;
	}

	public void setTipo(String tipo) {
		Tipo = tipo;
	}

	public String getUso() {
		return Uso;
	}

	public void setUso(String uso) {
		Uso = uso;
	}

	public void Acelerar() {

		int op;
		Scanner sc = new Scanner(System.in);
		System.out.println("Deseja Acelerar? Sim-1|Nao-2");
		op = sc.nextInt();

		switch (op) {
		case 1:
			while (getVelocidade() <= 1000) {
				Velocidade=Velocidade + 20;
				setCombustivel(getCombustivel() - 1);
				System.out.println("Sua velocidade é: " + Velocidade);
				System.out.println("Quantidade de Combustivel: " + getCombustivel());
			}
			break;

		case 2:
			System.out.println("Nao Acelera");
			break;
		default:
			System.out.println("Opção invalida digite novamente");
		}

	}

	public void Abastecer(String qtd) {

		while (getCombustivel() <=15) {
			int op;
			System.out.println("Veiculo foi desligado");
			Scanner sc = new Scanner(System.in);
			System.out.println("Quanto quer abastecer? 1=10L 2=20L 3=50L");
			op = sc.nextInt();

			switch (op) {
			case 1:

				setCombustivel(Combustivel + 10);
				System.out.println("Abasteceu 10");
				System.out.println("Total de litros no tanque: " + getCombustivel());

				break;

			case 2:
				setCombustivel(Combustivel + 20);
				System.out.println("Abasteceu 20");
				System.out.println("Total de litros no tanque: " + getCombustivel());
				break;
			case 3:
				setCombustivel(Combustivel + 50);
				System.out.println("Abasteceu 50");
				System.out.println("Total de litros no tanque: " + getCombustivel());
				break;
			default:
				System.out.println("Opção invalida digite novamente");
			}
			// Combustivel= Combustivel+ getCombustivel();
		}
	}

}
