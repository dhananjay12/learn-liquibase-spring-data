package com.djcodes.test.containers.crudservice.persistence;

import org.springframework.data.jpa.repository.JpaRepository;

public interface EmployeeRepository extends JpaRepository<EmployeeEntity, Long> {

    public EmployeeEntity findByFname(String fname);


}
