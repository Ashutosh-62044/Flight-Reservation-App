package com.Flight_Resevation_App.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.Flight_Resevation_App.Repository.UserRepository;
import com.Flight_Resevation_App.entity.User;

@Controller
public class UserController {

	@Autowired
	private UserRepository userRepo;
	
	
	// show User Registration..
	@RequestMapping("/show")
	public String showRegestration() {
		return "login/showReg";
	}
	
	// Save User Registration Data...
	@RequestMapping("/saveReg")
	public String saveRegistration(@ModelAttribute("User") User user, ModelMap modelMap) {
		userRepo.save(user);
		return"login/login";
	}
	//show Login page
		@RequestMapping("/showLoginpage")
		public String showLoginpage() {
			return "login/login";
		}
	
	// Verify Login Page ..
		@RequestMapping("/Verifylogin")
		public String VerifyLogin(@RequestParam("email") String email,@RequestParam("password") String password, ModelMap modelMap ){
			User user = userRepo.findByEmail(email);
			if(user!=null) {
			if(user.getEmail().equals(email) && user.getPassword().equals(password)) {
				return"findFlight";
			}else {
				modelMap.addAttribute("error" , "Invalid Username/ password..");
				return"login/login";
			}
		}else {
			modelMap.addAttribute("error" , "Invalid Username/ password..");
			return"login/login";
		  }
		}
		
		// Delete user registration..
		
		public String deleteUser() {
			return "";
		}
}
