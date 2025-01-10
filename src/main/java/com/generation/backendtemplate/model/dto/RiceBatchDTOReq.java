package com.generation.backendtemplate.model.dto;


import java.time.LocalDate;

//modello dei dati in arrivo per POST e
public class RiceBatchDTOReq
{
	private String variety;
	private double weight;
	private double pricePerKg;
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

	public String getCustomerName()
	{
		return customerName;
	}

	public void setCustomerName(String customerName)
	{
		this.customerName = customerName;
	}
}
