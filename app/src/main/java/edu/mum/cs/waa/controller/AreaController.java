package edu.mum.cs.waa.controller;


import edu.mum.cs.waa.domain.Area;
import edu.mum.cs.waa.domain.Center;
import edu.mum.cs.waa.service.AreaService;
import edu.mum.cs.waa.service.CenterService;
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
@RequestMapping(value="/areaManagement")
public class AreaController {
    @Autowired
    private AreaService areaService;
    @ModelAttribute("areas")
    List<Area> findAllArea(Model model){
        model.addAttribute("areaSearch", new Area());
        return areaService.findAll();
    }
    @RequestMapping(value = {"","/areaList"},method = RequestMethod.GET)
    public String AreaList(Model model){
//        List<Center> centerList=centerService.findAll();
//        model.addAttribute("centers", centerList);
        return "areaManagement/areaList";
    }
    @RequestMapping(value = "/addArea", method = RequestMethod.GET)
    public String inputArea(@ModelAttribute("newArea") Area area, Model model) {
        return "areaManagement/addArea";
    }
    @RequestMapping(value = {"/addArea","/updateArea"}, method = RequestMethod.POST)
    public String saveArea(@Valid @ModelAttribute("newArea") Area area, BindingResult bindingResult) {

        if (bindingResult.hasErrors())
            return "areaManagement/addArea";

        /*Category category = categoryService.getCategory(book.getCategory().getId());
        book.setCategory(category);*/
        areaService.save(area);
        return "redirect:/areaManagement";
    }
    @RequestMapping(value = "/updateArea/{id}", method = RequestMethod.GET)
    public String updateArea(Model model, @PathVariable("id") long id) {
//        List<Category> categories = categoryService.getAllCategories();
//        model.addAttribute("categories", categories);
        Area area = areaService.findByAreaID(id);
        model.addAttribute("area",area);

        return "areaManagement/updateArea";
    }

}
