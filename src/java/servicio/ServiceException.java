package servicio;

public class ServiceException extends Exception{
    public ServiceException(String s){
        super(s);
    }
    
    public ServiceException(String message, Throwable cause){
        super (message, cause);
    }
}
