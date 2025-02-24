package br.com.fiap.money_control_api.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import br.com.fiap.money_control_api.model.Category;

@RestController
public class CategoryController {

    @RequestMapping(path = "/category", produces = "application/json", method = {RequestMethod.GET})
	public Category index(){
		return new Category(1L, "Educação", "book");
	}
    
}
