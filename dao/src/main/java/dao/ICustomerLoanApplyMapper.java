package dao;

import common.CustomerLoanApply;
import org.springframework.stereotype.Repository;

/**
 * Created by xieshuai on 2017-11-2.
 */
@Repository
public interface ICustomerLoanApplyMapper {

    public CustomerLoanApply getById(Integer claId);
}
