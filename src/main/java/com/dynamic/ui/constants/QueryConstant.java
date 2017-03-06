package com.dynamic.ui.constants;

public interface QueryConstant {

	public static final String ADD_CONTENT = "INSERT INTO indexpage (id, what_we_are, what_we_do, who_we_are, status) VALUES (0, ?, ?, ?, ?)";

	public static final String GET_CONTENT = "SELECT * FROM indexpage where status = true";
	
	public static final String GET_ALL = "SELECT * FROM indexpage ";

	public static final String UPDATE_CONTENT = "UPDATE indexpage SET what_we_are = ?, what_we_do = ?, who_we_are = ?, status = ? WHERE id = ?";
}
