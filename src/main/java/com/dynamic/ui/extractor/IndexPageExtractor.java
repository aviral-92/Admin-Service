package com.dynamic.ui.extractor;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.core.ResultSetExtractor;

import com.dynamic.ui.dto.IndexPageDb;

public class IndexPageExtractor implements ResultSetExtractor<List<IndexPageDb>> {

	@Override
	public List<IndexPageDb> extractData(ResultSet rs) throws SQLException, DataAccessException {

		List<IndexPageDb> indexPageDbs = new ArrayList<>();
		IndexPageDb indexPageDb = null;
		while (rs.next()) {
			indexPageDb = new IndexPageDb();
			indexPageDb.setId(rs.getInt("id"));
			indexPageDb.setStatus(rs.getBoolean("status"));
			indexPageDb.setWhatWeAre(rs.getString("what_we_are"));
			indexPageDb.setWhatWeDo(rs.getString("what_we_do"));
			indexPageDb.setWhoWeAre(rs.getString("who_we_are"));
			indexPageDbs.add(indexPageDb);
		}
		return indexPageDbs;
	}

}
