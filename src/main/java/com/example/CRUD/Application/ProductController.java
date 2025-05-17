package com.example.CRUD.Application;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;
import jakarta.validation.Valid;

@Controller
@RequestMapping("/products")
public class ProductController {

    private final ProductService productService;

    public ProductController(ProductService productService) {
        this.productService = productService;
    }

    @GetMapping
    public String showProductList(Model model) {
        model.addAttribute("products", productService.getAllProducts());
        return "list";
    }

    @GetMapping("/add")
    public String showAddForm(Product product) {
        return "add";
    }

    @PostMapping("/add")
    public String addProduct(@Valid Product product, BindingResult result, Model model) {
        if (result.hasErrors()) {
            return "add";
        }
        productService.createProduct(product);
        return "redirect:/products";
    }

    @GetMapping("/edit/{id}")
    public String showEditForm(@PathVariable Long id, Model model) {
        Product product = productService.getProductById(id)
                .orElseThrow(() -> new IllegalArgumentException("Invalid product Id:" + id));
        model.addAttribute("product", product);
        return "edit";
    }

    @PostMapping("/update/{id}")
    public String updateProduct(@PathVariable Long id, @Valid Product product,
                                BindingResult result, Model model) {
        if (result.hasErrors()) {
            product.setId(id);
            return "edit";
        }
        productService.updateProduct(id, product);
        return "redirect:/products";
    }

    @GetMapping("/delete/{id}")
    public String deleteProduct(@PathVariable Long id) {
        productService.deleteProduct(id);
        return "redirect:/products";
    }
}