package com.generation.backendtemplate.model.dto;


import java.time.LocalDate;

public class RiceBatchDTORespRidotto
{
	private Long id;
	private LocalDate productionDate;
	private String customerName;

	public Long getId()
	{
		return id;
	}

	public void setId(Long id)
	{
		this.id = id;
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
}
