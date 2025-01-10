package com.generation.backendtemplate.controllers;

import com.generation.backendtemplate.controllers.helper.ControllerHelper;
import com.generation.backendtemplate.model.dto.RiceBatchDTOReq;
import com.generation.backendtemplate.model.dto.RiceBatchDTORespCompl;
import com.generation.backendtemplate.model.dto.RiceBatchDTORespRidotto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/batch")
public class RiceBatchController
{

	@Autowired
	ControllerHelper ch;
	//get all     //dto ridotto, con solo id, data e cliente
	//get one     //dto pieno, con tutti i campi
	//post        //dto senza data produzione, che viene impostata ad oggi in automatico e senza id
	//put         //tutto tranne id e data produzione, uguale a sopra
	//delete      //no dto
	@GetMapping
	public List<RiceBatchDTORespRidotto> getAll()
	{
		return ch.getAllDtoCompl();
	}

	@GetMapping("/{id}")
	public RiceBatchDTORespCompl getOne(@PathVariable long id)
	{
		return ch.getOneDtoCompl(id);
	}

	@PostMapping
	public RiceBatchDTORespCompl insert(@RequestBody RiceBatchDTOReq dto)
	{
		return ch.insertRiceBatch(dto);
	}

	@PutMapping("/{id}")
	public RiceBatchDTORespCompl modify(@PathVariable long id,@RequestBody RiceBatchDTOReq dto)
	{
		return ch.modifyRiceBatch(id,dto);
	}

	@DeleteMapping("/{id}")
	public Long delete(@PathVariable long id)
	{
		ch.deleteBatch(id);
		return id;
	}


}
