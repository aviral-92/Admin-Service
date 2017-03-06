package com.dynamic.ui.adapter;

import org.springframework.util.StringUtils;

public class IndexPageRequestMapper {

	public static com.dynamic.ui.dto.IndexPageDb convertServiceToDto(
			com.dynamic.ui.modal.IndexPageService indexPageDb) {

		com.dynamic.ui.dto.IndexPageDb indexPageService = null;
		if (!StringUtils.isEmpty(indexPageDb)) {

			indexPageService = new com.dynamic.ui.dto.IndexPageDb();
			indexPageService.setId(indexPageDb.getId());
			indexPageService.setStatus(indexPageDb.isStatus());
			indexPageService.setWhatWeAre(indexPageDb.getWhatWeAre());
			indexPageService.setWhatWeDo(indexPageDb.getWhatWeDo());
			indexPageService.setWhoWeAre(indexPageDb.getWhoWeAre());
		}
		return indexPageService;
	}
}
