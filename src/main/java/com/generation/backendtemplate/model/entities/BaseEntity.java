package com.generation.backendtemplate.model.entities;

import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.MappedSuperclass;
import lombok.Data;

//le sue proprietà vengono messe direttamente nella tabella delle classi che la estendono
@MappedSuperclass
@Data
public abstract class BaseEntity
{
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

}
