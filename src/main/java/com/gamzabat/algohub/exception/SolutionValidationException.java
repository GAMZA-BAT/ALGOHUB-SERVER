package com.gamzabat.algohub.exception;

import lombok.Getter;

@Getter
public class SolutionValidationException extends RuntimeException {
	private final String error;
	public SolutionValidationException(String error) {
		this.error = error;
	}
}
