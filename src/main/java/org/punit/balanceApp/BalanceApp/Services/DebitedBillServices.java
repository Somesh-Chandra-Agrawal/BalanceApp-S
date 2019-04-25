package org.punit.balanceApp.BalanceApp.Services;

import java.util.List;

import javax.transaction.Transactional;

import org.punit.balanceApp.BalanceApp.Data.Bill;
import org.punit.balanceApp.BalanceApp.Repo.CustomerRepository;
import org.punit.balanceApp.BalanceApp.Repo.DebitedBillRepository;
import org.punit.balanceApp.BalanceApp.Repo.DebitedBillRepositoryImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Service;

@Service
public class DebitedBillServices {
	
	@Autowired
	DebitedBillRepository debitedBillRepository;
	
	@Autowired
	CustomerRepository customerRepository;
	
	@Autowired

	DebitedBillRepositoryImpl debitedBillRepositoryImpl;
	
	@Transactional
	public void addDebitedBill(Bill debitedBillTO) {
		debitedBillTO.setDue(debitedBillTO.getBillAmount());
		debitedBillRepository.save(debitedBillTO);
		customerRepository.updateTotalDue(Long.valueOf(debitedBillTO.getBillAmount()), debitedBillTO.getCustId());
	}
	
	public List<Bill> getAllBillByCustId(Integer custId) {
		List<Bill> bills= debitedBillRepositoryImpl.getBillsByCustId(custId);
		return bills;
	}
	
	
	public List<Bill> getAllBill(Bill debitedBillTO) {
		return (List<Bill>) debitedBillRepository.findAll();
	}
}
