package src.Exceptions;

public class MainException extends Exception{
	private static final long serialVersionUID = 1L;
	private ErrorCode code;

	public ErrorCode getErrorCode(){
		return code;
	}

	public MainException setErrorCode(ErrorCode code){
		this.code = code;
		return this;
	}

	@Override
	public String getMessage(){
		return "Exceção " + getErrorCode();
	}
}
