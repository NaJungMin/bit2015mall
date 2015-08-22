package com.bit2015.bit2015mall.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.ibatis.SqlMapClientTemplate;
import org.springframework.stereotype.Repository;

import com.bit2015.bit2015mall.vo.AdminVo;

@Repository
public class AdminDao {
	@Autowired
	SqlMapClientTemplate sqlMapClientTemplate;

	public List<AdminVo> getList() {
		List<AdminVo> list = 
			(List<AdminVo>) sqlMapClientTemplate.queryForList("admin.list");

		return list;
	}

}
