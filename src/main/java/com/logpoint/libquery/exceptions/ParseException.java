package com.logpoint.libquery.exceptions;

/**
 * Generic exception class for representing all parsing errors.
 * 
 * @author kailash.buki@dev.immunesecurity.com
 * @version 5.2.0
 */
public class ParseException extends Exception {

	private static final long serialVersionUID = 1L;

	public ParseException(String error) {
		super(error);
	}
}
