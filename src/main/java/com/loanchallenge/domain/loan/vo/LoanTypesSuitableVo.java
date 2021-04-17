package com.loanchallenge.domain.loan.vo;

import java.util.Set;

public class LoanTypesSuitableVo {
    private String customer;
    private Set<LoanVo> loans;

    public LoanTypesSuitableVo(String customer, Set<LoanVo> loans) {
        this.customer = customer;
        this.loans = loans;
    }

    public String getCustomer() {
        return customer;
    }

    public Set<LoanVo> getLoans() {
        return loans;
    }
}
