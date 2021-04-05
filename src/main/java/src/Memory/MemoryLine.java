package  src.main.java.src.Memory;

public class MemoryLine{

	private String address;
	private String content;

	public MemoryLine(String address, String content){
		setAddress(address);
		setContent(content);
	}

	public void setAddress(String address){
		this.address = address;
	}

	public String getAddress(){
		return address;	
	}

	public void setContent(String content){
		this.content = content;
	}

	public String getContent(){
		return content;
	}
}
