package com.loanchallenge.domain.loan.model;

import com.loanchallenge.domain.loan.enums.LoanType;
import com.loanchallenge.domain.loan.vo.CustomerVo;
import com.loanchallenge.domain.loan.vo.LoanVo;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;
import java.util.Set;

@Service
public class LoanRuleF implements LoanRule {
    @Override
    public Set<LoanVo> possibilities(CustomerVo request) {
        return Set.of(
                new LoanVo(LoanType.PERSONAL, 4),
                new LoanVo(LoanType.COLLATERALIZED, 3),
                new LoanVo(LoanType.PAYROLL, 2));
    }

    @Override
    public boolean accept(CustomerVo request) {
        return request.verifyIncomeHigherThan(BigDecimal.valueOf(4999.99))
                && !request.verifyAgeHigherThan(30);
    }
}
