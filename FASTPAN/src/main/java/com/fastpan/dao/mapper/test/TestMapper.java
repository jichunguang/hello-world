package com.fastpan.dao.mapper.test;

import java.util.List;


import com.fastpan.dao.pojo.test.Test;

public interface TestMapper {
	List<Test> queryob();
    int insertTest (Test test);
    
    List<Test> selectAll();
}