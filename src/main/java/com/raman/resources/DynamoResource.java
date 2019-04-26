package com.raman.resources;

import java.io.IOException;

import javax.validation.Validator;
import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.core.MediaType;

import com.fasterxml.jackson.core.JsonParseException;
import com.raman.dao.DynamoService;

@Path("dynamo")
@Consumes(MediaType.APPLICATION_JSON)
public class DynamoResource {

	DynamoService dynamoDAO = new DynamoService();
	private final Validator validator;

	public DynamoResource(Validator validator) {
		this.validator=validator;
	}
	

	@GET
	@Path("items")
	public void getAll_Items() throws JsonParseException, IOException{
		dynamoDAO.putItem();
	}
	

}
