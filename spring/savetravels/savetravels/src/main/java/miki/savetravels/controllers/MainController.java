package miki.savetravels.controllers;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;

import miki.savetravels.models.Expense;
import miki.savetravels.services.ExpenseService;

@Controller
public class MainController {

    @Autowired ExpenseService expenseService; 

    //! CREATE
    // displays the new expense/create form
    // @ModelAttribute = data binding sends an empty expense to the form to be filled out
    @GetMapping("/expenses/new")
    public String newExpense(@ModelAttribute("expense")Expense expense){
        return "new.jsp";
    }
    // handles the form data form the method above
    // passes data to service
    // @ModelAttribute = data binding returns a full expense to send to the service.
    @PostMapping("/expenses")
    public String createExpense(@Valid @ModelAttribute("expense")Expense expense, BindingResult results){
        if(results.hasErrors()){
            return "new.jsp";
        } else {
            expenseService.createExpense(expense);
            return "redirect:/";
        }

    }
    


    //! READ ALL
    
    @GetMapping("/")
    public String index(Model model){
        // invokation of the getAllexpenses method in the service
        List<Expense> expenses = expenseService.getAllExpenses();
        System.out.println(expenses);
        // sends data from the DB to the view 
        model.addAttribute("expenses", expenses);
        // redirect to the show all/index page
        return "index.jsp";
    }


    //! READ ONE
    @GetMapping("/expense/{id}")
    public String show(@PathVariable("id")Long id, Model model){
        //call to the service method for one expense
        Expense expense = expenseService.getOneExpense(id);
        System.out.println(expense);
        // sends DB data to the view
        model.addAttribute("expense", expense);
        // return the view one page.
        return "show.jsp";
    }

    //! UPDATE

    @GetMapping("/expenses/edit/{id}")
    public String edit(@PathVariable("id")Long id, Model model){
        Expense expense = expenseService.getOneExpense(id);
        model.addAttribute("expense", expense);
        return "edit.jsp";
    }
    
    @PutMapping("/expenses/update/{id}")
    public String update(@PathVariable("id")Long id, @Valid @ModelAttribute("expense")Expense expense, BindingResult results, Model model){
        if(results.hasErrors()){
            // expense expense = expenseService.getOneExpense(id);
            // model.addAttribute("expense", expense);
            System.out.println(results.getAllErrors());
            return "edit.jsp";
        } else {
            expenseService.updateExpense(expense);
            return "redirect:/";
        }
    }

    //! DELETE

    @DeleteMapping("/expenses/delete/{id}")
    public String destroy(@PathVariable("id")Long id){
        Expense expense = expenseService.getOneExpense(id);
        expenseService.deleteExpense(expense);
        return "redirect:/";
    }
}