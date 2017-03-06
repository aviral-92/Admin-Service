package com.dynamic.ui.db.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;
import org.springframework.util.StringUtils;

import com.dynamic.ui.constants.QueryConstant;
import com.dynamic.ui.db.DynamicServiceDb;
import com.dynamic.ui.dto.IndexPageDb;
import com.dynamic.ui.extractor.IndexPageExtractor;

@Repository
public class DynamicServiceDbImpl implements DynamicServiceDb {

	@Autowired
	private JdbcTemplate jdbcTemplate;

	@Override
	public String contentAddDb(IndexPageDb indexPageDb) {

		String response = null;
		if (!StringUtils.isEmpty(indexPageDb)) {
			Object args[] = { indexPageDb.getWhatWeAre(), indexPageDb.getWhatWeDo(), indexPageDb.getWhoWeAre(),
					indexPageDb.isStatus() };
			int add = jdbcTemplate.update(QueryConstant.ADD_CONTENT, args);
			if (add > 0) {
				response = "Successfully inserted";
			} else {
				response = "unable to insert it";
			}
		}
		return response;
	}

	@Override
	public IndexPageDb getContentDb() {

		List<IndexPageDb> response = jdbcTemplate.query(QueryConstant.GET_CONTENT, new IndexPageExtractor());
		if (!response.isEmpty()) {
			return response.get(0);
		}
		return new IndexPageDb();
	}

	@Override
	public String updateContentDb(IndexPageDb indexPageDb) {

		String response = null;
		if (!StringUtils.isEmpty(indexPageDb)) {
			Object args[] = { indexPageDb.getWhatWeAre(), indexPageDb.getWhatWeDo(), indexPageDb.getWhoWeAre(),
					indexPageDb.isStatus(), indexPageDb.getId() };
			int add = jdbcTemplate.update(QueryConstant.UPDATE_CONTENT, args);
			if (add > 0) {
				response = "Successfully inserted";
			} else {
				response = "unable to insert it";
			}
		}
		return response;
	}

	@Override
	public List<IndexPageDb> getAllDb() {

		List<IndexPageDb> indexPageDbs = jdbcTemplate.query(QueryConstant.GET_ALL, new IndexPageExtractor());
		return indexPageDbs;
	}

}
