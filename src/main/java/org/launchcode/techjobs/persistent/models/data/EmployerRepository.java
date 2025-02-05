package org.launchcode.techjobs.persistent.models.data;

import org.launchcode.techjobs.persistent.models.Employer;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
//not sure if the second parameter is correct. should it be int since id is set as an integer
@Repository
public interface EmployerRepository extends CrudRepository<Employer, Integer> {
}
