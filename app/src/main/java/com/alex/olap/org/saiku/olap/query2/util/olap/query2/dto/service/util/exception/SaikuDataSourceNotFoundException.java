package com.alex.olap.org.saiku.olap.query2.util.olap.query2.dto.service.util.exception;



public class SaikuDataSourceNotFoundException extends SaikuDataSourceException {

    /**
     * @see java.lang.Exception#Exception()
     */
    public SaikuDataSourceNotFoundException() {
        super();
    }

    /**
     * @see java.lang.Exception#Exception(String))
     */

    public SaikuDataSourceNotFoundException(String message) {
        super(message);
    }

    /**
     * @see java.lang.Exception#Exception(Throwable)
     */
    public SaikuDataSourceNotFoundException(Throwable cause) {
        super(cause);
    }

    /**
     * @see java.lang.Exception#Exception(String, Throwable)
     */
    public SaikuDataSourceNotFoundException(String message, Throwable cause) {
        super(message, cause);
    }
}
