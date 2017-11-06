package service;

import common.CustomerLoanApply;
import dao.ICustomerLoanApplyMapper;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class ServiceApplicationTests {


	@Autowired
	private ICustomerLoanApplyService iCustomerLoanApplyService;

	@Test
	public void contextLoads() {
		CustomerLoanApply cla = iCustomerLoanApplyService.getById(108980);
		System.out.print(cla.getClaCoId());
	}
}
