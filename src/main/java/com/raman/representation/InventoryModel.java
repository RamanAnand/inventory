package com.raman.representation;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class InventoryModel {
	String name, description;
	int costPrice, sellPrice,quantityInStock, inventoryValue;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public int getCostPrice() {
		return costPrice;
	}
	public void setCostPrice(int costPrice) {
		this.costPrice = costPrice;
	}
	public int getSellPrice() {
		return sellPrice;
	}
	public void setSellPrice(int sellPrice) {
		this.sellPrice = sellPrice;
	}
	public int getQuantityInStock() {
		return quantityInStock;
	}
	public void setQuantityInStock(int quantityInStock) {
		this.quantityInStock = quantityInStock;
	}
	public int getInventoryValue() {
		return inventoryValue;
	}
	public void setInventoryValue(int inventoryValue) {
		this.inventoryValue = inventoryValue;
	}
	
	
	public InventoryModel() {
	}
	
	@Override
	public String toString() {
		return "InventoryModel [name=" + name + ", description=" + description
				+ ", costPrice=" + costPrice + ", sellPrice=" + sellPrice
				+ ", quantityInStock=" + quantityInStock + ", inventoryValue="
				+ inventoryValue + "]";
	}
	public InventoryModel(String name, String description, int costPrice,
			int sellPrice, int quantityInStock, int inventoryValue) {
		super();
		this.name = name;
		this.description = description;
		this.costPrice = costPrice;
		this.sellPrice = sellPrice;
		this.quantityInStock = quantityInStock;
		this.inventoryValue = inventoryValue;
	}
	
		

}
