package org.punit.balanceApp.BalanceApp.Services;

import java.util.List;

import org.punit.balanceApp.BalanceApp.Data.CreditedBillTO;
import org.punit.balanceApp.BalanceApp.Repo.CreditedBillReposatory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CreditedBillServices {
	
	@Autowired
	CreditedBillReposatory creditedBillReposatory;

	public void addCreditedBill(CreditedBillTO creditedBillTO) {
		creditedBillReposatory.save(creditedBillTO);
	}

	public List<CreditedBillTO> getAllCreditedBill() {
		return (List<CreditedBillTO>) creditedBillReposatory.findAll();
	}
	
	/*public List<CreditedBillTO> getAllCreditedBillByCustId(int custId) {
		return creditedBillReposatory.findAllByCustId(custId);
	}*/
}
