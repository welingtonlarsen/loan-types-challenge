package com.loanchallenge.domain.loan.model;

import com.loanchallenge.domain.loan.enums.LoanType;
import com.loanchallenge.domain.loan.vo.CustomerVo;
import com.loanchallenge.domain.loan.vo.LoanVo;
import org.springframework.stereotype.Service;

import java.util.Set;

@Service
public class LoanRuleA implements LoanRule{
    @Override
    public Set<LoanVo> possibilities(CustomerVo request) {
        return Set.of(new LoanVo(LoanType.PERSONAL, 4));
    }

    @Override
    public boolean accept(CustomerVo request) {
        return request.verifyIncomeIsMinorOrEqualsThan(3000) && !request.verifyIsFromSaoPaulo();
    }
}
