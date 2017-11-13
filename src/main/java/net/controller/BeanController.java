package net.controller;


import net.dao.DbHandler;
import net.model.ArticleModelClass;
import net.model.FileArticleCreator;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.validation.Valid;

@Controller
public class BeanController {

    @RequestMapping(value = "/", method = RequestMethod.GET)
    public String showMainPage(){
        return "index";
    }
    @RequestMapping(value="/addArticle", method=RequestMethod.GET)
    public String showForm(Model model){
        model.addAttribute("articleModelClassBean", new ArticleModelClass());
        return "addArticle";
    }

    @RequestMapping(value = "/addArticle", method = RequestMethod.POST)
    public String submit(@Valid @ModelAttribute("articleModelClassBean")ArticleModelClass articleModelClassBean,
                         BindingResult result, ModelMap model) {
        if (result.hasErrors()) {
            return "error";
        }
        FileArticleCreator fileArticleCreator = new FileArticleCreator(articleModelClassBean);
        if(fileArticleCreator.writeArticle()) {
            DbHandler dbHandler = new DbHandler();
            dbHandler.putValues(articleModelClassBean);
        }
        else{
            System.out.println("else block in net.controller submit func");
        }
        return "index";
    }


}