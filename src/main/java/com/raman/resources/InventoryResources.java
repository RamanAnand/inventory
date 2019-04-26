package com.raman.resources;

import java.util.List;

import javax.validation.Validator;
import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import com.raman.dao.InventoryService;
import com.raman.representation.InventoryModel;

@Path("inventory")
@Produces(MediaType.APPLICATION_JSON)
public class InventoryResources {
	InventoryService iDao = new InventoryService();
	private final Validator validator;
	
	public InventoryResources(Validator validator) {
		System.out.println("inventoryResource validator called");
		this.validator = validator;
	}

	@GET
	@Path("items")
	public List<InventoryModel> getAll_Items(){
		return iDao.getAll_Items();
	}
	
	@GET
	@Path("item/{value}")
	public InventoryModel getItem(@PathParam("value") String value){
		return iDao.getItem(value);
	}
	
	@POST
	@Path("item")
	@Consumes(MediaType.APPLICATION_JSON)
	public InventoryModel saveItem(InventoryModel item){
		return iDao.saveItem(item);
	}

}
