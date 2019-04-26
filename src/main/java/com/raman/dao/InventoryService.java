package com.raman.dao;

import java.util.ArrayList;
import java.util.List;

import com.raman.representation.InventoryModel;

public class InventoryService {
	
	public InventoryService() {
		System.out.println(":::::::::::::::::::InventoryService constructor::::::::::::::::");
	}

	static List<InventoryModel> list = new ArrayList<InventoryModel>(); 
	
	public List<InventoryModel> getAll_Items() {
		int inventoryValue = 33*22;
		InventoryModel i1= new InventoryModel("gear", "some disc", 23, 33, 22, inventoryValue);
		InventoryModel i2= new InventoryModel("set", "some disc", 213, 343, 12, inventoryValue);
		InventoryModel i3= new InventoryModel("kick", "some disc", 423, 353, 221, inventoryValue);
		InventoryModel i4= new InventoryModel("headlamp", "some disc", 233, 333, 22, inventoryValue);
		InventoryModel i5= new InventoryModel("starter", "some disc", 263, 333, 22, inventoryValue);
		InventoryModel i6= new InventoryModel("clutch", "some disc", 2344, 3366, 22, inventoryValue);
		InventoryModel i7= new InventoryModel("oil", "some disc", 623, 733, 22, inventoryValue);
		
		list.add(i1);
		list.add(i2);
		list.add(i3);
		list.add(i4);
		list.add(i5);
		list.add(i6);
		list.add(i7);
		return list;
	}

	public InventoryModel getItem(String value) {
		for(InventoryModel a: list){
			if(a.getName().equalsIgnoreCase(value))
				return a;
		}
		return null;
	}

	public InventoryModel saveItem(InventoryModel item) {
		InventoryModel i1= new InventoryModel(item.getName(), item.getDescription(), item.getCostPrice(),
				item.getSellPrice(), item.getQuantityInStock(), item.getInventoryValue());
		list.add(i1);
		return i1;
	}

}
