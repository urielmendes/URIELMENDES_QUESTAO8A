import java.util.HashMap;

public class Bibliotecaria {
	
	//Este hashmap funciona como um banco de livros EMPRESTADOS
	private HashMap<String, String> bancoLivros_ = new HashMap<String, String>();
	
	//Banco de usuarios cadastrados
	private HashMap<String, Usuario> bancoUsuario_ = new HashMap<String, Usuario>();

	public boolean addUsuario(String usuario){
		if(bancoUsuario_.containsKey(usuario)){
			return false; //ja esta cadastrado
		}
		bancoUsuario_.put(usuario, new Usuario(usuario));
		return true;
	}
	
	public boolean removeUsuario(String usuario){
		if(!bancoUsuario_.containsKey(usuario)){
			return false; //Nao esta cadastrado
		}
		bancoUsuario_.remove(usuario);
		return true;
	}
	
	public boolean bloqueiaUsuario(String usuario){
		if(!bancoUsuario_.containsKey(usuario))
			return false;
		bancoUsuario_.get(usuario).bloquear();
		return true;
	}
	public boolean liberaUsuario(String usuario){
		if(!bancoUsuario_.containsKey(usuario))
			return false;
		bancoUsuario_.get(usuario).liberar();
		return true;
	}
	
	public boolean empresta(String livro, String usuario){
		if(!bancoUsuario_.get(usuario).getSituacao())
			return false;
		//Se esta bloqueado retorna false
		bancoLivros_.put(livro, usuario);
		bancoUsuario_.get(usuario).empresta(livro);
		return true;
	}
	
	public void devolve(String livro, String usuario){
		bancoLivros_.remove(livro);
		bancoUsuario_.get(usuario).devolve(livro);
	}
	
	public boolean checaLivro(String livro){
		if(!bancoLivros_.containsKey(livro))
			return true; //Disponivel
		else
			return false; //Emprestado
	}
}
