package com.Revature.Project2.services;

import com.Revature.Project2.beans.pojos.Rating;
import com.Revature.Project2.beans.pojos.User;
<<<<<<< HEAD
import org.springframework.validation.Errors;
import org.springframework.validation.ValidationUtils;
import org.springframework.validation.Validator;
=======
import com.Revature.Project2.repos.UserRepo;

import java.io.FileWriter;
>>>>>>> 9860dfb6a24716eba4f5bdb12f72edb8613f1046

//TODO: Decide if we want to make this class a bean or keep it as a Util class
public class Validation implements Validator {

    public Validation(){
    }

    @Override
    public boolean supports(Class clazz) {
        return User.class.equals(clazz);
    }

    @Override
    public void validate(Object target, Errors errors) {
        ValidationUtils.rejectIfEmpty(errors,"username", "username is empty");
        ValidationUtils.rejectIfEmpty(errors, "password", "password is empty");
    }

    public boolean validateUser(String username, String password, User user){
        return username.equals(user.getUsername()) && password.equals(user.getPassword());
    }

<<<<<<< HEAD
    public void validateName(String name){
        //TODO: Write this method
    }
=======
    public boolean validateName(String firstName, String lastName){
        boolean isRegularName = false;

        if(firstName.matches("[a-zA-Z]{2,25}$")&& lastName.matches("[a-zA-Z]{2,25}$")){
            isRegularName = true;
        } else {
            //TODO: write to FileLogger and return to registration page ("/register")
        }
        return isRegularName;
    }
    public boolean validateUserCreds(String username, String password){
        boolean isRegularCreds = false;

        if(password.matches("[a-zA-Z0-9]{2,25}$")&& username.matches("[a-zA-Z0-9]{2,25}$")){
            isRegularCreds = true;
        } else {
            //TODO: write to FileLogger and return to registration page ("/register")
        }
        return isRegularCreds;
    }
    public boolean userExists(UserRepo user, String username){
        return user.existsById(username);
    }
>>>>>>> 9860dfb6a24716eba4f5bdb12f72edb8613f1046

}
