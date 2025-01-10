package com.generation.backendtemplate.controllers.helper;

import com.generation.backendtemplate.controllers.helper.exceptions.BatchNotFoundException;
import com.generation.backendtemplate.model.dto.DTOConverter;
import com.generation.backendtemplate.model.dto.RiceBatchDTOReq;
import com.generation.backendtemplate.model.dto.RiceBatchDTORespCompl;
import com.generation.backendtemplate.model.dto.RiceBatchDTORespRidotto;
import com.generation.backendtemplate.model.entities.RiceBatch;
import com.generation.backendtemplate.model.repositories.RiceBatchRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class ControllerHelperImpl implements ControllerHelper
{

	@Autowired
	RiceBatchRepository bRepo;

	@Autowired
	DTOConverter converter;

	@Override
	public List<RiceBatchDTORespRidotto> getAllDtoCompl()
	{
//		List<RiceBatch> all = bRepo.findAll();
//		List<RiceBatchDTORespRidotto> dtos = new ArrayList<>();
//		for(RiceBatch b : all)
//			dtos.add(converter.toDtoRidotto(b));
		return bRepo.findAll().stream().map(batch-> converter.toDtoRidotto(batch)).toList();
	}

	@Override
	public RiceBatchDTORespCompl getOneDtoCompl(long id)
	{
		Optional<RiceBatch> batch = bRepo.findById(id);
		//scatola che può contenere o no l'elemento
		if(batch.isPresent())//isPresent() da true se l'optional è pieno
										//.get() tira fuori l'oggetto dall'optional
			return converter.toDtoCompl(batch.get());

		throw new BatchNotFoundException(id);
	}

	@Override
	public RiceBatchDTORespCompl insertRiceBatch(RiceBatchDTOReq dto)
	{
		//anche qui dovrei lanciare eccezioni quando le cose non vanno bene
		//e gestirle nell'UniversalExceptionHandler
		RiceBatch entity = converter.toEntity(dto);
		entity.setProductionDate(LocalDate.now());
		entity = bRepo.save(entity);
		return converter.toDtoCompl(entity);
	}

	@Override
	public RiceBatchDTORespCompl modifyRiceBatch(long id, RiceBatchDTOReq dto)
	{
		RiceBatch entity = converter.toEntity(dto);
		entity.setId(id);
		entity = bRepo.save(entity);
		return converter.toDtoCompl(entity);
	}

	@Override
	public void deleteBatch(long id)
	{
		Optional<RiceBatch> batch = bRepo.findById(id);
		if(batch.isPresent())//isPresent() da true se l'optional è pieno
			bRepo.deleteById(id);
		else
			throw new BatchNotFoundException(id);
	}
}
