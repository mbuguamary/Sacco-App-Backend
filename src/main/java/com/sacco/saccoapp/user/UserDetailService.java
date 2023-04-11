package com.sacco.saccoapp.user;

import org.apache.catalina.User;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Optional;

@Service
public class UserDetailService {
private final UserDetailRepository userDetailRepository;

    public UserDetailService(UserDetailRepository userDetailRepository) {
        this.userDetailRepository = userDetailRepository;
    }

    public List <UserDetail> getUsers() {
        return userDetailRepository.findAll();
    }

    public void addNewUser(UserDetail userDetail) {
     Optional<UserDetail> userDetailOptional= userDetailRepository.findUserDetailByMemberNo(userDetail.getMemberNo());
        if (userDetailOptional.isPresent()){
            throw new IllegalStateException("Member Already Registered");
        }
        System.out.println(userDetail);
        userDetailRepository.save(userDetail);
    }

    public void deleteUser(Long userId) {
        boolean exists = userDetailRepository.existsById(userId);
        if (!exists){
            throw new IllegalStateException("Member with member No "+userId+" does not exists");
        }else{
            userDetailRepository.deleteById(userId);
        }
    }
     @Transactional
    public void updateUser(Long userId, String email, String password) {
         UserDetail userDetail= userDetailRepository.findById(userId).orElseThrow(()-> new IllegalStateException("\"Member with member No \"+userId+\" does not exists\""));

         userDetail.setEmail(email);
         userDetail.setPassword(password);

    }
}
