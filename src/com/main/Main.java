package com.main;

import java.util.Scanner;

import com.model.Aviao;
import com.model.Carro;

public class Main {



	

	

	public static void main(String[] args) {
		Carro C = new Carro("Chevrolet", 2, "2008", "Celta",0,2,50);

		System.out.println("Marca: " + C.getMarca());
		System.out.println("O carro tem "+C.getPortas()+" Portas" );
		System.out.println("Ano do carro "+ C.getAno());
		System.out.println("Modelo do carro "+ C.getModelo());
		System.out.println("Quantidade de combustivel "+C.getCombustivel()+"L");
		
		
		C.Abastecer();
		C.Acelerar();
		
//	    Aviao A = new Aviao("Boeng", "Passeio","AIRBUS A320",871,120,24000);
//	     System.out.println("O tipo do aviao é: "+ A.getTipo());
//	     System.out.println("O modo de Us é: " + A.getUso());
//	     System.out.println("A marca é: "+ A.getModelo());
//		 System.out.println("A velocidade maxima é: " + A.getVelocidade()+" KM/H");
//		 System.out.println("Qauntidade maxima de "+ A.getPassageiros() + " passageiros" );
//		 System.out.println("Quantidade Maxima de " +A.getCombustivel()+" Litros de combustivel");
//		
//		
//		A.Abastecer(null);
//		A.Acelerar();
			
		
	}
}
