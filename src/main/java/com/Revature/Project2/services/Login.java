package com.Revature.Project2.services;

import com.Revature.Project2.beans.pojos.User;
import com.Revature.Project2.repos.AdminRepo;
import com.Revature.Project2.repos.UserRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;

@Service
@Transactional
public class Login {
    private final UserRepo userRepo;
    private final AdminRepo adminRepo;


    @Autowired
    public Login(UserRepo userRepo, AdminRepo adminRepo) {
        this.userRepo = userRepo;
        this.adminRepo = adminRepo;
    }

//    public int userRole(User user){
//        return user.getUserType();
//    }

    public void save(User user){
        userRepo.save(user);
    }

    public User get(String username){
        return userRepo.getById(username);
    }

    //Login for users
    public HttpStatus userLogin(String username, String password){
        System.out.println("DEBUG: I can get here: user login method");
        Validation validation = new Validation();
        HttpStatus status;

        User user = userRepo.getById(username);

        //Validate the username and password
        boolean loginTrue = validation.validateUser(username, password, user);

        if(loginTrue){
            status = HttpStatus.OK;
        } else {
            status = HttpStatus.UNAUTHORIZED;
        }
        return status;
    }
    //Login for admin
    public void adminLogin(){
        //TODO: Write this method
    }
}
