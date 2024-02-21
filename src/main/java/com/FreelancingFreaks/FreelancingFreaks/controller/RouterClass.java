package com.FreelancingFreaks.FreelancingFreaks.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.FreelancingFreaks.FreelancingFreaks.Entity.Contact;
import com.FreelancingFreaks.FreelancingFreaks.Entity.FreelancerP;
import com.FreelancingFreaks.FreelancingFreaks.Entity.Services;
import com.FreelancingFreaks.FreelancingFreaks.Entity.User;
import com.FreelancingFreaks.FreelancingFreaks.repository.ServiceRepo;
import com.FreelancingFreaks.FreelancingFreaks.repository.contactRepo;
import com.FreelancingFreaks.FreelancingFreaks.repository.userrepo;
import com.FreelancingFreaks.FreelancingFreaks.services.ContactServiceImp;
import com.FreelancingFreaks.FreelancingFreaks.services.ServiceServiceImp;
import com.FreelancingFreaks.FreelancingFreaks.services.userserviceimp;

import jakarta.servlet.http.HttpServletRequest;

@Controller
public class RouterClass {
	@Autowired
	private userrepo userrepo1;
	
	@Autowired
	private userserviceimp service;
	@Autowired
	private ContactServiceImp contactS;
	@Autowired
	private contactRepo contactRepo1;
	@Autowired
	private ServiceRepo ServRepoobj;
	@Autowired
	private ServiceServiceImp Servbj;
	
	
	//index
	@GetMapping("/")
	public String index(Model model)
	{
		model.addAttribute("contact", new Contact());
		return "index.html";
	}
	
	
	
	//login signup
	@GetMapping("/login")
	public String Login()
	{
		return "Login.html";
	}
	@GetMapping("/signup")
	public String signup(Model model)
	{
		model.addAttribute("user", new User());
		return "Signup.html";
	}
	
	//user
	@PostMapping("/addUSer")
	public String processForm(User user, Model model)
	{
		userrepo1.save(user);
		System.out.println(user.getEmail());
		return "redirect:/login";
	}
	@GetMapping("/user")
	public String client(Model model)
	{
		List<User>user=service.getAllUser();
		model.addAttribute("user",user);
		return "userlist.html";
	}
	@GetMapping("/userbyid")
    public String userById(HttpServletRequest request, Model model) {
		String userId = request.getParameter("id");
		System.out.println(userId);
        User u = service.getUserById(Integer.parseInt(userId));
        System.out.println(u.getEmail());
        model.addAttribute("user", u); // Add the user object to the model
        return "SingleUser.html";
    }
	

	
	//admin
		@GetMapping("/admin")
		public String admin()
		{
			return "AdminDashboard.html";
		}
		@GetMapping("/category")
		public String category(Model model)
		{
			
			return "category.html";
		}

		@GetMapping("/service")
		public String getServices(Model model) {
		    List<Services> services = Servbj.getAllServices();
		    services.forEach(x -> System.out.println(x));
		    model.addAttribute("services", services);
		    return "services.html";
		}
		@GetMapping("/addservice")
		public String fetchService(Services services, Model model)
		{
			//ServRepoobj.save(services);
			return "AddService.html";
		}
		@PostMapping("/addservice")
		public String addService(Services services, Model model)
		{
			ServRepoobj.save(services);
			return "services.html";
		}
		
		
//		Contact
		@GetMapping("/contact")
		public String contact(Model model)
		{
			List<Contact>contact=contactS.getAllContact();
			model.addAttribute("contact",contact);
			return "contact.html";
		}		
		@PostMapping("/addContact")
		public String processContactForm(Contact contact, Model model)
		{
			contactRepo1.save(contact);
			System.out.println(contact.getEmail());
			return "/";
		}
		 @GetMapping("/deletecontact/{conId}")
		    public String deleteContact(@PathVariable long conId) {
		        // Call your service method to delete the contact by ID
		        contactS.deleteContact(conId);
		        return "redirect:/contact";
		  }

		
		
		//client
		@GetMapping("/client")
		public String client()
		{
			return "Client.html";
		}
		@GetMapping("/postProject")
		public String postProject()
		{
			return "UploadProject.html";
		}

		
		
		//freelancer
		@GetMapping("/freelancer")
		public String freelancer()
		{
			return "freelancer.html";
		}
		@PostMapping("/freelancer")
		public String portfolio(FreelancerP freelancerP, Model model)
		{
			model.addAttribute("freelancerP", new FreelancerP());
			return "freelancer.html";
		}
		
		
		//redirecting to there respective page after login
		@PostMapping("/login")
		public String processLogin(@RequestParam String email, @RequestParam String password, Model model) {
		    User user = service.getUserByEmailAndPassword(email, password);

		    if (user != null) {
		        // Add the user to the model if you need to display user information on the redirected page
		        model.addAttribute("user", user);

		        if ("FREELANCER".equals(user.getUserType())) {
		            return "redirect:/freelancer";
		        } else {
		            return "redirect:/client";
		        }
		    } else {
		        // Handle unsuccessful login, e.g., show an error message
		        return "Login.html";
		    }
		}
		
		//routing for userType
		@GetMapping("/usertype")
		public String getUserType(Model model) {
		    // Retrieve the user from the model or session
		    User user = (User) model.getAttribute("user");

		    if (user != null) {
		        model.addAttribute("userType", user.getUserType());
		        return "usertype.html";  // Assuming you have a usertype.html template to display the user type
		    } else {
		        // Handle the case where the user is not logged in
		        return "redirect:/login";
		    }
		}
		
}
