package com.sacco.saccoapp.loan;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
@Service
public class LoanService {
    public LoanService(LoanRepository loanRepository) {
        this.loanRepository = loanRepository;
    }

    private final  LoanRepository loanRepository;

    public static void addNewLoan(Loan loan) {
//        loanRepository.findLoanByCategory(loan.getCategory());
    }

    public List<Loan> getLoans() {
        return loanRepository.findAll();
    }

    public void deleteLoan(Long loanId) {
       boolean exists = loanRepository.existsById(loanId);
       if(!exists){
           throw new RuntimeException("Loan with id "+loanId+"does not exists");
       }else{
           loanRepository.deleteById(loanId);
       }
    }
@Transactional
    public void updateLoan(Long loanId, String name, String category) {
       // Loan loan = loanRepository.findById(loanId);
       // loan.setName(name);
        //loan.setCategory(category);
    }
}
