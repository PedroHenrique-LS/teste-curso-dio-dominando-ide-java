package com.dio;

import com.dio.module.Gato;

public class PrimeiroPrograma {
	
	public static void main(String[] args) {
		Gato gato = new Gato();
		Livros livros = new Livros();
		
		System.out.println(gato);
		System.out.println(livros);
	}
}

class Livros {
	private String titulo;
	private Integer npag;
}

