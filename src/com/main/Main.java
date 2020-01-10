package com.main;

import com.model.Aviao;
import com.model.Carro;
import com.model.Caminhao;

public class Main {

	public static void main(String[] args) {
		Carro C = new Carro("Chevrolet", 2, "2008", "Celta", 0, 2,100);

		System.out.println("Marca: " + C.getMarca());
		System.out.println("O carro tem " + C.getPortas() + " Portas");
		System.out.println("Ano do carro " + C.getAno());
		System.out.println("Modelo do carro " + C.getModelo());
		System.out.println("Quantidade de combustivel1 " + C.getCombustivel() + "L \n");

		C.Abastecer(50);
		C.Acelerar();

	    Aviao A = new Aviao("Boeng", "Passeio","AIRBUS A320",871,120,14);
	     System.out.println("O tipo do aviao é: "+ A.getTipo());
	     System.out.println("O modo de Uso é: " + A.getUso());
	     System.out.println("A marca é: "+ A.getModelo());
		 System.out.println("A velocidade maxima é: " + A.getVelocidade()+" KM/H");
		 System.out.println("Qauntidade maxima de "+ A.getPassageiros() + " passageiros" );
		 System.out.println("Quantidade de " +A.getCombustivel()+" Litros de combustivel \n");
		
		
		A.Abastecer("");
		A.Acelerar();
		
		Caminhao C1 = new Caminhao("Wolks",0, "2019", "Scania", 0, 1, 100);
		System.out.println("Marca: " + C1.getMarca());
		System.out.println("O carro tem " + C1.getPortas() + " Portas");
		System.out.println("Ano do carro " + C1.getAno());
		System.out.println("Modelo do carro " + C1.getModelo());
		System.out.println("Quantidade de combustivel1 " + C1.getCombustivel() + "L");

		C1.Abastecer(50);
		C1.Acelerar();
	}
}
