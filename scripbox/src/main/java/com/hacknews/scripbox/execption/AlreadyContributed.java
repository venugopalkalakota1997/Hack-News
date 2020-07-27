package com.hacknews.scripbox.execption;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;
@ResponseStatus(value = HttpStatus.BAD_REQUEST, reason = "AlreadyContributed")
public class AlreadyContributed extends Exception {
	private static final long serialVersionUID = 1L;

	private static final Logger logger = LoggerFactory.getLogger(AlreadyContributed.class);

	public AlreadyContributed() {
		logger.debug("inside AlreadyContributed class");
	}
}
