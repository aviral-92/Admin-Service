package com.dynamic.ui.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;

import com.dynamic.ui.db.DynamicServiceDb;
import com.dynamic.ui.dto.IndexPageDb;
import com.dynamic.ui.service.DynamicService;

@Service
public class DynamicServiceImpl implements DynamicService {

	@Autowired
	private DynamicServiceDb dynamicServiceDb;

	@Override
	public String contentAdd(IndexPageDb indexPageDb) {

		String response = null;
		if (!StringUtils.isEmpty(indexPageDb)) {
			response = dynamicServiceDb.contentAddDb(indexPageDb);
		}
		return response;
	}

	@Override
	public IndexPageDb getContent() {

		return dynamicServiceDb.getContentDb();
	}

	@Override
	public String updateContent(IndexPageDb indexPageDb) {

		return dynamicServiceDb.updateContentDb(indexPageDb);
	}

	@Override
	public List<IndexPageDb> getAll() {
		
		return dynamicServiceDb.getAllDb();
	}

}
