package com.fastpan.dao.mapper;

import java.util.List;

import com.fastpan.dao.pojo.Test;

public interface TestMapper {
	List<Test> queryob();
    int insertTest (Test test);
    
    List<Test> selectAll();
}