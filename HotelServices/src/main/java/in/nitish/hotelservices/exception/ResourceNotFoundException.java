package in.nitish.hotelservices.exception;

public class ResourceNotFoundException extends RuntimeException {

	public ResourceNotFoundException(String s)
	{
		super(s);
	}
	public ResourceNotFoundException()
	{
		super("ResourceNot Found Exception !!");
	}
	
}
