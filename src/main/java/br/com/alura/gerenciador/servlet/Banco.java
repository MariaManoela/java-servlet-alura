package br.com.alura.gerenciador.servlet;

import java.util.List;

public class Banco {
	private static List<Empresa> lista = new ArrayList<>();

	public void adiciona(Empresa empresa) {
		lista.add(empresa);
	}
	
}
