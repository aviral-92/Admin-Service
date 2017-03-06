package com.dynamic.ui.service;

import java.util.List;

import com.dynamic.ui.dto.IndexPageDb;

public interface DynamicService {

	public String contentAdd(IndexPageDb indexPageDb);

	public IndexPageDb getContent();
	
	public List<IndexPageDb> getAll();

	public String updateContent(IndexPageDb indexPageDb);
}
