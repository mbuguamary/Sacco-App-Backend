package com.sacco.saccoapp.loan;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface LoanRepository extends JpaRepository<Loan,Long>
{
    @Query("SELECT s FROM Loan s WHERE s.category = ?1")
    Optional<Loan> findLoanByCategory(String category);


}
