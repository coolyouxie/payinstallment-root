package web;

import common.CustomerLoanApply;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.annotation.Configuration;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import service.ICustomerLoanApplyService;

/**
 * Created by xieshuai on 2017-11-3.
 */
@RestController
@EnableAutoConfiguration
@RequestMapping(value = "/test")
public class TestController {

    @Autowired
    private ICustomerLoanApplyService iCustomerLoanApplyService;

    @RequestMapping(value = "getById")
    public String getById(Model model, Integer claId){
        CustomerLoanApply cla = iCustomerLoanApplyService.getById(claId);
        return cla.getClaCoId()+"";
    }
}
