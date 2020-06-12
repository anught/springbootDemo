package com.demo.springdemo.dao;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.demo.springdemo.entity.StudentInfo;

@Mapper
public interface StudentInfoDao {
	int sava(StudentInfo st);

	List<StudentInfo> findLisytByAge();
}
