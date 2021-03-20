package com.project.ssl.projectbank.rest;

import com.project.ssl.projectbank.model.Account;
import com.project.ssl.projectbank.service.AccountServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import java.util.List;

@Path("/accounts")
@RestController
public class AccountController {

    @Autowired
    private AccountServiceImpl accountServiceImpl;


    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public List<Account> findAll(){
        return accountServiceImpl.findAllAccounts();
    }
}
