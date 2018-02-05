package com.logpoint.libquery;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.UnsupportedEncodingException;

import org.antlr.runtime.ANTLRInputStream;
import org.antlr.runtime.CharStream;

/**
 * ANTLRNoCaseStringStream extends the basic ANTLRStringStream class so that all
 * the tokens are manipulated in upper case no matter what the case of the token
 * is in the search query.
 * 
 * Reference: http://www.antlr.org/wiki/pages/viewpage.action?pageId=1782
 * 
 * @author kailash.buki@dev.immunesecurity.com
 * @version 5.2.0
 */
public class ANTLRNoCaseStringStream extends ANTLRInputStream {
	public ANTLRNoCaseStringStream(String stream) throws UnsupportedEncodingException, IOException {
		super(new ByteArrayInputStream(stream.getBytes("UTF-8")), "utf-8");
	}

	public int LA(int i) {
		if (i == 0) {
			return 0; // undefined
		}
		if (i < 0) {
			i++; // e.g., translate LA(-1) to use offset 0
		}

		if ((p + i - 1) >= n) {

			return CharStream.EOF;
		}
		return Character.toUpperCase(data[p + i - 1]);
	}
}
