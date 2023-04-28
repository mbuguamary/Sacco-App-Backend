package com.sacco.saccoapp.user;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(path = "/api/v1/user")
public class UserDetailController {
    private final UserDetailService userDetailService;

   @Autowired
    public UserDetailController(UserDetailService userDetailService) {
        this.userDetailService = userDetailService;
    }
    @GetMapping
    public List <UserDetail> getUsers(){
       return userDetailService.getUsers();
    }
    @PostMapping
    public void registerNewUser(@RequestBody UserDetail userDetail){
       userDetailService.addNewUser(userDetail);
    }
    @DeleteMapping(path = "{userId}")
    public void deleteUser(@PathVariable("userId") Long userId) {
        userDetailService.deleteUser(userId);
    }
    @PutMapping(path= "{userId}")
    public void updateUser(
        @PathVariable("userId")  Long userId,
        @PathVariable(required = false)  String email,
        @PathVariable(required = false) String password
    ){
      userDetailService.updateUser(userId,email,password) ;
    }
}
