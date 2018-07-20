package br.ce.wcaquino.servicos;

import br.ce.wcaquino.exceptions.NaoPodeDividirPorZeroException;

public class Calculadora {

	public int soma(int a, int b) {
		return a + b;
	}

	public int subtrair(int a, int b) {
		// TODO Auto-generated method stub
		return a - b;
	}

	public int divide(int a, int b) throws NaoPodeDividirPorZeroException{
		if(b == 0) {
			throw new NaoPodeDividirPorZeroException();
		}
		return a / b;
	}

}
