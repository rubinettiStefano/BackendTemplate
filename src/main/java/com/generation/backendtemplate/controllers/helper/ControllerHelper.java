package com.generation.backendtemplate.controllers.helper;

import com.generation.backendtemplate.model.dto.RiceBatchDTOReq;
import com.generation.backendtemplate.model.dto.RiceBatchDTORespCompl;
import com.generation.backendtemplate.model.dto.RiceBatchDTORespRidotto;

import java.util.List;

public interface ControllerHelper
{
	List<RiceBatchDTORespRidotto> getAllDtoCompl();

	RiceBatchDTORespCompl getOneDtoCompl(long id);

	RiceBatchDTORespCompl insertRiceBatch(RiceBatchDTOReq dto);

	RiceBatchDTORespCompl modifyRiceBatch(long id, RiceBatchDTOReq dto);

	void deleteBatch(long id);
}
