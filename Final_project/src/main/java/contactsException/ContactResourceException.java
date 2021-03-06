package contactsException;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(value= HttpStatus.NOT_FOUND)
public class ContactResourceException extends RuntimeException{

	private static final long serialVersionUID = 1L;
	
    public ContactResourceException(String message) {
    	super(message);
    }
}