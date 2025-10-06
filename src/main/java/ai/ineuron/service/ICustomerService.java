package ai.ineuron.service;

import java.util.List;

import ai.ineuron.model.Customer;

public interface ICustomerService {
	
	public List<Customer> readAllCustomers();
	public void saveCustomer(Customer customer);
	public Customer getCustomerById(Integer customerId);
	public void deleteCustomerById(Integer customerId);
	
}
