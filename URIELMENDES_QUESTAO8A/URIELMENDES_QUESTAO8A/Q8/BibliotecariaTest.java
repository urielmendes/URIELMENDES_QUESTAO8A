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
		bibl.addUsuario(usuario);
		assertTrue(bibl.removeUsuario(usuario));
	}
	
	@Test
	public void testaBloqueiaUsuario(){
		bibl.addUsuario(usuario);
		assertTrue(bibl.bloqueiaUsuario(usuario));
	}
	
	@Test
	public void testaEmprestaLivro(){
		bibl.addUsuario(usuario);
		assertTrue(bibl.empresta("Crime e Castigo", usuario));
		
		bibl.bloqueiaUsuario(usuario);
		assertFalse(bibl.empresta("Os Irmãos Karamazov", usuario));
	}
	
	@Test
	public void testaDevolveLivro(){
		bibl.addUsuario(usuario);
		bibl.empresta("Dom Casmurro", usuario);
		
		assertFalse(bibl.checaLivro("Dom Casmurro")); 
		assertTrue(bibl.checaLivro("Memórias Póstumas de Brás Cubas"));
	}
	
}
