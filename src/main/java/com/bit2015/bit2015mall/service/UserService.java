package com.bit2015.bit2015mall.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bit2015.bit2015mall.dao.UserDao;
import com.bit2015.bit2015mall.vo.UserVo;

@Service
public class UserService {
	
	@Autowired
	UserDao userDao;
	
	public void member_join(UserVo userVo){
		userDao.insert(userVo);
	}
	
	public UserVo login( UserVo userVo ) {
		System.out.println(userVo.getId() + " : " + userVo.getPassword());
		UserVo vo = userDao.get( userVo.getId(), userVo.getPassword() );
		return vo;
	}
	
	
	public UserVo member_modify_view( long no) {
		System.out.println(no);
		UserVo vo = userDao.member_modify_view(no);
		System.out.println(vo);
		return vo;
	}
	
	public void member_update(UserVo userVo){
		userDao.update(userVo);
	}
	
	
/*	public void join( UserVo userVo ) {
		userDao.insert( userVo );
	}
	
	public UserVo login( UserVo userVo ) {
		UserVo vo = userDao.get( userVo.getEmail(), userVo.getPassword() );
		return vo;
	}
	
	public void update(UserVo userVo){
		System.out.println("UserService : " + userVo);
		userDao.update(userVo);
		
	}
	
	public UserVo checkemail( String email) {
		System.out.println("service :" + email);
		UserVo vo = userDao.get( email);
		System.out.println(vo);
		return vo;
	}*/
	
}
