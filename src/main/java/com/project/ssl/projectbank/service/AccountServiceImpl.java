package com.project.ssl.projectbank.service;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import com.project.ssl.projectbank.model.Account;
import com.project.ssl.projectbank.model.CCC;
import com.project.ssl.projectbank.repository.IAccountRepository;
import org.springframework.stereotype.Service;

@Service
public class AccountServiceImpl implements IAccountService{
	
	
	@Autowired
	private IAccountRepository accountRepository;

	@Override
	public List<Account> findAllAccounts() {
		return accountRepository.findAll();
	}

	@Override
	public Account findAccountById(Long ccc) {
		return accountRepository.findById(CCC.extraerCCC(ccc)).get();
	}

	@Override
	public Account save(Account acount) {
		
		return accountRepository.save(acount);
	}

	@Override
	public void deleteById(Long ccc) {
		accountRepository.deleteById(CCC.extraerCCC(ccc));
	}

	@Override
	public void update(Long ccc, Account acount) {
		Account actAccount=accountRepository.findById(CCC.extraerCCC(ccc)).get();
		actAccount.setCoinBase(acount.getCoinBase());
		actAccount.setDisponible(acount.getDisponible());
		actAccount.setSituacion(acount.getSituacion());
		accountRepository.save(actAccount);
	}

}
