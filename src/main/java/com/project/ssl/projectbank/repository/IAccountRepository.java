package com.project.ssl.projectbank.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.project.ssl.projectbank.model.Account;
import com.project.ssl.projectbank.model.CCC;


public interface IAccountRepository extends JpaRepository<Account,CCC>{
	
	
	

}
