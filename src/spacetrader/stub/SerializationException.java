package spacetrader.stub;

public class SerializationException extends Exception {
	private static final long serialVersionUID = 4093963223945532575L;

	public SerializationException() {
		super();
	}

	public SerializationException(String message, Throwable cause) {
		super(message, cause);
	}

	public SerializationException(String message) {
		super(message);
	}

	public SerializationException(Throwable cause) {
		super(cause);
	}
}