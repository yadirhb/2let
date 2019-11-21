package edu.mum.cs.waa.controller;

import com.sun.org.apache.bcel.internal.classfile.Code;
import com.sun.org.apache.xpath.internal.operations.Mod;
import edu.mum.cs.waa.domain.Category;
import edu.mum.cs.waa.domain.Status;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;


import javax.persistence.AttributeOverride;
import javax.persistence.criteria.CriteriaBuilder;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;

@Controller
public class CategoryController {


    @RequestMapping(value={"","/categoryList"}, method = RequestMethod.GET)
    public String loadList( Model model)
    {

        //get from the database
        List<Category> categoryList = new ArrayList<>();

        Category c1 = new Category();
        c1.setId(1);
        c1.setCode("100");
        c1.setName("Balls");
        c1.setDescription("Cool Stuff!");
        c1.setStatus(Status.ACTIVE);
        categoryList.add(c1);

        Category c2 = new Category();
        c2.setId(2);
        c2.setCode("1001");
        c2.setName("Bicycles");
        c2.setDescription("Cool Stuff!");
        c2.setStatus(Status.ACTIVE);
        categoryList.add(c2);

        model.addAttribute("categoryList",categoryList);
        return "itemManagement/categoryList";
    }

    @RequestMapping(value= "/upsertCategory/{id}", method = RequestMethod.GET)
    public String loadUpsert(@PathVariable("id") Optional<Integer> id, Model model)
    {
        List<Enum> statusValues = Arrays.asList(Status.values());
        model.addAttribute("statusValues",statusValues);

        Category category = new Category();
        if(id.isPresent()) {
            category.setCode("A12");
            category.setName("Name");
            category.setDescription("Description");
            category.setStatus(Status.DISABLED);
        }

        model.addAttribute("newCategory",category);
        return "itemManagement/upsertCategory";
    }


    @RequestMapping(value="/saveCategory", method = RequestMethod.POST)
    public String save(@ModelAttribute("newCategory") Category category)
    {
        //Save the new category
        return "redirect:categoryList";
    }

    @RequestMapping(value="/deleteCategory/{id}", method = RequestMethod.DELETE)
    public String delete(@PathVariable("id") Integer id)
    {
        //Delete the new category
        return "redirect:categoryList";
    }

}
