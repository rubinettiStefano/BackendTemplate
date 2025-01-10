package com.generation.backendtemplate.model.dto;

import lombok.Data;

import java.time.LocalDate;

//modello dei dati in arrivo per POST e
@Data
public class RiceBatchDTOReq
{
	private String variety;
	private double weight;
	private double pricePerKg;
	private String customerName;
}
