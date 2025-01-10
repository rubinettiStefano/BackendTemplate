package com.generation.backendtemplate.model.dto;

import lombok.Data;

import java.time.LocalDate;

@Data
public class RiceBatchDTORespRidotto
{
	private Long id;
	private LocalDate productionDate;
	private String customerName;
}
