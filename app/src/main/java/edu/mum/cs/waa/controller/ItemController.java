package edu.mum.cs.waa.controller;

import edu.mum.cs.waa.domain.Category;
import edu.mum.cs.waa.domain.Status;
import edu.mum.cs.waa.service.CategoryService;
import edu.mum.cs.waa.service.ItemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;

@Controller
public class ItemController {

    @Autowired
    CategoryService categoryService;

    @Autowired
    ItemService itemService;

    @RequestMapping(value={"","/itemList"}, method = RequestMethod.GET)
    public String loadList( Model model)
    {

        model.addAttribute("itemList",categoryService.findAll());
        return "itemManagement/itemList";
    }

    @RequestMapping(value= {"upsertItem","/upsertItem/{id}"}, method = RequestMethod.GET)
    public String loadUpsert(@PathVariable("id") Optional<Long> id, Model model)
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


    @RequestMapping(value="/saveItem", method = RequestMethod.POST)
    public String save(@ModelAttribute("newCategory") Category category)
    {
        //Save the new category
        categoryService.save(category);

        return "redirect:categoryList";
    }

    @RequestMapping(value="/deleteItem/{id}", method = RequestMethod.GET)
    public String delete(@PathVariable("id") Long id, Model model)
    {
        //Delete the new category
        categoryService.deleteById(id);

        //get from the database
        model.addAttribute("categoryList",categoryService.findAll());

        return "itemManagement/itemList";
    }

}
