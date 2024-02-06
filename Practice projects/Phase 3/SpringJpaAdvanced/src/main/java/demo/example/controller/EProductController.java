package demo.example.controller;

import java.sql.Date;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import demo.example.entity.Eproduct;
import demo.example.repository.EProductRepository;
@Controller
public class EProductController {
	@Autowired
	EProductRepository eProductRepo;
	
	@GetMapping("/listproducts")
	public String findAllProducts(ModelMap model){
		List<Eproduct> listOfProducts = eProductRepo.findAll();
		model.addAttribute("prodlist", listOfProducts);
		return "list-of-products";
	}
	
	@PostMapping("/testdate")
	public void date(@RequestParam("dateAdded") 
		@DateTimeFormat(iso = DateTimeFormat.ISO.DATE) Date dateAdded) {
		System.out.println(dateAdded + " Hi");
	}
	
	//// Add a new product
	@GetMapping("/addProduct")
	public String showNewProductForm(ModelMap model) {
		Eproduct product = new Eproduct();
		model.addAttribute("product", product);
		return "new-product";
	}
	
	@PostMapping("/addProduct")
	public String addNewProduct(ModelMap model, @ModelAttribute("product") Eproduct product) {
		//product.setDateAdded(new Date());
		System.out.println(product.getDate_added());
		Eproduct savedProduct = eProductRepo.save(product);
		model.addAttribute("id", savedProduct.getID());
		return "add-product-success";
	}
	
	@GetMapping("/deleteProduct")
	public String deleteProduct(ModelMap model, @RequestParam long id) 
	{
		Optional<Eproduct> eProductFromRepo = 
		eProductRepo.findById(id);
		model.addAttribute("id", id);
		if (eProductFromRepo.isPresent()) {
			eProductRepo.deleteById(id);
			return "delete-product-success";
		} 
		else {
			return "delete-product-failed";
		}
	}
}
