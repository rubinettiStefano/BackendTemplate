package com.generation.backendtemplate.controllers.helper;

import com.generation.backendtemplate.controllers.helper.exceptions.BatchNotFoundException;
import org.apache.coyote.BadRequestException;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class UniversalExceptionsHandler
{

	@ExceptionHandler(BatchNotFoundException.class)
	@ResponseStatus(HttpStatus.NOT_FOUND)
	public String handleBatchNotFound(BatchNotFoundException e)
	{
		return e.getMessage();
	}
}
