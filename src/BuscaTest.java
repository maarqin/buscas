

import static org.junit.Assert.*;

import org.junit.Test;

public class BuscaTest {

	int procurado = 36;
	
	@Test
	public void testBuscaSequencial() {
		assertEquals("buscaSequencial(" + procurado + ")", procurado, Principal.buscaSequencial(procurado));
	}

	@Test
	public void testBuscaSequencialRecursivo() {
		assertEquals("buscaSequencialRecursivo(" + procurado + ")", procurado, Principal.buscaSequencialRecursiva(procurado, Principal.tamanho));
	}
	
	@Test
	public void testBuscaBinaria() {
		assertEquals("buscaBinaria(" + procurado + ")", procurado, Principal.buscaBinaria(procurado));
	}
	
	@Test
	public void testBuscaBinariaRecursivo() {
		assertEquals("buscaBinariaRecursivo(" + procurado + ")", procurado, Principal.buscaBinariaRecursiva(procurado, 0, Principal.tamanho));
	}
	
}
