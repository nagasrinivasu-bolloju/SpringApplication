package Repo;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import entity.Customer2;

@Repository
public interface CustomerRepository extends JpaRepository<Customer2,Integer>
{
	
}
