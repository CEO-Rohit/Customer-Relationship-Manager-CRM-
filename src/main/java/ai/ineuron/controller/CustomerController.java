package ai.ineuron.controller;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import ai.ineuron.model.Customer;
import ai.ineuron.service.ICustomerService;

@Controller
@RequestMapping("/customer")
public class CustomerController {

	@Autowired
	private ICustomerService service;

	@GetMapping
	public String redirectingToPage() {
		return "redirect:/customer/list";
	}

	@GetMapping("/list")
	public String listCustomers(Map<String, Object> model) {

		List<Customer> customers = service.readAllCustomers();
		customers.forEach(System.out::println);

		model.put("customers", customers);

		return "list-customers";
	}

	@GetMapping("/showForm")
	public String formPageForAdd(Map<String, Object> model) {

		Customer customer = new Customer();
		model.put("customer", customer);

		return "customer-form";
	}

	@PostMapping("/saveCustomer")
	public String saveCustomer(@ModelAttribute("customer") Customer customer) {

		service.saveCustomer(customer);
		System.out.println(customer);
		return "redirect:/customer/list";
	}

	@GetMapping("/showUpdateForm")
	public String showUpdateForm(@RequestParam Integer customerId, Map<String, Object> model) {

		Customer customer = service.getCustomerById(customerId);
		System.out.println(customer);

		model.put("customer", customer);
		return "customer-form";
	}

	@GetMapping("/showDeleteForm")
	public String showDeleteForm(@RequestParam Integer customerId) {
		service.deleteCustomerById(customerId);
		return "redirect:/customer/list";
	}

}
