package com.sacco.saccoapp.user;

import jakarta.persistence.*;

@Entity
@Table
public class UserDetail {
    @Id
    @SequenceGenerator(
            name = "user-sequence",
            sequenceName = "user_sequence",
            allocationSize = 1
    )
    @GeneratedValue(
            strategy = GenerationType.SEQUENCE,
            generator = "user_sequence"
    )
    private Long id;
    private String  memberNo;
    private String email;
    private String password;
    public UserDetail() {
    }
    public UserDetail(Long id, String memberNo, String email, String password) {
        this.id = id;
        this.memberNo = memberNo;
        this.email = email;
        this.password = password;
    }

    public UserDetail(String memberNo, String email, String password) {
        this.memberNo = memberNo;
        this.email = email;
        this.password = password;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getMemberNo() {
        return memberNo;
    }

    public void setMemberNo(String memberNo) {
        this.memberNo = memberNo;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", memberNo='" + memberNo + '\'' +
                ", email='" + email + '\'' +
                ", password='" + password + '\'' +
                '}';
    }


}
