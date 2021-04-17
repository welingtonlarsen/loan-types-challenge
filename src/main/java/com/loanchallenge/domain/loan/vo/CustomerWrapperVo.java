package com.loanchallenge.domain.loan.vo;

import com.fasterxml.jackson.annotation.JsonProperty;

import javax.validation.Valid;

public class CustomerWrapperVo {
    @JsonProperty("customer")
    @Valid
    private CustomerVo customerVo;

    public CustomerWrapperVo(CustomerVo customerVo) {
        this.customerVo = customerVo;
    }

    public CustomerWrapperVo() {

    }

    public CustomerVo getCustomerVo() {
        return customerVo;
    }

    public void setCustomerVo(CustomerVo customerVo) {
        this.customerVo = customerVo;
    }
}