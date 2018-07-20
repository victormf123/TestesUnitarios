package br.ce.wcaquino.suites;

import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

import br.ce.wcaquino.servicos.CalculadoValorLocacaoTest;
import br.ce.wcaquino.servicos.CalculadoraTest;
import br.ce.wcaquino.servicos.LocacaoServiceTest;


@RunWith(Suite.class)
@SuiteClasses({
	CalculadoraTest.class,
	CalculadoValorLocacaoTest.class,
	LocacaoServiceTest.class

})
public class SuiteExecucao {
	//Remova se puder!
	
	@BeforeClass
	public static void before() {
		System.out.println("before");
	}
	
	@AfterClass
	public static void after() {
		System.out.println("after");
	}
	
}
