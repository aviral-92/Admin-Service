package com.dynamic.ui.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.dynamic.ui.adapter.IndexPageRequestMapper;
import com.dynamic.ui.adapter.IndexPageResponseMapper;
import com.dynamic.ui.modal.IndexPageService;
import com.dynamic.ui.service.DynamicService;

@RestController
@RequestMapping("/firstpage")
public class IndexPageController {

	@Autowired
	private DynamicService dynamicService;

	@RequestMapping(value = "/addcontent", method = RequestMethod.POST, produces = MediaType.APPLICATION_JSON_VALUE)
	public String addContent(@RequestBody IndexPageService indexPageService) {

		String response = dynamicService.contentAdd(IndexPageRequestMapper.convertServiceToDto(indexPageService));
		return response;
	}

	@RequestMapping(value = "/getcontent", method = RequestMethod.GET)
	public IndexPageService getContent() {

		return IndexPageResponseMapper.convertDtoToService(dynamicService.getContent());
	}
	
	@RequestMapping(value = "/getall", method = RequestMethod.GET)
	public List<IndexPageService> getAll() {

		return IndexPageResponseMapper.convertDtoToServiceList(dynamicService.getAll());
	}

	@RequestMapping(value = "/updatecontent", method = RequestMethod.PUT)
	public String updateContent(@RequestBody IndexPageService indexPageService) {

		return dynamicService.updateContent(IndexPageRequestMapper.convertServiceToDto(indexPageService));
	}

	@RequestMapping("/test")
	public String test() {

		return "Test successfull";
	}
}
