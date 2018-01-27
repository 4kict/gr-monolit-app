package gr.com.monolit.app.feignClients;

public class MyInnerException extends RuntimeException {

    public MyInnerException(String message) {
        super(message);
    }
}
