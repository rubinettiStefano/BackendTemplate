package com.generation.backendtemplate.model.entities;

import jakarta.persistence.Entity;

import java.time.LocalDate;

@Entity
public class RiceBatch extends BaseEntity
{
	private static final double MARGIN = 1.2;

	private String variety;
	private double weight;//kg
	private double pricePerKg;
	private LocalDate productionDate;
	private String customerName;

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
		return pricePerKg*weight*MARGIN;
	}
}
