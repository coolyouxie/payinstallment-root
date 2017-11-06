package dao;

import common.CustomerLoanApply;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class PayinstallmentDaoApplicationTests {

	@Autowired
	private ICustomerLoanApplyMapper iCustomerLoanApplyMapper;

	@Test
	public void contextLoads() {
		CustomerLoanApply cla = iCustomerLoanApplyMapper.getById(108980);
		System.out.print(cla.getClaCoId());
	}

}
