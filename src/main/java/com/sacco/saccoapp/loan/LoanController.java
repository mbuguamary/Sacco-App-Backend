package com.sacco.saccoapp.loan;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(path = "api/v1/loan")
public class LoanController {
    @Autowired
    public LoanController(LoanService loanService) {
        this.loanService = loanService;
    }

    private final LoanService loanService;
    @GetMapping
    public List<Loan> getLoans() {
        return loanService.getLoans();
    }
   @PostMapping
    public void registerNewLoan(@RequestBody Loan loan){
        loanService.addNewLoan(loan);
    }
    @DeleteMapping(path = "{loanId}")
    public void deleteLoan(@PathVariable("loanId") Long loanId){
        loanService.deleteLoan(loanId);

    }
    @PutMapping(path="{loanId}")
    public void updateLoan(
            @PathVariable ("loanId") Long loanId,
            @RequestParam(required = false) String name,
            @RequestParam(required = false) String category)
    {
     loanService.updateLoan(loanId,name,category) ;
    }



}
