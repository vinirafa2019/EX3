package com.model;

import java.util.Scanner;

public class Veiculo {

	// atributo
	private String Modelo;
	protected int Velocidade;
	private int Passageiros;
	protected int Combustivel;
	public int qtd;

	// contrutor
	public Veiculo(String Modelo, int Velocidade, int Passageiros, int Combustivel) {

		this.Modelo = Modelo;
		this.Velocidade = Velocidade;
		this.Passageiros = Passageiros;
		this.Combustivel = Combustivel;

	}

	// get e set
	public String getModelo() {
		return Modelo;
	}

	public void setModelo(String Modelo) {
		this.Modelo = Modelo;
	}

	public int getCombustivel() {
		return Combustivel;
	}

	public void setCombustivel(int Combustivel) {
		this.Combustivel = Combustivel;
	}

	public int getVelocidade() {
		return Velocidade;
	}

	public void setVelocidade(int Velocidade) {
		this.Velocidade = Velocidade;
	}

	public int getPassageiros() {
		return Passageiros;
	}

	public void setPassageiros(int Passageiros) {
		this.Passageiros = Passageiros;
	}

	// Atributos

	public void Acelerar() {

		int op;
		Scanner sc = new Scanner(System.in);
		System.out.println("Deseja Acelerar? Sim-1|Nao-2");
		op = sc.nextInt();

		switch (op) {
		case 1:
			while (this.Velocidade < 240) {
				setVelocidade(getVelocidade() + 20);
				setCombustivel(getCombustivel() - 1);
				System.out.println("Sua velocidade é: " + getVelocidade());
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

	public void Abastecer(int qtd) {
	}

}
