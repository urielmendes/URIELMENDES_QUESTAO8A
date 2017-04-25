import java.util.ArrayList;

public class Usuario {
	
	private boolean liberado_ = true;
	private String name_;
	private ArrayList<String> livros_ = new ArrayList<String>();

	public Usuario(String name){
		this.name_ = name;
	}
	
	
	public String getName() {
		return name_;
	}
	
	public void bloquear(){
		this.liberado_ = false;
	}
	
	public void liberar(){
		this.liberado_ = true;
	}
	
	public boolean getSituacao(){
		return liberado_;
	}
	
	public void devolve(String livro){
		livros_.remove(livro);
	}
	
	public void empresta(String livro){
		livros_.add(livro);
	}
	
	public void getLivros(){
		for(String livro : livros_){
			System.out.println(livro);
		}
	}
	
	
}
