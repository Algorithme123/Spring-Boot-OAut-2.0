package com.authentification.securite.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.security.RolesAllowed;
import java.security.Principal;

@RestController
public class LoginController {

    @RolesAllowed("USER")
    @RequestMapping(value = "/**")

    public String getUser(){
        return "Bienvenu Monsieur l'user";
    }


    @RequestMapping(value = "/admin")
    @RolesAllowed("ADMIN")
    public String getAdmin(){
        return "Bienvenue , Monsieur l'Administrateur";
    }

    @RequestMapping(value = "/*")
    public String getGithub(Principal user){
        return "Bienvenue, Github "+user.getName();
    }

}
