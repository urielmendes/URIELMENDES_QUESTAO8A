
public class Bibliotecaria {
	
	private static BancoUsuarios banco_ = new BancoUsuarios();
	
	public boolean addUsuario(String usuario){
		banco_.add(usuario);
		return true;
	}
	
	public boolean removeUsuario(String usuario){
		banco_.remove(usuario);
		return true;
	}
	
	public boolean bloqueiaUsuario(String usuario){
		return true;
	}
}
