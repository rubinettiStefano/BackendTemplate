package com.generation.backendtemplate.controllers.helper.exceptions;

public class BatchNotFoundException extends RuntimeException
{
	public BatchNotFoundException(long id)
	{
		super("Batch with id "+id+ " not found");
	}
}
