package com.authentification.securite.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.security.RolesAllowed;

@RestController
public class LoginController {

    @RequestMapping(value = "/*")
    @RolesAllowed("USER")
    public String getUser(){
        return "Bienvenu Monsieur l'user";
    }


    @RequestMapping(value = "/admin")
    @RolesAllowed("ADMIN")
    public String getAdmin(){
        return "Bienvenue , Monsieur l'Administrateur";
    }

}
