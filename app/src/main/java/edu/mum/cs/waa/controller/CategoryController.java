package edu.mum.cs.waa.controller;

import edu.mum.cs.waa.domain.Category;
import edu.mum.cs.waa.domain.Status;
import edu.mum.cs.waa.service.CategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;

@Controller
public class CategoryController {

    @Autowired
    CategoryService categoryService;

    @RequestMapping(value={"","/categoryList"}, method = RequestMethod.GET)
    public String loadList( Model model)
    {

        model.addAttribute("categoryList",categoryService.findAll());
        return "itemManagement/categoryList";
    }

    @RequestMapping(value= {"/upsertCategory"}, method = RequestMethod.GET)
    public String loadUpsert(@RequestParam("id") Optional<Long> id, Model model)
    {
        List<Enum> statusValues = Arrays.asList(Status.values());
        model.addAttribute("statusValues",statusValues);

        Category category = new Category();
        if(id.isPresent() && id.get() > 0) {
            category = categoryService.findById(id.get());
        }

        model.addAttribute("newCategory",category);
        return "itemManagement/upsertCategory";
    }


    @RequestMapping(value="saveCategory", method = RequestMethod.POST)
    public String save(@ModelAttribute("newCategory") Category category)
    {
        String view;

        //Save the new category
        categoryService.save(category);

        return "redirect:categoryList";
    }

    @RequestMapping(value={"/deleteCategory"}, method = RequestMethod.GET)
    public String delete(@RequestParam("id") Long id, Model model)
    {
        //Delete the new category
        categoryService.deleteById(id);

        //get from the database
        model.addAttribute("categoryList",categoryService.findAll());

        return "itemManagement/categoryList";
    }

}
