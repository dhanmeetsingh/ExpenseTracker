package in.dhanmeet.expensetracker.service;

import java.util.List;

import in.dhanmeet.expensetracker.model.Expense;

public interface ExpenseService {
	
	List<Expense> findAll();
	
	Expense save(Expense expense);
	
	Expense findById(Long id);
	
	void delete(Long id);
}
