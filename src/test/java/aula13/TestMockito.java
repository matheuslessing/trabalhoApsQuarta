package aula13;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;

import junit.framework.Assert;

import static org.mockito.Mockito.*;

@RunWith(MockitoJUnitRunner.class)
public class TestMockito {

	private CorreioService correioServiceMock;
	
	@Before
	public void init() {
		CorreioService correioServiceMock = Mockito.mock(CorreioService.class);
	}
	
	
	@Test
	public void test() {
		CorreioService correioServiceMock = Mockito.mock(CorreioService.class);
		when(correioServiceMock.getCep()).thenReturn("cachoeirinha");
		Assert.assertEquals("cachoeirinha", casa.getEndereco());
		System.out.println(casa.getEndereco());
	}
	
	@Test
	public void testMockGetEndereco900000() {
		// 1 passo, é criar o mock
		CorreioService correioServiceMock = Mockito.mock(CorreioService.class);
		
		// 2 passo, e definir o que simular, o que retornar.
		when(correioServiceMock.buscaEndereco('900000')).thenReturn('Porto Alegre');
		
		// 3 passo, executar o teste.
		Assert.assertEquals('Porto Alegre', correioServiceMock.buscaEndereco());		
		
	}
	
	@Test
	public void testMockGetEndereco800000() {
		// 1 passo, é criar o mock
		CorreioService correioServiceMock = Mockito.mock(CorreioService.class);
		
		// 2 passo, e definir o que simular, o que retornar.
		when(correioServiceMock.buscaEndereco('800000')).thenReturn('Av. Assis Brasil');
		
		// 3 passo, executar o teste.
		Assert.assertEquals('Av. Assis Brasil', correioServiceMock.buscaEndereco());
		
	}
	
	
}
