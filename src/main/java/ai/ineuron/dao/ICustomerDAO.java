package ai.ineuron.dao;

import org.springframework.data.repository.CrudRepository;

import ai.ineuron.model.Customer;

public interface ICustomerDAO extends CrudRepository<Customer, Integer> {
	
}
