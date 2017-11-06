package service;

import common.CustomerLoanApply;
import dao.ICustomerLoanApplyMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * Created by xieshuai on 2017-11-3.
 */
@Service
public class CustomerLoanApplyServiceImpl implements ICustomerLoanApplyService{

    @Autowired
    private ICustomerLoanApplyMapper iCustomerLoanApplyMapper;


    @Override
    public CustomerLoanApply getById(Integer claId) {
        CustomerLoanApply cla = iCustomerLoanApplyMapper.getById(claId);
        System.out.println(cla.getClaCoId());
        return cla;
    }
}
