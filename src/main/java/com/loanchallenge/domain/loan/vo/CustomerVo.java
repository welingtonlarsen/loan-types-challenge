package com.loanchallenge.domain.loan.vo;

import org.hibernate.validator.constraints.br.CPF;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Positive;
import java.math.BigDecimal;

public class CustomerVo {
    @NotBlank(message = "name must not be blank")
    private String name;
    @NotBlank(message = "cpf must not be blank")
    @CPF(message = "cpf invalid")
    private String cpf;
    @Positive(message = "age must be greater than 0")
    private int age;
    @NotBlank(message = "location must not be blank")
    private String location;
    @NotNull(message = "income must not be null")
    private BigDecimal income;

    public CustomerVo(
            @NotBlank String name,
            @NotBlank @CPF String cpf,
            @Positive int age,
            @NotBlank String location,
            @Positive @NotNull BigDecimal income) {
        super();
        this.name = name;
        this.cpf = cpf;
        this.age = age;
        this.location = location;
        this.income = income;
    }

    public String getName() {
        return name;
    }

    public String getCpf() {
        return cpf;
    }

    public int getAge() {
        return age;
    }

    public String getLocation() {
        return location;
    }

    public BigDecimal getIncome() {
        return income;
    }

    public boolean verifyIncomeIsMinorOrEqualsThan(BigDecimal value) {
        return income.compareTo(value) <= 0;
    }

    public boolean verifyIsFromSaoPaulo() {
        return location.equalsIgnoreCase("sp");
    }

    public boolean verifyIncomeHigherThan(BigDecimal value) {
        return income.compareTo(value) > 0;
    }

    public boolean verifyAgeHigherThan(int age) {
        return this.age > age;
    }
}
