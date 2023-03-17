package miki.savetravels.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import miki.savetravels.models.Expense;
import miki.savetravels.repositories.ExpenseRepository;

@Service
public class ExpenseService {
    @Autowired ExpenseRepository expenseRepository;

    public void createExpense(Expense expense) {
        expenseRepository.save(expense);
    }
        //! READ ALL
        public List<Expense> getAllExpenses(){
            return expenseRepository.findAll();
        }
    
        //! READ ONE
        public Expense getOneExpense(Long id){
            Optional<Expense> optionalexpense = expenseRepository.findById(id);
            Expense expense = optionalexpense.orElse(null);
            return expense;
        }
    
        //! UPDATE
        public void updateExpense(Expense expense) {
            expenseRepository.save(expense);
        }
    
        //! DELETE
        public void deleteExpense(Expense expense) {
            expenseRepository.delete(expense);
        }
        

}
