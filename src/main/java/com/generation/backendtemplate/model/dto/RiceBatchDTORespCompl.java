package com.generation.backendtemplate.model.dto;

import lombok.Data;

import java.time.LocalDate;

@Data
public class RiceBatchDTORespCompl
{
	private Long id;
	private String variety;
	private double weight;//kg
	private double pricePerKg;
	private LocalDate productionDate;
	private String customerName;
	private double price;
}
