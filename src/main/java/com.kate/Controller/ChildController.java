package com.kate.Controller;

import com.kate.Entity.Child;
import com.kate.Service.ChildrenService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import java.util.Collection;

/**
 * Created by pochi_000 on 19/10/2016.
 */
@Controller
public class ChildController {

    @Autowired
    private ChildrenService childrenService;

    @RequestMapping("children_list.html")
    public ModelAndView getAllChildren()
    {
        ModelMap model = new ModelMap();
        model.addAttribute("children", childrenService.getAllChildren());
        return new ModelAndView("children_list", model);
    }

    @RequestMapping(value = "/{id}", method = RequestMethod.GET)
    public Child getChildById(@PathVariable("id") int id)
    {
        return this.childrenService.getChildById(id);
    }
}
