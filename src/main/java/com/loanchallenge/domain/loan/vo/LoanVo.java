package com.loanchallenge.domain.loan.vo;

import com.loanchallenge.domain.loan.enums.LoanType;

public class LoanVo {
    private String type;
    private int taxes;

    public LoanVo(LoanType type, int taxes) {
        this.type = type.getFieldDescription();
        this.taxes = taxes;
    }

    public String getType() {
        return type;
    }

    public int getTaxes() {
        return taxes;
    }
}
