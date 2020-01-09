package com.model;

import java.util.Scanner;



public class Carro extends Veiculo{
	//Atributos	
	private String Marca;
	private int Portas;
	private String Ano;
	public int qtd;

	//Construtor
	public Carro(String Marca,int Portas,String Ano, String Modelo,int Velocidade,int Passageiros,int Combustivel) {
		super(Modelo,Velocidade,Passageiros,Combustivel);
		this.Marca=Marca;
		this.Portas=Portas;
		this.Ano=Ano;
		
	}
	
	
	public String getMarca() {
		return Marca;
	}
	public void setMarca(String Marca) {
		this.Marca = Marca;
	}
	public int getPortas() {
		return Portas;
	}
	public void setPortas(int Portas) {
		this.Portas = Portas;
	}
	public String getAno() {
		return Ano;
	}
	public void setAno(String Ano) {
		this.Ano = Ano;
	}

	//Metodos
	public void Abastecer(int qtd,int Combustivel) {		
		
		while(qtd<15) {
			int op;
			System.out.println("Veiculo foi desligado");
			Scanner sc = new Scanner (System.in);
			System.out.println("Quanto quer abastecer? 1=10L 2=20L 3=50L");
			op = sc.nextInt();
		
		switch( op )
		{
		    case 1:
		    	
		    	qtd = Combustivel + 10;
					System.out.println("Abasteceu 10");
					System.out.println("Total de litros no tanque: " + qtd);
					
		            break;
		    
		    case 2:
		    	qtd = Combustivel + 20;
		    	System.out.println("Abasteceu 20");
		    	System.out.println("Total de litros no tanque: " + qtd);
		            break;	    
		    case 3:
		    	qtd = Combustivel + 50;
		    	System.out.println("Abasteceu 50");
				System.out.println("Total de litros no tanque: " + qtd);
		            break;	
		    default:
		           System.out.println("Opção invalida digite novamente");
		}
		
		}
	}
	
	

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
				Combustivel =  qtd - 1;
				System.out.println("Sua velocidade é: " + this.Velocidade);
				System.out.println("Quantidade de Combustivel: " + Combustivel );
				} 
	            break;
	    
	    case 2:
	            System.out.println("Nao Acelera" );
	            break;	    
	    default:
	           System.out.println("Opção invalida digite novamente");
	}
		

	}
}

 