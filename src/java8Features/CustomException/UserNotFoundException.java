package java8Features.CustomException;

public class UserNotFoundException extends RuntimeException{
    public UserNotFoundException(String mesg){
        super(mesg);
    }
}
