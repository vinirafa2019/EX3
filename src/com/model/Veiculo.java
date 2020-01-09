package com.model;

import java.util.Scanner;

public class Veiculo {

		//atributo
		private String Modelo;		
		protected int Velocidade;
		private int Passageiros;
		protected int Combustivel;
		public int qtd;
		
		//contrutor
		public Veiculo(String Modelo, int Velocidade,int Passageiros,int Combustivel) {
			
			this.Modelo = Modelo;
			this.Velocidade = Velocidade;
			this.Passageiros=Passageiros;
			this.Combustivel = Combustivel;
			
		}

		//get e set
		public String getModelo() {
			return Modelo;
		}

		public void setModelo(String Modelo) {
			this.Modelo = Modelo;
		}

		
		public int getCombustivel() {
			return Combustivel;
		}

		public void setQtd(int Combustivel) {
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

		
		//Atributos
		
		public void Acelerar() {
			
			
			int op;
			Scanner sc = new Scanner (System.in);
			System.out.println("Deseja Acelerar? Sim-1|Nao-2");
			op = sc.nextInt();
		
		switch( op )
		{
		    case 1:
		    	while(this.Velocidade < 240 ) {
					this.Velocidade= Velocidade + 20;
					qtd = qtd  - 1;
					System.out.println("Sua velocidade é: " + this.Velocidade);
					System.out.println("Quantidade de Combustivel: " + qtd );
					} 
		            break;
		    
		    case 2:
		            System.out.println("Nao Acelera" );
		            break;	    
		    default:
		           System.out.println("Opção invalida digite novamente");
		}
			

		}
	
		public void Abastecer(){	
		}


}

