package com.loanchallenge.domain.loan.model;

import com.loanchallenge.domain.loan.vo.CustomerVo;
import com.loanchallenge.domain.loan.vo.LoanVo;

import javax.validation.Valid;
import java.util.Set;

public interface LoanRule {
    public Set<LoanVo> possibilities(CustomerVo request);
    boolean accept(@Valid CustomerVo request);
}
