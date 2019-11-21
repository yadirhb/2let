package edu.mum.cs.waa.controller;
import edu.mum.cs.waa.domain.Center;
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
@RequestMapping(value="/centersManagement")
public class CenterController {
    @Autowired
    private CenterService centerService;
    @ModelAttribute("centers")
    List<Center> findAllCenters(Model model){
        model.addAttribute("centerSearch", new Center());
        return centerService.findAll();
    }
    @RequestMapping(value = {"","/centerList"},method = RequestMethod.GET)
    public String CenterList(Model model){
//        List<Center> centerList=centerService.findAll();
//        model.addAttribute("centers", centerList);
        return "centersManagement/centerList";
    }
    @RequestMapping(value = "/addCenter", method = RequestMethod.GET)
    public String inputCenter(@ModelAttribute("newCenter") Center center, Model model) {
        return "centersManagement/addCenter";
    }
    @RequestMapping(value = {"/addCenter","/updateCenter"}, method = RequestMethod.POST)
    public String saveCenter(@Valid @ModelAttribute("newCenter") Center center, BindingResult bindingResult) {

        if (bindingResult.hasErrors())
            return "centersManagement/addCenter";

        /*Category category = categoryService.getCategory(book.getCategory().getId());
        book.setCategory(category);*/
        centerService.save(center);
        return "redirect:/centersManagement";
    }
    @RequestMapping(value = "/updateCenter/{id}", method = RequestMethod.GET)
    public String updateCenter(Model model, @PathVariable("id") long id) {
        Center center = centerService.findByCenterID(id);
        model.addAttribute("center",center);
        return "centersManagement/updateCenter";
    }

}
