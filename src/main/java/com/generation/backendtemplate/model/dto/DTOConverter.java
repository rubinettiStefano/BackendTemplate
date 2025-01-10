package com.generation.backendtemplate.model.dto;

import com.generation.backendtemplate.model.entities.RiceBatch;
import org.springframework.stereotype.Service;

import java.time.LocalDate;

@Service
public class DTOConverter
{
	public RiceBatch toEntity(RiceBatchDTOReq dto)
	{
		RiceBatch riceBatch = new RiceBatch();
		riceBatch.setVariety(dto.getVariety());
		riceBatch.setCustomerName(dto.getCustomerName());
		riceBatch.setPricePerKg(dto.getPricePerKg());
		riceBatch.setWeight(dto.getWeight());
		return riceBatch;
	}

	public RiceBatchDTORespCompl toDtoCompl(RiceBatch en)
	{
		RiceBatchDTORespCompl dto = new RiceBatchDTORespCompl();
		dto.setVariety(en.getVariety());
		dto.setCustomerName(en.getCustomerName());
		dto.setPricePerKg(en.getPricePerKg());
		dto.setWeight(en.getWeight());
		dto.setProductionDate(en.getProductionDate());
		dto.setId(en.getId());
		dto.setPrice(en.getPrice());
		return dto;
	}

	public RiceBatchDTORespRidotto toDtoRidotto(RiceBatch en)
	{
		RiceBatchDTORespRidotto dto = new RiceBatchDTORespRidotto();
		dto.setCustomerName(en.getCustomerName());
		dto.setProductionDate(en.getProductionDate());
		dto.setId(en.getId());
		return dto;
	}



}
