package exceptions;

public class ValorNaoNumericoException  extends Exception{

    public ValorNaoNumericoException(String message) {
         super(message);
         final int STATUS_DIVISAO_POR_ZERO = 1;
         System.out.println(message);
         System.exit(STATUS_DIVISAO_POR_ZERO);
    }
}
