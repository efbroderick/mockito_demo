package ourCode;

public class ServiceUnavailableException extends Throwable {
    public ServiceUnavailableException(String s) {
        super(s);
    }
    public ServiceUnavailableException() {
        this("ServiceUnavailableException");
    }
}
