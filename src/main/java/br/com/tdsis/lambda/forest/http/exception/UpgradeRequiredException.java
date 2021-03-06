package br.com.tdsis.lambda.forest.http.exception;

import org.apache.http.HttpStatus;

/**
 * The UpgradeRequiredException class
 * <p>
 * This is a concrete class of the the HttpException class. 
 * It represents an upgrade required http response.
 * 
 * @author fsantana
 * @version 0.0.2
 * @since 0.0.2
 * @see {@link HttpStatus#SC_GONE}
 */
public class UpgradeRequiredException extends HttpException {

    private static final long serialVersionUID = 3099405537692347007L;
    private static final int HTTP_STATUS = HttpStatus.SC_GONE;

    public UpgradeRequiredException() {
        super(HTTP_STATUS);
    }

    public UpgradeRequiredException(Object entity) {
        super(entity, HTTP_STATUS);
    }

    public UpgradeRequiredException(final String message, final Throwable cause) {
        super(HTTP_STATUS, message, cause);
    }

    public UpgradeRequiredException(Object entity, final String message, final Throwable cause) {
        super(entity, HTTP_STATUS, message, cause);
    }

}
