package chien.pro.controller;

import chien.pro.model.Product;
import chien.pro.service.IProductService;
import chien.pro.service.ProductService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

@Controller
@RequestMapping("/product")
public class ProductController {
    IProductService productService = new ProductService();
    @GetMapping("")
    public String index(Model model){
        List<Product> products= productService.findAll();
        model.addAttribute("products", products);
        return "/index";
    }
}
