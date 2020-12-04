package com.smartbank.controller;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.smartbank.dao.CustomerDao;
import com.smartbank.model.Customer;
import com.smartbank.model.Login;


@Controller

public class CustController{


@Autowired    
CustomerDao customerDao;


	@RequestMapping("loginpage")
   public String printHello(ModelMap model) {
     model.addAttribute("login", new Login());

      return "login";
	}
      @RequestMapping(value="/submit",method=RequestMethod.POST)
      public ModelAndView submitForm(@Valid @ModelAttribute("custlogin")Login e,BindingResult br)
      {
    	  return new ModelAndView("loginSuccessForm");
      }
      
      
      
      
      @RequestMapping(value="loginSuccessForm",method=RequestMethod.GET)
      public String validate(@RequestParam("uname") String name,@RequestParam("pwd") String pass,Model m)
      {
    	  if(name.equals("ani")&&pass.equals("abc"))
    	  {
    		  m.addAttribute("user",name);
    		  return "loginSuccessForm";
    	  }
    	  else
    	  {
    		  return "fail";
    	  }
      }
      
      //custcreate form
      @RequestMapping("create")
      public String cus(ModelMap m)
      {
    	  m.addAttribute("cusCreationForm",new Customer());
    	  return "cusCreationForm";
      }
      @RequestMapping(method=RequestMethod.POST)
      public ModelAndView form(@Valid @ModelAttribute("cuscre")Login e,BindingResult br)
      {
    	  return new ModelAndView("cusCreationForm");
      }
      
      
      
     /* @RequestMapping("/cusCreationForm")  
      public String add(Model m)  
      {  
          m.addAttribute("cuscre", new Customer());  
          return "cusCreationForm";  
      }*/
  	
  	@RequestMapping(value="/addcus",method = RequestMethod.POST)
  	 	 	public ModelAndView addCustomer(Customer customer) {
  		customerDao.insert(customer);
  		ModelAndView model1=new ModelAndView("success");
  	      
  	      return model1;
  	   }
      
  



      /* @RequestMapping("modify")
      public String modify(ModelMap m)
      {
    	  m.addAttribute("cusCreationForm",new Customer());
    	  return "modifyCus";
      }
      @RequestMapping(method=RequestMethod.POST)
      public ModelAndView modifypage(@Valid @ModelAttribute("modifycus")Customer e,BindingResult br)
      {
    	  return new ModelAndView("modifyCus");
      }*/
      
      
      
      
      
      
      
      /*
    
      @RequestMapping("create")
      public String creat(ModelMap model) {
        model.addAttribute("success", new Customer());

         return "loginSuccessForm";
   	}
         @RequestMapping(value="/submit",method=RequestMethod.POST)
         public ModelAndView createCust(@Valid @ModelAttribute("cuscre")Customer e,BindingResult br)
         {
       	  return new ModelAndView("cusCreationForm");
         }*/
    /*  
     Login loginForm = new Login();
    @RequestMapping(value="loginSuccessForm",method=RequestMethod.GET)
    public String validate(@Valid Login loginForm, BindingResult result,
			Map model)
    {
    	boolean userExists = CustomerService.checkLogin(loginForm.getUsername(),
                loginForm.getPassword());
    		if(userExists)
    		{
    			//m.addAttribute("login",name);
    			return "loginSuccessForm";
    		}
    		else 
    		{
    			return "fail";
    		}
    }*/
	
}

        
        

