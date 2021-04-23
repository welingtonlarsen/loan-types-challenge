package com.loanchallenge.api.rest;

import com.loanchallenge.domain.loan.service.LoanAnalyzerService;
import com.loanchallenge.domain.loan.vo.CustomerWrapperVo;
import com.loanchallenge.domain.loan.vo.LoanTypesSuitableVo;
import com.loanchallenge.domain.loan.vo.LoanVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;
import java.util.Set;

@RestController
public class LoanTypesController {
    @Autowired
    private LoanAnalyzerService loanAnalyzerService;

    @PostMapping(value = "/api/loanTypes")
    public ResponseEntity<Response<LoanTypesSuitableVo>> fetchLoanTypes(@RequestBody @Valid CustomerWrapperVo customer, BindingResult bindingResult) {
        Response response = new Response<LoanTypesSuitableVo>();
        
        if (bindingResult.hasErrors()) {
            return response.getAsBadRequest(bindingResult);
        }

        Set<LoanVo> loanTypesSuitable = loanAnalyzerService.fetchLoanTypesSuitable(customer.getCustomerVo());

        return response.getAsAccepted(new LoanTypesSuitableVo(customer.getCustomerVo().getName(), loanTypesSuitable));
    }
}
