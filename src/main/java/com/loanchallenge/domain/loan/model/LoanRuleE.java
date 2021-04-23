package com.loanchallenge.domain.loan.model;

import com.loanchallenge.domain.loan.enums.LoanType;
import com.loanchallenge.domain.loan.vo.CustomerVo;
import com.loanchallenge.domain.loan.vo.LoanVo;

import java.math.BigDecimal;
import java.util.Set;

public class LoanRuleE implements LoanRule{
    @Override
    public Set<LoanVo> possibilities(CustomerVo request) {
        return Set.of(new LoanVo(LoanType.PERSONAL, 4),
                new LoanVo(LoanType.PAYROLL, 2));
    }

    @Override
    public boolean accept(CustomerVo request) {
        return request.verifyIncomeHigherThan(new BigDecimal(4999.99))
                && request.verifyAgeHigherThan(29);
    }
}
