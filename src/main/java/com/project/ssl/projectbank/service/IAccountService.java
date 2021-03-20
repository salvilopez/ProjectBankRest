package com.project.ssl.projectbank.service;

import java.util.List;

import com.project.ssl.projectbank.model.Account;

public interface IAccountService {
    public List<Account> findAllAccounts();
    public Account findAccountById(Long ccc);
    public Account save(Account acount);
    public void deleteById(Long ccc);
    public void update(Long ccc,Account acount);
}
