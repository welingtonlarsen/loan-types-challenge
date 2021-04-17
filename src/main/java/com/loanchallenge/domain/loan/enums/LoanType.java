package com.loanchallenge.domain.loan.enums;

public enum LoanType {
    PERSONAL("personal"), COLLATERALIZED("collateralized"), PAYROLL("payroll");

    private final String fieldDescription;

    LoanType(String value) {
        this.fieldDescription = value;
    }

    public String getFieldDescription() {
        return fieldDescription;
    }
}
