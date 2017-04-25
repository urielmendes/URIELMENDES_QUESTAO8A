
public class Usuario {
	
	private boolean liberado_ = true;
	private String name_;

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
}
