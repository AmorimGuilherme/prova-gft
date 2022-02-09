package questao04;

public class ArrayTamanhoException extends RuntimeException {

	private static final long serialVersionUID = 5828579035264971213L;
	 
    public ArrayTamanhoException(String message) {
        super(message);
    }
 
    public ArrayTamanhoException(Throwable t) {
        super(t);
    }
}
