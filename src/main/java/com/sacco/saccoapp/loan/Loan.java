package com.sacco.saccoapp.loan;

import jakarta.persistence.*;

@Entity
@Table

public class Loan {
    @Id
    @SequenceGenerator(
            name = "loan-sequence",
            sequenceName = "loan_sequence",
            allocationSize = 1
    )
    @GeneratedValue(
            strategy = GenerationType.SEQUENCE,
            generator = "loan_sequence"
    )
    private Long id;
    private String name;
    private String member_no;
    private String category;
    private Double amount;



    public Loan() {
    }

    public Loan(Long id, String name, String member_no, String category, Double amount) {
        this.id = id;
        this.name = name;
        this.member_no = member_no;
        this.category = category;
        this.amount = amount;
    }

    public Loan(String name, String member_no, String category, Double amount) {
        this.name = name;
        this.member_no = member_no;
        this.category = category;
        this.amount = amount;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getMember_no() {
        return member_no;
    }

    public void setMember_no(String member_no) {
        this.member_no = member_no;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public Double getAmount() {
        return amount;
    }

    public void setAmount(Double amount) {
        this.amount = amount;
    }

    @Override
    public String toString() {
        return "Loan{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", member_no='" + member_no + '\'' +
                ", category='" + category + '\'' +
                ", amount=" + amount +
                '}';
    }
}
