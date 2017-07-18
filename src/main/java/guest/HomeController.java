/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guest;

/**
 *
 * @author Wayne.Hu
 */

 
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
 
@Controller
public class HomeController {
 
    @RequestMapping(value="/home.htm", method = RequestMethod.GET)
    public String viewHome(ModelMap modelMap){
        modelMap.put("printme", "Hello Spring !!");
        return "home";
    }
}
