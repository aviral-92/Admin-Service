package com.dynamic.ui.db;

import java.util.List;

import com.dynamic.ui.dto.IndexPageDb;

public interface DynamicServiceDb {

	public String contentAddDb(IndexPageDb indexPage);

	public IndexPageDb getContentDb();
	
	public List<IndexPageDb> getAllDb();

	public String updateContentDb(IndexPageDb indexPage);
}
