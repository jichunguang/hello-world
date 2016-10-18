package com.fastpan.facade.test;

import java.util.List;

import org.springframework.web.multipart.commons.CommonsMultipartFile;

import com.fastpan.dao.pojo.test.Test;

public interface TestFacede {
	public List<Test> test();
	public void deleteTest(Test test);
	public void upLoadBankReceipt(Test test, CommonsMultipartFile file);
}
