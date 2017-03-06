package com.dynamic.ui.adapter;

import java.util.ArrayList;
import java.util.List;

import org.springframework.util.StringUtils;

public class IndexPageResponseMapper {

	public static com.dynamic.ui.modal.IndexPageService convertDtoToService(
			com.dynamic.ui.dto.IndexPageDb indexPageDb) {

		com.dynamic.ui.modal.IndexPageService indexPageService = null;
		if (!StringUtils.isEmpty(indexPageDb)) {

			indexPageService = new com.dynamic.ui.modal.IndexPageService();
			indexPageService.setId(indexPageDb.getId());
			indexPageService.setStatus(indexPageDb.isStatus());
			indexPageService.setWhatWeAre(indexPageDb.getWhatWeAre());
			indexPageService.setWhatWeDo(indexPageDb.getWhatWeDo());
			indexPageService.setWhoWeAre(indexPageDb.getWhoWeAre());
		}
		return indexPageService;
	}

	public static List<com.dynamic.ui.modal.IndexPageService> convertDtoToServiceList(
			List<com.dynamic.ui.dto.IndexPageDb> indexPageDbs) {

		if (indexPageDbs.isEmpty()) {
			return null;
		}
		List<com.dynamic.ui.modal.IndexPageService> indexPageServices = new ArrayList<com.dynamic.ui.modal.IndexPageService>();
		for (com.dynamic.ui.dto.IndexPageDb indexPageDb : indexPageDbs) {
			indexPageServices.add(convertDtoToService(indexPageDb));
		}
		return indexPageServices;
	}
}
