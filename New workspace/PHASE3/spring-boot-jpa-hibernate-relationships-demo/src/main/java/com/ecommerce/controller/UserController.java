package com.ecommerce.controller;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.ecommerce.entity.AadharCard;
import com.ecommerce.entity.EducationalDegree;
import com.ecommerce.entity.MobilePhone;
import com.ecommerce.entity.User;
import com.ecommerce.repositry.AadharCardRepositry;
import com.ecommerce.repositry.EducationalDegreeRepositry;
import com.ecommerce.repositry.MobilePhoneRepositry;
import com.ecommerce.repositry.UserRepositry;

import jakarta.validation.ConstraintViolation;
import jakarta.validation.ConstraintViolationException;

@Controller
@Validated
public class UserController {

	@Autowired
	UserRepositry userRepositry;

	@Autowired
	AadharCardRepositry aadharCardRepositry;

	@Autowired
	MobilePhoneRepositry mobilePhoneRepositry;

	@Autowired
	EducationalDegreeRepositry educationalDegreeRepositry;

	@PostMapping("/add-user")
	@ResponseBody
	public String addUser(@RequestParam String uName, @RequestParam long aadharCardNo) {

		User user = new User();
		user.setName(uName);

		AadharCard aadharCard = new AadharCard();
		aadharCard.setNumber(aadharCardNo);

		aadharCardRepositry.save(aadharCard); // This will create an id for the aadharCard object.

		user.setAadharCard(aadharCard);

		userRepositry.save(user);

		return "User with id=" + user.getID() + " is created. His aadhar card id=" + aadharCard.getID();
	}

	@PostMapping("/add-user-with-mobiles")
	@ResponseBody
	public String addUserWithMobiles(@RequestParam String uName, @RequestParam long aadharCardNo,
			@RequestParam long mobileNo1, @RequestParam long mobileNo2) {

		User user = new User();
		user.setName(uName);

		AadharCard aadharCard = new AadharCard();
		aadharCard.setNumber(aadharCardNo);

		aadharCardRepositry.save(aadharCard); // This will create an id for the aadharCard object.

		user.setAadharCard(aadharCard);

		userRepositry.save(user);

		MobilePhone m1 = new MobilePhone();
		m1.setNumber(mobileNo1);
		m1.setUser(user);
		mobilePhoneRepositry.save(m1);

		MobilePhone m2 = new MobilePhone();
		m2.setNumber(mobileNo2);
		m2.setUser(user);
		mobilePhoneRepositry.save(m2);

		List<MobilePhone> mobiles = new ArrayList<MobilePhone>();
		mobiles.add(m1);
		mobiles.add(m2);

		user.setPhones(mobiles);

		// userRepositry.save(user);

		return "User with id=" + user.getID() + " is created. His aadhar card id=" + aadharCard.getID();
	}

	@GetMapping("/add-user-simplified-show-form")
	public String addUserWithMobiles(Model model) {
		User user = new User();
		model.addAttribute("user", user);

		return "new-user";
	}

	@PostMapping("/add-user-simplified-save")
	@ResponseBody
	public String addUserWithMobiles(@ModelAttribute("user") @Validated User user, BindingResult result) {

		if (result.hasErrors()) {
			System.err.println("Hi DEBUG Input has errors" + result.getErrorCount());
		}

		userRepositry.save(user);

		List<MobilePhone> mobiles = user.getPhones();

		for (MobilePhone m : mobiles) {
			m.setUser(user);
			mobilePhoneRepositry.save(m);
		}

		return "User " + user.getID() + " add success!";
	}

	//// Test Many to Many Relationship
	@GetMapping("/add-user-with-degrees-simplified-show-form")
	public String addUserWithDegrees(Model model) {
		User user = new User();
		model.addAttribute("user", user);

		return "new-user-with-degrees"; // show new-user-with-degrees.jsp
	}

	@PostMapping("/add-user-with-degrees-simplified-save")
	@ResponseBody
	public String addUserWithDegrees(@ModelAttribute("user") @Validated User user, BindingResult result) {
		
		
		if (result.hasErrors()) {			
			return "Validation of User failed. Please check your user related inputs.";
		}

		List<MobilePhone> mobiles = user.getPhones();	

		
			userRepositry.save(user);

			for (MobilePhone m : mobiles) {
				m.setUser(user);
				mobilePhoneRepositry.save(m);
			}

			return "User " + user.getID() + " having edu degrees added successfully!";
		
	}
	
	
	@ExceptionHandler(value = jakarta.validation.ConstraintViolationException.class)
	public ResponseEntity<Object> abc(ConstraintViolationException exception) {
		String messages = "";
		
		Set<ConstraintViolation<?>> violations = exception.getConstraintViolations();
		for (ConstraintViolation voilation: violations) {
			
			Object obj = voilation.getRootBean();
			
			if(obj instanceof MobilePhone)			
			messages = messages + ", " + ((MobilePhone) obj).getNumber()  + ": " +  voilation.getMessage();
			
			if(obj instanceof User)			
				messages = messages + ", " + ((User) obj).getName()  + ": " +  voilation.getMessage();
		}
		
		return new ResponseEntity<>("Input Errors! " + messages, HttpStatus.NOT_FOUND);		
	}

	//// M2M with Request Params
	@PostMapping("/add-user-with-degrees")
	@ResponseBody
	public String addUserWithDegrees(@RequestParam String uName, @RequestParam long aadharCardNo,
			@RequestParam long mobileNo1, @RequestParam long mobileNo2, @RequestParam String deg1,
			@RequestParam String deg2) {

		User user = new User();
		user.setName(uName);

		AadharCard aadharCard = new AadharCard();
		aadharCard.setNumber(aadharCardNo);

		aadharCardRepositry.save(aadharCard); // This will create an id for the aadharCard object.

		user.setAadharCard(aadharCard);

		userRepositry.save(user);

		MobilePhone m1 = new MobilePhone();
		m1.setNumber(mobileNo1);
		m1.setUser(user);
		mobilePhoneRepositry.save(m1);

		MobilePhone m2 = new MobilePhone();
		m2.setNumber(mobileNo2);
		m2.setUser(user);
		mobilePhoneRepositry.save(m2);

		List<MobilePhone> mobiles = new ArrayList<MobilePhone>();
		mobiles.add(m1);
		mobiles.add(m2);

		EducationalDegree edu1 = new EducationalDegree();
		edu1.setName(deg1);
		List<User> users = new ArrayList<User>();
		users.add(user);
		edu1.setUsers(users);
		educationalDegreeRepositry.save(edu1);

		EducationalDegree edu2 = new EducationalDegree();
		edu2.setName(deg2);
		edu2.setUsers(users);
		educationalDegreeRepositry.save(edu2);

		user.setPhones(mobiles);

		// userRepositry.save(user);

		return "User with id=" + user.getID() + " is created. His aadhar card id=" + aadharCard.getID();
	}

	// Try this when posting JSON content
//	@PostMapping("/add-user-simplified")
//	@ResponseBody
//	public String addUserWithMobiles(@RequestBody User user) {
//		userRepositry.save(user);
//		
//		return "User " +user.getID() +" add success!";
//	}

	@GetMapping("/user-details")
	public String userDetails(@RequestParam long id, ModelMap model) {
		Optional<User> userFromRepo = userRepositry.findById(id);

		model.addAttribute("id", id);

		if (userFromRepo.isPresent()) {
			User user = userFromRepo.get();

			model.addAttribute("user", user);

			AadharCard aadhar = user.getAadharCard();
			List<MobilePhone> mobiles = user.getPhones();

			String mobilesStr = "";
			for (MobilePhone m : mobiles)
				mobilesStr = mobilesStr + " " + m.getNumber();

			return "user-details";
		} else {
			return "user-not-found";
		}

	}

}
