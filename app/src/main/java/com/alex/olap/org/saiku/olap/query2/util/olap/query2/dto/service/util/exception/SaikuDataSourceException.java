package com.alex.olap.org.saiku.olap.query2.util.olap.query2.dto.service.util.exception;



public class SaikuDataSourceException extends SaikuServiceException {

    /**
     * @see java.lang.Exception#Exception()
     */
    SaikuDataSourceException() {
        super();
    }

    /**
     * @see java.lang.Exception#Exception(String))
     */

    public SaikuDataSourceException(String message) {
        super(message);
    }

    /**
     * @see java.lang.Exception#Exception(Throwable)
     */
    SaikuDataSourceException(Throwable cause) {
        super(cause);
    }

    /**
     * @see java.lang.Exception#Exception(String, Throwable)
     */
    SaikuDataSourceException(String message, Throwable cause) {
        super(message, cause);
    }

}
