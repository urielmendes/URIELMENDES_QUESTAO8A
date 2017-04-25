import static org.junit.Assert.*;
import static org.mockito.Mockito.*;

import org.junit.Before;
import org.junit.Test;
//import org.mockito.Mock;

public class BibliotecariaTest {
	
	BancoUsuarios banco;
	Bibliotecaria bibl;
	String usuario = "fulano da silva";
	
	@Before
	public void setUp(){
		banco = mock(BancoUsuarios.class);
		bibl = new Bibliotecaria();
	}

	@Test
	public void testaAddUsuario() {
		assertTrue(bibl.addUsuario(usuario));
	}
	
	@Test
	public void testaRemoveUsuario() {
		assertTrue(bibl.removeUsuario(usuario));
	}
	
	@Test
	public void testaBloqueiaUsuario(){
		assertTrue(bibl.bloqueiaUsuario(usuario));
	}
	
	//Ainda nao ha implementacao dos metodos, mas estes testes devem se manter validos
	//ate o final do projeto
}
