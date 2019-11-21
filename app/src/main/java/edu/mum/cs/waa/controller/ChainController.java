package edu.mum.cs.waa.controller;

import edu.mum.cs.waa.domain.Chain;
import edu.mum.cs.waa.service.ChainService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.validation.Valid;
import java.util.List;

@Controller
@RequestMapping(value="/chainManagement")
public class ChainController {
    boolean haveChain=false;
    @Autowired
    private ChainService chainService;
    @ModelAttribute("chains")
    List<Chain> findAllChain(Model model){
        model.addAttribute("chainSearch", new Chain());
        return chainService.findAll();
    }
    @RequestMapping(value = {"","/chainList"},method = RequestMethod.GET)
    public String ChainList(Model model){
//        List<Center> centerList=centerService.findAll();
//        model.addAttribute("centers", centerList);
        return "chainManagement/chainList";
    }
    @RequestMapping(value = "/addChain", method = RequestMethod.GET)
    public String inputChain(@ModelAttribute("newChain") Chain chain, Model model) {
        return "chainManagement/addChain";
    }
    @RequestMapping(value = {"/addChain","/updateChain"}, method = RequestMethod.POST)
    public String saveChain(@Valid @ModelAttribute("newChain") Chain chain, BindingResult bindingResult) {

        if (bindingResult.hasErrors())
            return "chainManagement/addChain";

        /*Category category = categoryService.getCategory(book.getCategory().getId());
        book.setCategory(category);*/
        chainService.save(chain);
        haveChain=true;
        return "redirect:/chainManagement";
    }
    @RequestMapping(value = "/updateChain/{id}", method = RequestMethod.GET)
    public String updateChain(Model model, @PathVariable("id") long id) {
//        List<Category> categories = categoryService.getAllCategories();
//        model.addAttribute("categories", categories);
        Chain chain = chainService.findByChainID(id);
        model.addAttribute("chain",chain);

        return "chainManagement/updateChain";
    }

}
