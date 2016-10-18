package com.fastpan.facade.test;

import org.springframework.web.multipart.commons.CommonsMultipartFile;

import com.fastpan.dao.pojo.test.Test;

public interface TestFacede {
	public Object test();
	public void deleteTest(Test test);
	public void upLoadBankReceipt(Test test, CommonsMultipartFile file);
}
