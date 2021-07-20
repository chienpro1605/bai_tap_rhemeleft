package com.codegym.controller;

import com.codegym.Service.CustomerService;
import com.codegym.Service.ICustomerService;
import com.codegym.model.Customer;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import java.util.List;

@Controller
@RequestMapping("/customer")
public class CustomerController {
    private final ICustomerService customerService = new CustomerService();

    @GetMapping("")
    public String index(Model model){

        List<Customer> customerList = customerService.findAll();
        model.addAttribute("customers", customerList);
        return "/index";
    }
    @GetMapping("/create")
    public String create(Model model){
        model.addAttribute("customer", new Customer());
        return "/create";
    }
    @PostMapping("/save")
    public String save(Customer customer){
        customer.setId((int) (Math.random()*1000));
        customerService.save(customer);
        return "redirect:/customer";
    }
    @GetMapping("/{id}/edit")
    public String edit(@PathVariable int id, Model model){
        model.addAttribute("customer", customerService.findById(id));
        return "/edit";
    }
    @PostMapping("/update")
    public String update(Customer customer){
        customerService.update(customer.getId(), customer);
        return "redirect:/customer";
    }
    @GetMapping("/{id}/delete")
    public String delete(@PathVariable int id, Model model){
        model.addAttribute("customer", customerService.findById(id));
        return "/delete";
    }
    @PostMapping("/delete")
    public String delete(Customer customer, RedirectAttributes redirectAttributes){
        customerService.remove(customer.getId());
        redirectAttributes.addFlashAttribute("thanking", "xoa thanh cong");
        return "redirect:/customer";
    }
    @GetMapping("/{id}/view")
    public String view(@PathVariable int id, Model model){
        model.addAttribute("customer", customerService.findById(id));
        return "/view";
    }
    @GetMapping("/search")
    public String search( @RequestParam("name") String name, Model model){
        List<Customer> customerList = customerService.search(name);
        model.addAttribute("customers", customerList);
        return "/index";
    }
}
