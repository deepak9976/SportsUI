package com.deepak;



import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

/**
 * @author KFY062
 *
 */
public interface CustomerRepository extends JpaRepository<Customer, Long> {
	
	List<Customer> findByLastNameStartsWithIgnoreCase(String lastName);

}