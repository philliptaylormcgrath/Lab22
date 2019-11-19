package co.grandcircus;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class LabController {
	
	// this @Autowired annotation works in conjunction with the
		// @Component annotation (in the Person class) to allow
		// allow us to take advantage of Spring's Dependency Injection
		@Autowired
		private Person p;

		// the RequestMapping is how we will call the methods in the
		// Controller classes -- they will be called when we
		// navigate the referenced url in our browser
		// localhost:8080 is the default server port
		      
		      
		@RequestMapping("/")
		public ModelAndView home() {
			// the ModelAndView object allows us to manage the jsp pages we want to show
			// and the model data that we want to pass in
			// first param is the page name
			// second param is the model name that will used in the jsp to
			// represent the third param which is the model data
			ModelAndView mv = new ModelAndView("index", "test", "Hi, my name is Blorpo!");
			p.setFirstName("Grand");
			p.setLastName("Chirpo");
			p.setPhone("222-222-2222");
			p.setEmailAddress("Jazzhands@aol.net");
			p.setPassword("password");

			mv.addObject("personTest", p.getFirstName() + " " + p.getLastName() + " " + p.getPhone() + " " + p.getEmailAddress() + " " + p.getPassword());

			return mv;
		}

		// PostMappings and the method assignment in the form will allow us to 
		// hide the input details from our url
		@PostMapping("/add-person")
		public ModelAndView registration(@RequestParam("first") String f, @RequestParam("last") String l,
				@RequestParam("phone") String phone, @RequestParam("emailAddress") String email, @RequestParam("password") String password) {
			Person pFromForm = new Person(f, l, phone, email, password);
			ModelAndView mv = new ModelAndView("results", "p", pFromForm);
			mv.addObject("personTest", pFromForm.getFirstName() + "<br> " + pFromForm.getLastName() + "<br>" + pFromForm.getPhone() + "<br>" + pFromForm.getEmailAddress() + "<br>" + pFromForm.getPassword());
			return mv;
		}
		
		
		@RequestMapping("registration-page") //add 'test-page' to the URL (localhost8080:/test-page
		public String registrationView() {
			return "registration";
		}
		
		@RequestMapping("results-page") //add 'test-page' to the URL (localhost8080:/test-page
		public String resultsView() {
			return "results";
		}
		
		

	}