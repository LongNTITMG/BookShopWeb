package com.bookshopweb.dto;

import java.util.StringJoiner;

public class ErrorMessage {
    private final int statusCode;
    private final String message;

    public ErrorMessage(int statusCode, String message) {
        this.statusCode = statusCode;
        this.message = message;
    }

	@Override
	public String toString() {
		return "ErrorMessage [statusCode=" + statusCode + ", message=" + message + "]";
	}

  
}
