/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guest;

import entity.Customer;
import guest.CustomerDao;
import javax.servlet.http.HttpServletRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

/**
 *
 * @author Wayne.Hu
 */
@Controller
public class CustomerController {
    @Autowired
    private CustomerDao customerDao;
    
    @RequestMapping(value="/customer.htm")
    public ModelAndView customerbook(HttpServletRequest request) {
        String name = request.getParameter("name");
       /*
        if (name != null) {
            Integer id = Integer.parseInt(request.getParameter("id"));
            Customer c = new Customer(id);
            c.setName(name);
            customerDao.persist(c);
        }*/
        for (Customer customer : customerDao.getAllCustomers()) { 
            System.out.println("name="+customer.getName());
        }            
        return new ModelAndView("customer.jsp", "customerDao", customerDao);
    }
}
