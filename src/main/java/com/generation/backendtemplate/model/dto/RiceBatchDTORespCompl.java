package com.generation.backendtemplate.model.dto;


import java.time.LocalDate;

public class RiceBatchDTORespCompl
{
	private Long id;
	private String variety;
	private double weight;//kg
	private double pricePerKg;
	private LocalDate productionDate;
	private String customerName;
	private double price;

	public Long getId()
	{
		return id;
	}

	public void setId(Long id)
	{
		this.id = id;
	}

	public String getVariety()
	{
		return variety;
	}

	public void setVariety(String variety)
	{
		this.variety = variety;
	}

	public double getWeight()
	{
		return weight;
	}

	public void setWeight(double weight)
	{
		this.weight = weight;
	}

	public double getPricePerKg()
	{
		return pricePerKg;
	}

	public void setPricePerKg(double pricePerKg)
	{
		this.pricePerKg = pricePerKg;
	}

	public LocalDate getProductionDate()
	{
		return productionDate;
	}

	public void setProductionDate(LocalDate productionDate)
	{
		this.productionDate = productionDate;
	}

	public String getCustomerName()
	{
		return customerName;
	}

	public void setCustomerName(String customerName)
	{
		this.customerName = customerName;
	}

	public double getPrice()
	{
		return price;
	}

	public void setPrice(double price)
	{
		this.price = price;
	}
}
