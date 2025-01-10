package com.generation.backendtemplate.model.entities;

import jakarta.persistence.Entity;
import lombok.Data;

import java.time.LocalDate;

@Entity
@Data
public class RiceBatch extends BaseEntity
{
	private static final double MARGIN = 1.2;

	private String variety;
	private double weight;//kg
	private double pricePerKg;
	private LocalDate productionDate;
	private String customerName;

	public double getPrice()
	{
		return pricePerKg*weight*MARGIN;
	}
}
