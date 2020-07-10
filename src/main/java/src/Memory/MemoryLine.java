package  src.main.java.src.Memory;

public class MemoryLine{
	//Conteudo privado endereco e conteudo para melhor encapsulamento da informacao
	private String address;
	private String content;
	//Metodo linha de memoria setter endereço e conteudo com parametros
	public MemoryLine(String address, String content){
		setAddress(address);
		setContent(content);
	}
	//Setter endereco
	public void setAddress(String address){
		this.address = address;
	}
	//Obter endereco
	public String getAddress(){
		return address;	
	}
	//Setter conteudo
	public void setContent(String content){
		this.content = content;
	}
	//Obter conteudo
	public String getContent(){
		return content;
	}
}
