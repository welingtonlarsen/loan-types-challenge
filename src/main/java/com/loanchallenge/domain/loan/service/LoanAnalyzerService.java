package com.loanchallenge.domain.loan.service;

import com.loanchallenge.domain.loan.model.LoanRule;
import com.loanchallenge.domain.loan.vo.CustomerVo;
import com.loanchallenge.domain.loan.vo.LoanVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.validation.Valid;
import java.util.Set;
import java.util.stream.Collectors;

@Service
public class LoanAnalyzerService {
    @Autowired private Set<LoanRule> loanRules;

    public Set<LoanVo> fetchLoanTypesSuitable(@Valid CustomerVo customerVo) {
        Set<LoanRule> loanRulesAccepted =
                loanRules.stream()
                        .filter(loanRule -> loanRule.accept(customerVo))
                        .collect(Collectors.toSet());

        if (loanRulesAccepted.size() != 1) {
            return Set.of();
        }

        return loanRulesAccepted.iterator().next().possibilities(customerVo);
    }
}
